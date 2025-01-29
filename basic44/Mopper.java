package basic44;

import battlecode.common.*;

public class Mopper extends Unit {

    boolean recovering;

    Mopper(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        completePatterns();
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.MOPPER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;

        hasMicro = MicroManagerMopper.doMicro();

        super.startTurn();

        TowerManager.updateAll();
        TowerManager.readMessages();
    }

    boolean shouldRecover(){
        if (rc.getRoundNum() > Constants.MIN_ROUNDS_NO_RECOVERY && rc.getNumberTowers() > Constants.MIN_TOWERS_NO_RECOVERY) return false;
        return (rc.getPaint() < Constants.CRITICAL_PAINT_MOPPER);
    }

    void runTurn() throws GameActionException {
        move();
        tryGivePaint();
        tryAttackTile();
        tryWithdraw();
        completePatterns();
    }

    void move() throws GameActionException {
        if (hasMicro || !rc.isMovementReady()) return;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
    }

    MapLocation getTarget() throws GameActionException {
        MapLocation target = null;
        if (recovering && !suicide && TowerManager.closestPaintTower != null){
            target = getRecoveryLoc();
            if (target != null) return target;
        }
        target = getClosestEnemy();
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
        if (!rc.isActionReady()) return;
        MapInfo myLoc = rc.senseMapInfo(rc.getLocation());
        if (myLoc.getPaint().isEnemy()){
            if (rc.canAttack(myLoc.getMapLocation())){
                rc.attack(myLoc.getMapLocation());
                return;
            }
        }
        MapInfo[] tiles = rc.senseNearbyMapInfos();
        for (MapInfo m : tiles){
            if (m.getPaint().isEnemy()) {
                if (rc.canAttack(m.getMapLocation())){
                    rc.attack(m.getMapLocation());
                    return;
                }
            }
        }
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
