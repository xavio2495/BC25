package basic46;

import battlecode.common.MapLocation;

public class MapTracker {

    //final static int MAX_MAP_SIZE = 64;
    //final static int LONG_BITS = 64;
    final static int ARRAY_SIZE = 64;

    static long[] visitedLocations = new long[ARRAY_SIZE];


    MapTracker(){
    }

    static void reset(){
        visitedLocations = new long[ARRAY_SIZE];
    }

    static void add(MapLocation loc){
        visitedLocations[loc.x] |= (1L << loc.y);
    }

    static boolean check(MapLocation loc){
        return (((visitedLocations[loc.x] >>> loc.y) & 1L)) != 0L;
    }

}
