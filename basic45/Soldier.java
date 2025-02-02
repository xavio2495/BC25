package basic45;

import battlecode.common.*;

/**
 * Soldier code. It is probably our most complex non-generated class.
 */

public class Soldier extends Unit {

    static MapLocation symTarget;

    boolean recovering = false;
    Soldier(RobotController rc) throws GameActionException {
        super(rc);
        Map.initialize();
        Map.fill();
        /**
         * We kinda move to the symmetric position of we were spawned very early on by a paint tower.
         */
        if (TowerManager.closestPaintTower != null && rc.getLocation().distanceSquaredTo(TowerManager.closestPaintTower) <= GameConstants.BUILD_ROBOT_RADIUS_SQUARED && rc.getRoundNum() < Constants.RUSH_TURNS){
            SymmetryManager.setBase(TowerManager.closestPaintTower);
        }
    }

    void startTurn() throws GameActionException {
        //Try attacking enemy towers
        attackTowers();
        //Try completing patterns
        completePatterns();
        //Try withdrawint paint from adjacent towers
        tryWithdraw();
        //Should I recover?
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.SOLDIER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;
        hasMicro = MicroManagerSoldier.doMicro();

        //Compute a bunch of vision stuff (e.g., distance to nearby tiles)
        super.startTurn();

        /*
        Compute a bunch of stuff related to SRPs. Most importantly it checks which positions (2,2) mod 4 can possibly be centers of SRPs.
        It also computes if my current location can be the center of a SRP that doesn't sabotage other SRPs. For instance, if all nearby (2,2) centers are obstructed
        it is likely that I might be able to do one here freely. This consumes a bunch of bytecode, so only do this from the second turn on (first turn there is a lot of init.)
         */
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
        //Check closest ruins to
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

    MapLocation getTarget() throws GameActionException{
        MapLocation tg = null;
        //Recovering target.
        if (recovering && !suicide && TowerManager.closestPaintTower != null){
            tg = getRecoveryLoc();
            if (tg != null) return tg;
        }
        //Closest Enemy Tower target
        tg = getClosestEnemyTower();
        if (tg != null) return tg;
        if (closestRuin != null && !Util.towerMax()) return closestRuin;

        //Go to symmetric if target not found (only for rushers!)
        if (symTarget != null) return symTarget;

        //Go to the best SRP center you found
        if (rc.getRoundNum() > creationTurn){
            tg = VisionManager.bestSRPSpot;
            if (tg != null){
                tg = tg.add(tg.directionTo(VisionManager.bestCenter));
                return tg;
            }

            tg = getBestFlagLoc();
            if (tg != null) return tg;
        }

        //After round 200 also start painting empty tiles
        if (rc.getRoundNum() > 200){
            if (VisionManager.emptyLoc != null) return VisionManager.emptyLoc;
        }

        //No target found??? ==> Explore!
        return explore.getExplore3Target();
    }

    MapLocation getBestFlagLoc() throws GameActionException {
        for (int i = 0; i < VisionManager.flagSize; ++i){
            VisionManager.flagPaintCheck(i);
            if (VisionManager.bestFlagLoc != null) return VisionManager.bestFlagLoc;
        }
        return null;
    }


    void paint() throws GameActionException {
        //Try attack towers
        attackTowers();

        //If there is a ruin with enemy paint but not ours, try to sabotage it!
        if (closestRuin != null && Map.hasEnemyPaint(closestRuin) && rc.canSenseLocation(closestRuin)){
            RuinManager.drawPatternEnhanced(closestRuin, TowerManager.getNextBuild());
            return;
        }

        //Otherwise construct money or paint tower depending on the number of chips and the pattern already being drawn. We only revert from
        //paint to money if we are really low on chips and from money to paint if we have too many.
        else if (closestRuin != null && rc.getLocation().distanceSquaredTo(closestRuin) <= 8 && !Util.towerMax()) {
            int code = RuinManager.getType(Map.getPattern(closestRuin));
            int x = TowerManager.getNextBuild(code);
            UnitType t = switch (x) {
                case RuinManager.PAINT -> UnitType.LEVEL_ONE_PAINT_TOWER;
                case RuinManager.MONEY -> UnitType.LEVEL_ONE_MONEY_TOWER;
                default -> UnitType.LEVEL_ONE_DEFENSE_TOWER;
            };
            //Try completing the pattern.
            if (rc.canCompleteTowerPattern(t, closestRuin)) {
                rc.completeTowerPattern(t, closestRuin);
            }
            RuinManager.drawPatternEnhanced(closestRuin, x);
        }
        //Paint nearby SRPs.
        paintNearby();
    }

    void paintNearby() throws GameActionException {
        if (rc.getPaint() < Constants.CRITICAL_PAINT_SOLDIER) return;

        if (!rc.isActionReady()) return;

        if (symTarget != null) return; //no srps if 'rushing'

        if (rc.getRoundNum() <= creationTurn) return; //We didn't compute the SRPs at this round. Better not to screw it.

        MapLocation myLoc = rc.getLocation();

        //Compute which colors should I paint depending on nearby marks.
        VisionManager.fillFlagPaint();

        //Prioritize my own tile.
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

        //Only paint at distance at most 4 in order to avoid sabotaging nearby ruins/other SRPs.
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

    /**
     * We only paint if we are sure that we can complete the SRP (e.g., not obstructed or with enemy paint) and if we are not sabotaging nearby ruin patterns.
     */
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
