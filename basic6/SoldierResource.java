package basic6;

import battlecode.common.*;

public class SoldierResource extends Soldier {

    boolean recovering = false;

    SoldierResource(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        //debugLine = "";
        super.startTurn();
    }

    void endTurn(){
        //rc.setIndicatorString(debugLine.toString());
    }

    boolean shouldRecover(){
        return (rc.getPaint() < Constants.CRITICAL_PAINT_SOLDIER_RESOURCE);
    }

    void runTurn() throws GameActionException {
        paint();
        completePatterns();
        tryWithdraw();
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.SOLDIER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
        paint();
        tryWithdraw();
        completePatterns();
    }

    MapLocation getTarget() throws GameActionException{
        if (recovering && TowerManager.closestPaintTower != null) return TowerManager.closestPaintTower;
        if (rc.getRoundNum() > creationTurn) {
            MapLocation target = ResourcePatternManager.getBestTarget();
            //MapLocation target = null;
            if (target != null) return target;
        }
        return explore.getExplore3Target();
    }

    void paint() throws GameActionException {
        paintSelf();
    }

    /*TODO: can be optimized with codegen*/
    /*MapLocation getClosestMisPainted() throws GameActionException{
        MapLocation ans = null;
        int bestDist = 0;
        MapInfo[] infos = rc.senseNearbyMapInfos();
        int d;
        PaintType p;
        MapLocation loc;
        boolean maxT = Util.towerMax();
        boolean ready = rc.isActionReady() && rc.getPaint() > 10;
        for (MapInfo m : infos){
            loc = m.getMapLocation();
            if (m.hasRuin() || m.isWall() || (Map.isNearRuin(loc) && !maxT) || m.getPaint().isEnemy()) continue;
            d = (loc.x%5)*5 + (loc.y%5);
            p = (((GameConstants.RESOURCE_PATTERN >>> d) & 1) != 0) ? PaintType.ALLY_SECONDARY : PaintType.ALLY_PRIMARY;
            if (m.getPaint() != p){
                int dist = rc.getLocation().distanceSquaredTo(loc);
                if (ready && dist <= 4){
                    rc.attack(loc, (((GameConstants.RESOURCE_PATTERN >>> d) & 1) != 0));
                    ready = false;
                    continue;
                }
                if (ans == null || dist < bestDist){
                    ans = loc;
                    bestDist = dist;
                }
            }
        }
        return ans;
    }*/

}
