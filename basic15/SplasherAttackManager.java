
package basic15;

import battlecode.common.*;

public class SplasherAttackManager {
    static RobotController rc;
    public static void calc() throws GameActionException {
        rc = MyRobot.rc;


MapLocation myLoc = rc.getLocation();
MapLocation loc;
MapInfo i;
RobotInfo r;
PaintType p;
Team myTeam = rc.getTeam();

int attack21 = 0;
int attack32 = 0;
int attack26 = 0;
int attack19 = 0;
int attack36 = 0;
int attack6 = 0;
int attack5 = 0;
int attack12 = 0;
int attack25 = 0;
int attack4 = 0;
int attack1 = 0;
int attack29 = 0;
int attack33 = 0;
int attack10 = 0;
int attack22 = 0;
int attack11 = 0;
int attack7 = 0;
int attack16 = 0;
int attack24 = 0;
int attack2 = 0;
int attack13 = 0;
int attack34 = 0;
int attack14 = 0;
int attack23 = 0;
int attack18 = 0;
int attack3 = 0;
int attack28 = 0;
int attack9 = 0;
int attack15 = 0;
int attack30 = 0;
int attack20 = 0;
int attack31 = 0;
int attack0 = 0;
int attack17 = 0;
int attack35 = 0;
int attack8 = 0;
int attack27 = 0;
i = rc.senseMapInfo(myLoc);
p = i.getPaint();
loc = myLoc.translate(2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
    attack4 += 4;
    attack18 += 4;
    attack19 += 4;
    attack34 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack4 += 1;
    attack16 += 1;
    attack18 += 1;
    attack19 += 1;
    attack33 += 1;
    attack34 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack4 += 10;
    attack16 += 10;
    attack18 += 10;
    attack19 += 10;
    attack33 += 10;
    attack34 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
    attack6 += 4;
    attack14 += 4;
    attack18 += 4;
    attack19 += 4;
    attack33 += 4;
    attack34 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack6 += 1;
    attack14 += 1;
    attack15 += 1;
    attack18 += 1;
    attack19 += 1;
    attack21 += 1;
    attack33 += 1;
    attack34 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack6 += 10;
    attack14 += 10;
    attack15 += 10;
    attack18 += 10;
    attack19 += 10;
    attack21 += 10;
    attack33 += 10;
    attack34 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
    attack1 += 4;
    attack6 += 4;
    attack14 += 4;
    attack18 += 4;
    attack21 += 4;
    attack31 += 4;
    attack33 += 4;
    attack34 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack1 += 1;
    attack5 += 1;
    attack6 += 1;
    attack14 += 1;
    attack18 += 1;
    attack19 += 1;
    attack21 += 1;
    attack30 += 1;
    attack31 += 1;
    attack33 += 1;
    attack34 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack1 += 10;
    attack5 += 10;
    attack6 += 10;
    attack14 += 10;
    attack18 += 10;
    attack19 += 10;
    attack21 += 10;
    attack30 += 10;
    attack31 += 10;
    attack33 += 10;
    attack34 += 10;
}
}
loc = myLoc.translate(3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
    attack18 += 4;
    attack19 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack14 += 1;
    attack18 += 1;
    attack19 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack14 += 10;
    attack18 += 10;
    attack19 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
    attack14 += 4;
    attack18 += 4;
    attack19 += 4;
    attack33 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack1 += 1;
    attack14 += 1;
    attack18 += 1;
    attack19 += 1;
    attack33 += 1;
    attack34 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack1 += 10;
    attack14 += 10;
    attack18 += 10;
    attack19 += 10;
    attack33 += 10;
    attack34 += 10;
}
}
loc = myLoc.translate(3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
    attack1 += 4;
    attack14 += 4;
    attack18 += 4;
    attack21 += 4;
    attack33 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack1 += 1;
    attack6 += 1;
    attack14 += 1;
    attack18 += 1;
    attack21 += 1;
    attack33 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack1 += 10;
    attack6 += 10;
    attack14 += 10;
    attack18 += 10;
    attack21 += 10;
    attack33 += 10;
}
}
loc = myLoc.translate(4, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack19 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack19 += 10;
}
}
loc = myLoc.translate(4, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
    attack14 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack14 += 1;
    attack18 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack14 += 10;
    attack18 += 10;
}
}
loc = myLoc.translate(4, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += 4;
    attack1 += 4;
    attack14 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack1 += 1;
    attack14 += 1;
    attack33 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack1 += 10;
    attack14 += 10;
    attack33 += 10;
}
}
loc = myLoc.translate(1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack4 += 1;
    attack6 += 1;
    attack11 += 1;
    attack15 += 1;
    attack16 += 1;
    attack18 += 1;
    attack19 += 1;
    attack30 += 1;
    attack31 += 1;
    attack33 += 1;
    attack34 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack4 += 10;
    attack6 += 10;
    attack11 += 10;
    attack15 += 10;
    attack16 += 10;
    attack18 += 10;
    attack19 += 10;
    attack30 += 10;
    attack31 += 10;
    attack33 += 10;
    attack34 += 10;
    attack35 += 10;
}
if(p.isEnemy()){
    attack6 += 4;
    attack15 += 4;
    attack16 += 4;
    attack18 += 4;
    attack19 += 4;
    attack30 += 4;
    attack33 += 4;
    attack34 += 4;
    attack35 += 4;
}
}
loc = myLoc.translate(3, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack4 += 1;
    attack19 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack4 += 10;
    attack19 += 10;
}
if(p.isEnemy()){
    attack19 += 4;
}
}
loc = myLoc.translate(3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack1 += 1;
    attack5 += 1;
    attack14 += 1;
    attack21 += 1;
    attack31 += 1;
    attack33 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += 10;
    attack1 += 10;
    attack5 += 10;
    attack14 += 10;
    attack21 += 10;
    attack31 += 10;
    attack33 += 10;
}
if(p.isEnemy()){
    attack1 += 4;
    attack5 += 4;
    attack14 += 4;
    attack21 += 4;
    attack33 += 4;
}
}
loc = myLoc.translate(2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += 4;
    attack5 += 4;
    attack6 += 4;
    attack14 += 4;
    attack20 += 4;
    attack21 += 4;
    attack31 += 4;
    attack33 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += 1;
    attack5 += 1;
    attack6 += 1;
    attack14 += 1;
    attack17 += 1;
    attack18 += 1;
    attack20 += 1;
    attack21 += 1;
    attack31 += 1;
    attack33 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += 10;
    attack5 += 10;
    attack6 += 10;
    attack14 += 10;
    attack17 += 10;
    attack18 += 10;
    attack20 += 10;
    attack21 += 10;
    attack31 += 10;
    attack33 += 10;
}
}
loc = myLoc.translate(2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += 4;
    attack5 += 4;
    attack7 += 4;
    attack20 += 4;
    attack21 += 4;
    attack31 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += 1;
    attack3 += 1;
    attack5 += 1;
    attack7 += 1;
    attack20 += 1;
    attack21 += 1;
    attack31 += 1;
    attack33 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += 10;
    attack3 += 10;
    attack5 += 10;
    attack7 += 10;
    attack20 += 10;
    attack21 += 10;
    attack31 += 10;
    attack33 += 10;
}
}
loc = myLoc.translate(3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += 4;
    attack5 += 4;
    attack21 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += 1;
    attack5 += 1;
    attack14 += 1;
    attack20 += 1;
    attack21 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += 10;
    attack5 += 10;
    attack14 += 10;
    attack20 += 10;
    attack21 += 10;
}
}
loc = myLoc.translate(4, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += 4;
    attack14 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += 1;
    attack14 += 1;
    attack21 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += 10;
    attack14 += 10;
    attack21 += 10;
}
}
loc = myLoc.translate(4, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += 1;
    attack5 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += 10;
    attack5 += 10;
}
}
loc = myLoc.translate(1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += 1;
    attack3 += 1;
    attack5 += 1;
    attack6 += 1;
    attack7 += 1;
    attack12 += 1;
    attack17 += 1;
    attack20 += 1;
    attack21 += 1;
    attack30 += 1;
    attack31 += 1;
    attack33 += 1;
    attack34 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += 10;
    attack3 += 10;
    attack5 += 10;
    attack6 += 10;
    attack7 += 10;
    attack12 += 10;
    attack17 += 10;
    attack20 += 10;
    attack21 += 10;
    attack30 += 10;
    attack31 += 10;
    attack33 += 10;
    attack34 += 10;
}
if(p.isEnemy()){
    attack3 += 4;
    attack5 += 4;
    attack6 += 4;
    attack17 += 4;
    attack20 += 4;
    attack21 += 4;
    attack30 += 4;
    attack31 += 4;
    attack33 += 4;
}
}
loc = myLoc.translate(3, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += 1;
    attack5 += 1;
    attack7 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += 10;
    attack5 += 10;
    attack7 += 10;
}
if(p.isEnemy()){
    attack5 += 4;
}
}
loc = myLoc.translate(-4, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack27 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack27 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack8 += 10;
    attack27 += 10;
}
}
loc = myLoc.translate(-4, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack27 += 4;
    attack29 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack23 += 1;
    attack27 += 1;
    attack29 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack23 += 10;
    attack27 += 10;
    attack29 += 10;
}
}
loc = myLoc.translate(-4, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack29 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack13 += 1;
    attack29 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack13 += 10;
    attack29 += 10;
}
}
loc = myLoc.translate(-3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack8 += 4;
    attack9 += 4;
    attack23 += 4;
    attack27 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack9 += 1;
    attack11 += 1;
    attack23 += 1;
    attack27 += 1;
    attack29 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack8 += 10;
    attack9 += 10;
    attack11 += 10;
    attack23 += 10;
    attack27 += 10;
    attack29 += 10;
}
}
loc = myLoc.translate(-3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack8 += 4;
    attack13 += 4;
    attack23 += 4;
    attack27 += 4;
    attack29 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack13 += 1;
    attack23 += 1;
    attack24 += 1;
    attack27 += 1;
    attack29 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack8 += 10;
    attack13 += 10;
    attack23 += 10;
    attack24 += 10;
    attack27 += 10;
    attack29 += 10;
}
}
loc = myLoc.translate(-3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack13 += 4;
    attack23 += 4;
    attack26 += 4;
    attack29 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack12 += 1;
    attack13 += 1;
    attack23 += 1;
    attack26 += 1;
    attack27 += 1;
    attack29 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack12 += 10;
    attack13 += 10;
    attack23 += 10;
    attack26 += 10;
    attack27 += 10;
    attack29 += 10;
}
}
loc = myLoc.translate(-2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack8 += 4;
    attack9 += 4;
    attack10 += 4;
    attack11 += 4;
    attack23 += 4;
    attack24 += 4;
    attack27 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack9 += 1;
    attack10 += 1;
    attack11 += 1;
    attack13 += 1;
    attack15 += 1;
    attack23 += 1;
    attack24 += 1;
    attack27 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack11 += 10;
    attack13 += 10;
    attack15 += 10;
    attack23 += 10;
    attack24 += 10;
    attack27 += 10;
}
}
loc = myLoc.translate(-2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack8 += 4;
    attack11 += 4;
    attack12 += 4;
    attack13 += 4;
    attack23 += 4;
    attack24 += 4;
    attack27 += 4;
    attack29 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack9 += 1;
    attack11 += 1;
    attack12 += 1;
    attack13 += 1;
    attack23 += 1;
    attack24 += 1;
    attack26 += 1;
    attack27 += 1;
    attack29 += 1;
    attack30 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack8 += 10;
    attack9 += 10;
    attack11 += 10;
    attack12 += 10;
    attack13 += 10;
    attack23 += 10;
    attack24 += 10;
    attack26 += 10;
    attack27 += 10;
    attack29 += 10;
    attack30 += 10;
}
}
loc = myLoc.translate(-2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += 4;
    attack12 += 4;
    attack13 += 4;
    attack23 += 4;
    attack24 += 4;
    attack26 += 4;
    attack29 += 4;
    attack36 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack12 += 1;
    attack13 += 1;
    attack17 += 1;
    attack23 += 1;
    attack24 += 1;
    attack26 += 1;
    attack29 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack8 += 10;
    attack12 += 10;
    attack13 += 10;
    attack17 += 10;
    attack23 += 10;
    attack24 += 10;
    attack26 += 10;
    attack29 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(-3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack9 += 1;
    attack10 += 1;
    attack27 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack27 += 10;
}
if(p.isEnemy()){
    attack8 += 4;
    attack9 += 4;
    attack27 += 4;
}
}
loc = myLoc.translate(-3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack13 += 1;
    attack26 += 1;
    attack29 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack13 += 10;
    attack26 += 10;
    attack29 += 10;
    attack36 += 10;
}
if(p.isEnemy()){
    attack13 += 4;
    attack26 += 4;
    attack29 += 4;
}
}
loc = myLoc.translate(-1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack6 += 1;
    attack8 += 1;
    attack10 += 1;
    attack11 += 1;
    attack12 += 1;
    attack13 += 1;
    attack15 += 1;
    attack17 += 1;
    attack23 += 1;
    attack24 += 1;
    attack30 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += 10;
    attack6 += 10;
    attack8 += 10;
    attack10 += 10;
    attack11 += 10;
    attack12 += 10;
    attack13 += 10;
    attack15 += 10;
    attack17 += 10;
    attack23 += 10;
    attack24 += 10;
    attack30 += 10;
    attack36 += 10;
}
if(p.isEnemy()){
    attack8 += 4;
    attack11 += 4;
    attack12 += 4;
    attack13 += 4;
    attack15 += 4;
    attack17 += 4;
    attack23 += 4;
    attack24 += 4;
    attack30 += 4;
}
}
loc = myLoc.translate(-1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += 4;
    attack12 += 4;
    attack13 += 4;
    attack17 += 4;
    attack23 += 4;
    attack24 += 4;
    attack26 += 4;
    attack30 += 4;
    attack36 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack11 += 1;
    attack12 += 1;
    attack13 += 1;
    attack17 += 1;
    attack23 += 1;
    attack24 += 1;
    attack25 += 1;
    attack26 += 1;
    attack29 += 1;
    attack30 += 1;
    attack31 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack11 += 10;
    attack12 += 10;
    attack13 += 10;
    attack17 += 10;
    attack23 += 10;
    attack24 += 10;
    attack25 += 10;
    attack26 += 10;
    attack29 += 10;
    attack30 += 10;
    attack31 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(-1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += 4;
    attack12 += 4;
    attack13 += 4;
    attack17 += 4;
    attack25 += 4;
    attack26 += 4;
    attack32 += 4;
    attack36 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack12 += 1;
    attack13 += 1;
    attack17 += 1;
    attack20 += 1;
    attack24 += 1;
    attack25 += 1;
    attack26 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack12 += 10;
    attack13 += 10;
    attack17 += 10;
    attack20 += 10;
    attack24 += 10;
    attack25 += 10;
    attack26 += 10;
    attack32 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(-1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += 4;
    attack25 += 4;
    attack26 += 4;
    attack32 += 4;
    attack36 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack7 += 1;
    attack12 += 1;
    attack25 += 1;
    attack26 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack7 += 10;
    attack12 += 10;
    attack25 += 10;
    attack26 += 10;
    attack32 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(0, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += 4;
    attack6 += 4;
    attack12 += 4;
    attack17 += 4;
    attack20 += 4;
    attack24 += 4;
    attack30 += 4;
    attack31 += 4;
    attack36 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack6 += 1;
    attack12 += 1;
    attack13 += 1;
    attack15 += 1;
    attack17 += 1;
    attack20 += 1;
    attack21 += 1;
    attack24 += 1;
    attack30 += 1;
    attack31 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack6 += 10;
    attack12 += 10;
    attack13 += 10;
    attack15 += 10;
    attack17 += 10;
    attack20 += 10;
    attack21 += 10;
    attack24 += 10;
    attack30 += 10;
    attack31 += 10;
    attack32 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(0, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += 4;
    attack7 += 4;
    attack12 += 4;
    attack17 += 4;
    attack20 += 4;
    attack25 += 4;
    attack31 += 4;
    attack32 += 4;
    attack36 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack5 += 1;
    attack7 += 1;
    attack12 += 1;
    attack17 += 1;
    attack20 += 1;
    attack25 += 1;
    attack26 += 1;
    attack30 += 1;
    attack31 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack5 += 10;
    attack7 += 10;
    attack12 += 10;
    attack17 += 10;
    attack20 += 10;
    attack25 += 10;
    attack26 += 10;
    attack30 += 10;
    attack31 += 10;
    attack32 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(0, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += 4;
    attack7 += 4;
    attack20 += 4;
    attack25 += 4;
    attack32 += 4;
    attack36 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack7 += 1;
    attack17 += 1;
    attack20 += 1;
    attack25 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack7 += 10;
    attack17 += 10;
    attack20 += 10;
    attack25 += 10;
    attack32 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += 4;
    attack5 += 4;
    attack7 += 4;
    attack17 += 4;
    attack20 += 4;
    attack21 += 4;
    attack31 += 4;
    attack32 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack5 += 1;
    attack6 += 1;
    attack7 += 1;
    attack17 += 1;
    attack20 += 1;
    attack21 += 1;
    attack31 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack5 += 10;
    attack6 += 10;
    attack7 += 10;
    attack17 += 10;
    attack20 += 10;
    attack21 += 10;
    attack31 += 10;
    attack32 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += 4;
    attack5 += 4;
    attack7 += 4;
    attack20 += 4;
    attack32 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack5 += 1;
    attack7 += 1;
    attack20 += 1;
    attack25 += 1;
    attack31 += 1;
    attack32 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack5 += 10;
    attack7 += 10;
    attack20 += 10;
    attack25 += 10;
    attack31 += 10;
    attack32 += 10;
}
}
loc = myLoc.translate(-2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack12 += 1;
    attack13 += 1;
    attack23 += 1;
    attack25 += 1;
    attack26 += 1;
    attack29 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack12 += 10;
    attack13 += 10;
    attack23 += 10;
    attack25 += 10;
    attack26 += 10;
    attack29 += 10;
    attack36 += 10;
}
if(p.isEnemy()){
    attack12 += 4;
    attack13 += 4;
    attack25 += 4;
    attack26 += 4;
    attack29 += 4;
    attack36 += 4;
}
}
loc = myLoc.translate(0, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack6 += 1;
    attack11 += 1;
    attack12 += 1;
    attack15 += 1;
    attack16 += 1;
    attack17 += 1;
    attack23 += 1;
    attack24 += 1;
    attack30 += 1;
    attack31 += 1;
    attack33 += 1;
    attack34 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack6 += 10;
    attack11 += 10;
    attack12 += 10;
    attack15 += 10;
    attack16 += 10;
    attack17 += 10;
    attack23 += 10;
    attack24 += 10;
    attack30 += 10;
    attack31 += 10;
    attack33 += 10;
    attack34 += 10;
}
if(p.isEnemy()){
    attack6 += 4;
    attack11 += 4;
    attack12 += 4;
    attack15 += 4;
    attack17 += 4;
    attack24 += 4;
    attack30 += 4;
    attack31 += 4;
    attack34 += 4;
}
}
loc = myLoc.translate(0, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack7 += 1;
    attack25 += 1;
    attack32 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += 10;
    attack7 += 10;
    attack25 += 10;
    attack32 += 10;
}
if(p.isEnemy()){
    attack7 += 4;
    attack25 += 4;
    attack32 += 4;
}
}
loc = myLoc.translate(0, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += 4;
    attack22 += 4;
    attack28 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack16 += 1;
    attack22 += 1;
    attack28 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack16 += 10;
    attack22 += 10;
    attack28 += 10;
}
}
loc = myLoc.translate(0, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += 4;
    attack10 += 4;
    attack16 += 4;
    attack22 += 4;
    attack28 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack10 += 1;
    attack15 += 1;
    attack16 += 1;
    attack22 += 1;
    attack28 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack10 += 10;
    attack15 += 10;
    attack16 += 10;
    attack22 += 10;
    attack28 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(0, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += 4;
    attack10 += 4;
    attack11 += 4;
    attack15 += 4;
    attack16 += 4;
    attack22 += 4;
    attack28 += 4;
    attack34 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack9 += 1;
    attack10 += 1;
    attack11 += 1;
    attack15 += 1;
    attack16 += 1;
    attack19 += 1;
    attack22 += 1;
    attack28 += 1;
    attack30 += 1;
    attack34 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack9 += 10;
    attack10 += 10;
    attack11 += 10;
    attack15 += 10;
    attack16 += 10;
    attack19 += 10;
    attack22 += 10;
    attack28 += 10;
    attack30 += 10;
    attack34 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(1, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += 4;
    attack28 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack28 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack28 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += 4;
    attack16 += 4;
    attack19 += 4;
    attack28 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack16 += 1;
    attack19 += 1;
    attack22 += 1;
    attack28 += 1;
    attack34 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack16 += 10;
    attack19 += 10;
    attack22 += 10;
    attack28 += 10;
    attack34 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += 4;
    attack15 += 4;
    attack16 += 4;
    attack18 += 4;
    attack19 += 4;
    attack28 += 4;
    attack34 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack6 += 1;
    attack10 += 1;
    attack15 += 1;
    attack16 += 1;
    attack18 += 1;
    attack19 += 1;
    attack28 += 1;
    attack34 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack6 += 10;
    attack10 += 10;
    attack15 += 10;
    attack16 += 10;
    attack18 += 10;
    attack19 += 10;
    attack28 += 10;
    attack34 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(2, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack19 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack19 += 10;
}
}
loc = myLoc.translate(2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += 4;
    attack19 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack18 += 1;
    attack19 += 1;
    attack28 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack18 += 10;
    attack19 += 10;
    attack28 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(-1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack9 += 1;
    attack10 += 1;
    attack11 += 1;
    attack16 += 1;
    attack22 += 1;
    attack28 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += 10;
    attack9 += 10;
    attack10 += 10;
    attack11 += 10;
    attack16 += 10;
    attack22 += 10;
    attack28 += 10;
}
if(p.isEnemy()){
    attack9 += 4;
    attack10 += 4;
    attack16 += 4;
    attack22 += 4;
    attack28 += 4;
}
}
loc = myLoc.translate(2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack5 += 4;
    attack7 += 4;
    attack20 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack5 += 1;
    attack7 += 1;
    attack20 += 1;
    attack21 += 1;
    attack32 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack5 += 10;
    attack7 += 10;
    attack20 += 10;
    attack21 += 10;
    attack32 += 10;
}
}
loc = myLoc.translate(2, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack5 += 1;
    attack7 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack5 += 10;
    attack7 += 10;
}
if(p.isEnemy()){
    attack7 += 4;
}
}
loc = myLoc.translate(0, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack6 += 4;
    attack10 += 4;
    attack11 += 4;
    attack15 += 4;
    attack16 += 4;
    attack24 += 4;
    attack30 += 4;
    attack34 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack6 += 1;
    attack8 += 1;
    attack10 += 1;
    attack11 += 1;
    attack15 += 1;
    attack16 += 1;
    attack17 += 1;
    attack18 += 1;
    attack24 += 1;
    attack28 += 1;
    attack30 += 1;
    attack34 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack6 += 10;
    attack8 += 10;
    attack10 += 10;
    attack11 += 10;
    attack15 += 10;
    attack16 += 10;
    attack17 += 10;
    attack18 += 10;
    attack24 += 10;
    attack28 += 10;
    attack30 += 10;
    attack34 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack6 += 4;
    attack15 += 4;
    attack17 += 4;
    attack18 += 4;
    attack21 += 4;
    attack30 += 4;
    attack31 += 4;
    attack33 += 4;
    attack34 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack6 += 1;
    attack14 += 1;
    attack15 += 1;
    attack17 += 1;
    attack18 += 1;
    attack20 += 1;
    attack21 += 1;
    attack24 += 1;
    attack30 += 1;
    attack31 += 1;
    attack33 += 1;
    attack34 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack6 += 10;
    attack14 += 10;
    attack15 += 10;
    attack17 += 10;
    attack18 += 10;
    attack20 += 10;
    attack21 += 10;
    attack24 += 10;
    attack30 += 10;
    attack31 += 10;
    attack33 += 10;
    attack34 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(1, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack7 += 4;
    attack32 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack7 += 1;
    attack20 += 1;
    attack32 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack7 += 10;
    attack20 += 10;
    attack32 += 10;
}
}
loc = myLoc.translate(-2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack8 += 4;
    attack9 += 4;
    attack10 += 4;
    attack11 += 4;
    attack22 += 4;
    attack27 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += 1;
    attack9 += 1;
    attack10 += 1;
    attack11 += 1;
    attack16 += 1;
    attack22 += 1;
    attack23 += 1;
    attack27 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack11 += 10;
    attack16 += 10;
    attack22 += 10;
    attack23 += 10;
    attack27 += 10;
}
}
loc = myLoc.translate(-1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack8 += 4;
    attack9 += 4;
    attack10 += 4;
    attack11 += 4;
    attack15 += 4;
    attack16 += 4;
    attack22 += 4;
    attack28 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += 1;
    attack9 += 1;
    attack10 += 1;
    attack11 += 1;
    attack15 += 1;
    attack16 += 1;
    attack22 += 1;
    attack24 += 1;
    attack28 += 1;
    attack35 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack11 += 10;
    attack15 += 10;
    attack16 += 10;
    attack22 += 10;
    attack24 += 10;
    attack28 += 10;
    attack35 += 10;
}
}
loc = myLoc.translate(-1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack8 += 4;
    attack9 += 4;
    attack10 += 4;
    attack11 += 4;
    attack15 += 4;
    attack16 += 4;
    attack23 += 4;
    attack24 += 4;
    attack30 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += 1;
    attack9 += 1;
    attack10 += 1;
    attack11 += 1;
    attack12 += 1;
    attack15 += 1;
    attack16 += 1;
    attack22 += 1;
    attack23 += 1;
    attack24 += 1;
    attack27 += 1;
    attack30 += 1;
    attack34 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack11 += 10;
    attack12 += 10;
    attack15 += 10;
    attack16 += 10;
    attack22 += 10;
    attack23 += 10;
    attack24 += 10;
    attack27 += 10;
    attack30 += 10;
    attack34 += 10;
}
}
loc = myLoc.translate(-2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += 1;
    attack9 += 1;
    attack10 += 1;
    attack22 += 1;
    attack28 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack22 += 10;
    attack28 += 10;
}
if(p.isEnemy()){
    attack9 += 4;
    attack10 += 4;
    attack22 += 4;
}
}
loc = myLoc.translate(-3, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack9 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack9 += 1;
    attack22 += 1;
    attack27 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack9 += 10;
    attack22 += 10;
    attack27 += 10;
}
}
loc = myLoc.translate(-4, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack9 += 1;
    attack27 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack9 += 10;
    attack27 += 10;
}
if(p.isEnemy()){
    attack27 += 4;
}
}
loc = myLoc.translate(-2, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack9 += 1;
    attack22 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack9 += 10;
    attack22 += 10;
}
if(p.isEnemy()){
    attack22 += 4;
}
}
loc = myLoc.translate(-1, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack10 += 1;
    attack22 += 1;
    attack28 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack10 += 10;
    attack22 += 10;
    attack28 += 10;
}
if(p.isEnemy()){
    attack22 += 4;
    attack28 += 4;
}
}
loc = myLoc.translate(-2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack13 += 1;
    attack25 += 1;
    attack26 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack13 += 10;
    attack25 += 10;
    attack26 += 10;
    attack32 += 10;
    attack36 += 10;
}
if(p.isEnemy()){
    attack25 += 4;
    attack26 += 4;
    attack36 += 4;
}
}
loc = myLoc.translate(-2, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack25 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack25 += 1;
    attack26 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack25 += 10;
    attack26 += 10;
}
}
loc = myLoc.translate(-1, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack25 += 4;
    attack32 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack25 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack25 += 10;
    attack32 += 10;
    attack36 += 10;
}
}
loc = myLoc.translate(-3, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack25 += 1;
    attack26 += 1;
    attack29 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack25 += 10;
    attack26 += 10;
    attack29 += 10;
}
if(p.isEnemy()){
    attack26 += 4;
}
}
loc = myLoc.translate(-4, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack26 += 1;
    attack29 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack26 += 10;
    attack29 += 10;
}
if(p.isEnemy()){
    attack29 += 4;
}
}
if(rc.canMove(Direction.SOUTHWEST)){
int best = -1; int bestScore = 0;
if(bestScore < attack27) { bestScore = attack27; best = attack27; }
if(bestScore < attack9) { bestScore = attack9; best = attack9; }
if(bestScore < attack8) { bestScore = attack8; best = attack8; }
if(bestScore < attack23) { bestScore = attack23; best = attack23; }
if(bestScore < attack22) { bestScore = attack22; best = attack22; }
if(bestScore < attack10) { bestScore = attack10; best = attack10; }
if(bestScore < attack11) { bestScore = attack11; best = attack11; }
if(bestScore < attack24) { bestScore = attack24; best = attack24; }
if(bestScore < attack12) { bestScore = attack12; best = attack12; }
if(bestScore < attack16) { bestScore = attack16; best = attack16; }
if(bestScore < attack15) { bestScore = attack15; best = attack15; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack34) { bestScore = attack34; best = attack34; }
var info = MicroManagerSplasher.microInfos[Direction.SOUTHWEST.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
if(rc.canMove(Direction.WEST)){
int best = -1; int bestScore = 0;
if(bestScore < attack2) { bestScore = attack2; best = attack2; }
if(bestScore < attack8) { bestScore = attack8; best = attack8; }
if(bestScore < attack23) { bestScore = attack23; best = attack23; }
if(bestScore < attack13) { bestScore = attack13; best = attack13; }
if(bestScore < attack10) { bestScore = attack10; best = attack10; }
if(bestScore < attack11) { bestScore = attack11; best = attack11; }
if(bestScore < attack24) { bestScore = attack24; best = attack24; }
if(bestScore < attack12) { bestScore = attack12; best = attack12; }
if(bestScore < attack36) { bestScore = attack36; best = attack36; }
if(bestScore < attack15) { bestScore = attack15; best = attack15; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack17) { bestScore = attack17; best = attack17; }
if(bestScore < attack6) { bestScore = attack6; best = attack6; }
var info = MicroManagerSplasher.microInfos[Direction.WEST.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
if(rc.canMove(Direction.NORTHWEST)){
int best = -1; int bestScore = 0;
if(bestScore < attack29) { bestScore = attack29; best = attack29; }
if(bestScore < attack23) { bestScore = attack23; best = attack23; }
if(bestScore < attack13) { bestScore = attack13; best = attack13; }
if(bestScore < attack26) { bestScore = attack26; best = attack26; }
if(bestScore < attack11) { bestScore = attack11; best = attack11; }
if(bestScore < attack24) { bestScore = attack24; best = attack24; }
if(bestScore < attack12) { bestScore = attack12; best = attack12; }
if(bestScore < attack36) { bestScore = attack36; best = attack36; }
if(bestScore < attack25) { bestScore = attack25; best = attack25; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack17) { bestScore = attack17; best = attack17; }
if(bestScore < attack3) { bestScore = attack3; best = attack3; }
if(bestScore < attack31) { bestScore = attack31; best = attack31; }
var info = MicroManagerSplasher.microInfos[Direction.NORTHWEST.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
if(rc.canMove(Direction.SOUTH)){
int best = -1; int bestScore = 0;
if(bestScore < attack8) { bestScore = attack8; best = attack8; }
if(bestScore < attack10) { bestScore = attack10; best = attack10; }
if(bestScore < attack11) { bestScore = attack11; best = attack11; }
if(bestScore < attack24) { bestScore = attack24; best = attack24; }
if(bestScore < attack28) { bestScore = attack28; best = attack28; }
if(bestScore < attack16) { bestScore = attack16; best = attack16; }
if(bestScore < attack15) { bestScore = attack15; best = attack15; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack17) { bestScore = attack17; best = attack17; }
if(bestScore < attack35) { bestScore = attack35; best = attack35; }
if(bestScore < attack34) { bestScore = attack34; best = attack34; }
if(bestScore < attack6) { bestScore = attack6; best = attack6; }
if(bestScore < attack18) { bestScore = attack18; best = attack18; }
var info = MicroManagerSplasher.microInfos[Direction.SOUTH.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
if(rc.canMove(Direction.CENTER)){
int best = -1; int bestScore = 0;
if(bestScore < attack23) { bestScore = attack23; best = attack23; }
if(bestScore < attack11) { bestScore = attack11; best = attack11; }
if(bestScore < attack24) { bestScore = attack24; best = attack24; }
if(bestScore < attack12) { bestScore = attack12; best = attack12; }
if(bestScore < attack16) { bestScore = attack16; best = attack16; }
if(bestScore < attack15) { bestScore = attack15; best = attack15; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack17) { bestScore = attack17; best = attack17; }
if(bestScore < attack3) { bestScore = attack3; best = attack3; }
if(bestScore < attack34) { bestScore = attack34; best = attack34; }
if(bestScore < attack6) { bestScore = attack6; best = attack6; }
if(bestScore < attack31) { bestScore = attack31; best = attack31; }
if(bestScore < attack33) { bestScore = attack33; best = attack33; }
var info = MicroManagerSplasher.microInfos[Direction.CENTER.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
if(rc.canMove(Direction.NORTH)){
int best = -1; int bestScore = 0;
if(bestScore < attack13) { bestScore = attack13; best = attack13; }
if(bestScore < attack24) { bestScore = attack24; best = attack24; }
if(bestScore < attack12) { bestScore = attack12; best = attack12; }
if(bestScore < attack36) { bestScore = attack36; best = attack36; }
if(bestScore < attack15) { bestScore = attack15; best = attack15; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack17) { bestScore = attack17; best = attack17; }
if(bestScore < attack3) { bestScore = attack3; best = attack3; }
if(bestScore < attack32) { bestScore = attack32; best = attack32; }
if(bestScore < attack6) { bestScore = attack6; best = attack6; }
if(bestScore < attack31) { bestScore = attack31; best = attack31; }
if(bestScore < attack20) { bestScore = attack20; best = attack20; }
if(bestScore < attack21) { bestScore = attack21; best = attack21; }
var info = MicroManagerSplasher.microInfos[Direction.NORTH.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
if(rc.canMove(Direction.SOUTHEAST)){
int best = -1; int bestScore = 0;
if(bestScore < attack11) { bestScore = attack11; best = attack11; }
if(bestScore < attack16) { bestScore = attack16; best = attack16; }
if(bestScore < attack15) { bestScore = attack15; best = attack15; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack4) { bestScore = attack4; best = attack4; }
if(bestScore < attack35) { bestScore = attack35; best = attack35; }
if(bestScore < attack34) { bestScore = attack34; best = attack34; }
if(bestScore < attack6) { bestScore = attack6; best = attack6; }
if(bestScore < attack31) { bestScore = attack31; best = attack31; }
if(bestScore < attack19) { bestScore = attack19; best = attack19; }
if(bestScore < attack18) { bestScore = attack18; best = attack18; }
if(bestScore < attack33) { bestScore = attack33; best = attack33; }
if(bestScore < attack0) { bestScore = attack0; best = attack0; }
var info = MicroManagerSplasher.microInfos[Direction.SOUTHEAST.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
if(rc.canMove(Direction.EAST)){
int best = -1; int bestScore = 0;
if(bestScore < attack24) { bestScore = attack24; best = attack24; }
if(bestScore < attack15) { bestScore = attack15; best = attack15; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack17) { bestScore = attack17; best = attack17; }
if(bestScore < attack35) { bestScore = attack35; best = attack35; }
if(bestScore < attack34) { bestScore = attack34; best = attack34; }
if(bestScore < attack6) { bestScore = attack6; best = attack6; }
if(bestScore < attack31) { bestScore = attack31; best = attack31; }
if(bestScore < attack20) { bestScore = attack20; best = attack20; }
if(bestScore < attack18) { bestScore = attack18; best = attack18; }
if(bestScore < attack33) { bestScore = attack33; best = attack33; }
if(bestScore < attack21) { bestScore = attack21; best = attack21; }
if(bestScore < attack14) { bestScore = attack14; best = attack14; }
var info = MicroManagerSplasher.microInfos[Direction.EAST.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
if(rc.canMove(Direction.NORTHEAST)){
int best = -1; int bestScore = 0;
if(bestScore < attack12) { bestScore = attack12; best = attack12; }
if(bestScore < attack30) { bestScore = attack30; best = attack30; }
if(bestScore < attack17) { bestScore = attack17; best = attack17; }
if(bestScore < attack3) { bestScore = attack3; best = attack3; }
if(bestScore < attack34) { bestScore = attack34; best = attack34; }
if(bestScore < attack6) { bestScore = attack6; best = attack6; }
if(bestScore < attack31) { bestScore = attack31; best = attack31; }
if(bestScore < attack20) { bestScore = attack20; best = attack20; }
if(bestScore < attack7) { bestScore = attack7; best = attack7; }
if(bestScore < attack33) { bestScore = attack33; best = attack33; }
if(bestScore < attack21) { bestScore = attack21; best = attack21; }
if(bestScore < attack5) { bestScore = attack5; best = attack5; }
if(bestScore < attack1) { bestScore = attack1; best = attack1; }
var info = MicroManagerSplasher.microInfos[Direction.NORTHEAST.ordinal()];
info.bestAtkValue=bestScore;
info.bestAtkLoc=id2loc(best);
}
}
static MapLocation id2loc(int id) {
MapLocation myLoc = rc.getLocation();
return switch(id) {
    case 0 -> myLoc.translate(3,-1);
    case 1 -> myLoc.translate(3,1);
    case 2 -> myLoc.translate(-3,0);
    case 3 -> myLoc.translate(0,2);
    case 4 -> myLoc.translate(1,-3);
    case 5 -> myLoc.translate(2,2);
    case 6 -> myLoc.translate(1,0);
    case 7 -> myLoc.translate(1,3);
    case 8 -> myLoc.translate(-2,-1);
    case 9 -> myLoc.translate(-2,-2);
    case 10 -> myLoc.translate(-1,-2);
    case 11 -> myLoc.translate(-1,-1);
    case 12 -> myLoc.translate(-1,1);
    case 13 -> myLoc.translate(-2,1);
    case 14 -> myLoc.translate(3,0);
    case 15 -> myLoc.translate(0,-1);
    case 16 -> myLoc.translate(0,-2);
    case 17 -> myLoc.translate(0,1);
    case 18 -> myLoc.translate(2,-1);
    case 19 -> myLoc.translate(2,-2);
    case 20 -> myLoc.translate(1,2);
    case 21 -> myLoc.translate(2,1);
    case 22 -> myLoc.translate(-1,-3);
    case 23 -> myLoc.translate(-2,0);
    case 24 -> myLoc.translate(-1,0);
    case 25 -> myLoc.translate(-1,3);
    case 26 -> myLoc.translate(-2,2);
    case 27 -> myLoc.translate(-3,-1);
    case 28 -> myLoc.translate(0,-3);
    case 29 -> myLoc.translate(-3,1);
    case 30 -> myLoc.translate(0,0);
    case 31 -> myLoc.translate(1,1);
    case 32 -> myLoc.translate(0,3);
    case 33 -> myLoc.translate(2,0);
    case 34 -> myLoc.translate(1,-1);
    case 35 -> myLoc.translate(1,-2);
    case 36 -> myLoc.translate(-1,2);
    default -> null;
};
}
}
