package basic43;

import battlecode.common.*;

public class MicroManagerMopper {

    static Direction[] directions = Direction.values();

    //static int extraCd = 0; // in cds
    static boolean canAttack;
    //static boolean canMoveNextTurn;
    static RobotController rc;

    static int myRange;

    static MicroInfo[] microInfos;

    static boolean goodPaintNearby;

    static void initiateMicro() throws GameActionException {
        rc = MyRobot.rc;

        myRange = rc.getType().actionRadiusSquared;
        canAttack = rc.isActionReady();

        goodPaintNearby = false;

        microInfos = new MicroInfo[9];
        microInfos[Direction.NORTH.ordinal()] = new MicroInfo(Direction.NORTH);
        microInfos[Direction.NORTHEAST.ordinal()] = new MicroInfo(Direction.NORTHEAST);
        microInfos[Direction.EAST.ordinal()] = new MicroInfo(Direction.EAST);
        microInfos[Direction.SOUTHEAST.ordinal()] = new MicroInfo(Direction.SOUTHEAST);
        microInfos[Direction.SOUTH.ordinal()] = new MicroInfo(Direction.SOUTH);
        microInfos[Direction.SOUTHWEST.ordinal()] = new MicroInfo(Direction.SOUTHWEST);
        microInfos[Direction.WEST.ordinal()] = new MicroInfo(Direction.WEST);
        microInfos[Direction.NORTHWEST.ordinal()] = new MicroInfo(Direction.NORTHWEST);
        microInfos[Direction.CENTER.ordinal()] = new MicroInfo(Direction.CENTER);
    }

    static boolean doMicro() throws GameActionException {
        RobotInfo[] units = rc.senseNearbyRobots(8, rc.getTeam());
        for (RobotInfo r : units) {
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
        }

        MopperAttackManager.calc();

        boolean shouldMicro = microInfos[8].p.isEnemy() && goodPaintNearby;

        if (microInfos[0].shouldMicro()) shouldMicro = true;
        if (microInfos[1].shouldMicro()) shouldMicro = true;
        if (microInfos[2].shouldMicro()) shouldMicro = true;
        if (microInfos[3].shouldMicro()) shouldMicro = true;
        if (microInfos[4].shouldMicro()) shouldMicro = true;
        if (microInfos[5].shouldMicro()) shouldMicro = true;
        if (microInfos[6].shouldMicro()) shouldMicro = true;
        if (microInfos[7].shouldMicro()) shouldMicro = true;
        if (microInfos[8].shouldMicro()) shouldMicro = true;

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

        int minPaint = microInfos[8].paintLost();
        Direction moveDir = Direction.CENTER;
        int x = microInfos[0].paintLost();
        if (microInfos[0].isAccessible && microInfos[0].towersInRange <= bestMicro.towersInRange && minPaint > x){
            minPaint = x;
            moveDir = microInfos[0].dir;
        }
        x = microInfos[1].paintLost();
        if (microInfos[1].isAccessible && microInfos[1].towersInRange <= bestMicro.towersInRange && minPaint > x){
            minPaint = x;
            moveDir = microInfos[1].dir;
        }
        x = microInfos[2].paintLost();
        if (microInfos[2].isAccessible && microInfos[2].towersInRange <= bestMicro.towersInRange && minPaint > x){
            minPaint = x;
            moveDir = microInfos[2].dir;
        }
        x = microInfos[3].paintLost();
        if (microInfos[3].isAccessible && microInfos[3].towersInRange <= bestMicro.towersInRange && minPaint > x){
            minPaint = x;
            moveDir = microInfos[3].dir;
        }
        x = microInfos[4].paintLost();
        if (microInfos[4].isAccessible && microInfos[4].towersInRange <= bestMicro.towersInRange && minPaint > x){
            minPaint = x;
            moveDir = microInfos[4].dir;
        }
        x = microInfos[5].paintLost();
        if (microInfos[5].isAccessible && microInfos[5].towersInRange <= bestMicro.towersInRange &&minPaint > x){
            minPaint = x;
            moveDir = microInfos[5].dir;
        }
        x = microInfos[6].paintLost();
        if (microInfos[6].isAccessible && microInfos[6].towersInRange <= bestMicro.towersInRange &&minPaint > x){
            minPaint = x;
            moveDir = microInfos[6].dir;
        }
        x = microInfos[7].paintLost();
        if (microInfos[7].isAccessible && microInfos[7].towersInRange <= bestMicro.towersInRange && minPaint > x){
            minPaint = x;
            moveDir = microInfos[7].dir;
        }
        if (minPaint - microInfos[8].getAtk() < bestMicro.paintDiff()){
            attack(microInfos[8]);
            if (rc.canMove(moveDir))rc.move(moveDir);
            return true;
        }
        if (bestMicro.dir != Direction.CENTER) rc.move(bestMicro.dir);
        attack(bestMicro);
        return true;
    }

    public static void updateTower(RobotInfo r) throws GameActionException {
        unit = r;
        unitLoc = r.getLocation();
        hasPaint = true;
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

    public static void updateMopper(RobotInfo r) throws GameActionException {
        if (rc.getLocation().distanceSquaredTo(r.getLocation()) <= 8) {
            hasPaint = r.getPaintAmount() > 0;
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
    }


    public static void updateEnemy(RobotInfo r) throws GameActionException {
        if (rc.getLocation().distanceSquaredTo(r.getLocation()) <= 8) {
            hasPaint = r.getPaintAmount() > 0;
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
    }



    static void attack(MicroInfo M) throws GameActionException {
        if (M.inAttackRange && M.atkValue < 10){
            Mopper.tryAttackEnemy();
            return;
        }
        if (M.atkDirection == null) return;
        if (rc.canMopSwing(M.atkDirection)){
            rc.mopSwing(M.atkDirection);
            rc.setIndicatorLine(rc.getLocation(), rc.getLocation().add(M.atkDirection), 0,0,200);
        }
    }


    static RobotInfo unit;
    static MapLocation unitLoc;
    static boolean hasPaint;

    static class MicroInfo{
        int atkValue; //in paint loss
        Direction atkDirection = null; // for mopwsing attack

        int towersInRange = 0;
        int moppersInRange = 0;
        Direction dir;
        MapLocation loc;
        PaintType p = PaintType.EMPTY;
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
            switch(p){
                case ALLY_PRIMARY, ALLY_SECONDARY, EMPTY:
                    goodPaintNearby = true;
            }
        }

        void updateTower() throws GameActionException {
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= unit.getType().actionRadiusSquared){
                //rc.setIndicatorDot(loc, 0,0,200);
                ++towersInRange;
            }
        }


        boolean shouldMicro(){
            return isAccessible && towersInRange <= 0 && atkValue > 0;
        }

        void updateMopper(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            //if (dist <= UnitType.MOPPER.actionRadiusSquared) ++moppersInRange;
            if (dist <= 8) ++moppersInRange;
            if (dist < closestDistMopper) closestDistMopper = dist;
            if (dist <= myRange && hasPaint) inAttackRange = true;
            if (dist < closestDistEnemy) closestDistEnemy = dist;
        }

        void updateAlly(){
            if (!isAccessible) return;
            if ( unitLoc.distanceSquaredTo(loc) <= 2) ++adjAllies;
        }

        void updateEnemy(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= myRange && hasPaint) inAttackRange = true;
            if (dist < closestDistEnemy) closestDistEnemy = dist;
        }

        int getAtk(){
            if (!canAttack){
                return 0;
            }
            int x = inAttackRange ? GameConstants.MOPPER_ATTACK_PAINT_DEPLETION + GameConstants.MOPPER_ATTACK_PAINT_ADDITION : 0;
            if (x < atkValue) x = atkValue;
            return x;
        }

        int paintDiff(){
            return paintLost() - getAtk();
        }

        int paintLost(){ //paintDiff
            return switch (p) {
                case ENEMY_PRIMARY, ENEMY_SECONDARY ->
                        GameConstants.MOPPER_PAINT_PENALTY_MULTIPLIER*(GameConstants.PENALTY_ENEMY_TERRITORY + 2*adjAllies) + (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3;
                case EMPTY ->
                        GameConstants.PENALTY_NEUTRAL_TERRITORY + adjAllies + (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3;
                default -> adjAllies + (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3;
            };
        }

        boolean isBetterThan(MicroInfo M){
            if (!isAccessible) return false;
            if (!M.isAccessible) return true;


            if (towersInRange > M.towersInRange) return false;
            if (M.towersInRange > towersInRange) return true;


            int p = paintDiff(), mp = M.paintDiff();
            if (p > mp) return false;
            if (mp > p) return true;

            if (canAttack){
                int atkPaint = getAtk(), matkPaint = M.getAtk();
                if (atkPaint > matkPaint) return true;
                if (matkPaint > atkPaint) return false;
            }

            return closestDistEnemy < M.closestDistEnemy;

        }
    }
}
