package basic3;

import battlecode.common.*;

public class Soldier extends Unit {

    boolean recovering = false;

    Soldier(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        updateClosestRuin();
        TowerManager.update();
    }

    void endTurn(){

    }

    boolean shouldRecover(){
        return ((closestRuin == null || rc.getLocation().distanceSquaredTo(closestRuin) > 2 ||  Util.towerMax()) && rc.getPaint() < Constants.CRITICAL_PAINT);
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



    void paintSelf() throws GameActionException {
        if (!rc.canAttack(rc.getLocation())) return;
        MapLocation myLoc = rc.getLocation();
        int dx = myLoc.x % GameConstants.PATTERN_SIZE;
        int dy = myLoc.y % GameConstants.PATTERN_SIZE;
        int d = dx*GameConstants.PATTERN_SIZE + dy;
        int bit = (GameConstants.RESOURCE_PATTERN >>> d) & 1;
        PaintType p = bit > 0 ? PaintType.ALLY_SECONDARY : PaintType.ALLY_PRIMARY;
        PaintType cp = rc.senseMapInfo(rc.getLocation()).getPaint();
        if (cp.isEnemy()) return;
        if (cp == p) return;
        rc.attack(rc.getLocation(), bit > 0);
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

    MapLocation getClosestEmptyTile(){
        MapInfo[] infos = rc.senseNearbyMapInfos();
        MapLocation ans = null;
        int bestDist = -1;
        for (MapInfo mi : infos){
            if (mi.getPaint() != PaintType.EMPTY) continue;
            if (!mi.isPassable()) continue;
            int newD = rc.getLocation().distanceSquaredTo(mi.getMapLocation());
            if (bestDist < 0 || newD < bestDist){
                ans = mi.getMapLocation();
                bestDist = newD;
            }
        }
        return ans;
    }

    void completePatterns() throws GameActionException {
        int x = (rc.getLocation().x / 5)*5 + 2;
        int y = (rc.getLocation().y / 5)*5 + 2;
        MapLocation pLoc = new MapLocation(x,y);
        if (rc.canCompleteResourcePattern(pLoc)) rc.completeResourcePattern(pLoc);
    }

}
