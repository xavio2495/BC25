package basic46;

import battlecode.common.*;

public class Tower extends MyRobot {

    UnitType[] spawnPlan;
    int spawnPlanPos = 0;

    final int THRESHOLD = 10;

    final int ROUNDS_PROTECTION = 40;

    static int enemySoldiers;
    static int alliedMoppers;

    int roundMopper = -ROUNDS_PROTECTION;

    static boolean paintTower;

    int[] soldierDirCount = new int[8];
    int[] mopperDirCount = new int[8];
    int[] splasherDirCount = new int[8];
    double[] dists = new double[8];

    static final UnitType[] spawnPlanInitialPaint = {
            UnitType.SOLDIER,
            UnitType.SOLDIER,
            UnitType.SOLDIER,
            UnitType.SOLDIER,
            UnitType.SOLDIER,
            UnitType.SOLDIER
    };
    static final UnitType[] spawnPlanInitialMoney = {
            UnitType.SOLDIER,
            UnitType.SOLDIER,
            UnitType.SOLDIER,
            UnitType.SOLDIER,
            UnitType.SOLDIER,
            UnitType.SOLDIER
    };
    static UnitType[] spawnPlanEarly = {
            UnitType.SOLDIER,
            UnitType.MOPPER,
            UnitType.SPLASHER,
    };
    static UnitType[] spawnPlanMid = {
            UnitType.SOLDIER,
            UnitType.MOPPER,
            UnitType.SPLASHER,
            UnitType.MOPPER,
    };
    static UnitType[] spawnPlanLate = {
            UnitType.SOLDIER,
            UnitType.SPLASHER,
            UnitType.SPLASHER,
            UnitType.SPLASHER,
            UnitType.SPLASHER,
    };

    static final int TURNS_PAINT = 20;
    int[] paintIncrease = new int[TURNS_PAINT];
    int oldPaint = 0;
    boolean spawnInitial = true;

    Tower(RobotController rc) throws GameActionException {
        super(rc);

        spawnPlan = spawnPlanInitialPaint;

        doDirs();
        oldPaint = MyRobot.rc.getPaint();
        VisionManager.makeAssignments();

        paintTower = switch(rc.getType()){
            case LEVEL_ONE_PAINT_TOWER, LEVEL_TWO_PAINT_TOWER, LEVEL_THREE_PAINT_TOWER -> true;
            default -> false;
        };
    }

    void startTurn() throws GameActionException {
        TowerManager.updateTowerCount();
        TowerManager.updateAll();
        for (Direction dir : directions) if (rc.canRemoveMark(rc.getLocation().add(dir))) rc.removeMark(rc.getLocation().add(dir));
        switch(rc.getType()){
            case LEVEL_ONE_PAINT_TOWER:
            case LEVEL_TWO_PAINT_TOWER:
            case LEVEL_THREE_PAINT_TOWER:
                TowerManager.closestPaintTower = rc.getLocation();
                TowerManager.roundPaintTowerSeen = rc.getRoundNum();
                break;
        }
        TowerManager.readMessages();
        paintIncrease[rc.getRoundNum()%TURNS_PAINT] = MyRobot.rc.getPaint() - oldPaint;
    }

    void doDirs(){
        int dx, dy;
        MapLocation myLoc = rc.getLocation();
        dists[Direction.EAST.ordinal()] = W - myLoc.x - 1;;
        dx = W - myLoc.x - 1;
        dy = H - myLoc.y - 1;
        dists[Direction.NORTHEAST.ordinal()] = Math.sqrt(2)*Math.min(dx,dy);
        dists[Direction.NORTH.ordinal()] = H - myLoc.y - 1;
        dx = W - myLoc.x - 1;
        dy = myLoc.y;
        dists[Direction.SOUTHEAST.ordinal()] = Math.sqrt(2)*Math.min(dx,dy);
        dists[Direction.WEST.ordinal()] = myLoc.x;;
        dx = myLoc.x;
        dy = H - myLoc.y - 1;
        dists[Direction.NORTHWEST.ordinal()] = Math.sqrt(2)*Math.min(dx,dy);
        dx = myLoc.x;
        dy = myLoc.y;
        dists[Direction.SOUTHWEST.ordinal()] = Math.sqrt(2)*Math.min(dx,dy);
        dists[Direction.SOUTH.ordinal()] = myLoc.y;
    }

    Direction getBestDir(int[] dirCount){
        Direction ans = null;
        double dAns = -1;
        for (Direction dir : directions){
            if (!rc.canBuildRobot(UnitType.SOLDIER, rc.getLocation().add(dir))) continue;
            double ndAns = dists[dir.ordinal()]/(2*(dirCount[dir.ordinal()])+1);
            if (ndAns > dAns){
                dAns = ndAns;
                ans = dir;
            }
        }
        return ans;
    }

    UnitType[] wantedSpawnPlan() {
        var round = rc.getRoundNum();
        if(round < 500) return spawnPlanEarly;
        if(round < 1700) return spawnPlanMid;
        return spawnPlanLate;
    }

    void checkSpawnPlan(){
        if (spawnInitial && spawnPlanPos + 2*rc.getNumberTowers() >= THRESHOLD){
            spawnPlan = wantedSpawnPlan();
            spawnPlanPos = 0;
            spawnInitial = false;
        }

        if(!spawnInitial) {
            var want = wantedSpawnPlan();
            if(spawnPlan != want) {
                spawnPlan = want;
                spawnPlanPos = 0;
            }
        }
    }

    void runTurn() throws GameActionException {
        checkSpawnPlan();

        MapLocation m = getThreat();
        if(m != null && rc.getRoundNum() >= roundMopper + ROUNDS_PROTECTION) spawnDefense(m);

        UnitType t = getNextSpawn();
        if (shouldSpawn(t)){
            if (paintTower && t == UnitType.SOLDIER && rc.getRoundNum() < Constants.RUSH_TURNS) spawnRush();
            else spawn(t);
        }
        tryUpgrade();
        attack();
        //if (shouldSpawnSoldier()) spawn(UnitType.SOLDIER, null);
    }

    void endTurn() throws GameActionException {
        TowerManager.reportPaintTowerTower();
        if (TowerManager.shouldDestruct()) rc.disintegrate();
        oldPaint = MyRobot.rc.getPaint();
    }

    void tryUpgrade() throws GameActionException {
        int savings = 0;
        if (!Util.towerMax()) savings = UnitType.LEVEL_ONE_PAINT_TOWER.moneyCost;
        switch(rc.getType()){
            case LEVEL_ONE_PAINT_TOWER:
                if (rc.getChips() >= UnitType.LEVEL_TWO_MONEY_TOWER.moneyCost + savings){
                    if (rc.canUpgradeTower(rc.getLocation()) && maxIncrease() < Constants.MIN_INCREASE_NO_UPGRADE_2) rc.upgradeTower(rc.getLocation());
                }
                break;
            case LEVEL_TWO_PAINT_TOWER:
                if (rc.getChips() >= UnitType.LEVEL_THREE_PAINT_TOWER.moneyCost + savings){
                    if (rc.canUpgradeTower(rc.getLocation()) && maxIncrease() < Constants.MIN_INCREASE_NO_UPGRADE_2) rc.upgradeTower(rc.getLocation());
                }
                break;
        }
    }

    int maxIncrease(){
        int ans = 0;
        for (int x : paintIncrease) if (ans < x) ans = x;
        return ans;
    }

    /*boolean shouldSpawnSoldier(){
        if (creationTurn < 5 && soldiersSpawned == 0) return true;
        if (Util.towerMax()) return true;
        return rc.getChips() >= UnitType.LEVEL_ONE_PAINT_TOWER.moneyCost + UnitType.SOLDIER.moneyCost;
    }*/

    void spawnDefense(MapLocation target) throws GameActionException {
        MapLocation[] locs = rc.getAllLocationsWithinRadiusSquared(rc.getLocation(), GameConstants.BUILD_ROBOT_RADIUS_SQUARED);
        MapLocation bestLoc = null;
        int bestDist = 0;
        for (MapLocation loc : locs){
            if (!rc.canBuildRobot(UnitType.MOPPER, loc)) continue;
            int d = loc.distanceSquaredTo(target);
            if (bestLoc == null || d < bestDist){
                bestDist = d;
                bestLoc = loc;
            }
        }
        if (bestLoc != null){
            rc.buildRobot(UnitType.MOPPER, bestLoc);
            if (getNextSpawn() == UnitType.MOPPER) increasePlan();
        }
    }

    void spawnRush() throws GameActionException {
        MapLocation target = new MapLocation(MyRobot.W - rc.getLocation().x - 1, MyRobot.H - rc.getLocation().y - 1);
        MapLocation[] locs = rc.getAllLocationsWithinRadiusSquared(rc.getLocation(), GameConstants.BUILD_ROBOT_RADIUS_SQUARED);
        MapLocation bestLoc = null;
        int bestDist = 0;
        for (MapLocation loc : locs){
            if (!rc.canBuildRobot(UnitType.SOLDIER, loc)) continue;
            int d = loc.distanceSquaredTo(target);
            if (bestLoc == null || d < bestDist){
                bestDist = d;
                bestLoc = loc;
            }
        }
        if (bestLoc != null){
            rc.buildRobot(UnitType.SOLDIER, bestLoc);
            increaseCount(soldierDirCount, rc.getLocation().directionTo(bestLoc));
            //soldierDirCount[rc.getLocation().directionTo(bestLoc).ordinal()]++;
            increasePlan();
        }
    }

    void increaseCount(int[] dirCount, Direction dir){
        int ord = dir.ordinal();
        int or1 = dir.rotateLeft().ordinal();
        int or2 = dir.rotateRight().ordinal();
        dirCount[ord]++;
        dirCount[or1]++;
        dirCount[or2]++;
    }

    UnitType getNextSpawn() {
        return spawnPlan[spawnPlanPos];
    }

    boolean shouldSpawn(UnitType t){
        //if (t == UnitType.SOLDIER && creationTurn < 5 && unitsSpawnedByType[UnitType.SOLDIER.ordinal()] == 0) return true;
        if (Util.towerMax()) return true;
        return rc.getChips() >= UnitType.LEVEL_ONE_PAINT_TOWER.moneyCost + t.moneyCost;
    }

    void spawn(UnitType t) throws GameActionException {
        int[] dirCount = switch(t){
            case SOLDIER -> soldierDirCount;
            case SPLASHER -> splasherDirCount;
            default -> mopperDirCount;
        };
        Direction dir = getBestDir(dirCount);
        if (dir == null) return;
        if (rc.canBuildRobot(t, rc.getLocation().add(dir).add(dir))){
            rc.buildRobot(t, rc.getLocation().add(dir).add(dir));
            increaseCount(dirCount, dir);
            //dirCount[dir.ordinal()]++;
            increasePlan();
        }

        if (rc.canBuildRobot(t, rc.getLocation().add(dir))){
            rc.buildRobot(t, rc.getLocation().add(dir));
            increaseCount(dirCount, dir);
            //dirCount[dir.ordinal()]++;
            increasePlan();
        }
    }

    void increasePlan(){
        spawnPlanPos++;
        if (spawnPlanPos >= spawnPlan.length) {
            spawnPlanPos = 0;
            spawnPlan = wantedSpawnPlan();
            spawnInitial = false;
        }
    }

    void attack() throws GameActionException {
        if (rc.canAttack(null)) rc.attack(null);
        RobotInfo[] enemies = rc.senseNearbyRobots(rc.getType().actionRadiusSquared, rc.getTeam().opponent());
        RobotInfo bestR = null;
        for (RobotInfo r : enemies){
            if (!rc.canAttack(r.getLocation())) continue;
            if (isBetterThan(r, bestR)) bestR = r;
        }
        if (bestR != null) rc.attack(bestR.getLocation());
    }

    boolean isBetterThan(RobotInfo A, RobotInfo B){
        if (B == null) return true;
        if (A.getType() == UnitType.SPLASHER && B.getType() != UnitType.SPLASHER) return true;
        if (A.getType() != UnitType.SPLASHER && B.getType() == UnitType.SPLASHER) return false;
        if (A.getType() == UnitType.SOLDIER && B.getType() != UnitType.SOLDIER) return true;
        if (A.getType() == UnitType.SOLDIER && B.getType() != UnitType.SOLDIER) return false;
        return (A.getHealth() < B.getHealth());
    }

    static MapLocation getThreat() throws GameActionException {
        VisionManager.computeDistsTower();
        RobotInfo[] enemies = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam().opponent());
        MapLocation bestAns = null;
        enemySoldiers = 0;
        alliedMoppers = 0;
        int bestDist = 0;
        for (RobotInfo r : enemies){
            if (r.getType() != UnitType.SOLDIER) continue;
            if (VisionManager.computeDistance(r.getLocation()) > Constants.DIST_INF) continue;
            ++enemySoldiers;
            int d = r.getLocation().distanceSquaredTo(rc.getLocation());
            if (bestAns == null || d < bestDist){
                bestDist = d;
                bestAns = r.getLocation();
            }
        }
        RobotInfo[] allies = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam());
        for (RobotInfo r : allies){
            if (VisionManager.computeDistance(r.getLocation()) > Constants.DIST_INF) continue;
            if (r.getType() == UnitType.MOPPER) ++alliedMoppers;
        }
        if (alliedMoppers < enemySoldiers+1 || alliedMoppers < 3) return bestAns;
        return null;
    }
}
