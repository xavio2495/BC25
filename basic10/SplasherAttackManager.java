package basic10;

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
            score0 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
        }
        }
        loc = myLoc.translate(-3, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score1 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score1 += 10;
        }
        }
        loc = myLoc.translate(-3, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score2 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score2 += 10;
        }
        }
        loc = myLoc.translate(-3, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score3 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score3 += 10;
        }
        }
        loc = myLoc.translate(-2, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score1 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score4 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score1 += 10;
            score4 += 10;
        }
        }
        loc = myLoc.translate(-2, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
            score1 += 4;
            score2 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score1 += 1;
            score2 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score5 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score1 += 10;
            score2 += 10;
            score5 += 10;
        }
        }
        loc = myLoc.translate(-2, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
            score1 += 4;
            score2 += 4;
            score3 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score1 += 1;
            score2 += 1;
            score3 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score6 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score1 += 10;
            score2 += 10;
            score3 += 10;
            score6 += 10;
        }
        }
        loc = myLoc.translate(-2, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
            score2 += 4;
            score3 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score2 += 1;
            score3 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score7 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score2 += 10;
            score3 += 10;
            score7 += 10;
        }
        }
        loc = myLoc.translate(-2, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score3 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score3 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score8 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score3 += 10;
            score8 += 10;
        }
        }
        loc = myLoc.translate(-1, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
            score1 += 4;
            score2 += 4;
            score4 += 4;
            score5 += 4;
            score6 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score1 += 1;
            score2 += 1;
            score4 += 1;
            score5 += 1;
            score6 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score3 += 1;
            score9 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score1 += 10;
            score2 += 10;
            score3 += 10;
            score4 += 10;
            score5 += 10;
            score6 += 10;
            score9 += 10;
        }
        }
        loc = myLoc.translate(-1, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
            score1 += 4;
            score2 += 4;
            score3 += 4;
            score5 += 4;
            score6 += 4;
            score7 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score1 += 1;
            score2 += 1;
            score3 += 1;
            score5 += 1;
            score6 += 1;
            score7 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score10 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score1 += 10;
            score2 += 10;
            score3 += 10;
            score5 += 10;
            score6 += 10;
            score7 += 10;
            score10 += 10;
        }
        }
        loc = myLoc.translate(-1, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score0 += 4;
            score2 += 4;
            score3 += 4;
            score6 += 4;
            score7 += 4;
            score8 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score2 += 1;
            score3 += 1;
            score6 += 1;
            score7 += 1;
            score8 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score1 += 1;
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score1 += 10;
            score2 += 10;
            score3 += 10;
            score6 += 10;
            score7 += 10;
            score8 += 10;
            score11 += 10;
        }
        }
        loc = myLoc.translate(0, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 4;
            score2 += 4;
            score3 += 4;
            score5 += 4;
            score6 += 4;
            score7 += 4;
            score9 += 4;
            score10 += 4;
            score11 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
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
        if (p == PaintType.EMPTY && i.isPassable()) {
            score0 += 1;
            score4 += 1;
            score8 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score0 += 10;
            score1 += 10;
            score2 += 10;
            score3 += 10;
            score4 += 10;
            score5 += 10;
            score6 += 10;
            score7 += 10;
            score8 += 10;
            score9 += 10;
            score10 += 10;
            score11 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(-1, -3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score4 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score4 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score1 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 10;
            score4 += 10;
        }
        }
        loc = myLoc.translate(-1, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 4;
            score4 += 4;
            score5 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score1 += 1;
            score4 += 1;
            score5 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score2 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 10;
            score2 += 10;
            score4 += 10;
            score5 += 10;
        }
        }
        loc = myLoc.translate(0, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 4;
            score4 += 4;
            score5 += 4;
            score9 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score1 += 1;
            score4 += 1;
            score5 += 1;
            score9 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score6 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 10;
            score4 += 10;
            score5 += 10;
            score6 += 10;
            score9 += 10;
        }
        }
        loc = myLoc.translate(0, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score1 += 4;
            score2 += 4;
            score4 += 4;
            score5 += 4;
            score6 += 4;
            score9 += 4;
            score10 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score1 += 1;
            score2 += 1;
            score4 += 1;
            score5 += 1;
            score6 += 1;
            score9 += 1;
            score10 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score7 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 10;
            score2 += 10;
            score4 += 10;
            score5 += 10;
            score6 += 10;
            score7 += 10;
            score9 += 10;
            score10 += 10;
        }
        }
        loc = myLoc.translate(1, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score4 += 4;
            score5 += 4;
            score6 += 4;
            score9 += 4;
            score10 += 4;
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score4 += 1;
            score5 += 1;
            score6 += 1;
            score9 += 1;
            score10 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score1 += 1;
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score1 += 10;
            score4 += 10;
            score5 += 10;
            score6 += 10;
            score9 += 10;
            score10 += 10;
            score11 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(-1, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score3 += 4;
            score7 += 4;
            score8 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score3 += 1;
            score7 += 1;
            score8 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score2 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score2 += 10;
            score3 += 10;
            score7 += 10;
            score8 += 10;
        }
        }
        loc = myLoc.translate(0, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score2 += 4;
            score3 += 4;
            score6 += 4;
            score7 += 4;
            score8 += 4;
            score10 += 4;
            score11 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score2 += 1;
            score3 += 1;
            score6 += 1;
            score7 += 1;
            score8 += 1;
            score10 += 1;
            score11 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score5 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score2 += 10;
            score3 += 10;
            score5 += 10;
            score6 += 10;
            score7 += 10;
            score8 += 10;
            score10 += 10;
            score11 += 10;
        }
        }
        loc = myLoc.translate(1, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score5 += 4;
            score6 += 4;
            score7 += 4;
            score9 += 4;
            score10 += 4;
            score11 += 4;
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score5 += 1;
            score6 += 1;
            score7 += 1;
            score9 += 1;
            score10 += 1;
            score11 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score2 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score2 += 10;
            score5 += 10;
            score6 += 10;
            score7 += 10;
            score9 += 10;
            score10 += 10;
            score11 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(-1, 3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score8 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score8 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score3 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score3 += 10;
            score8 += 10;
        }
        }
        loc = myLoc.translate(0, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score3 += 4;
            score7 += 4;
            score8 += 4;
            score11 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score3 += 1;
            score7 += 1;
            score8 += 1;
            score11 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score6 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score3 += 10;
            score6 += 10;
            score7 += 10;
            score8 += 10;
            score11 += 10;
        }
        }
        loc = myLoc.translate(1, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score6 += 4;
            score7 += 4;
            score8 += 4;
            score10 += 4;
            score11 += 4;
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score6 += 1;
            score7 += 1;
            score8 += 1;
            score10 += 1;
            score11 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score3 += 1;
            score9 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score3 += 10;
            score6 += 10;
            score7 += 10;
            score8 += 10;
            score9 += 10;
            score10 += 10;
            score11 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(0, -4);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if (p == PaintType.EMPTY && i.isPassable()) {
            score4 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 10;
        }
        }
        loc = myLoc.translate(0, -3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score4 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score4 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score5 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 10;
            score5 += 10;
        }
        }
        loc = myLoc.translate(1, -3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score4 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score4 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score9 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 10;
            score9 += 10;
        }
        }
        loc = myLoc.translate(1, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score4 += 4;
            score5 += 4;
            score9 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score4 += 1;
            score5 += 1;
            score9 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score10 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 10;
            score5 += 10;
            score9 += 10;
            score10 += 10;
        }
        }
        loc = myLoc.translate(2, -2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score9 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score9 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score4 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score4 += 10;
            score9 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(2, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score9 += 4;
            score10 += 4;
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score9 += 1;
            score10 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score5 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score5 += 10;
            score9 += 10;
            score10 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(2, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score9 += 4;
            score10 += 4;
            score11 += 4;
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score9 += 1;
            score10 += 1;
            score11 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score6 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score6 += 10;
            score9 += 10;
            score10 += 10;
            score11 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(0, 3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score8 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score8 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score7 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score7 += 10;
            score8 += 10;
        }
        }
        loc = myLoc.translate(1, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score7 += 4;
            score8 += 4;
            score11 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score7 += 1;
            score8 += 1;
            score11 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score10 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score7 += 10;
            score8 += 10;
            score10 += 10;
            score11 += 10;
        }
        }
        loc = myLoc.translate(2, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score10 += 4;
            score11 += 4;
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score10 += 1;
            score11 += 1;
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score7 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score7 += 10;
            score10 += 10;
            score11 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(0, 4);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if (p == PaintType.EMPTY && i.isPassable()) {
            score8 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score8 += 10;
        }
        }
        loc = myLoc.translate(1, 3);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score8 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score8 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score8 += 10;
            score11 += 10;
        }
        }
        loc = myLoc.translate(2, 2);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score11 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score11 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score8 += 1;
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score8 += 10;
            score11 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(3, -1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score9 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score9 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(3, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score10 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score10 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(3, 1);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if(p.isEnemy()){
            score12 += 4;
        } else if (p == PaintType.EMPTY && i.isPassable()) {
            score12 += 1;
        }
        if (p == PaintType.EMPTY && i.isPassable()) {
            score11 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score11 += 10;
            score12 += 10;
        }
        }
        loc = myLoc.translate(4, 0);
        if(rc.canSenseLocation(loc)) {
        i = rc.senseMapInfo(loc);
        r = rc.senseRobotAtLocation(loc);
        p = i.getPaint();
        if (p == PaintType.EMPTY && i.isPassable()) {
            score12 += 1;
        }
        if(r != null && r.team != myTeam && r.type.isTowerType()){
            score12 += 10;
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
