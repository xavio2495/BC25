package basic25;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;
import battlecode.common.UnitType;

public class Splasher extends Unit {

    boolean recovering;

    boolean symChecked = false;

    Splasher(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        //updateClosestRuin();
        TowerManager.updateAll();
        super.startTurn();
        MapLocation symLoc = SymmetryManager.getSymmetric(spawnLoc);
        if (symLoc != null && rc.getLocation().distanceSquaredTo(symLoc) <= 10) symChecked = true;
    }

    boolean shouldRecover() {
        if (rc.getRoundNum() > Constants.MIN_ROUNDS_NO_RECOVERY && rc.getNumberTowers() > Constants.MIN_TOWERS_NO_RECOVERY) return false;
        return (TowerManager.closestPaintTower != null && rc.getPaint() < Constants.CRITICAL_PAINT_SPLASHER);
    }

    void runTurn() throws GameActionException {
        //tryWithdraw();
        completePatterns();
        if (shouldRecover())
            recovering = true;
        if (rc.getPaint() >= UnitType.SPLASHER.paintCapacity - Constants.MIN_TRANSFER_PAINT)
            recovering = false;
        tryAttackTile();
        move();
        tryAttackTile();
        tryWithdraw();
        completePatterns();
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
        if (recovering && TowerManager.closestPaintTower != null) return TowerManager.closestPaintTower;

        if (!symChecked) {
            MapLocation symTarget = SymmetryManager.getSymmetric(spawnLoc);
            if (symTarget != null) {
                rc.setIndicatorLine(rc.getLocation(), symTarget, 200, 0, 0);
                return symTarget;
            }
        }

        return explore.getExplore3Target();
    }

    void tryAttackTile() throws GameActionException {
        if(!rc.isActionReady()) return;
        MapLocation loc = SplasherAttackManager.getBestAttack();
        if (loc != null && rc.canAttack(loc))
            rc.attack(loc);
    }
}
