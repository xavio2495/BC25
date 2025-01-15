package basic11;

import battlecode.common.GameActionException;
import battlecode.common.MapInfo;
import battlecode.common.MapLocation;
import battlecode.common.PaintType;
import battlecode.common.RobotController;
import battlecode.common.RobotInfo;
import battlecode.common.Team;
import battlecode.common.UnitType;

public class Splasher extends Unit {

    boolean recovering;

    Splasher(RobotController rc) throws GameActionException {
        super(rc);
        Map.initialize();
    }

    void startTurn() throws GameActionException {
        Map.fill();
        updateClosestRuin();
    }

    boolean shouldRecover() {
        if (rc.getRoundNum() > Constants.NO_HEAL_ROUND) return false;
        return (rc.getPaint() < Constants.CRITICAL_PAINT_SPLASHER);
    }

    void runTurn() throws GameActionException {
        tryWithdraw();
        if (shouldRecover())
            recovering = true;
        if (rc.getPaint() >= UnitType.SPLASHER.paintCapacity - Constants.MIN_TRANSFER_PAINT)
            recovering = false;
        tryAttackTile();
        move();
        tryAttackTile();
        tryGivePaint();
        tryWithdraw();
    }

    void move() throws GameActionException {
        if (!rc.isMovementReady())
            return;
        if (MicroManagerMopper.doMicro())
            return; // TODO custom micro for splashers?
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
