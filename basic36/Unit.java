package basic36;

import battlecode.common.*;

public abstract class Unit extends MyRobot {

    static Explore explore;
    static Pathfinding pathfinding;

    static MapLocation closestRuin = null;
    static MapLocation prevClosestRuin = null;
    static int closestRuinDist = 0;

    static boolean suicide = false;

    Unit(RobotController rc) throws GameActionException {
        super(rc);
        explore = new Explore();
        pathfinding = new Pathfinding();
    }

    void startTurn() throws GameActionException {
        VisionManager.makeAssignments();
    }

    void runTurn() throws GameActionException {}

    void endTurn() throws GameActionException {
        Pathfinding.bugNav.run();
    }

    static void updateClosestRuin() throws GameActionException {
        checkCurrentRuin();
        MapLocation myLoc = rc.getLocation();
        int bestDist = -1;
        boolean hasEnemyPaint = false;
        if (closestRuin != null) bestDist = myLoc.distanceSquaredTo(closestRuin);
        MapLocation[] ruins = rc.senseNearbyRuins(GameConstants.VISION_RADIUS_SQUARED);
        for (MapLocation loc : ruins){
            if (Map.invalidTarget(loc)){
                continue;
            }
            if (closestRuin == null){
                closestRuin = loc;
                hasEnemyPaint = Map.hasEnemyPaint(closestRuin);
                bestDist = myLoc.distanceSquaredTo(closestRuin);
                continue;
            }
            boolean pt = Map.hasEnemyPaint(loc);
            if (!pt && hasEnemyPaint) continue;
            if (pt && !hasEnemyPaint){
                closestRuin = loc;
                hasEnemyPaint = true;
                bestDist = myLoc.distanceSquaredTo(closestRuin);
                continue;
            }
            //RobotInfo r = rc.senseRobotAtLocation(loc);
            //if (r != null && r.getType().isTowerType()) continue;
            int d = myLoc.distanceSquaredTo(loc);
            if (d < bestDist){
                bestDist = d;
                closestRuin = loc;
                //hasEnemyPaint = pt; //Already assigned
            }
        }
        if (closestRuin == null) closestRuin = prevClosestRuin;
    }

    static void checkCurrentRuin() throws GameActionException{
        prevClosestRuin = closestRuin;
        closestRuin = null;
        if (prevClosestRuin == null) return;
        if (!rc.canSenseLocation(prevClosestRuin)) return;
        if (Map.invalidTarget(prevClosestRuin)) prevClosestRuin = null;
    }

    void tryWithdraw() throws GameActionException {
        if (!rc.isActionReady()) return;
        RobotInfo[] robots = rc.senseNearbyRobots(GameConstants.PAINT_TRANSFER_RADIUS_SQUARED, rc.getTeam());
        for (RobotInfo r : robots){
            if (r.getType().isTowerType()){
                int neededPaint = rc.getType().paintCapacity - rc.getPaint();
                if (neededPaint <= Constants.MIN_TRANSFER_PAINT) return;
                int maxPaint = r.getPaintAmount();
                if (maxPaint == 0) return;
                if (neededPaint > maxPaint) neededPaint = maxPaint;
                rc.transferPaint(r.getLocation(), -neededPaint);
                return;
            }
        }
    }

    void completePatterns() throws GameActionException {
        /*int x = (rc.getLocation().x / 5)*5 + 2;
        int y = (rc.getLocation().y / 5)*5 + 2;
        MapLocation pLoc = new MapLocation(x,y);
        if (rc.canCompleteResourcePattern(pLoc)) rc.completeResourcePattern(pLoc);*/
        MapLocation[] locs = rc.getAllLocationsWithinRadiusSquared(rc.getLocation(), 8);
        for (MapLocation loc : locs){
            if (loc.x%4 == 2 && loc.y%4 == 2){
                if (rc.canCompleteResourcePattern(loc)) rc.completeResourcePattern(loc);
            }
        }
    }



    MapLocation getClosestEnemy() throws GameActionException {
        MapLocation ans = null;
        int bestDist = 0;
        RobotInfo[] enemies = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam().opponent());
        for (RobotInfo r : enemies){
            if (r.getType().isTowerType()) continue;
            if (r.getPaintAmount() == 0) continue;
            int d = r.getLocation().distanceSquaredTo(rc.getLocation());
            if (ans == null || d < bestDist){
                ans = r.getLocation();
                bestDist = d;
            }
        }
        return ans;
    }

    MapLocation getClosestEnemyPaint(){
        MapLocation ans = null;
        int bestDist = 0;
        MapInfo[] tiles = rc.senseNearbyMapInfos();
        for (MapInfo m : tiles){
            if (m.getPaint().isEnemy()) {
                int d = m.getMapLocation().distanceSquaredTo(rc.getLocation());
                if (ans == null || d < bestDist) {
                    ans = m.getMapLocation();
                    bestDist = d;
                }
            }
        }
        return ans;
    }

    void tryGivePaint() throws GameActionException {
        if (rc.getActionCooldownTurns() > 0) return;
        if (2*rc.getPaint() <= rc.getType().paintCapacity) return;
        RobotInfo[] rs = rc.senseNearbyRobots(2, rc.getTeam());
        for (RobotInfo r : rs){
            if (isHurt(r)){
                if (rc.canTransferPaint(r.getLocation(), rc.getPaint() - rc.getType().paintCapacity/2)){
                    rc.transferPaint(r.getLocation(), rc.getPaint() - rc.getType().paintCapacity/2);
                    return;
                }
            }
        }
    }

    boolean isHurt(RobotInfo r){
        if (r.getType().isTowerType()) return false;
        return 4*r.getPaintAmount() < r.getType().paintCapacity;
    }

    MapLocation searchClosestHurt() throws GameActionException {
        RobotInfo mostHurt = null;
        RobotInfo[] rs = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam());
        for (RobotInfo r : rs){
            if (isHurt(r)){
                if (mostHurt == null || r.getPaintAmount() < mostHurt.getPaintAmount()) mostHurt = r;
            }
        }
        if (mostHurt == null) return null;
        return mostHurt.getLocation();
    }


    static int[] X = new int[]{2, 2, 2, 0, -2, -2, -2, 0};
    static int[] Y = new int[]{2, 0, -2, -2, -2, 0, 2, 2};

    static MapLocation getBestWaitingLoc() throws GameActionException {
        MapLocation bestSpot = null;
        MapLocation myLoc = rc.getLocation();
        int myID = rc.getID();
        int bestDistance = 0;
        int paintLost = 0;
        for (int i = 0; i < 8; ++i){
            MapLocation waitingLoc = TowerManager.closestPaintTower.translate(X[i], Y[i]);
            if (!rc.canSenseLocation(waitingLoc)) continue;
            RobotInfo r = rc.senseRobotAtLocation(waitingLoc);
            MapInfo m = rc.senseMapInfo(waitingLoc);
            int d = myLoc.distanceSquaredTo(waitingLoc);
            int pl = switch(m.getPaint()){
                case ENEMY_PRIMARY, ENEMY_SECONDARY -> GameConstants.PENALTY_ENEMY_TERRITORY;
                case EMPTY -> GameConstants.PENALTY_NEUTRAL_TERRITORY;
                default -> 0;
            };
            if ((r == null || r.getID() == myID) && (bestSpot == null || pl < paintLost  || (pl == paintLost && d < bestDistance))){
                bestDistance = d;
                bestSpot = waitingLoc;
                paintLost = pl;
            }
        }
        if (bestSpot == null){
            if (myLoc.distanceSquaredTo(TowerManager.closestPaintTower) <= 4){
                suicide = true;
                return null;
            }
            return TowerManager.closestPaintTower;
        }
        return bestSpot;
    }

    static MapLocation getRecoveryLoc() throws GameActionException {
        if (!rc.canSenseLocation(TowerManager.closestPaintTower)) return TowerManager.closestPaintTower;
        int neededPaint = rc.getType().paintCapacity - rc.getPaint();
        RobotInfo tower = rc.senseRobotAtLocation(TowerManager.closestPaintTower);
        int towerPaint = tower.getPaintAmount();
        if (towerPaint >= neededPaint || (towerPaint >= Constants.MINIMUM_PAINT_RECOVERY && rc.getPaint() <= Constants.CRITICAL_PAINT_RECOVERY)){
            return TowerManager.closestPaintTower;
        }
        return getBestWaitingLoc();
    }
}
