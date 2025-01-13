package basic6;

import battlecode.common.*;

public class Tower extends MyRobot {

    int[] unitsSpawnedByType = new int[20];

    Tower(RobotController rc){
        super(rc);
    }

    void startTurn() throws GameActionException {

    }

    void runTurn() throws GameActionException {
        tryUpgrade();
        UnitType t = getNextSpawn();
        if (shouldSpawn(t)) spawn(t, null);
        attack();
        //if (shouldSpawnSoldier()) spawn(UnitType.SOLDIER, null);
    }

    void endTurn() throws GameActionException {
    }

    void tryUpgrade() throws GameActionException {
        int savings = 0;
        if (!Util.towerMax()) savings = UnitType.LEVEL_ONE_PAINT_TOWER.moneyCost;
        switch(rc.getType()){
            case LEVEL_ONE_PAINT_TOWER:
                if (rc.getChips() >= UnitType.LEVEL_TWO_MONEY_TOWER.moneyCost + savings){
                    if (rc.canUpgradeTower(rc.getLocation())) rc.upgradeTower(rc.getLocation());
                }
                break;
            case LEVEL_TWO_PAINT_TOWER:
                if (rc.getChips() >= UnitType.LEVEL_THREE_PAINT_TOWER.moneyCost + savings){
                    if (rc.canUpgradeTower(rc.getLocation())) rc.upgradeTower(rc.getLocation());
                }
                break;
        }
    }

    /*boolean shouldSpawnSoldier(){
        if (creationTurn < 5 && soldiersSpawned == 0) return true;
        if (Util.towerMax()) return true;
        return rc.getChips() >= UnitType.LEVEL_ONE_PAINT_TOWER.moneyCost + UnitType.SOLDIER.moneyCost;
    }*/

    UnitType getNextSpawn(){
        if (unitsSpawnedByType[UnitType.SOLDIER.ordinal()] <= unitsSpawnedByType[UnitType.MOPPER.ordinal()] + 1) return UnitType.SOLDIER;
        return UnitType.MOPPER;
    }

    boolean shouldSpawn(UnitType t){
        //if (t == UnitType.SOLDIER && creationTurn < 5 && unitsSpawnedByType[UnitType.SOLDIER.ordinal()] == 0) return true;
        if (Util.towerMax()) return true;
        return rc.getChips() >= UnitType.LEVEL_ONE_PAINT_TOWER.moneyCost + t.moneyCost;
    }

    void spawn(UnitType type, MapLocation target){
        MapLocation bestLoc = null;
        int bestDist = -1;
        Direction dir = directions[(int)(Math.random() * 8.0)];
        for (int i = 0; i < 8; ++i){
            MapLocation loc = rc.adjacentLocation(dir);
            if (!rc.canBuildRobot(type, rc.adjacentLocation(dir))) continue;
            if (target == null){
                bestLoc = loc;
            } else {
                int d = loc.distanceSquaredTo(target);
                if (bestDist < 0 || d < bestDist) {
                    bestDist = d;
                    bestLoc = loc;
                }
            }
            dir = dir.rotateLeft();
        }
        try {
            if (bestLoc != null){
                rc.buildRobot(type, bestLoc);
                ++unitsSpawnedByType[type.ordinal()];
            }
        } catch (GameActionException e){
            e.printStackTrace();
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
}