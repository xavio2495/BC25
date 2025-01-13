package basic7;

import battlecode.common.*;

public class SoldierTower extends Soldier {

    boolean recovering = false;

    SoldierTower(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        super.startTurn();
        updateClosestRuin();
    }

    void endTurn(){
    }

    boolean shouldRecover(){
        return ((closestRuin == null || rc.getLocation().distanceSquaredTo(closestRuin) > 2 ||  Util.towerMax()) && rc.getPaint() < Constants.CRITICAL_PAINT_SOLDIER_TOWER);
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
        if (closestRuin != null && !Util.towerMax()) return closestRuin;
        else if (rc.getNumberTowers() < GameConstants.MAX_NUMBER_OF_TOWERS) return explore.getExplore3Target();
        MapLocation loc = getClosestEmptyTile();
        if (loc != null) return loc;
        return explore.getExplore3Target();
    }


    void paint() throws GameActionException {
        if (closestRuin == null || rc.getLocation().distanceSquaredTo(closestRuin) > 8 || Util.towerMax()){
            paintSelf();
            return;
        }
        int ruinType = Map.getPattern(closestRuin);
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
                RuinManager.drawPatternEnhanced(closestRuin,trueType);
            }
        }
    }

    void chooseWisely(int ruinType) throws GameActionException{
        if ((ruinType & 8) > 0) paintRuinSafe();
        try {
            RuinManager.drawPatternEnhanced(closestRuin, TowerManager.getNextBuild());
        } catch(GameActionException e){
            e.printStackTrace();
            System.out.println("My Location " + rc.getLocation());
            System.out.println("Ruin Location " + closestRuin);
        }
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
