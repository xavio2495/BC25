
package basic38;

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

int attack20 = 0;
int attack7 = 0;
int attack30 = 0;
int attack6 = 0;
int attack21 = 0;
int attack3 = 0;
int attack2 = 0;
int attack36 = 0;
int attack33 = 0;
int attack23 = 0;
int attack35 = 0;
int attack32 = 0;
int attack26 = 0;
int attack34 = 0;
int attack31 = 0;
int attack11 = 0;
int attack10 = 0;
int attack19 = 0;
int attack1 = 0;
int attack14 = 0;
int attack8 = 0;
int attack9 = 0;
int attack27 = 0;
int attack13 = 0;
int attack16 = 0;
int attack12 = 0;
int attack0 = 0;
int attack5 = 0;
int attack22 = 0;
int attack25 = 0;
int attack15 = 0;
int attack18 = 0;
int attack24 = 0;
int attack4 = 0;
int attack28 = 0;
int attack29 = 0;
int attack17 = 0;
i = rc.senseMapInfo(myLoc);
p = i.getPaint();
loc = myLoc.translate(2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(4, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(4, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(4, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(3, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack0 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(4, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(4, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(3, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack1 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-4, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-4, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-4, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack2 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(0, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(0, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(0, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(0, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(0, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack3 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(0, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(0, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(0, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(2, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack19 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack4 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(2, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack5 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack5 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(0, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack6 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack6 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack14 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack17 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack18 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack21 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack31 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack33 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(1, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack7 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack7 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack20 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack35 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack11 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack12 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack15 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack16 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack23 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack24 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack30 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack34 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack8 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-3, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-4, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack27 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack27 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-2, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack9 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-1, -4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack10 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack10 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack22 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack22 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack28 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack13 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack13 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-2, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-1, 4);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p.isEnemy()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack32 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack36 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
}
loc = myLoc.translate(-3, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack25 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
loc = myLoc.translate(-4, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack26 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack26 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
    attack29 += Constants.SPLASHER_SCORE_ATTACK_TOWER;
}
if(p.isEnemy()){
    attack29 += Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY;
}
}
if(rc.canMove(Direction.SOUTHWEST)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack27) { bestScore = attack27; best = 27; }
if(bestScore < attack9) { bestScore = attack9; best = 9; }
if(bestScore < attack8) { bestScore = attack8; best = 8; }
if(bestScore < attack23) { bestScore = attack23; best = 23; }
if(bestScore < attack22) { bestScore = attack22; best = 22; }
if(bestScore < attack10) { bestScore = attack10; best = 10; }
if(bestScore < attack11) { bestScore = attack11; best = 11; }
if(bestScore < attack24) { bestScore = attack24; best = 24; }
if(bestScore < attack12) { bestScore = attack12; best = 12; }
if(bestScore < attack16) { bestScore = attack16; best = 16; }
if(bestScore < attack15) { bestScore = attack15; best = 15; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack34) { bestScore = attack34; best = 34; }
var info = MicroManagerSplasher.microInfos[Direction.SOUTHWEST.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
}
if(rc.canMove(Direction.WEST)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack2) { bestScore = attack2; best = 2; }
if(bestScore < attack8) { bestScore = attack8; best = 8; }
if(bestScore < attack23) { bestScore = attack23; best = 23; }
if(bestScore < attack13) { bestScore = attack13; best = 13; }
if(bestScore < attack10) { bestScore = attack10; best = 10; }
if(bestScore < attack11) { bestScore = attack11; best = 11; }
if(bestScore < attack24) { bestScore = attack24; best = 24; }
if(bestScore < attack12) { bestScore = attack12; best = 12; }
if(bestScore < attack36) { bestScore = attack36; best = 36; }
if(bestScore < attack15) { bestScore = attack15; best = 15; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack17) { bestScore = attack17; best = 17; }
if(bestScore < attack6) { bestScore = attack6; best = 6; }
var info = MicroManagerSplasher.microInfos[Direction.WEST.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
}
if(rc.canMove(Direction.NORTHWEST)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack29) { bestScore = attack29; best = 29; }
if(bestScore < attack23) { bestScore = attack23; best = 23; }
if(bestScore < attack13) { bestScore = attack13; best = 13; }
if(bestScore < attack26) { bestScore = attack26; best = 26; }
if(bestScore < attack11) { bestScore = attack11; best = 11; }
if(bestScore < attack24) { bestScore = attack24; best = 24; }
if(bestScore < attack12) { bestScore = attack12; best = 12; }
if(bestScore < attack36) { bestScore = attack36; best = 36; }
if(bestScore < attack25) { bestScore = attack25; best = 25; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack17) { bestScore = attack17; best = 17; }
if(bestScore < attack3) { bestScore = attack3; best = 3; }
if(bestScore < attack31) { bestScore = attack31; best = 31; }
var info = MicroManagerSplasher.microInfos[Direction.NORTHWEST.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
}
if(rc.canMove(Direction.SOUTH)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack8) { bestScore = attack8; best = 8; }
if(bestScore < attack10) { bestScore = attack10; best = 10; }
if(bestScore < attack11) { bestScore = attack11; best = 11; }
if(bestScore < attack24) { bestScore = attack24; best = 24; }
if(bestScore < attack28) { bestScore = attack28; best = 28; }
if(bestScore < attack16) { bestScore = attack16; best = 16; }
if(bestScore < attack15) { bestScore = attack15; best = 15; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack17) { bestScore = attack17; best = 17; }
if(bestScore < attack35) { bestScore = attack35; best = 35; }
if(bestScore < attack34) { bestScore = attack34; best = 34; }
if(bestScore < attack6) { bestScore = attack6; best = 6; }
if(bestScore < attack18) { bestScore = attack18; best = 18; }
var info = MicroManagerSplasher.microInfos[Direction.SOUTH.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
}
if(rc.canMove(Direction.CENTER)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack23) { bestScore = attack23; best = 23; }
if(bestScore < attack11) { bestScore = attack11; best = 11; }
if(bestScore < attack24) { bestScore = attack24; best = 24; }
if(bestScore < attack12) { bestScore = attack12; best = 12; }
if(bestScore < attack16) { bestScore = attack16; best = 16; }
if(bestScore < attack15) { bestScore = attack15; best = 15; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack17) { bestScore = attack17; best = 17; }
if(bestScore < attack3) { bestScore = attack3; best = 3; }
if(bestScore < attack34) { bestScore = attack34; best = 34; }
if(bestScore < attack6) { bestScore = attack6; best = 6; }
if(bestScore < attack31) { bestScore = attack31; best = 31; }
if(bestScore < attack33) { bestScore = attack33; best = 33; }
var info = MicroManagerSplasher.microInfos[Direction.CENTER.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
}
if(rc.canMove(Direction.NORTH)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack13) { bestScore = attack13; best = 13; }
if(bestScore < attack24) { bestScore = attack24; best = 24; }
if(bestScore < attack12) { bestScore = attack12; best = 12; }
if(bestScore < attack36) { bestScore = attack36; best = 36; }
if(bestScore < attack15) { bestScore = attack15; best = 15; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack17) { bestScore = attack17; best = 17; }
if(bestScore < attack3) { bestScore = attack3; best = 3; }
if(bestScore < attack32) { bestScore = attack32; best = 32; }
if(bestScore < attack6) { bestScore = attack6; best = 6; }
if(bestScore < attack31) { bestScore = attack31; best = 31; }
if(bestScore < attack20) { bestScore = attack20; best = 20; }
if(bestScore < attack21) { bestScore = attack21; best = 21; }
var info = MicroManagerSplasher.microInfos[Direction.NORTH.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
}
if(rc.canMove(Direction.SOUTHEAST)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack11) { bestScore = attack11; best = 11; }
if(bestScore < attack16) { bestScore = attack16; best = 16; }
if(bestScore < attack15) { bestScore = attack15; best = 15; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack4) { bestScore = attack4; best = 4; }
if(bestScore < attack35) { bestScore = attack35; best = 35; }
if(bestScore < attack34) { bestScore = attack34; best = 34; }
if(bestScore < attack6) { bestScore = attack6; best = 6; }
if(bestScore < attack31) { bestScore = attack31; best = 31; }
if(bestScore < attack19) { bestScore = attack19; best = 19; }
if(bestScore < attack18) { bestScore = attack18; best = 18; }
if(bestScore < attack33) { bestScore = attack33; best = 33; }
if(bestScore < attack0) { bestScore = attack0; best = 0; }
var info = MicroManagerSplasher.microInfos[Direction.SOUTHEAST.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
}
if(rc.canMove(Direction.EAST)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack24) { bestScore = attack24; best = 24; }
if(bestScore < attack15) { bestScore = attack15; best = 15; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack17) { bestScore = attack17; best = 17; }
if(bestScore < attack35) { bestScore = attack35; best = 35; }
if(bestScore < attack34) { bestScore = attack34; best = 34; }
if(bestScore < attack6) { bestScore = attack6; best = 6; }
if(bestScore < attack31) { bestScore = attack31; best = 31; }
if(bestScore < attack20) { bestScore = attack20; best = 20; }
if(bestScore < attack18) { bestScore = attack18; best = 18; }
if(bestScore < attack33) { bestScore = attack33; best = 33; }
if(bestScore < attack21) { bestScore = attack21; best = 21; }
if(bestScore < attack14) { bestScore = attack14; best = 14; }
var info = MicroManagerSplasher.microInfos[Direction.EAST.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
}
if(rc.canMove(Direction.NORTHEAST)){
int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;
if(bestScore < attack12) { bestScore = attack12; best = 12; }
if(bestScore < attack30) { bestScore = attack30; best = 30; }
if(bestScore < attack17) { bestScore = attack17; best = 17; }
if(bestScore < attack3) { bestScore = attack3; best = 3; }
if(bestScore < attack34) { bestScore = attack34; best = 34; }
if(bestScore < attack6) { bestScore = attack6; best = 6; }
if(bestScore < attack31) { bestScore = attack31; best = 31; }
if(bestScore < attack20) { bestScore = attack20; best = 20; }
if(bestScore < attack7) { bestScore = attack7; best = 7; }
if(bestScore < attack33) { bestScore = attack33; best = 33; }
if(bestScore < attack21) { bestScore = attack21; best = 21; }
if(bestScore < attack5) { bestScore = attack5; best = 5; }
if(bestScore < attack1) { bestScore = attack1; best = 1; }
var info = MicroManagerSplasher.microInfos[Direction.NORTHEAST.ordinal()];
info.atkValue=bestScore;
info.atkLoc=id2loc(best);
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
