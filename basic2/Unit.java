package basic2;

import battlecode.common.*;
import battlecode.schema.RobotType;

public abstract class Unit extends MyRobot {

    Explore explore;
    Pathfinding pathfinding;

    MapLocation closestRuin = null;

    Unit(RobotController rc) throws GameActionException {
        super(rc);
        explore = new Explore();
        pathfinding = new Pathfinding();
    }

    abstract void startTurn() throws GameActionException;

    abstract void runTurn() throws GameActionException;

    abstract void endTurn() throws GameActionException;

    void updateClosestRuin() throws GameActionException {
        checkCurrentRuin();
        MapLocation myLoc = rc.getLocation();
        int bestDist = -1;
        if (closestRuin != null) bestDist = myLoc.distanceSquaredTo(closestRuin);
        MapLocation[] ruins = rc.senseNearbyRuins(GameConstants.VISION_RADIUS_SQUARED);
        for (MapLocation loc : ruins){
            RobotInfo r = rc.senseRobotAtLocation(loc);
            if (r != null && r.getType().isTowerType()) continue;
            int d = myLoc.distanceSquaredTo(loc);
            if (bestDist < 0 || d < bestDist){
                bestDist = d;
                closestRuin = loc;
            }
        }
    }

    void checkCurrentRuin() throws GameActionException{
        if (closestRuin == null) return;
        if (!rc.canSenseLocation(closestRuin)) return;
        RobotInfo r = rc.senseRobotAtLocation(closestRuin);
        if (r == null) return;
        if (r.getType().isTowerType()){
            closestRuin = null;
        }
    }

    void tryWithdraw() throws GameActionException {
        if (!rc.isActionReady()) return;
        if (TowerManager.closestPaintTower == null) return;
        if (rc.getLocation().distanceSquaredTo(TowerManager.closestPaintTower) > GameConstants.PAINT_TRANSFER_RADIUS_SQUARED) return;
        RobotInfo r = rc.senseRobotAtLocation(TowerManager.closestPaintTower);
        if (r == null) return;
        if (r.getTeam() != rc.getTeam()) return;
        switch(r.getType()){
            case LEVEL_ONE_PAINT_TOWER:
            case LEVEL_TWO_PAINT_TOWER:
            case LEVEL_THREE_PAINT_TOWER:
                break;
            default:
                return;
        }
        int neededPaint = rc.getType().paintCapacity - rc.getPaint();
        if (neededPaint <= Constants.MIN_TRANSFER_PAINT) return;
        int maxPaint = r.getPaintAmount();
        if (maxPaint == 0) return;
        if (neededPaint > maxPaint) neededPaint = maxPaint;
        rc.transferPaint(r.getLocation(), -neededPaint);
    }
}
