package basic39;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.GameConstants;
import battlecode.common.MapLocation;
import battlecode.common.PaintType;
import battlecode.common.RobotController;
import battlecode.common.RobotInfo;
import battlecode.common.UnitType;

public class MicroManagerSplasher {

    static Direction[] directions = Direction.values();

    //static int extraCd = 0; // in cds
    static boolean canAttack;
    //static boolean canMoveNextTurn;
    static RobotController rc;

    static int myRange;

    static MicroInfo[] microInfos;

    static void initiateMicro() throws GameActionException {
        rc = MyRobot.rc;

        myRange = rc.getType().actionRadiusSquared;
        canAttack = rc.isActionReady() && rc.getPaint() > UnitType.SPLASHER.attackCost;

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

        //if (!enemyNearby) return false;


        SplasherAttackManager.calc();

        boolean shouldMicro = false;
        if (microInfos[0].isAccessible && (microInfos[0].moppersInRange > 0 || microInfos[0].atkLoc != null)) shouldMicro = true;
        if (microInfos[1].isAccessible && (microInfos[1].moppersInRange > 0 || microInfos[1].atkLoc != null)) shouldMicro = true;
        if (microInfos[2].isAccessible && (microInfos[2].moppersInRange > 0 || microInfos[2].atkLoc != null)) shouldMicro = true;
        if (microInfos[3].isAccessible && (microInfos[3].moppersInRange > 0 || microInfos[3].atkLoc != null)) shouldMicro = true;
        if (microInfos[4].isAccessible && (microInfos[4].moppersInRange > 0 || microInfos[4].atkLoc != null)) shouldMicro = true;
        if (microInfos[5].isAccessible && (microInfos[5].moppersInRange > 0 || microInfos[5].atkLoc != null)) shouldMicro = true;
        if (microInfos[6].isAccessible && (microInfos[6].moppersInRange > 0 || microInfos[6].atkLoc != null)) shouldMicro = true;
        if (microInfos[7].isAccessible && (microInfos[7].moppersInRange > 0 || microInfos[7].atkLoc != null)) shouldMicro = true;
        if (microInfos[8].isAccessible && (microInfos[8].moppersInRange > 0 || microInfos[8].atkLoc != null)) shouldMicro = true;

        if (!shouldMicro) return false;

        int score;

        // get best move+attack
        MicroInfo maBest = null;
        int maBestScore = -2147483648;
        score = microInfos[0].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[0]; }
        score = microInfos[1].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[1]; }
        score = microInfos[2].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[2]; }
        score = microInfos[3].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[3]; }
        score = microInfos[4].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[4]; }
        score = microInfos[5].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[5]; }
        score = microInfos[6].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[6]; }
        score = microInfos[7].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[7]; }
        score = microInfos[8].score(); if(score > maBestScore) { maBestScore = score; maBest = microInfos[8]; }

        // get best move
        MicroInfo mBest = null;
        int mBestScore = -2147483648;
        score = microInfos[0].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[0]; }
        score = microInfos[1].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[1]; }
        score = microInfos[2].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[2]; }
        score = microInfos[3].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[3]; }
        score = microInfos[4].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[4]; }
        score = microInfos[5].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[5]; }
        score = microInfos[6].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[6]; }
        score = microInfos[7].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[7]; }
        score = microInfos[8].moveScore(); if(score > mBestScore) { mBestScore = score; mBest = microInfos[8]; }


        if(mBest != null && (microInfos[8].attackScore() + mBestScore > maBestScore)) {
            // attack, then move
            if(microInfos[8].atkLoc != null && rc.canAttack(microInfos[8].atkLoc)) {
                rc.attack(microInfos[8].atkLoc);
            }
            if (rc.canMove(mBest.dir)){
                rc.move(mBest.dir);
            }
            return true;
        } else if (maBest != null) {    
            // move + attack
            if (rc.canMove(maBest.dir)){
                rc.move(maBest.dir);
            }
            if(maBest.atkLoc != null && rc.canAttack(maBest.atkLoc)) {
                rc.attack(maBest.atkLoc);
            }
            return true;
        } else {
            return false;
        }
    }

    public static void updateTower(RobotInfo r) throws GameActionException {
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

    public static void updateMopper(RobotInfo r) throws GameActionException {
        if (rc.getLocation().distanceSquaredTo(r.getLocation()) <= 8) {
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


    static RobotInfo unit;
    static MapLocation unitLoc;

    static class MicroInfo{
        int atkValue = 0;
        MapLocation atkLoc = null;

        int towersInRange = 0;
        int moppersInRange = 0;
        Direction dir;
        MapLocation loc;
        PaintType p;
        int closestDistMopper = Constants.INF;
        int adjAllies;
        boolean isAccessible = true;

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
        }

        void updateMopper(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= UnitType.MOPPER.actionRadiusSquared) ++moppersInRange;
            if (dist < closestDistMopper) closestDistMopper = dist;
        }

        void updateAlly(){
            if (!isAccessible) return;
            int dist = unitLoc.distanceSquaredTo(loc);
            if (dist <= 2) ++adjAllies;
        }

        int paintLost(){
            return switch (p) {
                case ENEMY_PRIMARY, ENEMY_SECONDARY ->
                        (GameConstants.PENALTY_ENEMY_TERRITORY + 2*adjAllies) + (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3;
                case EMPTY ->
                        GameConstants.PENALTY_NEUTRAL_TERRITORY + adjAllies + (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3;
                default -> adjAllies + (moppersInRange * GameConstants.MOPPER_ATTACK_PAINT_DEPLETION) / 3;
            };
        }

        int moveScore()  {
            if(!isAccessible) return -100000000;
            if(towersInRange != 0) return -10000000 * towersInRange;
            return -paintLost() * 100 + closestDistMopper;
        }

        int attackScore() {
            if(canAttack && atkLoc != null) {
                return 100*atkValue;
            }
            return 0;
        }

        int score() {
            return attackScore() + moveScore();
        }

    }
}
