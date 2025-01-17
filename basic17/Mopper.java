package basic17;

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
        //if (rc.getRoundNum() >= Constants.NO_HEAL_ROUND) return false;
        if (rc.getChips() > Constants.NO_HEAL_CHIPS) return false;
        return (rc.getPaint() < Constants.CRITICAL_PAINT_MOPPER);
    }

    void runTurn() throws GameActionException {
        completePatterns();
        tryWithdraw();
        tryAttackEnemy();
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.MOPPER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;
        move();
        tryAttackEnemy();
        tryGivePaint();
        tryAttackTile();
        tryWithdraw();
        completePatterns();
    }

    void endTurn(){
    }

    void move() throws GameActionException {
        if (!rc.isMovementReady()) return;
        if (MicroManagerMopper.doMicro()) return;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
    }

    MapLocation getTarget() throws GameActionException {
        if (recovering && TowerManager.closestPaintTower != null) return TowerManager.closestPaintTower;
        MapLocation target = getClosestEnemy();
        if (target == null) target = getClosestEnemyPaint();
        if (target == null) target = searchClosestHurt();
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
}
