package basic35;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;
import battlecode.common.UnitType;

public class Splasher extends Unit {

    boolean recovering;

    Splasher(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        //updateClosestRuin();
        TowerManager.updateAll();
    }

    boolean shouldRecover() {
        if (rc.getRoundNum() > Constants.MIN_ROUNDS_NO_RECOVERY && rc.getNumberTowers() > Constants.MIN_TOWERS_NO_RECOVERY) return false;
        return (TowerManager.closestPaintTower != null && rc.getPaint() < Constants.CRITICAL_PAINT_SPLASHER);
    }

    void runTurn() throws GameActionException {
        //tryWithdraw();
        if (shouldRecover())
            recovering = true;
        if (rc.getPaint() >= UnitType.SPLASHER.paintCapacity - Constants.MIN_TRANSFER_PAINT)
            recovering = false;
        move();
        tryWithdraw();
    }

    void move() throws GameActionException {
        if (!rc.isMovementReady())
            return;
        if (MicroManagerSplasher.doMicro())
            return;

        MapLocation oldLoc = rc.getLocation();

        MapLocation target = getTarget();
        pathfinding.moveTo(target);

        var dir = oldLoc.directionTo(rc.getLocation());
        var info = MicroManagerSplasher.microInfos[dir.ordinal()];
        if(info.atkLoc != null && rc.canAttack(info.atkLoc)) {
            rc.attack(info.atkLoc);
        }
    }

    MapLocation getTarget() throws GameActionException {
        MapLocation tg = null;
        if (recovering && !suicide && TowerManager.closestPaintTower != null){
            tg = getRecoveryLoc();
            if (tg != null) return tg;
        }
        return explore.getExplore3Target();
    }
}
