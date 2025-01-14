package basic9;

import battlecode.common.*;

public class Tower extends MyRobot {

    UnitType[] spawnPlan;
    int spawnPlanPos = 0;

    final int THRESHOLD = 10;

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
    static final UnitType[] spawnPlanDefault = {
            UnitType.SOLDIER,
            UnitType.MOPPER,
    };

    Tower(RobotController rc){
        super(rc);

        if (rc.getRoundNum() < 4) {
            spawnPlan = switch (rc.getType()) {
                case LEVEL_ONE_PAINT_TOWER -> spawnPlanInitialPaint;
                case LEVEL_ONE_MONEY_TOWER -> spawnPlanInitialMoney;
                default -> spawnPlanDefault;
            };
        } else {
            spawnPlan = spawnPlanDefault;
        }
    }

    void startTurn() throws GameActionException {

    }

    void checkSpawnPlan(){
        if (spawnPlan == spawnPlanDefault) return;
        if (spawnPlanPos + 2*rc.getNumberTowers() >= THRESHOLD){
            spawnPlan = spawnPlanDefault;
            spawnPlanPos = 1;
        }
    }

    void runTurn() throws GameActionException {
        tryUpgrade();
        checkSpawnPlan();

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

    UnitType getNextSpawn() {
        return spawnPlan[spawnPlanPos];
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

                spawnPlanPos++;
                if (spawnPlanPos >= spawnPlan.length) {
                    spawnPlanPos = 0;
                    spawnPlan = spawnPlanDefault;
                }
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
