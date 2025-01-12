package basic3;

import battlecode.common.*;

public class Map {

    static int[][] map;

    static final int RUIN = 2;
    static final int WALL = 1;


    static void initialize(){
        map = new int[MyRobot.W][MyRobot.H];
    }

    static void fill() throws GameActionException {
        MapLocation[] ruins = MyRobot.rc.senseNearbyRuins(GameConstants.VISION_RADIUS_SQUARED);
        for (MapLocation m : ruins){
            int x = m.x, y = m.y;
            map[x][y] |= 1;
        }
    }
}
