package basic46;

import battlecode.common.*;

public class Soldier extends Unit {

    static MapLocation symTarget;

    boolean recovering = false;
    Soldier(RobotController rc) throws GameActionException {
        super(rc);
        Map.initialize();
        Map.fill();
        if (TowerManager.closestPaintTower != null && rc.getLocation().distanceSquaredTo(TowerManager.closestPaintTower) <= GameConstants.BUILD_ROBOT_RADIUS_SQUARED && rc.getRoundNum() < Constants.RUSH_TURNS){
            SymmetryManager.setBase(TowerManager.closestPaintTower);
        }
    }

    void startTurn() throws GameActionException {
        attackTowers();
        completePatterns();
        tryWithdraw();
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.SOLDIER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;
        hasMicro = MicroManagerSoldier.doMicro();

        super.startTurn();

        if (rc.getRoundNum() > creationTurn) VisionManager.scanRSPs(); //MAX 4200 bytecode
        if (VisionManager.flag && rc.senseMapInfo(rc.getLocation()).getMark() != null){
            MapLocation myLoc = rc.getLocation();
            if (myLoc.x > 1 && myLoc.y > 1 && myLoc.x < MyRobot.W - 2 && myLoc.y < MyRobot.H - 2) {
                if (rc.canMark(rc.getLocation())) {
                    rc.mark(rc.getLocation(), false);
                    VisionManager.flags[VisionManager.flagSize++] = rc.getLocation();
                }
            }
        }
        updateClosestRuin();
        TowerManager.readMessages();
        symTarget = SymmetryManager.getTarget();
    }

    void endTurn() throws GameActionException {
        super.endTurn();
        SymmetryManager.checkSym();
    }

    void runTurn() throws GameActionException {
        move();
        paint();
        tryWithdraw();
        completePatterns();
    }

    void paintNearby() throws GameActionException {
        if (rc.getPaint() < Constants.CRITICAL_PAINT_SOLDIER) return;
        if (!rc.isActionReady()) return;
        if (symTarget != null) return;

        MapLocation myLoc = rc.getLocation();
        VisionManager.fillFlagPaint();

        if (rc.senseMapInfo(myLoc).getPaint() == PaintType.EMPTY){
            if (rc.canAttack(myLoc)){
                PaintType targetPaint = VisionManager.getFlagPaint(rc.getLocation());
                if (targetPaint == null) {
                    int x = myLoc.x % 4, y = myLoc.y % 4;
                    int z = x * 4 + y;
                    targetPaint = ((5147 >>> z) & 1) > 0 ? PaintType.ALLY_SECONDARY : PaintType.ALLY_PRIMARY;
                }
                rc.attack(myLoc, targetPaint == PaintType.ALLY_SECONDARY);
                return;
            }
        }

        if (!shouldSRP()) return;

        if (rc.getRoundNum() > creationTurn) {
            //tryPaint(myLoc);
            if (VisionManager.bestSRPSpot != null && rc.getLocation().distanceSquaredTo(VisionManager.bestSRPSpot) <= 4) tryPaint(VisionManager.bestSRPSpot);
            if (tryPaint(myLoc.translate(1, 0))) return;
            if (tryPaint(myLoc.translate(0, 1))) return;
            if (tryPaint(myLoc.translate(-1, 0))) return;
            if (tryPaint(myLoc.translate(0, -1))) return;
            if (tryPaint(myLoc.translate(1, 1))) return;
            if (tryPaint(myLoc.translate(1, -1))) return;
            if (tryPaint(myLoc.translate(-1, -1))) return;
            if (tryPaint(myLoc.translate(-1, 1))) return;
            if (tryPaint(myLoc.translate(2, 0))) return;
            if (tryPaint(myLoc.translate(0, 2))) return;
            if (tryPaint(myLoc.translate(-2, 0))) return;
            if (tryPaint(myLoc.translate(0, -2))) return;
        }
    }

    boolean tryPaint(MapLocation loc) throws GameActionException {
        if (!rc.canSenseLocation(loc)) return false;
        MapInfo m = rc.senseMapInfo(loc);
        if (!Util.towerMax() && Map.isNearRuin(m.getMapLocation())) return false;
        PaintType targetPaint = VisionManager.getFlagPaint(loc);
        if (targetPaint != null) {
            if (m.getPaint().isEnemy() || m.getPaint() == targetPaint) return false;
            if (rc.canAttack(m.getMapLocation())) {
                rc.attack(m.getMapLocation(), targetPaint == PaintType.ALLY_SECONDARY);
                return true;
            }
            return false;
        }


        if (m.isWall() || m.hasRuin() || !shouldPaint(loc)) return false;
        int x = m.getMapLocation().x%4, y = m.getMapLocation().y%4;
        int z = x*4 + y;
        targetPaint = ((5147 >>> z)&1) > 0 ? PaintType.ALLY_SECONDARY : PaintType.ALLY_PRIMARY;
        if (m.getPaint().isEnemy() || m.getPaint() == targetPaint) return false;
        if (rc.canAttack(m.getMapLocation())){
            rc.attack(m.getMapLocation(), targetPaint == PaintType.ALLY_SECONDARY);
            return true;
        }
        return false;
    }

    void attackTowers() throws GameActionException {
        if (!rc.isActionReady()) return;
        RobotInfo[] robots = rc.senseNearbyRobots(rc.getType().actionRadiusSquared, rc.getTeam().opponent());
        for (RobotInfo r : robots){
            if (!r.getType().isTowerType()) continue;
            if (rc.canAttack(r.getLocation())) rc.attack(r.getLocation());
        }
    }

    MapLocation getClosestEnemyTower() throws GameActionException {
        RobotInfo[] robots = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam().opponent());
        MapLocation bestLoc = null;
        int bestDist = 0;
        for (RobotInfo r : robots){
            if (!r.getType().isTowerType()) continue;
            int dist = VisionManager.computeDistance(r.getLocation());
            if (dist > Constants.DIST_INF) continue;
            if (bestLoc == null || dist < bestDist){
                bestLoc = r.getLocation();
                bestDist = dist;
            }
        }
        return bestLoc;
    }

    boolean shouldRecover(){
        if (rc.getRoundNum() > Constants.MIN_ROUNDS_NO_RECOVERY && rc.getNumberTowers() > Constants.MIN_TOWERS_NO_RECOVERY) return false;
        return (rc.getPaint() < Constants.CRITICAL_PAINT_SOLDIER);
    }

    void move() throws GameActionException {
        if (hasMicro || !rc.isMovementReady()) return;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
    }

    boolean shouldSRP(){
        int size = (int) (1.5*Math.sqrt(MyRobot.W*MyRobot.H));
        return rc.getRoundNum() > size;
    }

    MapLocation getTarget() throws GameActionException{
        MapLocation tg = null;
        if (recovering && !suicide && TowerManager.closestPaintTower != null){
            tg = getRecoveryLoc();
            if (tg != null) return tg;
        }
        tg = getClosestEnemyTower();
        if (tg != null) return tg;
        if (closestRuin != null && !Util.towerMax()) return closestRuin;
        if (symTarget != null) return symTarget;

        if (rc.getRoundNum() > creationTurn && shouldSRP()){
            tg = VisionManager.bestSRPSpot;
            if (tg != null){
                tg = tg.add(tg.directionTo(VisionManager.bestCenter));
                return tg;
            }

            tg = getBestFlagLoc();
            if (tg != null) return tg;
        }

        if (rc.getRoundNum() > 200){
            if (VisionManager.emptyLoc != null) return VisionManager.emptyLoc;
        }
        return explore.getExplore3Target();
    }

    MapLocation getBestFlagLoc() throws GameActionException {
        for (int i = 0; i < VisionManager.flagSize; ++i){
            VisionManager.flagPaintCheck(i);
            if (VisionManager.bestFlagLoc != null) return VisionManager.bestFlagLoc;
        }
        return null;
    }

    int getMarkRuin(MapLocation loc) throws GameActionException{
        PaintType ans = rc.senseMapInfo(loc.add(Direction.NORTH)).getMark();
        if (ans != PaintType.EMPTY) return RuinManager.PAINT;
        ans = rc.senseMapInfo(loc.add(Direction.EAST)).getMark();
        if (ans != PaintType.EMPTY) return RuinManager.PAINT;
        ans = rc.senseMapInfo(loc.add(Direction.WEST)).getMark();
        if (ans != PaintType.EMPTY) return RuinManager.PAINT;
        ans = rc.senseMapInfo(loc.add(Direction.SOUTH)).getMark();
        if (ans != PaintType.EMPTY) return RuinManager.PAINT;
        ans = rc.senseMapInfo(loc.add(Direction.NORTHWEST)).getMark();
        if (ans != PaintType.EMPTY) return RuinManager.MONEY;
        ans = rc.senseMapInfo(loc.add(Direction.NORTHEAST)).getMark();
        if (ans != PaintType.EMPTY) return RuinManager.MONEY;
        ans = rc.senseMapInfo(loc.add(Direction.SOUTHWEST)).getMark();
        if (ans != PaintType.EMPTY) return RuinManager.MONEY;
        ans = rc.senseMapInfo(loc.add(Direction.SOUTHEAST)).getMark();
        if (ans != PaintType.EMPTY) return RuinManager.MONEY;
        return -1;
    }

    void markPaint(MapLocation loc) throws GameActionException {
        MapLocation l = loc.add(Direction.NORTH);
        if (rc.canMark(l)){
            rc.mark(l, true);
            return;
        }
        l = loc.add(Direction.SOUTH);
        if (rc.canMark(l)){
            rc.mark(l, true);
            return;
        }
        l = loc.add(Direction.EAST);
        if (rc.canMark(l)){
            rc.mark(l, true);
            return;
        }
        l = loc.add(Direction.WEST);
        if (rc.canMark(l)){
            rc.mark(l, true);
        }
    }

    void markMoney(MapLocation loc) throws GameActionException{
        MapLocation l = loc.add(Direction.NORTHEAST);
        if (rc.canMark(l)){
            rc.mark(l, true);
            return;
        }
        l = loc.add(Direction.NORTHWEST);
        if (rc.canMark(l)){
            rc.mark(l, true);
            return;
        }
        l = loc.add(Direction.SOUTHEAST);
        if (rc.canMark(l)){
            rc.mark(l, true);
            return;
        }
        l = loc.add(Direction.SOUTHWEST);
        if (rc.canMark(l)){
            rc.mark(l, true);
        }
    }


    void paint() throws GameActionException {
        attackTowers();
        if (closestRuin != null && Map.hasEnemyPaint(closestRuin) && rc.canSenseLocation(closestRuin)){
            RuinManager.drawPatternEnhanced(closestRuin, TowerManager.getNextBuild());
            return;
        }
        else if (closestRuin != null && rc.getLocation().distanceSquaredTo(closestRuin) <= 8 && !Util.towerMax()) {
            int x = getMarkRuin(closestRuin);
            boolean shouldPaint = false;
            if (x < 0){
                shouldPaint = true;
                int code = RuinManager.getType(Map.getPattern(closestRuin));
                x = TowerManager.getNextBuild(code);
            }
            if (shouldPaint){
                if (x == RuinManager.PAINT) markPaint(closestRuin);
                else markMoney(closestRuin);
            }
            UnitType t = switch (x) {
                case RuinManager.PAINT -> UnitType.LEVEL_ONE_PAINT_TOWER;
                case RuinManager.MONEY -> UnitType.LEVEL_ONE_MONEY_TOWER;
                default -> UnitType.LEVEL_ONE_DEFENSE_TOWER;
            };
            if (rc.canCompleteTowerPattern(t, closestRuin)) {
                rc.completeTowerPattern(t, closestRuin);
                //if (rc.canRemoveMark(closestRuin)) rc.removeMark(closestRuin);
            }
            RuinManager.drawPatternEnhanced(closestRuin, x);
        }
        paintNearby();
    }

    static boolean shouldPaint (MapLocation loc) throws GameActionException {
        switch((loc.x%4)*4 + loc.y%4){
            case 0:
                if (!Map.forbiddenCenter(loc.translate(-2,-2))) { rc.setIndicatorDot(loc.translate(-2, -2), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(-2,2))) { rc.setIndicatorDot(loc.translate(-2, 2), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(2,-2))) { rc.setIndicatorDot(loc.translate(2, -2), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(2,2))) { rc.setIndicatorDot(loc.translate(2, 2), 200, 0, 0); return true; }
                return false;
            case 1:
                if (!Map.forbiddenCenter(loc.translate(-2,1))) { rc.setIndicatorDot(loc.translate(-2, 1), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(2,1))) { rc.setIndicatorDot(loc.translate(2, 1), 200, 0, 0); return true; }
                return false;
            case 2:
                if (!Map.forbiddenCenter(loc.translate(-2,0))) { rc.setIndicatorDot(loc.translate(-2, 0), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(2,0))) { rc.setIndicatorDot(loc.translate(2, 0), 200, 0, 0); return true; }
                return false;
            case 3:
                if (!Map.forbiddenCenter(loc.translate(-2,-1))) { rc.setIndicatorDot(loc.translate(-2, -1), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(2,-1))) { rc.setIndicatorDot(loc.translate(2, -1), 200, 0, 0); return true; }
                return false;
            case 4:
                if (!Map.forbiddenCenter(loc.translate(1,-2))) { rc.setIndicatorDot(loc.translate(1, -2), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(1,2))) { rc.setIndicatorDot(loc.translate(1, 2), 200, 0, 0); return true; }
                return false;
            case 5:
                if (!Map.forbiddenCenter(loc.translate(1,1))) { rc.setIndicatorDot(loc.translate(1, 1), 200, 0, 0); return true; }
                return false;
            case 6:
                if (!Map.forbiddenCenter(loc.translate(1,0))) { rc.setIndicatorDot(loc.translate(1, 0), 200, 0, 0); return true; }
                return false;
            case 7:
                if (!Map.forbiddenCenter(loc.translate(1,-1))) { rc.setIndicatorDot(loc.translate(1, -1), 200, 0, 0); return true; }
                return false;
            case 8:
                if (!Map.forbiddenCenter(loc.translate(0,-2))) { rc.setIndicatorDot(loc.translate(0, -2), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(0,2))) { rc.setIndicatorDot(loc.translate(0, 2), 200, 0, 0); return true; }
                return false;
            case 9:
                if (!Map.forbiddenCenter(loc.translate(0,1))) { rc.setIndicatorDot(loc.translate(0, 1), 200, 0, 0); return true; }
                return false;
            case 10:
                if (!Map.forbiddenCenter(loc.translate(0,0))) { rc.setIndicatorDot(loc.translate(0, 0), 200, 0, 0); return true; }
                return false;
            case 11:
                if (!Map.forbiddenCenter(loc.translate(0,-1))) { rc.setIndicatorDot(loc.translate(0, -1), 200, 0, 0); return true; }
                return false;
            case 12:
                if (!Map.forbiddenCenter(loc.translate(-1,-2))) { rc.setIndicatorDot(loc.translate(-1, -2), 200, 0, 0); return true; }
                if (!Map.forbiddenCenter(loc.translate(-1,2))) { rc.setIndicatorDot(loc.translate(-1, 2), 200, 0, 0); return true; }
                return false;
            case 13:
                if (!Map.forbiddenCenter(loc.translate(-1,1))) { rc.setIndicatorDot(loc.translate(-1, 1), 200, 0, 0); return true; }
                return false;
            case 14:
                if (!Map.forbiddenCenter(loc.translate(-1,0))) { rc.setIndicatorDot(loc.translate(-1, 0), 200, 0, 0); return true; }
                return false;
            case 15:
                if (!Map.forbiddenCenter(loc.translate(-1,-1))) { rc.setIndicatorDot(loc.translate(-1, -1), 200, 0, 0); return true; }
                return false;
        }
        return false;
    }

}
