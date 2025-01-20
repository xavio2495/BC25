package basic21;
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

    void endTurn() throws GameActionException {
        super.endTurn();
    }

    boolean shouldRecover() {
        if (rc.getChips() > Constants.NO_HEAL_CHIPS) return false;
        return (TowerManager.closestPaintTower != null && rc.getPaint() < Constants.CRITICAL_PAINT_SPLASHER);
    }

    void runTurn() throws GameActionException {
        //tryWithdraw();
        if (shouldRecover())
            recovering = true;
        if (rc.getPaint() >= UnitType.SPLASHER.paintCapacity - Constants.MIN_TRANSFER_PAINT)
            recovering = false;
        tryAttackTile();
        move();
        tryAttackTile();
        tryWithdraw();
    }

    void move() throws GameActionException {
        if (!rc.isMovementReady())
            return;
        if (MicroManagerSplasher.doMicro())
            return;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
    }

    MapLocation getTarget() throws GameActionException {
        if (recovering && TowerManager.closestPaintTower != null)
            return TowerManager.closestPaintTower;
        //MapLocation target = getClosestEnemyPaint();
        // if (target == null) target = searchClosestHurt();
        return explore.getExplore3Target();
    }

    void tryAttackTile() throws GameActionException {
        if(!rc.isActionReady()) return;
        MapLocation loc = SplasherAttackManager.getBestAttack();
        if (loc != null && rc.canAttack(loc))
            rc.attack(loc);
    }
}
