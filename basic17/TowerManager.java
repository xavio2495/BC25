package basic17;

import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotInfo;

public class TowerManager {

    static final int PAINT = 0;
    static final int MONEY = 1;
    static final int DEFENSE = 2;

    static final int ID_HASH = 1000;

    static boolean[] ids = new boolean [ID_HASH];

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
            if (!ids[r.getID()%ID_HASH]) {
                switch (r.getType()) {
                    case LEVEL_ONE_MONEY_TOWER:
                    case LEVEL_TWO_MONEY_TOWER:
                    case LEVEL_THREE_MONEY_TOWER:
                        ++count[MONEY];
                        ids[r.getID() % ID_HASH] = true;
                        break;
                    case LEVEL_ONE_PAINT_TOWER:
                    case LEVEL_TWO_PAINT_TOWER:
                    case LEVEL_THREE_PAINT_TOWER:
                        ++count[PAINT];
                        ids[r.getID() % ID_HASH] = true;
                        break;
                    case LEVEL_ONE_DEFENSE_TOWER:
                    case LEVEL_TWO_DEFENSE_TOWER:
                    case LEVEL_THREE_DEFENSE_TOWER:
                        ++count[DEFENSE];
                        ids[r.getID() % ID_HASH] = true;
                        break;
                }
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

    static int getNextBuild() {
        int i = MyRobot.rc.getNumberTowers();
        if (i >= buildPlan.length) {
            i = buildPlan.length - 1;
        }
        return buildPlan[i];
    }

}
