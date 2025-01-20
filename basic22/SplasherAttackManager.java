package basic22;

import battlecode.common.GameActionException;
import battlecode.common.MapInfo;
import battlecode.common.MapLocation;
import battlecode.common.PaintType;
import battlecode.common.RobotController;
import battlecode.common.RobotInfo;
import battlecode.common.Team;

public  class SplasherAttackManager {
    static RobotController rc;

    public static MapLocation getBestAttack() throws GameActionException {
        rc = MyRobot.rc;
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
            if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-3, -1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-3, 0);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-3, 1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-2, -2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-2, -1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-2, 0);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-2, 1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-2, 2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-1, -1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-1, 0);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-1, 1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, 0);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-1, -3);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-1, -2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, -2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, -1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(1, -1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-1, 2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, 1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(1, 0);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(-1, 3);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, 2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(1, 1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, -4);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if (p == PaintType.EMPTY && i.isPassable()) {
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, -3);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(1, -3);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(1, -2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(2, -2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(2, -1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(2, 0);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, 3);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(1, 2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(2, 1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(0, 4);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if (p == PaintType.EMPTY && i.isPassable()) {
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(1, 3);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(2, 2);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(3, -1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(3, 0);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(3, 1);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if(p.isEnemy()){
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
            } else if (p == PaintType.EMPTY && i.isPassable()) {
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if (p == PaintType.EMPTY && i.isPassable()) {
                score11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        loc = myLoc.translate(4, 0);
        if(rc.canSenseLocation(loc)) {
            i = rc.senseMapInfo(loc);
            r = rc.senseRobotAtLocation(loc);
            p = i.getPaint();
            if (p == PaintType.EMPTY && i.isPassable()) {
                score12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
            }
            if(r != null && r.team != myTeam && r.type.isTowerType()){
                score12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
            }
        }
        MapLocation best = null;
        int bestScore = 17;
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
