package basic23;

import battlecode.common.*;

public class Mopper extends Unit {

    boolean recovering;

    Mopper(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        //updateClosestRuin();
        TowerManager.updateAll();
        SymmetryManager.readMessages();
    }

    boolean shouldRecover(){
        //if (rc.getRoundNum() >= Constants.NO_HEAL_ROUND) return false;
        if (rc.getRoundNum() > Constants.MIN_ROUNDS_NO_RECOVERY && rc.getNumberTowers() > Constants.MIN_TOWERS_NO_RECOVERY) return false;
        return (TowerManager.closestPaintTower != null && rc.getPaint() < Constants.CRITICAL_PAINT_MOPPER);
    }

    void runTurn() throws GameActionException {
        completePatterns();
        //tryWithdraw();
        //tryAttackEnemy();
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.MOPPER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;
        move();
        //tryAttackEnemy();
        tryGivePaint();
        tryAttackTile();
        tryWithdraw();
        completePatterns();
    }

    void move() throws GameActionException {
        //if (!rc.isMovementReady()) return;
        if (MicroManagerMopper.doMicro()) return;
        if (!rc.isMovementReady()) return;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
    }

    void endTurn() throws GameActionException {
        super.endTurn();
    }

    MapLocation getTarget() throws GameActionException {
        if (recovering && TowerManager.closestPaintTower != null) return TowerManager.closestPaintTower;
        MapLocation target = getClosestEnemy();
        if (target == null) target = getClosestEnemyPaint();
        if (target == null && 2*rc.getPaint() > rc.getType().paintCapacity + Constants.MIN_GIVING_THRESHOLD) target = searchClosestHurt();
        if (target == null) target = explore.getExplore3Target();
        return target;
    }

    static void tryAttackEnemy() throws GameActionException {
        RobotInfo[] enemies = rc.senseNearbyRobots(rc.getType().actionRadiusSquared, rc.getTeam().opponent());
        RobotInfo bestR = null;
        for (RobotInfo r : enemies){
            if (r.getPaintAmount() == 0) continue;
            if (!rc.canAttack(r.getLocation())) continue;
            if (isBetterThan(r, bestR)) bestR = r;
        }
        if (bestR != null){
            rc.attack(bestR.getLocation());
            //rc.setIndicatorDot(bestR.getLocation(), 200,0,0);
        }
    }

    void tryAttackTile() throws GameActionException {
        MapLocation loc = getClosestEnemyPaint();
        if (rc.canAttack(loc)) rc.attack(loc);
    }

    static boolean isBetterThan(RobotInfo A, RobotInfo B){
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
