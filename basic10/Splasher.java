package basic10;

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
        return (rc.getPaint() < Constants.CRITICAL_PAINT_SPLASHER);
    }

    void runTurn() throws GameActionException {
        //tryWithdraw();
        //if (shouldRecover())
        //    recovering = true;
        //if (rc.getPaint() >= UnitType.SPLASHER.paintCapacity - Constants.MIN_TRANSFER_PAINT)
        //    recovering = false;
        //tryAttackTile();
        move();
        //tryGivePaint();
        //tryWithdraw();
    }

    void move() throws GameActionException {
        if (!rc.isMovementReady())
            return;
        //if (MicroManagerMopper.doMicro())
        //    return; // TODO custom micro for splashers?
        MapLocation target = getTarget();
        pathfinding.moveTo(target);
        System.out.println("lasdofasdlfk");
    }

    MapLocation getTarget() throws GameActionException {
        if (recovering && TowerManager.closestPaintTower != null)
            return TowerManager.closestPaintTower;
        MapLocation target = getClosestEnemyPaint();
        // if (target == null) target = searchClosestHurt();
        if (target == null)
            target = explore.getExplore3Target();
        return target;
    }

    void tryAttackTile() throws GameActionException {
        MapLocation loc = getBestAttack();
        if (loc != null && rc.canAttack(loc))
            rc.attack(loc);
    }

    MapLocation getBestAttack() throws GameActionException{
        int score0 = 0;
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int score4 = 0;
        int score5 = 0;
        int score6 = 0;
        int score7 = 0;
        int score8 = 0;
        int score9 = 0;
        int score10 = 0;
        int score11 = 0;
        int score12 = 0;
        MapLocation myLoc = rc.getLocation();
        MapLocation loc;
        MapInfo i;
        RobotInfo r;
        PaintType p;
        Team myTeam = rc.getTeam();
        loc = myLoc.translate(-4, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 2;
        } else if (p == PaintType.EMPTY) {
            score0 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
        }
        }
        loc = myLoc.translate(-3, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 2;
        } else if (p == PaintType.EMPTY) {
            score1 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score1 += 2;
        }
        }
        loc = myLoc.translate(-3, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score2 += 2;
        } else if (p == PaintType.EMPTY) {
            score2 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score2 += 2;
        }
        }
        loc = myLoc.translate(-3, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score3 += 2;
        } else if (p == PaintType.EMPTY) {
            score3 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score3 += 2;
        }
        }
        loc = myLoc.translate(-2, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 2;
            score4 += 2;
        } else if (p == PaintType.EMPTY) {
            score0 += 1;
            score4 += 1;
        }
        if (p == PaintType.EMPTY) {
            score1 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score1 += 2;
            score4 += 2;
        }
        }
        loc = myLoc.translate(-2, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score5 += 2;
        } else if (p == PaintType.EMPTY) {
            score5 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
            score1 += 1;
            score2 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score1 += 2;
            score2 += 2;
            score5 += 2;
        }
        }
        loc = myLoc.translate(-2, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score6 += 2;
        } else if (p == PaintType.EMPTY) {
            score6 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
            score1 += 1;
            score2 += 1;
            score3 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score1 += 2;
            score2 += 2;
            score3 += 2;
            score6 += 2;
        }
        }
        loc = myLoc.translate(-2, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score7 += 2;
        } else if (p == PaintType.EMPTY) {
            score7 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
            score2 += 1;
            score3 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score2 += 2;
            score3 += 2;
            score7 += 2;
        }
        }
        loc = myLoc.translate(-2, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 2;
            score8 += 2;
        } else if (p == PaintType.EMPTY) {
            score0 += 1;
            score8 += 1;
        }
        if (p == PaintType.EMPTY) {
            score3 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score3 += 2;
            score8 += 2;
        }
        }
        loc = myLoc.translate(-1, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score3 += 2;
            score9 += 2;
        } else if (p == PaintType.EMPTY) {
            score3 += 1;
            score9 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
            score1 += 1;
            score2 += 1;
            score4 += 1;
            score5 += 1;
            score6 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score1 += 2;
            score2 += 2;
            score3 += 2;
            score4 += 2;
            score5 += 2;
            score6 += 2;
            score9 += 2;
        }
        }
        loc = myLoc.translate(-1, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score10 += 2;
        } else if (p == PaintType.EMPTY) {
            score10 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
            score1 += 1;
            score2 += 1;
            score3 += 1;
            score5 += 1;
            score6 += 1;
            score7 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score1 += 2;
            score2 += 2;
            score3 += 2;
            score5 += 2;
            score6 += 2;
            score7 += 2;
            score10 += 2;
        }
        }
        loc = myLoc.translate(-1, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 2;
            score11 += 2;
        } else if (p == PaintType.EMPTY) {
            score1 += 1;
            score11 += 1;
        }
        if (p == PaintType.EMPTY) {
            score0 += 1;
            score2 += 1;
            score3 += 1;
            score6 += 1;
            score7 += 1;
            score8 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score1 += 2;
            score2 += 2;
            score3 += 2;
            score6 += 2;
            score7 += 2;
            score8 += 2;
            score11 += 2;
        }
        }
        loc = myLoc.translate(0, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 2;
            score4 += 2;
            score8 += 2;
            score12 += 2;
        } else if (p == PaintType.EMPTY) {
            score0 += 1;
            score4 += 1;
            score8 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY) {
            score1 += 1;
            score2 += 1;
            score3 += 1;
            score5 += 1;
            score6 += 1;
            score7 += 1;
            score9 += 1;
            score10 += 1;
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 2;
            score1 += 2;
            score2 += 2;
            score3 += 2;
            score4 += 2;
            score5 += 2;
            score6 += 2;
            score7 += 2;
            score8 += 2;
            score9 += 2;
            score10 += 2;
            score11 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(-1, -3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 2;
        } else if (p == PaintType.EMPTY) {
            score1 += 1;
        }
        if (p == PaintType.EMPTY) {
            score4 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 2;
            score4 += 2;
        }
        }
        loc = myLoc.translate(-1, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score2 += 2;
        } else if (p == PaintType.EMPTY) {
            score2 += 1;
        }
        if (p == PaintType.EMPTY) {
            score1 += 1;
            score4 += 1;
            score5 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 2;
            score2 += 2;
            score4 += 2;
            score5 += 2;
        }
        }
        loc = myLoc.translate(0, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score6 += 2;
        } else if (p == PaintType.EMPTY) {
            score6 += 1;
        }
        if (p == PaintType.EMPTY) {
            score1 += 1;
            score4 += 1;
            score5 += 1;
            score9 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 2;
            score4 += 2;
            score5 += 2;
            score6 += 2;
            score9 += 2;
        }
        }
        loc = myLoc.translate(0, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score7 += 2;
        } else if (p == PaintType.EMPTY) {
            score7 += 1;
        }
        if (p == PaintType.EMPTY) {
            score1 += 1;
            score2 += 1;
            score4 += 1;
            score5 += 1;
            score6 += 1;
            score9 += 1;
            score10 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 2;
            score2 += 2;
            score4 += 2;
            score5 += 2;
            score6 += 2;
            score7 += 2;
            score9 += 2;
            score10 += 2;
        }
        }
        loc = myLoc.translate(1, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 2;
            score11 += 2;
        } else if (p == PaintType.EMPTY) {
            score1 += 1;
            score11 += 1;
        }
        if (p == PaintType.EMPTY) {
            score4 += 1;
            score5 += 1;
            score6 += 1;
            score9 += 1;
            score10 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 2;
            score4 += 2;
            score5 += 2;
            score6 += 2;
            score9 += 2;
            score10 += 2;
            score11 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(-1, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score2 += 2;
        } else if (p == PaintType.EMPTY) {
            score2 += 1;
        }
        if (p == PaintType.EMPTY) {
            score3 += 1;
            score7 += 1;
            score8 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score2 += 2;
            score3 += 2;
            score7 += 2;
            score8 += 2;
        }
        }
        loc = myLoc.translate(0, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score5 += 2;
        } else if (p == PaintType.EMPTY) {
            score5 += 1;
        }
        if (p == PaintType.EMPTY) {
            score2 += 1;
            score3 += 1;
            score6 += 1;
            score7 += 1;
            score8 += 1;
            score10 += 1;
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score2 += 2;
            score3 += 2;
            score5 += 2;
            score6 += 2;
            score7 += 2;
            score8 += 2;
            score10 += 2;
            score11 += 2;
        }
        }
        loc = myLoc.translate(1, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score2 += 2;
        } else if (p == PaintType.EMPTY) {
            score2 += 1;
        }
        if (p == PaintType.EMPTY) {
            score5 += 1;
            score6 += 1;
            score7 += 1;
            score9 += 1;
            score10 += 1;
            score11 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score2 += 2;
            score5 += 2;
            score6 += 2;
            score7 += 2;
            score9 += 2;
            score10 += 2;
            score11 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(-1, 3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score3 += 2;
        } else if (p == PaintType.EMPTY) {
            score3 += 1;
        }
        if (p == PaintType.EMPTY) {
            score8 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score3 += 2;
            score8 += 2;
        }
        }
        loc = myLoc.translate(0, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score6 += 2;
        } else if (p == PaintType.EMPTY) {
            score6 += 1;
        }
        if (p == PaintType.EMPTY) {
            score3 += 1;
            score7 += 1;
            score8 += 1;
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score3 += 2;
            score6 += 2;
            score7 += 2;
            score8 += 2;
            score11 += 2;
        }
        }
        loc = myLoc.translate(1, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score3 += 2;
            score9 += 2;
        } else if (p == PaintType.EMPTY) {
            score3 += 1;
            score9 += 1;
        }
        if (p == PaintType.EMPTY) {
            score6 += 1;
            score7 += 1;
            score8 += 1;
            score10 += 1;
            score11 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score3 += 2;
            score6 += 2;
            score7 += 2;
            score8 += 2;
            score9 += 2;
            score10 += 2;
            score11 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(0, -4);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score4 += 2;
        } else if (p == PaintType.EMPTY) {
            score4 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 2;
        }
        }
        loc = myLoc.translate(0, -3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score5 += 2;
        } else if (p == PaintType.EMPTY) {
            score5 += 1;
        }
        if (p == PaintType.EMPTY) {
            score4 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 2;
            score5 += 2;
        }
        }
        loc = myLoc.translate(1, -3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score9 += 2;
        } else if (p == PaintType.EMPTY) {
            score9 += 1;
        }
        if (p == PaintType.EMPTY) {
            score4 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 2;
            score9 += 2;
        }
        }
        loc = myLoc.translate(1, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score10 += 2;
        } else if (p == PaintType.EMPTY) {
            score10 += 1;
        }
        if (p == PaintType.EMPTY) {
            score4 += 1;
            score5 += 1;
            score9 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 2;
            score5 += 2;
            score9 += 2;
            score10 += 2;
        }
        }
        loc = myLoc.translate(2, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score4 += 2;
            score12 += 2;
        } else if (p == PaintType.EMPTY) {
            score4 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY) {
            score9 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 2;
            score9 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(2, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score5 += 2;
        } else if (p == PaintType.EMPTY) {
            score5 += 1;
        }
        if (p == PaintType.EMPTY) {
            score9 += 1;
            score10 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score5 += 2;
            score9 += 2;
            score10 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(2, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score6 += 2;
        } else if (p == PaintType.EMPTY) {
            score6 += 1;
        }
        if (p == PaintType.EMPTY) {
            score9 += 1;
            score10 += 1;
            score11 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score6 += 2;
            score9 += 2;
            score10 += 2;
            score11 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(0, 3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score7 += 2;
        } else if (p == PaintType.EMPTY) {
            score7 += 1;
        }
        if (p == PaintType.EMPTY) {
            score8 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score7 += 2;
            score8 += 2;
        }
        }
        loc = myLoc.translate(1, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score10 += 2;
        } else if (p == PaintType.EMPTY) {
            score10 += 1;
        }
        if (p == PaintType.EMPTY) {
            score7 += 1;
            score8 += 1;
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score7 += 2;
            score8 += 2;
            score10 += 2;
            score11 += 2;
        }
        }
        loc = myLoc.translate(2, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score7 += 2;
        } else if (p == PaintType.EMPTY) {
            score7 += 1;
        }
        if (p == PaintType.EMPTY) {
            score10 += 1;
            score11 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score7 += 2;
            score10 += 2;
            score11 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(0, 4);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score8 += 2;
        } else if (p == PaintType.EMPTY) {
            score8 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score8 += 2;
        }
        }
        loc = myLoc.translate(1, 3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score11 += 2;
        } else if (p == PaintType.EMPTY) {
            score11 += 1;
        }
        if (p == PaintType.EMPTY) {
            score8 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score8 += 2;
            score11 += 2;
        }
        }
        loc = myLoc.translate(2, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score8 += 2;
            score12 += 2;
        } else if (p == PaintType.EMPTY) {
            score8 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY) {
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score8 += 2;
            score11 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(3, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score9 += 2;
        } else if (p == PaintType.EMPTY) {
            score9 += 1;
        }
        if (p == PaintType.EMPTY) {
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score9 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(3, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score10 += 2;
        } else if (p == PaintType.EMPTY) {
            score10 += 1;
        }
        if (p == PaintType.EMPTY) {
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score10 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(3, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score11 += 2;
        } else if (p == PaintType.EMPTY) {
            score11 += 1;
        }
        if (p == PaintType.EMPTY) {
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score11 += 2;
            score12 += 2;
        }
        }
        loc = myLoc.translate(4, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score12 += 2;
        } else if (p == PaintType.EMPTY) {
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score12 += 2;
        }
        }
        MapLocation best = null;
        int bestScore = 8;
        if(bestScore < score0) { bestScore = score0; best = myLoc.translate(-2, 0); }
        if(bestScore < score1) { bestScore = score1; best = myLoc.translate(-1, -1); }
        if(bestScore < score2) { bestScore = score2; best = myLoc.translate(-1, 0); }
        if(bestScore < score3) { bestScore = score3; best = myLoc.translate(-1, 1); }
        if(bestScore < score4) { bestScore = score4; best = myLoc.translate(0, -2); }
        if(bestScore < score5) { bestScore = score5; best = myLoc.translate(0, -1); }
        if(bestScore < score6) { bestScore = score6; best = myLoc.translate(0, 0); }
        if(bestScore < score7) { bestScore = score7; best = myLoc.translate(0, 1); }
        if(bestScore < score8) { bestScore = score8; best = myLoc.translate(0, 2); }
        if(bestScore < score9) { bestScore = score9; best = myLoc.translate(1, -1); }
        if(bestScore < score10) { bestScore = score10; best = myLoc.translate(1, 0); }
        if(bestScore < score11) { bestScore = score11; best = myLoc.translate(1, 1); }
        if(bestScore < score12) { bestScore = score12; best = myLoc.translate(2, 0); }
        return best;
    }
}
