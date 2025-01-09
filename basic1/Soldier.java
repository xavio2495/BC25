package basic1;

import battlecode.common.*;

public class Soldier extends Unit {

    Soldier(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        updateClosestRuin();
        TowerManager.update();
    }

    void endTurn(){

    }

    void runTurn() throws GameActionException {
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
        paint();
    }

    MapLocation getTarget() throws GameActionException{
        if (closestRuin != null) return closestRuin;
        return explore.getExplore3Target();
    }


    void paint() throws GameActionException {
        if (closestRuin == null || rc.getLocation().distanceSquaredTo(closestRuin) >= 9){
            paintSelf();
            return;
        }
        int ruinType = RuinManager.checkPattern(closestRuin);
        System.out.println("ruinType: " + ruinType);
        int trueType = RuinManager.getType(ruinType);
        switch(trueType){
            case -1 -> chooseWisely(ruinType);
            default -> {
                UnitType t = switch(trueType){
                    case RuinManager.PAINT -> UnitType.LEVEL_ONE_PAINT_TOWER;
                    case RuinManager.MONEY -> UnitType.LEVEL_ONE_MONEY_TOWER;
                    default -> UnitType.LEVEL_ONE_DEFENSE_TOWER;
                };
                System.out.println("Trying to complete tower of type " + t);
                if (rc.canCompleteTowerPattern(t, closestRuin)){
                    rc.completeTowerPattern(t, closestRuin);
                    return;
                }
                RuinManager.drawPattern(closestRuin,trueType);
            }
        }
    }

    void chooseWisely(int ruinType) throws GameActionException{
        if ((ruinType & 8) > 0) paintRuinSafe();
        try {
            RuinManager.drawPattern(closestRuin, TowerManager.getNextBuild());
        } catch(GameActionException e){
            e.printStackTrace();
            System.out.println("My Location " + rc.getLocation());
            System.out.println("Ruin Location " + closestRuin);
        }
    }



    void paintSelf() throws GameActionException {
        if (rc.senseMapInfo(rc.getLocation()).getPaint() != PaintType.EMPTY) return;
        if (!rc.canAttack(rc.getLocation())) return;
        MapLocation myLoc = rc.getLocation();
        int dx = myLoc.x % GameConstants.PATTERN_SIZE;
        int dy = myLoc.y % GameConstants.PATTERN_SIZE;
        int d = dx*GameConstants.PATTERN_SIZE + dy;
        int bit = (GameConstants.RESOURCE_PATTERN >>> d) & 1;
        rc.attack(rc.getLocation(), bit == 0);
    }

    void paintRuinSafe() throws GameActionException {
        MapLocation loc = closestRuin.add(Direction.NORTHEAST);
        if (rc.canSenseLocation(loc) && rc.senseMapInfo(loc).getPaint() == PaintType.EMPTY && rc.canAttack(loc)) rc.attack(loc, true);
        loc = closestRuin.add(Direction.SOUTHEAST);
        if (rc.canSenseLocation(loc) && rc.senseMapInfo(loc).getPaint() == PaintType.EMPTY && rc.canAttack(loc)) rc.attack(loc, true);
        loc = closestRuin.add(Direction.SOUTHWEST);
        if (rc.canSenseLocation(loc) && rc.senseMapInfo(loc).getPaint() == PaintType.EMPTY && rc.canAttack(loc)) rc.attack(loc, true);
        loc = closestRuin.add(Direction.NORTHWEST);
        if (rc.canSenseLocation(loc) && rc.senseMapInfo(loc).getPaint() == PaintType.EMPTY && rc.canAttack(loc)) rc.attack(loc, true);
    }

}
