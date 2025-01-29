package basic43;
import battlecode.common.*;

public class Splasher extends Unit {

    boolean recovering;

    Splasher(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.SPLASHER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;


        MicroManagerSplasher.initiateMicro();
        analyzeEnemies();
        hasMicro = MicroManagerSplasher.doMicro();

        super.startTurn();

        TowerManager.updateAll();
        TowerManager.readMessages();
    }

    boolean shouldRecover() {
        return false;
        //if (rc.getRoundNum() > Constants.MIN_ROUNDS_NO_RECOVERY && rc.getNumberTowers() > Constants.MIN_TOWERS_NO_RECOVERY) return false;
        //return (TowerManager.closestPaintTower != null && rc.getPaint() < Constants.CRITICAL_PAINT_SPLASHER);
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
        if (hasMicro || !rc.isMovementReady()) return;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
    }

    MapLocation getTarget() throws GameActionException {
        MapLocation tg = null;
        if (recovering && !suicide && TowerManager.closestPaintTower != null){
            tg = getRecoveryLoc();
            if (tg != null) return tg;
        }
        return explore.getExplore3Target();
    }

    void analyzeEnemies() throws GameActionException {
        RobotInfo[] enemies = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam().opponent());
        MapLocation myLoc = rc.getLocation();
        for (RobotInfo r : enemies){
            switch(r.getType()){
                case LEVEL_ONE_PAINT_TOWER:
                case LEVEL_TWO_PAINT_TOWER:
                case LEVEL_THREE_PAINT_TOWER:
                case LEVEL_ONE_MONEY_TOWER:
                case LEVEL_TWO_MONEY_TOWER:
                case LEVEL_THREE_MONEY_TOWER:
                    VisionManager.addTower9(r.getLocation().x - myLoc.x, r.getLocation().y - myLoc.y);
                    MicroManagerSplasher.updateTower(r);
                    break;
                case LEVEL_ONE_DEFENSE_TOWER:
                case LEVEL_TWO_DEFENSE_TOWER:
                case LEVEL_THREE_DEFENSE_TOWER:
                    VisionManager.addTower16(r.getLocation().x - myLoc.x, r.getLocation().y - myLoc.y);
                    MicroManagerSplasher.updateTower(r);
                    break;
                case MOPPER:
                    MicroManagerSplasher.updateMopper(r);
                    break;
            }
        }
    }

}
