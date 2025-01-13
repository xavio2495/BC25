package basic6;

import battlecode.common.*;

public class Mopper extends Unit {

    boolean recovering;

    Mopper(RobotController rc) throws GameActionException {
        super(rc);
        Map.initialize();
    }

    void startTurn() throws GameActionException {
        Map.fill();
        updateClosestRuin();
    }

    boolean shouldRecover(){
        return (rc.getPaint() < Constants.CRITICAL_PAINT_MOPPER);
    }

    void runTurn() throws GameActionException {
        tryWithdraw();
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.MOPPER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;
        MapLocation target = getTarget();
        tryAttackEnemy();
        pathfinding.moveTo(target);
        tryAttackEnemy();
        tryAttackTile();
        tryWithdraw();
    }

    void endTurn(){
    }

    MapLocation getTarget() throws GameActionException {
        if (recovering) return TowerManager.closestPaintTower;
        MapLocation target = getClosestEnemy();
        if (target == null) target = getClosestEnemyPaint();
        if (target == null) target = explore.getExplore3Target();
        return target;
    }

    void tryAttackEnemy() throws GameActionException {
        RobotInfo[] enemies = rc.senseNearbyRobots(rc.getType().actionRadiusSquared, rc.getTeam().opponent());
        RobotInfo bestR = null;
        for (RobotInfo r : enemies){
            if (!rc.canAttack(r.getLocation())) continue;
            if (isBetterThan(r, bestR)) bestR = r;
        }
        if (bestR != null) rc.attack(bestR.getLocation());
    }

    void tryAttackTile() throws GameActionException {
        MapLocation loc = getClosestEnemyPaint();
        if (rc.canAttack(loc)) rc.attack(loc);
    }

    boolean isBetterThan(RobotInfo A, RobotInfo B){
        if (B == null) return true;
        if (A.getPaintAmount() < Constants.MIN_PAINT_MOPPER_ATTACK) return false;
        if (A.getPaintAmount() < GameConstants.MOPPER_ATTACK_PAINT_DEPLETION && B.getPaintAmount() >= GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) return false;
        if (A.getPaintAmount() >= GameConstants.MOPPER_ATTACK_PAINT_DEPLETION && B.getPaintAmount() < GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) return false;
        if (A.getType() == UnitType.SPLASHER && B.getType() != UnitType.SPLASHER) return true;
        if (A.getType() != UnitType.SPLASHER && B.getType() == UnitType.SPLASHER) return false;
        if (A.getType() == UnitType.SOLDIER && B.getType() != UnitType.SOLDIER) return true;
        if (A.getType() == UnitType.SOLDIER && B.getType() != UnitType.SOLDIER) return false;
        return (A.getPaintAmount() < B.getPaintAmount());
    }

    MapLocation getClosestEnemy() throws GameActionException {
        MapLocation ans = null;
        int bestDist = 0;
        RobotInfo[] enemies = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam().opponent());
        for (RobotInfo r : enemies){
            if (r.getType().isTowerType()) continue;
            if (r.getPaintAmount() == 0) continue;
            int d = r.getLocation().distanceSquaredTo(rc.getLocation());
            if (ans == null || d < bestDist){
                ans = r.getLocation();
                bestDist = d;
            }
        }
        return ans;
    }

    MapLocation getClosestEnemyPaint(){
        MapLocation ans = null;
        int bestDist = 0;
        MapInfo[] tiles = rc.senseNearbyMapInfos();
        for (MapInfo m : tiles){
            if (m.getPaint().isEnemy()) {
                int d = m.getMapLocation().distanceSquaredTo(rc.getLocation());
                if (ans == null || d < bestDist) {
                    ans = m.getMapLocation();
                    bestDist = d;
                }
            }
        }
        return ans;
    }

}
