package basic45;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;
import battlecode.common.UnitType;

/**
 * Splasher code. It literally moves random (except when micro-ing / recovering) and attacks whenever it can cover enough of enemy painted tiles.
 */
public class Splasher extends Unit {

    boolean recovering;

    Splasher(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.SPLASHER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;

        hasMicro = MicroManagerSplasher.doMicro();

        super.startTurn();

        TowerManager.updateAll();
        TowerManager.readMessages();
    }

    boolean shouldRecover() {
        if (rc.getRoundNum() > Constants.MIN_ROUNDS_NO_RECOVERY && rc.getNumberTowers() > Constants.MIN_TOWERS_NO_RECOVERY) return false;
        return (TowerManager.closestPaintTower != null && rc.getPaint() < Constants.CRITICAL_PAINT_SPLASHER);
    }

    void runTurn() throws GameActionException {
        if (shouldRecover())
            recovering = true;
        if (rc.getPaint() >= UnitType.SPLASHER.paintCapacity - Constants.MIN_TRANSFER_PAINT)
            recovering = false;
        move();
        tryWithdraw();
    }

    void move() throws GameActionException {
        if (hasMicro || !rc.isMovementReady()) return;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
    }

    /**
     * We literally move random lmao
     */
    MapLocation getTarget() throws GameActionException {
        MapLocation tg = null;
        if (recovering && !suicide && TowerManager.closestPaintTower != null){
            tg = getRecoveryLoc();
            if (tg != null) return tg;
        }
        return explore.getExplore3Target(); // <--
    }
}
