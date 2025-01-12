package basic4;

import battlecode.common.*;

public class Tower extends MyRobot {

    int soldiersSpawned = 0;

    Tower(RobotController rc){
        super(rc);
    }

    void startTurn() throws GameActionException {

    }

    void runTurn() throws GameActionException {
        tryUpgrade();
        if (shouldSpawnSoldier()) spawn(UnitType.SOLDIER, null);
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

    boolean shouldSpawnSoldier(){
        if (creationTurn < 5 && soldiersSpawned == 0) return true;
        if (Util.towerMax()) return true;
        return rc.getChips() >= UnitType.LEVEL_ONE_PAINT_TOWER.moneyCost + UnitType.SOLDIER.moneyCost;
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
                if (type == UnitType.SOLDIER){
                    ++soldiersSpawned;
                }
            }
        } catch (GameActionException e){
            e.printStackTrace();
        }
    }
}