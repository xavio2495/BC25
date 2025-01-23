package basic30;

import battlecode.common.*;

public class TowerManager {

    static final int PAINT = 0;
    static final int MONEY = 1;
    static final int DEFENSE = 2;

    static int[] count = new int[3];

    static MapLocation closestPaintTower = null;
    static int d = 0;


    static void updateClosest(){
        if (closestPaintTower != null) d = MyRobot.rc.getLocation().distanceSquaredTo(closestPaintTower);
    }


    static void update(RobotInfo r) throws GameActionException  {
        if (r != null && r.getTeam() == MyRobot.rc.getTeam()){
            switch(r.getType()){
                case LEVEL_ONE_PAINT_TOWER:
                case LEVEL_TWO_PAINT_TOWER:
                case LEVEL_THREE_PAINT_TOWER:
                    int newD = MyRobot.rc.getLocation().distanceSquaredTo(r.getLocation());
                    if (closestPaintTower == null || newD < d){
                        closestPaintTower = r.getLocation();
                        d = newD;
                    }
                    break;
            }
        }
    }


    static void updateAll() throws GameActionException {
        updateClosest();
        RobotInfo[] robots = MyRobot.rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, MyRobot.rc.getTeam());
        for (RobotInfo r : robots){
            switch(r.getType()){
                case LEVEL_ONE_PAINT_TOWER:
                case LEVEL_TWO_PAINT_TOWER:
                case LEVEL_THREE_PAINT_TOWER:
                    int newD = MyRobot.rc.getLocation().distanceSquaredTo(r.getLocation());
                    if (closestPaintTower == null || newD < d){
                        closestPaintTower = r.getLocation();
                        d = newD;
                    }
                    break;
            }
        }
    }

    static int ruinCountGuess;
    static int[] buildPlan;

    static int[] buildPlanSmall = { MONEY, MONEY, MONEY, PAINT, MONEY, PAINT, PAINT, DEFENSE };
    static int[] buildPlanBig = { MONEY, MONEY, MONEY, MONEY, MONEY, MONEY, MONEY, MONEY, PAINT, PAINT, PAINT, PAINT,
            DEFENSE };

    static void init() {
        int cells = MyRobot.rc.getMapWidth() * MyRobot.rc.getMapHeight();
        ruinCountGuess = cells / 40;
        if (ruinCountGuess < 16)
            buildPlan = buildPlanSmall;
        else
            buildPlan = buildPlanBig;
    }

    static int getNextBuildOld(){
        int i = MyRobot.rc.getNumberTowers();
        if (i >= buildPlan.length) {
            i = buildPlan.length - 1;
        }
        if (MyRobot.rc.getNumberTowers() < 7 && buildPlan[i] == DEFENSE){
            return MONEY;
        }
        return buildPlan[i];
    }


    static int getNextBuild() {
        //int ans = getNextBuildOld();
        int ch = MyRobot.rc.getChips();
        //int tn = MyRobot.rc.getNumberTowers();
        if (ch < Constants.MIN_CHIPS_PAINT_TOWER) return MONEY;
        return PAINT;
        /*if (ch >= Constants.MIN_CHIPS_PAINT_TOWER) return PAINT;
        if (tn < 7 && ans == DEFENSE) ans = MONEY;
        return ans;*/
    }


    static int towerCountCurrent;
    static int towerCountPrev;
    static int roundDestruction = 0;

    static void updateTowerCount(){
        towerCountPrev = towerCountCurrent;
        towerCountCurrent = MyRobot.rc.getNumberTowers();
    }

    static boolean shouldDestruct() throws GameActionException {
        RobotController rc = MyRobot.rc;
        if (towerCountCurrent < towerCountPrev){
            roundDestruction = rc.getRoundNum();
            return false;
        }
        if (rc.getRoundNum() < MyRobot.creationTurn + 2 || rc.getRoundNum() < roundDestruction + Constants.WAIT_DESTRUCTION) return false;
        if (rc.getChips() < Constants.MIN_CHIPS_DESTRUCTION) return false;
        switch(rc.getType()) {
            case LEVEL_ONE_PAINT_TOWER:
            case LEVEL_TWO_PAINT_TOWER:
            case LEVEL_THREE_PAINT_TOWER:
            case LEVEL_ONE_DEFENSE_TOWER:
            case LEVEL_TWO_DEFENSE_TOWER:
            case LEVEL_THREE_DEFENSE_TOWER:
                return false;
        }
        if (enemyTilesNearby()) return false;
        return (soldierNearby());
    }

    static boolean enemyTilesNearby(){
        MapInfo[] mis = MyRobot.rc.senseNearbyMapInfos();
        for (MapInfo m : mis) if (m.getPaint().isEnemy()) return true;
        return false;
    }

    static boolean soldierNearby() throws GameActionException {
        RobotInfo[] robots = MyRobot.rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, MyRobot.rc.getTeam());
        for (RobotInfo r : robots){
            if (r.getType() == UnitType.SOLDIER && r.getPaintAmount() > 100) return true;
        }
        return false;
    }




}
