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
        return (rc.getPaint() < Constants.CRITICAL_PAINT_SOLDIER);
    }

    void runTurn() throws GameActionException {
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
        MapLocation target = rc.getClosestMisPainted();
        if (target != null) return target;
        return explore.getExplore3Target();
    }

    void paint(){

    }

    MapLocation getClosestMisPainted(){
        MapLocation ans = null;
        MapInfo[] infos = rc.senseNearbyMapInfos();
        for (MapInfo m : infos){
            switch(m.getPaint()){

            }
        }
    }

}
