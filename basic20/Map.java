package basic20;

import battlecode.common.*;

public class Map {

    static int[][] map;

    //static long[] map2;

    static RobotController rc;

    /*
     Bit 0 -> Not Wall / Wall
     Bit 1 -> Not Ruin / Ruin
     Bit 2 -> Not Enemy / Enemy
     Bit 3 -> Not Ally / Ally
     Bit 4 -> Obstructed
     Bit 5-9 -> RuinType
     Bit 10-20 -> Round Enemy Paint OR pointer towards tower
     Bit 21 -> 31 Round Nearby Ruins
     */


    //static final int NEARBY_TILES_WITH_ENEMY_PAINT = 16;
    //static final int NT_C = 0xFFFFFFFF - NEARBY_TILES_WITH_ENEMY_PAINT;
    static final int ENEMY_TOWER = 4;
    static final int ENEMY_TOWER_C = ~ENEMY_TOWER;
    static final int ALLY_TOWER = 2;
    static final int ALLY_TOWER_C = ~ALLY_TOWER;
    static final int OBSTRUCTED = 8;
    static final int RUIN = 1;
    static final int NO_PAINT = (1 << 9);
    //static final int WALL = 1;
    static int RUIN_TYPE_TYPE_SHIFT = 4;
    static int RUIN_TYPE_C = 0xFFFFFC0F;

    static int ROUND_ENEMY_PAINT_SHIFT = 10;
    static int ROUND_ENEMY_PAINT_C = 0xFFE003FF;

    static int ROUND_RUIN_SHIFT = 21;
    static int ROUND_RUIN_C = 0x001FFFFF;

    static int MIN_ROUNDS_ENEMY_PAINT = 45;
    static int MIN_ROUNDS_RUIN = 45;


    static void initialize(){
        map = new int[MyRobot.W][MyRobot.H];
        //map2 = new long[MyRobot.W];
    }

    static void fill() throws GameActionException {
        TowerManager.updateClosest();
        rc = MyRobot.rc;
        MapLocation[] ruins = MyRobot.rc.senseNearbyRuins(GameConstants.VISION_RADIUS_SQUARED);
        for (MapLocation m : ruins){
            int x = m.x, y = m.y;

            if((map[x][y] & RUIN) == 0){
                map[x][y] |= RUIN;

                map[x-2][y-2] |= (1 << ROUND_ENEMY_PAINT_SHIFT);
                map[x-2][y-1] |= (2 << ROUND_ENEMY_PAINT_SHIFT);
                map[x-2][y] |= (3 << ROUND_ENEMY_PAINT_SHIFT);
                map[x-2][y+1] |= (4 << ROUND_ENEMY_PAINT_SHIFT);
                map[x-2][y+2] |= (5 << ROUND_ENEMY_PAINT_SHIFT);

                map[x-1][y-2] |= (6 << ROUND_ENEMY_PAINT_SHIFT);
                map[x-1][y-1] |= (7 << ROUND_ENEMY_PAINT_SHIFT);
                map[x-1][y] |= (8 << ROUND_ENEMY_PAINT_SHIFT);
                map[x-1][y+1] |= (9 << ROUND_ENEMY_PAINT_SHIFT);
                map[x-1][y+2] |= (10 << ROUND_ENEMY_PAINT_SHIFT);

                map[x][y-2] |= (11 << ROUND_ENEMY_PAINT_SHIFT);
                map[x][y-1] |= (12 << ROUND_ENEMY_PAINT_SHIFT);
                map[x][y+1] |= (14 << ROUND_ENEMY_PAINT_SHIFT);
                map[x][y+2] |= (15 << ROUND_ENEMY_PAINT_SHIFT);

                map[x+1][y-2] |= (16 << ROUND_ENEMY_PAINT_SHIFT);
                map[x+1][y-1] |= (17 << ROUND_ENEMY_PAINT_SHIFT);
                map[x+1][y] |= (18 << ROUND_ENEMY_PAINT_SHIFT);
                map[x+1][y+1] |= (19 << ROUND_ENEMY_PAINT_SHIFT);
                map[x+1][y+2] |= (20 << ROUND_ENEMY_PAINT_SHIFT);

                map[x+2][y-2] |= (21 << ROUND_ENEMY_PAINT_SHIFT);
                map[x+2][y-1] |= (22 << ROUND_ENEMY_PAINT_SHIFT);
                map[x+2][y] |= (23 << ROUND_ENEMY_PAINT_SHIFT);
                map[x+2][y+1] |= (24 << ROUND_ENEMY_PAINT_SHIFT);
                map[x+2][y+2] |= (25 << ROUND_ENEMY_PAINT_SHIFT);
            }



            RobotInfo r = MyRobot.rc.senseRobotAtLocation(m);
            if (r != null){
                if (r.getTeam() == rc.getTeam()){
                    map[x][y] |= ALLY_TOWER;
                    map[x][y] &= ENEMY_TOWER_C;
                    TowerManager.update(r);
                }
                else{
                    map[x][y] |= ENEMY_TOWER;
                    map[x][y] &= ALLY_TOWER_C;
                }
                map[x][y] &= ROUND_RUIN_C;
            }
            else {
                int ruinType = RuinManager.checkPattern(m);
                int c = (((map[x][y] & RUIN_TYPE_C) & ALLY_TOWER_C) & ENEMY_TOWER_C);
                //MyRobot.debugLine += ("Pattern at " + m + " is " + c + ".   ");
                c |= (ruinType << RUIN_TYPE_TYPE_SHIFT);
                if ((ruinType & 16) != 0){
                    c &= ROUND_ENEMY_PAINT_C;
                    c |= ((rc.getRoundNum() + MIN_ROUNDS_ENEMY_PAINT) << ROUND_ENEMY_PAINT_SHIFT);
                }
                else if ((ruinType & 8) == 0){
                    c &= ROUND_ENEMY_PAINT_C;
                }
                //if (((c >>> ROUND_ENEMY_PAINT_SHIFT) & 0xFFF) <= rc.getRoundNum()) Unit.updateClosestRuin(m);
                map[x][y] = c;

                int rd = ((rc.getRoundNum() + MIN_ROUNDS_RUIN) << ROUND_RUIN_SHIFT);
                map[x][y] |= rd;
            }
        }
    }

    static int getPattern(MapLocation loc){
        return  ((map[loc.x][loc.y] >>> RUIN_TYPE_TYPE_SHIFT) & 0x1F);
    }

    /*static boolean enemyPainted(MapLocation loc){
        int c = map[loc.x][loc.y];
        return ((c >>> ROUND_ENEMY_PAINT_SHIFT) & 0x7FF) <= MyRobot.rc.getRoundNum();
    }*/

    static boolean invalidTarget(MapLocation loc){
        int c = map[loc.x][loc.y];
        //MyRobot.debugLine += ("Code at " + loc + " is " + c + ".   ");
        //rc.setIndicatorString(MyRobot.debugLine);
        if (((c >>> ROUND_ENEMY_PAINT_SHIFT) & 0x7FF) > MyRobot.rc.getRoundNum() && (c & NO_PAINT) != 0) return true;
        return (c & 6) != 0;
    }

    static boolean hasEnemyPaint(MapLocation loc){
        return (((map[loc.x][loc.y] >>> ROUND_ENEMY_PAINT_SHIFT) & 0x7FF) > MyRobot.rc.getRoundNum());
    }

    static boolean isNearRuin(MapLocation loc){
        int c = (map[loc.x][loc.y] >>> ROUND_ENEMY_PAINT_SHIFT) & 31;
        int code = switch(c){
            case 1 -> map[loc.x+2][loc.y+2];
            case 2 -> map[loc.x+2][loc.y+1];
            case 3 -> map[loc.x+2][loc.y];
            case 4 -> map[loc.x+2][loc.y-1];
            case 5-> map[loc.x+2][loc.y-2];
            case 6 -> map[loc.x+1][loc.y+2];
            case 7 -> map[loc.x+1][loc.y+1];
            case 8 -> map[loc.x+1][loc.y];
            case 9 -> map[loc.x+1][loc.y-1];
            case 10 -> map[loc.x+1][loc.y-2];
            case 11 -> map[loc.x][loc.y+2];
            case 12 -> map[loc.x][loc.y+1];
            case 14 -> map[loc.x][loc.y-1];
            case 15 -> map[loc.x][loc.y-2];
            case 16 -> map[loc.x-1][loc.y+2];
            case 17 -> map[loc.x-1][loc.y+1];
            case 18 -> map[loc.x-1][loc.y];
            case 19 -> map[loc.x-1][loc.y-1];
            case 20 -> map[loc.x-1][loc.y-2];
            case 21 -> map[loc.x-2][loc.y+2];
            case 22 -> map[loc.x-2][loc.y+1];
            case 23 -> map[loc.x-2][loc.y];
            case 24 -> map[loc.x-2][loc.y-1];
            case 25 -> map[loc.x-2][loc.y-2];
            default -> 0; //TODO this is alright, right?
        };
        return (code & 6) == 0 && (((code >>> ROUND_RUIN_SHIFT) & 0x7FF) > MyRobot.rc.getRoundNum());
        //return (((c >>> ROUND_RUIN_SHIFT) & 0x7FF) > MyRobot.rc.getRoundNum());
    }



    /*static boolean canCenterHere(MapLocation loc){
        int c = map[loc.x][loc.y];
        if ((c & 28) > 0) return false;
        return (((c >>> ROUND_ENEMY_PAINT_SHIFT) & 0x7FF) <= MyRobot.rc.getRoundNum());
    }*/

    static boolean forbiddenCenter(MapLocation loc){
        if (loc.x <= 1 || loc.y <= 1 || loc.x >= MyRobot.W-2 || loc.y >= MyRobot.H-2) return true;
        int c = map[loc.x][loc.y];
        if ((c & 15) != 0) return true;
        return (c >>> ROUND_RUIN_SHIFT & 0x7FF) > MyRobot.rc.getRoundNum();
    }

    static void markObstructed(MapLocation loc){
        map[loc.x][loc.y] |= OBSTRUCTED;
    }

    /*IMPORTANT: DO NOT DO THIS ON TOP OF RUINS*/
    static void markCenterNearRuins(MapLocation loc){
        map[loc.x][loc.y] |= ((rc.getRoundNum() + MIN_ROUNDS_RUIN) << ROUND_RUIN_SHIFT);
    }

}
