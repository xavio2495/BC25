package basic3;

import battlecode.common.GameActionException;
import battlecode.common.GameConstants;
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


    static void update() throws GameActionException  {
        MapLocation[] ruins = MyRobot.rc.senseNearbyRuins(GameConstants.VISION_RADIUS_SQUARED);
        if (closestPaintTower == null) d = -1;
        else d = closestPaintTower.distanceSquaredTo(MyRobot.rc.getLocation());
        for (MapLocation loc : ruins){
            RobotInfo r = MyRobot.rc.senseRobotAtLocation(loc);
            if (r != null && r.getTeam() == MyRobot.rc.getTeam()){
                switch(r.getType()){
                    case LEVEL_ONE_PAINT_TOWER:
                    case LEVEL_TWO_PAINT_TOWER:
                    case LEVEL_THREE_PAINT_TOWER:
                        int newD = MyRobot.rc.getLocation().distanceSquaredTo(r.getLocation());
                        if (d < 0 || newD < d){
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
    }

    static int getNextBuild(){
        /*if (count[PAINT] <= count[MONEY] && count[PAINT] <= count[DEFENSE]) return PAINT;
        if (count[MONEY] <= count[PAINT] && count[MONEY] <= count[DEFENSE]) return MONEY;
        return DEFENSE;*/
        return switch (MyRobot.rc.getNumberTowers()) {
            case 0, 1, 2, 3, 4, 5, 6, 7 -> MONEY;
            case 8, 9, 10, 11 -> PAINT;
            default -> DEFENSE;
        };
    }

}
