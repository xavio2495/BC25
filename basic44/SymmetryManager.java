package basic44;

import battlecode.common.*;

public class SymmetryManager {

    static final int H = 1, V = 2, R = 4;
    static final int HC = (~H)&7, VC = (~V)&7, RC = (~R)&7;

    static boolean foundH = false, foundR = false, foundV = false;

    static MapLocation base = null;
    static MapLocation bR, bH, bV;

    static MapLocation target;

    static int discardedSyms = 0;

    static MapLocation L;
    static int symX, symY;

    static long w, r;

    static long[] mapWalls = new long[60];
    static long[] mapRuins = new long[60];
    static long[] mapVision = new long[60];

    static void discardH(){
        discardedSyms |= H;
    }

    static void discardV(){
        discardedSyms |= V;
    }

    static void discardR(){
        discardedSyms |= R;
    }

    static int getSym(){
        return switch(discardedSyms){
            case HC -> H;
            case VC -> V;
            case RC -> R;
            default -> 0;
        };
    }

    static void checkSym(){
        if (base == null) return;
        if (Clock.getBytecodesLeft() < 400) return;
        if (getSym() != 0) return;
        MapInfo[] infos = MyRobot.rc.senseNearbyMapInfos();
        for (MapInfo m : infos){
            if (Clock.getBytecodesLeft() < 400) return;
            L = m.getMapLocation();
            mapVision[L.x] |= (1L << L.y);
            w = m.isWall() ? 1L : 0L;
            r = m.hasRuin() ? 1L : 0L;
            mapWalls[L.x] |= (w << L.y);
            mapRuins[L.x] |= (r << L.y);
            symX = MyRobot.W - L.x - 1;
            symY = MyRobot.H - L.y - 1;
            if (((mapVision[symX] & (1L << L.y)) != 0) && (((mapWalls[symX] >>> L.y) & 1) != w || ((mapRuins[symX] >>> L.y) & 1) != r)) discardH();
            if (((mapVision[L.x] & (1L << symY)) != 0) && (((mapWalls[L.x] >>> symY) & 1) != w || ((mapRuins[L.x] >>> symY) & 1) != r)) discardV();
            if (((mapVision[symX] & (1L << symY)) != 0) && (((mapWalls[symX] >>> symY) & 1) != w || ((mapRuins[symX] >>> symY) & 1) != r)) discardR();
        }
    }

    static MapLocation getSymmetric(MapLocation loc){
        return switch(getSym()){
            case H-> new MapLocation(MyRobot.W - loc.x - 1, loc.y);
            case V-> new MapLocation(loc.x, MyRobot.H - loc.y - 1);
            case R-> new MapLocation(MyRobot.W - loc.x - 1, MyRobot.H - loc.y - 1);
            default -> null;
        };
    }

    static void setBase(MapLocation loc){
        base = loc;
        bR =  new MapLocation(MyRobot.W - base.x - 1, MyRobot.H - base.y - 1);
        bV = new MapLocation(base.x, MyRobot.H - base.y - 1);
        bH = new MapLocation(MyRobot.W - base.x - 1, base.y);
    }

    static MapLocation getTarget(){
        if (base == null) return null;
        target = null;
        MapLocation myLoc = MyRobot.rc.getLocation();
        if ((discardedSyms & R) == 0 && !foundR){
            if (myLoc.distanceSquaredTo(bR) < 10) foundR = true;
            else return bR;
        }
        if ((discardedSyms & V) == 0 && !foundV){
            if (myLoc.distanceSquaredTo(bV) < 10) foundV = true;
            else return bV;
        }
        if ((discardedSyms & H) == 0 && !foundH){
            if (myLoc.distanceSquaredTo(bH) < 10) foundH = true;
            else return bH;
        }
        return null;
    }

}