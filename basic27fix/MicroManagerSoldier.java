package basic27fix;

import battlecode.common.*;

public class MicroManagerSoldier {

    static Direction[] directions = Direction.values();

    //static int extraCd = 0; // in cds
    static boolean canAttack;
    static boolean canMoveNextTurn;
    static RobotController rc;

    static int myRange;

    static MicroInfo[] microInfos;
    static MicroInfo bestMicro;
    static boolean roundNice;
    static boolean turretSeen;
    static int moppers;

    static boolean doMicro() throws GameActionException {
        rc = MyRobot.rc;
        if (!rc.isMovementReady()) return false;

        myRange = rc.getType().actionRadiusSquared;

        turretSeen = false;
        moppers = 0;
        int myPaint = rc.getPaint();
        roundNice = true; // rc.getRoundNum()%2 == 0;

        /*int frac = (200*myPaint) / rc.getType().paintCapacity;
        extraCd = 100 - frac;
        if (extraCd < 0) extraCd = 0;*/

        canAttack = rc.isActionReady() && rc.getPaint() > 10;

        myPaint -= 15;
        if (myPaint <= 0) myPaint = 1;
        int cdAdd = 10;
        int paintPercentage = (int) Math.round(myPaint * 100.0/ rc.getType().paintCapacity);
        if (paintPercentage < GameConstants.INCREASED_COOLDOWN_THRESHOLD) {
            cdAdd += (int) Math.round(cdAdd
                    * (GameConstants.INCREASED_COOLDOWN_INTERCEPT + GameConstants.INCREASED_COOLDOWN_SLOPE * paintPercentage) / 100.0);
        }

        canMoveNextTurn = (cdAdd + rc.getMovementCooldownTurns() - GameConstants.COOLDOWNS_PER_TURN < GameConstants.COOLDOWN_LIMIT);

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

        RobotInfo[] units = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam().opponent());
        for (RobotInfo r : units) {
            //if (r.getTeam() != rc.getTeam()) {
            switch (r.getType()) {
                case SPLASHER:
                case SOLDIER:
                    break;
                case MOPPER:
                    unit = r;
                    unitLoc = r.getLocation();
                    //++moppers;
                    microInfos[0].updateMopper();
                    microInfos[1].updateMopper();
                    microInfos[2].updateMopper();
                    microInfos[3].updateMopper();
                    microInfos[4].updateMopper();
                    microInfos[5].updateMopper();
                    microInfos[6].updateMopper();
                    microInfos[7].updateMopper();
                    microInfos[8].updateMopper();
                    break;
                default:
                    unit = r;
                    turretSeen = true;
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
        }

        units = rc.senseNearbyRobots(8, rc.getTeam());
        for (RobotInfo r : units) {
                unit = r;
                //if (r.getType() == UnitType.MOPPER) --moppers;
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
        }


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

        if (!shouldMicro){
            return false;
        }

        bestMicro = microInfos[8];
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
        int moppersInRange8 = 0;
        int moppersInRange13 = 0;
        //int moppersInMoveRange = 0;
        //int allyMoppers = 0;
        Direction dir;
        MapLocation loc;
        PaintType p = PaintType.EMPTY;
        //int closestDistMopper = Constants.INF;
        int adjAllies = 0;
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
            if (dist <= myRange) inAttackRange = true;
            if (dist < closestDistEnemy) closestDistEnemy = dist;
        }

        void updateMopper(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= 8) ++moppersInRange8;
            else if (dist <= 13) ++moppersInRange13;
            //if (dist < closestDistMopper) closestDistMopper = dist;
        }

        void updateAlly(){
            if (!isAccessible) return;
            if (unitLoc.distanceSquaredTo(loc) <= 2) ++adjAllies;
        }

        int paintLost(){
            return switch (p) {
                case ENEMY_PRIMARY, ENEMY_SECONDARY ->
                        (GameConstants.PENALTY_ENEMY_TERRITORY + 2*adjAllies) + (moppersInRange8 * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION + moppersInRange13 *GameConstants.MOPPER_SWING_PAINT_DEPLETION) / 3;
                case EMPTY ->
                        GameConstants.PENALTY_NEUTRAL_TERRITORY + adjAllies + (moppersInRange8 * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION + moppersInRange13 *GameConstants.MOPPER_SWING_PAINT_DEPLETION) / 3;
                default -> adjAllies + (moppersInRange8 * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION + moppersInRange13 *GameConstants.MOPPER_SWING_PAINT_DEPLETION) / 3;
            };
        }

        boolean isBetterThan(MicroInfo M){
            if (!isAccessible) return false;
            if (!M.isAccessible) return true;


            if (canAttack && canMoveNextTurn && roundNice){
                if (inAttackRange && !M.inAttackRange) return true;
                if (M.inAttackRange && !inAttackRange) return false;
            }

            if (towersInRange > M.towersInRange) return false;
            if (M.towersInRange > towersInRange) return true;

            if (closestDistEnemy <= 17 && M.closestDistEnemy > 17) return true;
            if (closestDistEnemy > 17 && M.closestDistEnemy <= 17) return false;

            return paintLost() < M.paintLost();

        }
    }
}
