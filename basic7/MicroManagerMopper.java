package basic7;

import battlecode.common.*;

public class MicroManagerMopper {

    static Direction[] directions = Direction.values();

    //static int extraCd = 0; // in cds
    static boolean canAttack;
    //static boolean canMoveNextTurn;
    static RobotController rc;

    static int myRange;

    static MicroInfo[] microInfos;

    static boolean doMicro() throws GameActionException {
        rc = MyRobot.rc;
        if (!rc.isMovementReady()) return false;

        myRange = rc.getType().actionRadiusSquared;

        microInfos = new MicroInfo[9];
        microInfos[0] = new MicroInfo(Direction.NORTH);
        microInfos[1] = new MicroInfo(Direction.NORTHEAST);
        microInfos[2] = new MicroInfo(Direction.EAST);
        microInfos[3] = new MicroInfo(Direction.SOUTHEAST);
        microInfos[4] = new MicroInfo(Direction.SOUTH);
        microInfos[5] = new MicroInfo(Direction.SOUTHWEST);
        microInfos[6] = new MicroInfo(Direction.WEST);
        microInfos[7] = new MicroInfo(Direction.NORTHWEST);
        microInfos[8] = new MicroInfo(Direction.CENTER);

        //boolean enemyNearby = false;

        RobotInfo[] units = rc.senseNearbyRobots();
        for (RobotInfo r : units) {
            if (r.getTeam() != rc.getTeam()) {
                switch (r.getType()) {
                    case SPLASHER:
                    case SOLDIER:
                        if (rc.getLocation().distanceSquaredTo(r.getLocation()) <= 8) {
                            //enemyNearby = true;
                            unit = r;
                            unitLoc = r.getLocation();
                            microInfos[0].updateEnemy();
                            microInfos[1].updateEnemy();
                            microInfos[2].updateEnemy();
                            microInfos[3].updateEnemy();
                            microInfos[4].updateEnemy();
                            microInfos[5].updateEnemy();
                            microInfos[6].updateEnemy();
                            microInfos[7].updateEnemy();
                            microInfos[8].updateEnemy();
                        }
                        break;
                    case MOPPER:
                        if (rc.getLocation().distanceSquaredTo(r.getLocation()) <= 8) {
                            //enemyNearby = true;
                            unit = r;
                            unitLoc = r.getLocation();
                            microInfos[0].updateMopper();
                            microInfos[1].updateMopper();
                            microInfos[2].updateMopper();
                            microInfos[3].updateMopper();
                            microInfos[4].updateMopper();
                            microInfos[5].updateMopper();
                            microInfos[6].updateMopper();
                            microInfos[7].updateMopper();
                            microInfos[8].updateMopper();
                        }
                        break;
                    default:
                        unit = r;
                        unitLoc = r.getLocation();
                        microInfos[0].updateTower();
                        microInfos[1].updateTower();
                        microInfos[2].updateTower();
                        microInfos[3].updateTower();
                        microInfos[4].updateTower();
                        microInfos[5].updateTower();
                        microInfos[6].updateTower();
                        microInfos[7].updateTower();
                        microInfos[8].updateTower();
                }
            } else {
                switch (r.getType()) {
                    case MOPPER:
                        unit = r;
                        unitLoc = r.getLocation();
                        microInfos[0].updateAllyMopper();
                        microInfos[1].updateAllyMopper();
                        microInfos[2].updateAllyMopper();
                        microInfos[3].updateAllyMopper();
                        microInfos[4].updateAllyMopper();
                        microInfos[5].updateAllyMopper();
                        microInfos[6].updateAllyMopper();
                        microInfos[7].updateAllyMopper();
                        microInfos[8].updateAllyMopper();
                        break;
                    default:
                        unit = r;
                        unitLoc = r.getLocation();
                        microInfos[0].updateAlly();
                        microInfos[1].updateAlly();
                        microInfos[2].updateAlly();
                        microInfos[3].updateAlly();
                        microInfos[4].updateAlly();
                        microInfos[5].updateAlly();
                        microInfos[6].updateAlly();
                        microInfos[7].updateAlly();
                        microInfos[8].updateAlly();
                        break;
                }
            }
        }

        //if (!enemyNearby) return false;

        boolean shouldMicro = false;

        if (microInfos[0].isAccessible && microInfos[0].inAttackRange) shouldMicro = true;
        if (microInfos[1].isAccessible && microInfos[1].inAttackRange) shouldMicro = true;
        if (microInfos[2].isAccessible && microInfos[2].inAttackRange) shouldMicro = true;
        if (microInfos[3].isAccessible && microInfos[3].inAttackRange) shouldMicro = true;
        if (microInfos[4].isAccessible && microInfos[4].inAttackRange) shouldMicro = true;
        if (microInfos[5].isAccessible && microInfos[5].inAttackRange) shouldMicro = true;
        if (microInfos[6].isAccessible && microInfos[6].inAttackRange) shouldMicro = true;
        if (microInfos[7].isAccessible && microInfos[7].inAttackRange) shouldMicro = true;
        if (microInfos[8].isAccessible && microInfos[8].inAttackRange) shouldMicro = true;

        if (!shouldMicro) return false;

        MicroInfo bestMicro = microInfos[8];
        if (microInfos[0].isBetterThan(bestMicro)) bestMicro = microInfos[0];
        if (microInfos[1].isBetterThan(bestMicro)) bestMicro = microInfos[1];
        if (microInfos[2].isBetterThan(bestMicro)) bestMicro = microInfos[2];
        if (microInfos[3].isBetterThan(bestMicro)) bestMicro = microInfos[3];
        if (microInfos[4].isBetterThan(bestMicro)) bestMicro = microInfos[4];
        if (microInfos[5].isBetterThan(bestMicro)) bestMicro = microInfos[5];
        if (microInfos[6].isBetterThan(bestMicro)) bestMicro = microInfos[6];
        if (microInfos[7].isBetterThan(bestMicro)) bestMicro = microInfos[7];

        if (bestMicro.dir == Direction.CENTER) return true;

        if (rc.canMove(bestMicro.dir)){
            MovementManager.move(bestMicro.dir);
        }
        return true;
    }

    static RobotInfo unit;
    static MapLocation unitLoc;
    static boolean mopper;

    static class MicroInfo{

        int towersInRange = 0;
        int moppersInRange = 0;
        int moppersInMoveRange = 0;
        int allyMoppers = 0;
        Direction dir;
        MapLocation loc;
        PaintType p;
        int closestDistMopper = Constants.INF;
        int adjAllies;
        boolean isAccessible = true;
        int closestDistEnemy = Constants.INF;
        boolean inAttackRange = false;

        MicroInfo(Direction dir) throws GameActionException {
            this.dir = dir;
            if (dir != Direction.CENTER && !rc.canMove(dir)){
                isAccessible = false;
                return;
            }
            loc = rc.getLocation().add(dir);
            p = rc.senseMapInfo(loc).getPaint();
        }

        void updateTower(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= unit.getType().actionRadiusSquared) ++towersInRange;
            //if (dist <= myRange && !mopper) inAttackRange = true; //TODO fix
        }

        void updateMopper(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= UnitType.MOPPER.actionRadiusSquared) ++moppersInRange;
            //if (dist <= 8) ++moppersInMoveRange;
            if (dist < closestDistMopper) closestDistMopper = dist;
            if (dist <= myRange) inAttackRange = true;
            if (dist < closestDistEnemy) closestDistEnemy = dist;
        }

        void updateAllyMopper(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= 8) ++allyMoppers;
            if (dist <= 2) ++adjAllies;
        }

        void updateAlly(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= 2) ++adjAllies;
        }

        void updateEnemy(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= myRange) inAttackRange = true;
            if (dist < closestDistEnemy) closestDistEnemy = dist;
        }

        int paintLost(){
            int ptk = 0;
            if (canAttack && inAttackRange) ptk = GameConstants.MOPPER_ATTACK_PAINT_DEPLETION + GameConstants.MOPPER_ATTACK_PAINT_ADDITION;
            return switch (p) {
                case ENEMY_PRIMARY, ENEMY_SECONDARY ->
                        2 * (GameConstants.PENALTY_ENEMY_TERRITORY * (adjAllies)) + (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3 - ptk;
                case EMPTY ->
                        2 * GameConstants.PENALTY_NEUTRAL_TERRITORY + (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3 - ptk;
                default -> (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3 - ptk;
            };
        }

        boolean isBetterThan(MicroInfo M){
            if (!isAccessible) return false;
            if (!M.isAccessible) return true;


            if (towersInRange > M.towersInRange) return false;
            if (M.towersInRange > towersInRange) return true;


            int p = paintLost(), mp = M.paintLost();
            if (p > mp) return false;
            if (mp > p) return true;

            if (canAttack){
                if (inAttackRange && !M.inAttackRange) return true;
                if (M.inAttackRange && !inAttackRange) return false;
            }

            if (!inAttackRange && !M.inAttackRange){
                return closestDistEnemy < M.closestDistEnemy;
            }

            return false;

        }
    }
}
