package basic45;

import battlecode.common.*;

/**Our mopper implementation. At a high level it first tries to micro, if it doesn't it finds the closest enemy/enemy paint /low-paint ally (in this order),
 * and if there isn't any it goes out to explore.
 */
public class Mopper extends Unit {

    boolean recovering;

    Mopper(RobotController rc) throws GameActionException {
        super(rc);
    }

    void startTurn() throws GameActionException {
        //Try completing patterns (can we even do this with moppers? Idk we never actually checked)
        completePatterns();

        //recovering if low paint (we don't go back to recover in the late-game though)
        if (shouldRecover()) recovering = true;
        if (rc.getPaint() >= UnitType.MOPPER.paintCapacity - Constants.MIN_TRANSFER_PAINT) recovering = false;

        //Try micro-ing
        hasMicro = MicroManagerMopper.doMicro();

        //Do some precalculations (e.g. real distance to closest tiles)
        super.startTurn();

        //Check nearby towers (e.g., to find the closest paint one to recover)
        TowerManager.updateAll();
        TowerManager.readMessages();
    }

    boolean shouldRecover(){
        if (rc.getRoundNum() > Constants.MIN_ROUNDS_NO_RECOVERY && rc.getNumberTowers() > Constants.MIN_TOWERS_NO_RECOVERY) return false;
        return (rc.getPaint() < Constants.CRITICAL_PAINT_MOPPER);
    }

    void runTurn() throws GameActionException {
        //Find a target and move to it
        move();
        //Try giving paint to an adjacent low-paint unit
        tryGivePaint();
        //Try attacking a nearby enemy-painted tile
        tryAttackTile();
        //Try withdrawing paint from adjacent tower
        tryWithdraw();
        //Try completing whatever patterns are nearby.
        completePatterns();
    }

    void move() throws GameActionException {
        //Micro? => no movement. Otherwise go to target.
        if (hasMicro || !rc.isMovementReady()) return;
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
    }

    MapLocation getTarget() throws GameActionException {
        //Recover if possible
        MapLocation target = null;
        if (recovering && !suicide && TowerManager.closestPaintTower != null){
            target = getRecoveryLoc();
            if (target != null) return target;
        }
        //Otherwise go to closest enemy.
        target = getClosestEnemy();
        //Otherwise go to closest enemy paint.
        if (target == null) target = getClosestEnemyPaint();
        //Otherwise (if I'm healty enough) go to closest low-paint ally
        if (target == null && 2*rc.getPaint() > rc.getType().paintCapacity + Constants.MIN_GIVING_THRESHOLD) target = searchClosestHurt();
        //No target?? --> explore! =D
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
