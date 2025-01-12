package basic4;

import battlecode.common.*;

public abstract class Unit extends MyRobot {

    static Explore explore;
    static Pathfinding pathfinding;

    static MapLocation closestRuin = null;
    static int closestRuinDist = 0;

    Unit(RobotController rc) throws GameActionException {
        super(rc);
        explore = new Explore();
        pathfinding = new Pathfinding();
    }

    abstract void startTurn() throws GameActionException;

    abstract void runTurn() throws GameActionException;

    abstract void endTurn() throws GameActionException;

    static void updateClosestRuin() throws GameActionException {
        checkCurrentRuin();
        MapLocation myLoc = rc.getLocation();
        int bestDist = -1;
        if (closestRuin != null) bestDist = myLoc.distanceSquaredTo(closestRuin);
        MapLocation[] ruins = rc.senseNearbyRuins(GameConstants.VISION_RADIUS_SQUARED);
        for (MapLocation loc : ruins){
            if (Map.invalidTarget(loc)){
                continue;
            }
            //RobotInfo r = rc.senseRobotAtLocation(loc);
            //if (r != null && r.getType().isTowerType()) continue;
            int d = myLoc.distanceSquaredTo(loc);
            if (bestDist < 0 || d < bestDist){
                bestDist = d;
                closestRuin = loc;
            }
        }
    }

    static void checkCurrentRuin() throws GameActionException{
        if (closestRuin == null) return;
        if (!rc.canSenseLocation(closestRuin)) return;
        if (Map.invalidTarget(closestRuin)) closestRuin = null;
    }

    void tryWithdraw() throws GameActionException {
        if (!rc.isActionReady()) return;
        RobotInfo[] robots = rc.senseNearbyRobots(GameConstants.PAINT_TRANSFER_RADIUS_SQUARED, rc.getTeam());
        for (RobotInfo r : robots){
            if (r.getType().isTowerType()){
                int neededPaint = rc.getType().paintCapacity - rc.getPaint();
                if (neededPaint <= Constants.MIN_TRANSFER_PAINT) return;
                int maxPaint = r.getPaintAmount();
                if (maxPaint == 0) return;
                if (neededPaint > maxPaint) neededPaint = maxPaint;
                rc.transferPaint(r.getLocation(), -neededPaint);
                return;
            }
        }
    }
}
