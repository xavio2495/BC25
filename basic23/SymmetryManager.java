package basic23;

import battlecode.common.*;

public class SymmetryManager {

    static final int H = 1, V = 2, R = 4;
    static final int HC = (~H)&7, VC = (~V)&7, RC = (~R)&7;

    static final int CODE = 0xF;
    static final int CODE_SHIFT = 28;

    static int discardedSyms = 0;

    static MapLocation L;
    static int symX, symY;

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
        if (Clock.getBytecodesLeft() < 400) return;
        if (getSym() != 0) return;
        MapInfo[] infos = MyRobot.rc.senseNearbyMapInfos();
        for (MapInfo m : infos){
            if (Clock.getBytecodesLeft() < 400) return;
            L = m.getMapLocation();
            mapVision[L.x] |= (1L << L.y);
            if (m.isWall()) mapWalls[L.x] |= (1L << L.y);
            else if (m.hasRuin()) mapRuins[L.x] |= (1L << L.y);
            symX = MyRobot.W - L.x - 1;
            symY = MyRobot.H - L.y - 1;
            if ((mapVision[symX] & (1L << L.y)) != 0 && (mapWalls[L.x] & (1L << L.y)) != (mapWalls[symX] & (1L << L.y))) discardH();
            if ((mapVision[L.x] & (1L << symY)) != 0 && (mapWalls[L.x] & (1L << L.y)) != (mapWalls[L.x] & (1L << symY))) discardV();
            if ((mapVision[symX] & (1L << symY)) != 0 && (mapWalls[L.x] & (1L << L.y)) != (mapWalls[symX] & (1L << symY))) discardR();
            if ((mapVision[symX] & (1L << L.y)) != 0 && (mapRuins[L.x] & (1L << L.y)) != (mapRuins[symX] & (1L << L.y))) discardH();
            if ((mapVision[L.x] & (1L << symY)) != 0 && (mapRuins[L.x] & (1L << L.y)) != (mapRuins[L.x] & (1L << symY))) discardV();
            if ((mapVision[symX] & (1L << symY)) != 0 && (mapRuins[L.x] & (1L << L.y)) != (mapRuins[symX] & (1L << symY))) discardR();
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

    static int computeMsg(){
        return (CODE << CODE_SHIFT) | discardedSyms;
    }

    static void towerBroadcast() throws GameActionException {
        RobotController rc = MyRobot.rc;
        int msg = computeMsg();
        if (rc.canBroadcastMessage()) rc.broadcastMessage(msg);
        RobotInfo[] units = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam());
        for (RobotInfo r : units){
            if (Clock.getBytecodesLeft() < 500) return;
            if (rc.canSendMessage(r.getLocation(), msg)) rc.sendMessage(r.getLocation(), msg);
        }
    }

    static void sendToTower() throws GameActionException {
        RobotController rc = MyRobot.rc;
        int msg = computeMsg();
        if (rc.canBroadcastMessage()) rc.broadcastMessage(msg);
        RobotInfo[] units = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam());
        for (RobotInfo r : units){
            if (Clock.getBytecodesLeft() < 500) return;
            if (!r.getType().isTowerType()) continue;
            if (rc.canSendMessage(r.getLocation(), msg)){
                rc.sendMessage(r.getLocation(), msg);
                return;
            }
        }
    }

    static void readMessages() throws GameActionException {
        RobotController rc = MyRobot.rc;
        Message[] msgs = rc.readMessages(rc.getRoundNum());
        for (Message m : msgs){
            if ((m.getBytes() >>> CODE_SHIFT) != CODE) continue;
            int newD = (m.getBytes() & 7);
            discardedSyms |= newD;
        }
        msgs = rc.readMessages(rc.getRoundNum()-1);
        for (Message m : msgs){
            if ((m.getBytes() >>> CODE_SHIFT) != CODE) continue;
            int newD = (m.getBytes() & 7);
            discardedSyms |= newD;
        }
    }
}
