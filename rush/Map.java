package rush;

import battlecode.common.*;

public class Map {

    static int[][] map;

    static boolean H = true;
    static boolean V = true;
    static boolean R = true;

    static int Wi, He;


    static int RUIN = 4;
    static int PASSABLE = 1;
    static int WALL = 2;

    static MapLocation spawn;

    static void setSpawn(MapLocation loc){
        spawn = loc;
        map = new int[MyRobot.rc.getMapWidth()][MyRobot.rc.getMapHeight()];
        Wi = MyRobot.rc.getMapWidth();
        He = MyRobot.rc.getMapHeight();
    }

    static void update() throws GameActionException {
        if (R){
            MapLocation l = getRSym(spawn);
            if (!enemyTower(l)) R = false;
        }
        if (V){
            MapLocation l = getVSym(spawn);
            if (!enemyTower(l)) V = false;
        }
        if (H){
            MapLocation l = getHSym(spawn);
            if (!enemyTower(l)) H = false;
        }
    }

    static boolean enemyTower(MapLocation loc) throws GameActionException {
        if (!MyRobot.rc.canSenseLocation(loc)) return true;
        RobotInfo r = MyRobot.rc.senseRobotAtLocation(loc);
        if (r == null) return false;
        if (r.getTeam() == MyRobot.rc.getTeam()) return false;
        if (!r.getType().isTowerType()) return false;
        return true;
    }

    static void fill() throws GameActionException {
        MapInfo[] locs = MyRobot.rc.senseNearbyMapInfos();
        for (MapInfo l : locs){
            MapLocation loc = l.getMapLocation();
            int var;
            if (l.isWall()) var = WALL;
            else if (l.hasRuin()) var = RUIN;
            else {
                RobotInfo r = MyRobot.rc.senseRobotAtLocation(l.getMapLocation());
                if (r != null && r.getType().isTowerType()) var = RUIN;
                else var = PASSABLE;
            }
            map[loc.x][loc.y] = var;
            int x,y;
            if (R){
                x = Wi - loc.x - 1;
                y = He - loc.y - 1;
                if ((var | map[x][y]) != var) R = false;
            }
            if (V){
                x = loc.x;
                y = He - loc.y - 1;
                if ((var | map[x][y]) != var) V = false;
            }
            if (H){
                x = Wi - loc.x - 1;
                y = loc.y;
                if ((var | map[x][y]) != var) H = false;
            }
        }
    }

    static MapLocation getSymmetric(MapLocation loc){
        if (R) return getRSym(loc);
        if (V) return getVSym(loc);
        return getHSym(loc);
    }

    static MapLocation getRSym(MapLocation loc){
        return new MapLocation(Wi - loc.x-1, He - loc.y-1);
    }

    static MapLocation getVSym(MapLocation loc){
        return new MapLocation(loc.x, He - loc.y-1);
    }

    static MapLocation getHSym(MapLocation loc){
        return new MapLocation(Wi - loc.x-1, loc.y);
    }

}
