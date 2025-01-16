package basic11;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapInfo;
import battlecode.common.MapLocation;
import battlecode.common.PaintType;
import battlecode.common.RobotController;
import battlecode.common.RobotInfo;
import battlecode.common.Team;

public  class SplasherAttackManager {
    static RobotController rc;

    public static boolean doMoveAndAttack() throws GameActionException {
        rc = MyRobot.rc;
        
        int attack24 = -18;
int attack26 = -18;
int attack22 = -18;
int attack28 = -18;
int move0 = 0;
int attack34 = -18;
int attack5 = -18;
int attack36 = -18;
int attack20 = -18;
int attack8 = -18;
int attack29 = -18;
int move5 = 0;
int attack11 = -18;
int attack35 = -18;
int attack9 = -18;
int move4 = 0;
int move8 = 0;
int attack14 = -18;
int move7 = 0;
int attack3 = -18;
int attack4 = -18;
int attack12 = -18;
int attack15 = -18;
int attack18 = -18;
int attack0 = -18;
int move3 = 0;
int move1 = 0;
int move2 = 0;
int attack33 = -18;
int attack6 = -18;
int attack7 = -18;
int attack21 = -18;
int move6 = 0;
int attack16 = -18;
int attack31 = -18;
int attack27 = -18;
int attack25 = -18;
int attack10 = -18;
int attack13 = -18;
int attack32 = -18;
int attack2 = -18;
int attack19 = -18;
int attack17 = -18;
int attack30 = -18;
int attack1 = -18;
int attack23 = -18;
MapLocation myLoc = rc.getLocation();
MapLocation loc;
MapInfo i;
RobotInfo r;
PaintType p;
Team myTeam = rc.getTeam();
i = rc.senseMapInfo(myLoc);
p = i.getPaint();
int clumpScore = p.isEnemy() ? -2 : -1;
loc = myLoc.translate(0, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY){
    move0 += -1;
}
if(p.isEnemy()){
    move0 += -2;
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
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move2 += clumpScore;
    move3 += clumpScore;
    move4 += clumpScore;
    move6 += clumpScore;
    move7 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
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
}
loc = myLoc.translate(-1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move1 += clumpScore;
    move2 += clumpScore;
    move3 += clumpScore;
    move6 += clumpScore;
    move8 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
    attack2 += 10;
    attack6 += 10;
    attack8 += 10;
    attack9 += 10;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(p == PaintType.EMPTY){
    move6 += -1;
}
if(p.isEnemy()){
    move6 += -2;
    attack8 += 4;
    attack9 += 4;
    attack12 += 4;
    attack13 += 4;
    attack15 += 4;
    attack17 += 4;
    attack23 += 4;
    attack24 += 4;
    attack30 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack6 += 1;
    attack8 += 1;
    attack9 += 1;
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
}
loc = myLoc.translate(-1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move2 += clumpScore;
    move3 += clumpScore;
    move6 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
    attack3 += 10;
    attack9 += 10;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(p == PaintType.EMPTY){
    move3 += -1;
}
if(p.isEnemy()){
    move3 += -2;
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
    attack9 += 1;
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
}
loc = myLoc.translate(-1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move3 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move6 += -20;
    move7 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move6 += -20;
    move7 += -20;
}
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
}
loc = myLoc.translate(0, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move1 += clumpScore;
    move2 += clumpScore;
    move3 += clumpScore;
    move4 += clumpScore;
    move5 += clumpScore;
    move6 += clumpScore;
    move7 += clumpScore;
    move8 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
    attack3 += 10;
    attack6 += 10;
    attack9 += 10;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(p == PaintType.EMPTY){
    move2 += -1;
}
if(p.isEnemy()){
    move2 += -2;
    attack6 += 4;
    attack9 += 4;
    attack12 += 4;
    attack15 += 4;
    attack17 += 4;
    attack24 += 4;
    attack30 += 4;
    attack31 += 4;
    attack34 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack3 += 1;
    attack6 += 1;
    attack9 += 1;
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
}
loc = myLoc.translate(0, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move3 += clumpScore;
    move4 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move6 += -20;
    move7 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move6 += -20;
    move7 += -20;
}
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
}
loc = myLoc.translate(1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move2 += clumpScore;
    move4 += clumpScore;
    move5 += clumpScore;
    move7 += clumpScore;
    move8 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(p == PaintType.EMPTY){
    move7 += -1;
}
if(p.isEnemy()){
    move7 += -2;
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
}
loc = myLoc.translate(1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move2 += clumpScore;
    move4 += clumpScore;
    move7 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(p == PaintType.EMPTY){
    move4 += -1;
}
if(p.isEnemy()){
    move4 += -2;
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
}
loc = myLoc.translate(1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move0 += clumpScore;
    move4 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move6 += -20;
    move7 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move6 += -20;
    move7 += -20;
}
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
}
loc = myLoc.translate(-2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move6 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move6 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move1 += clumpScore;
    move6 += clumpScore;
}
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
}
loc = myLoc.translate(-2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move6 += -20;
    move8 += -20;
    attack2 += 10;
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack12 += 10;
    attack13 += 10;
    attack23 += 10;
    attack24 += 10;
    attack26 += 10;
    attack27 += 10;
    attack29 += 10;
    attack30 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move6 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move1 += clumpScore;
    move3 += clumpScore;
    move6 += clumpScore;
}
if(p.isEnemy()){
    attack2 += 4;
    attack8 += 4;
    attack9 += 4;
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
    attack10 += 1;
    attack12 += 1;
    attack13 += 1;
    attack23 += 1;
    attack24 += 1;
    attack26 += 1;
    attack27 += 1;
    attack29 += 1;
    attack30 += 1;
}
}
loc = myLoc.translate(-2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move6 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move6 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move3 += clumpScore;
    move6 += clumpScore;
}
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
}
loc = myLoc.translate(-2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move2 += -20;
    move3 += -20;
    move6 += -20;
    attack3 += 10;
    attack12 += 10;
    attack13 += 10;
    attack23 += 10;
    attack25 += 10;
    attack26 += 10;
    attack29 += 10;
    attack36 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move2 += -20;
    move3 += -20;
    move6 += -20;
}
if(r != null && r.team == myTeam){
    move3 += clumpScore;
}
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
if(p.isEnemy()){
    attack12 += 4;
    attack13 += 4;
    attack25 += 4;
    attack26 += 4;
    attack29 += 4;
    attack36 += 4;
}
}
loc = myLoc.translate(-2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move3 += -20;
    attack13 += 10;
    attack25 += 10;
    attack26 += 10;
    attack32 += 10;
    attack36 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move3 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack13 += 1;
    attack25 += 1;
    attack26 += 1;
    attack32 += 1;
    attack36 += 1;
}
if(p.isEnemy()){
    attack25 += 4;
    attack26 += 4;
    attack36 += 4;
}
}
loc = myLoc.translate(-1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(p == PaintType.EMPTY){
    move1 += -1;
}
if(p.isEnemy()){
    move1 += -2;
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
if(r != null && r.team == myTeam){
    move1 += clumpScore;
    move2 += clumpScore;
    move6 += clumpScore;
    move8 += clumpScore;
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
}
loc = myLoc.translate(-1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move3 += -20;
    move4 += -20;
    attack3 += 10;
    attack7 += 10;
    attack12 += 10;
    attack25 += 10;
    attack26 += 10;
    attack32 += 10;
    attack36 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move3 += -20;
    move4 += -20;
}
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
}
loc = myLoc.translate(0, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
    attack6 += 10;
    attack8 += 10;
    attack9 += 10;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move1 += clumpScore;
    move2 += clumpScore;
    move5 += clumpScore;
    move6 += clumpScore;
    move7 += clumpScore;
    move8 += clumpScore;
}
if(p == PaintType.EMPTY){
    move8 += -1;
}
if(p.isEnemy()){
    move8 += -2;
    attack6 += 4;
    attack9 += 4;
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
    attack9 += 1;
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
}
loc = myLoc.translate(0, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move3 += -20;
    move4 += -20;
    attack3 += 10;
    attack7 += 10;
    attack17 += 10;
    attack20 += 10;
    attack25 += 10;
    attack32 += 10;
    attack36 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move3 += -20;
    move4 += -20;
}
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
}
loc = myLoc.translate(1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
    attack0 += 10;
    attack4 += 10;
    attack6 += 10;
    attack9 += 10;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move1 += -20;
    move2 += -20;
    move3 += -20;
    move4 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move2 += clumpScore;
    move5 += clumpScore;
    move7 += clumpScore;
    move8 += clumpScore;
}
if(p == PaintType.EMPTY){
    move5 += -1;
}
if(p.isEnemy()){
    move5 += -2;
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
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack4 += 1;
    attack6 += 1;
    attack9 += 1;
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
}
loc = myLoc.translate(1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move3 += -20;
    move4 += -20;
    attack3 += 10;
    attack5 += 10;
    attack7 += 10;
    attack20 += 10;
    attack25 += 10;
    attack31 += 10;
    attack32 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move3 += -20;
    move4 += -20;
}
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
}
loc = myLoc.translate(2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move2 += -20;
    move4 += -20;
    move5 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move2 += -20;
    move4 += -20;
    move5 += -20;
    move7 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move5 += clumpScore;
    move7 += clumpScore;
}
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
}
loc = myLoc.translate(2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move2 += -20;
    move4 += -20;
    move5 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move2 += -20;
    move4 += -20;
    move5 += -20;
    move7 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move4 += clumpScore;
    move5 += clumpScore;
    move7 += clumpScore;
}
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
}
loc = myLoc.translate(2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move2 += -20;
    move4 += -20;
    move5 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move2 += -20;
    move4 += -20;
    move5 += -20;
    move7 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move4 += clumpScore;
    move7 += clumpScore;
}
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
}
loc = myLoc.translate(2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move2 += -20;
    move4 += -20;
    move7 += -20;
    attack1 += 10;
    attack3 += 10;
    attack5 += 10;
    attack7 += 10;
    attack20 += 10;
    attack21 += 10;
    attack31 += 10;
    attack33 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move2 += -20;
    move4 += -20;
    move7 += -20;
}
if(r != null && r.team == myTeam){
    move4 += clumpScore;
}
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
}
loc = myLoc.translate(2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move0 += -20;
    move4 += -20;
    attack5 += 10;
    attack7 += 10;
    attack20 += 10;
    attack21 += 10;
    attack32 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move0 += -20;
    move4 += -20;
}
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
}
loc = myLoc.translate(-2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move1 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move2 += -20;
    move6 += -20;
    move8 += -20;
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack11 += 10;
    attack16 += 10;
    attack22 += 10;
    attack23 += 10;
    attack27 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move2 += -20;
    move6 += -20;
    move8 += -20;
}
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
}
loc = myLoc.translate(-1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move1 += clumpScore;
    move8 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move2 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move2 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
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
}
loc = myLoc.translate(0, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team == myTeam){
    move1 += clumpScore;
    move5 += clumpScore;
    move8 += clumpScore;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move2 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
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
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move2 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(p.isEnemy()){
    attack4 += 4;
    attack9 += 4;
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
}
loc = myLoc.translate(-3, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    attack10 += 10;
    attack22 += 10;
    attack27 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
}
if(p.isEnemy()){
    attack10 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack10 += 1;
    attack22 += 1;
    attack27 += 1;
}
}
loc = myLoc.translate(-3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move6 += -20;
    attack2 += 10;
    attack8 += 10;
    attack10 += 10;
    attack11 += 10;
    attack27 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move6 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack10 += 1;
    attack11 += 1;
    attack27 += 1;
}
if(p.isEnemy()){
    attack8 += 4;
    attack10 += 4;
    attack27 += 4;
}
}
loc = myLoc.translate(-3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move3 += -20;
    move6 += -20;
    attack2 += 10;
    attack8 += 10;
    attack9 += 10;
    attack10 += 10;
    attack23 += 10;
    attack27 += 10;
    attack29 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move3 += -20;
    move6 += -20;
}
if(p.isEnemy()){
    attack2 += 4;
    attack8 += 4;
    attack10 += 4;
    attack23 += 4;
    attack27 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack8 += 1;
    attack9 += 1;
    attack10 += 1;
    attack23 += 1;
    attack27 += 1;
    attack29 += 1;
}
}
loc = myLoc.translate(-3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move3 += -20;
    move6 += -20;
    attack2 += 10;
    attack8 += 10;
    attack13 += 10;
    attack23 += 10;
    attack24 += 10;
    attack27 += 10;
    attack29 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move3 += -20;
    move6 += -20;
}
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
}
loc = myLoc.translate(-3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move3 += -20;
    move6 += -20;
    attack2 += 10;
    attack12 += 10;
    attack13 += 10;
    attack23 += 10;
    attack26 += 10;
    attack27 += 10;
    attack29 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move3 += -20;
    move6 += -20;
}
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
}
loc = myLoc.translate(-2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move8 += -20;
    attack8 += 10;
    attack10 += 10;
    attack11 += 10;
    attack22 += 10;
    attack28 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move8 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack8 += 1;
    attack10 += 1;
    attack11 += 1;
    attack22 += 1;
    attack28 += 1;
}
if(p.isEnemy()){
    attack10 += 4;
    attack11 += 4;
    attack22 += 4;
}
}
loc = myLoc.translate(-1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move5 += -20;
    move8 += -20;
    attack4 += 10;
    attack9 += 10;
    attack10 += 10;
    attack11 += 10;
    attack16 += 10;
    attack22 += 10;
    attack28 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move5 += -20;
    move8 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack9 += 1;
    attack10 += 1;
    attack11 += 1;
    attack16 += 1;
    attack22 += 1;
    attack28 += 1;
}
if(p.isEnemy()){
    attack10 += 4;
    attack11 += 4;
    attack16 += 4;
    attack22 += 4;
    attack28 += 4;
}
}
loc = myLoc.translate(0, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move5 += -20;
    move8 += -20;
    attack4 += 10;
    attack11 += 10;
    attack15 += 10;
    attack16 += 10;
    attack22 += 10;
    attack28 += 10;
    attack35 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move5 += -20;
    move8 += -20;
}
if(p.isEnemy()){
    attack4 += 4;
    attack11 += 4;
    attack16 += 4;
    attack22 += 4;
    attack28 += 4;
    attack35 += 4;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack4 += 1;
    attack11 += 1;
    attack15 += 1;
    attack16 += 1;
    attack22 += 1;
    attack28 += 1;
    attack35 += 1;
}
}
loc = myLoc.translate(1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move5 += -20;
    move8 += -20;
    attack4 += 10;
    attack16 += 10;
    attack19 += 10;
    attack22 += 10;
    attack28 += 10;
    attack34 += 10;
    attack35 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move5 += -20;
    move8 += -20;
}
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
}
loc = myLoc.translate(1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move1 += -20;
    move2 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
    attack4 += 10;
    attack6 += 10;
    attack11 += 10;
    attack15 += 10;
    attack16 += 10;
    attack18 += 10;
    attack19 += 10;
    attack28 += 10;
    attack34 += 10;
    attack35 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move1 += -20;
    move2 += -20;
    move5 += -20;
    move6 += -20;
    move7 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move5 += clumpScore;
    move8 += clumpScore;
}
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
    attack11 += 1;
    attack15 += 1;
    attack16 += 1;
    attack18 += 1;
    attack19 += 1;
    attack28 += 1;
    attack34 += 1;
    attack35 += 1;
}
}
loc = myLoc.translate(2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move2 += -20;
    move5 += -20;
    move7 += -20;
    move8 += -20;
    attack0 += 10;
    attack4 += 10;
    attack16 += 10;
    attack18 += 10;
    attack19 += 10;
    attack33 += 10;
    attack34 += 10;
    attack35 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move2 += -20;
    move5 += -20;
    move7 += -20;
    move8 += -20;
}
if(r != null && r.team == myTeam){
    move5 += clumpScore;
}
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
}
loc = myLoc.translate(-3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move3 += -20;
    move6 += -20;
    attack2 += 10;
    attack13 += 10;
    attack26 += 10;
    attack29 += 10;
    attack36 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move3 += -20;
    move6 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack2 += 1;
    attack13 += 1;
    attack26 += 1;
    attack29 += 1;
    attack36 += 1;
}
if(p.isEnemy()){
    attack13 += 4;
    attack26 += 4;
    attack29 += 4;
}
}
loc = myLoc.translate(-3, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move3 += -20;
    attack25 += 10;
    attack26 += 10;
    attack29 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move3 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack25 += 1;
    attack26 += 1;
    attack29 += 1;
}
if(p.isEnemy()){
    attack26 += 4;
}
}
loc = myLoc.translate(3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move4 += -20;
    move5 += -20;
    move7 += -20;
    attack0 += 10;
    attack1 += 10;
    attack14 += 10;
    attack18 += 10;
    attack19 += 10;
    attack33 += 10;
    attack34 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move4 += -20;
    move5 += -20;
    move7 += -20;
}
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
}
loc = myLoc.translate(3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move4 += -20;
    move5 += -20;
    move7 += -20;
    attack0 += 10;
    attack1 += 10;
    attack6 += 10;
    attack14 += 10;
    attack18 += 10;
    attack21 += 10;
    attack33 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move4 += -20;
    move5 += -20;
    move7 += -20;
}
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
}
loc = myLoc.translate(3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move4 += -20;
    move5 += -20;
    move7 += -20;
    attack0 += 10;
    attack1 += 10;
    attack5 += 10;
    attack14 += 10;
    attack21 += 10;
    attack31 += 10;
    attack33 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move4 += -20;
    move5 += -20;
    move7 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack1 += 1;
    attack5 += 1;
    attack14 += 1;
    attack21 += 1;
    attack31 += 1;
    attack33 += 1;
}
if(p.isEnemy()){
    attack1 += 4;
    attack5 += 4;
    attack14 += 4;
    attack21 += 4;
    attack33 += 4;
}
}
loc = myLoc.translate(3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move4 += -20;
    move7 += -20;
    attack1 += 10;
    attack5 += 10;
    attack14 += 10;
    attack20 += 10;
    attack21 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move4 += -20;
    move7 += -20;
}
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
}
loc = myLoc.translate(3, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move4 += -20;
    attack1 += 10;
    attack5 += 10;
    attack7 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move4 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack1 += 1;
    attack5 += 1;
    attack7 += 1;
}
if(p.isEnemy()){
    attack5 += 4;
}
}
loc = myLoc.translate(2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move5 += -20;
    move8 += -20;
    attack4 += 10;
    attack18 += 10;
    attack19 += 10;
    attack28 += 10;
    attack35 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move5 += -20;
    move8 += -20;
}
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
}
loc = myLoc.translate(3, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move5 += -20;
    attack0 += 10;
    attack4 += 10;
    attack19 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move5 += -20;
}
if(p == PaintType.EMPTY && i.isPassable()){
    attack0 += 1;
    attack4 += 1;
    attack19 += 1;
}
if(p.isEnemy()){
    attack19 += 4;
}
}
loc = myLoc.translate(3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam && r.type.isTowerType()){
    move5 += -20;
    move7 += -20;
    attack0 += 10;
    attack14 += 10;
    attack18 += 10;
    attack19 += 10;
    attack35 += 10;
}
if(r != null && r.team != myTeam && r.type.ordinal() >= 9){
    move5 += -20;
    move7 += -20;
}
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
loc = myLoc.translate(-4, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(p == PaintType.EMPTY && i.isPassable()){
    attack10 += 1;
    attack27 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack10 += 10;
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
    attack10 += 1;
    attack22 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack10 += 10;
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
    attack11 += 1;
    attack22 += 1;
    attack28 += 1;
}
if(r != null && r.team != myTeam && r.type.isTowerType()){
    attack11 += 10;
    attack22 += 10;
    attack28 += 10;
}
if(p.isEnemy()){
    attack22 += 4;
    attack28 += 4;
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
int best = -1;
int bestScore = -100000;
if(bestScore < move1&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1; best = 0; }
if(bestScore < move1+attack27&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack27; best = 1; }
if(bestScore < move1+attack23&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack23; best = 2; }
if(bestScore < move1+attack10&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack10; best = 3; }
if(bestScore < move1+attack9&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack9; best = 4; }
if(bestScore < move1+attack8&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack8; best = 5; }
if(bestScore < move1+attack24&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack24; best = 6; }
if(bestScore < move1+attack12&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack12; best = 7; }
if(bestScore < move1+attack22&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack22; best = 8; }
if(bestScore < move1+attack16&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack16; best = 9; }
if(bestScore < move1+attack11&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack11; best = 10; }
if(bestScore < move1+attack15&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack15; best = 11; }
if(bestScore < move1+attack30&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack30; best = 12; }
if(bestScore < move1+attack17&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack17; best = 13; }
if(bestScore < move1+attack3&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack3; best = 14; }
if(bestScore < move1+attack34&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack34; best = 15; }
if(bestScore < move1+attack6&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack6; best = 16; }
if(bestScore < move1+attack31&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack31; best = 17; }
if(bestScore < move1+attack33&& rc.canMove(Direction.SOUTHWEST)) { bestScore = move1+attack33; best = 18; }
if(bestScore < move6&& rc.canMove(Direction.WEST)) { bestScore = move6; best = 19; }
if(bestScore < move6+attack2&& rc.canMove(Direction.WEST)) { bestScore = move6+attack2; best = 20; }
if(bestScore < move6+attack23&& rc.canMove(Direction.WEST)) { bestScore = move6+attack23; best = 21; }
if(bestScore < move6+attack8&& rc.canMove(Direction.WEST)) { bestScore = move6+attack8; best = 22; }
if(bestScore < move6+attack9&& rc.canMove(Direction.WEST)) { bestScore = move6+attack9; best = 23; }
if(bestScore < move6+attack24&& rc.canMove(Direction.WEST)) { bestScore = move6+attack24; best = 24; }
if(bestScore < move6+attack13&& rc.canMove(Direction.WEST)) { bestScore = move6+attack13; best = 25; }
if(bestScore < move6+attack12&& rc.canMove(Direction.WEST)) { bestScore = move6+attack12; best = 26; }
if(bestScore < move6+attack11&& rc.canMove(Direction.WEST)) { bestScore = move6+attack11; best = 27; }
if(bestScore < move6+attack16&& rc.canMove(Direction.WEST)) { bestScore = move6+attack16; best = 28; }
if(bestScore < move6+attack15&& rc.canMove(Direction.WEST)) { bestScore = move6+attack15; best = 29; }
if(bestScore < move6+attack30&& rc.canMove(Direction.WEST)) { bestScore = move6+attack30; best = 30; }
if(bestScore < move6+attack17&& rc.canMove(Direction.WEST)) { bestScore = move6+attack17; best = 31; }
if(bestScore < move6+attack36&& rc.canMove(Direction.WEST)) { bestScore = move6+attack36; best = 32; }
if(bestScore < move6+attack3&& rc.canMove(Direction.WEST)) { bestScore = move6+attack3; best = 33; }
if(bestScore < move6+attack34&& rc.canMove(Direction.WEST)) { bestScore = move6+attack34; best = 34; }
if(bestScore < move6+attack6&& rc.canMove(Direction.WEST)) { bestScore = move6+attack6; best = 35; }
if(bestScore < move6+attack31&& rc.canMove(Direction.WEST)) { bestScore = move6+attack31; best = 36; }
if(bestScore < move6+attack33&& rc.canMove(Direction.WEST)) { bestScore = move6+attack33; best = 37; }
if(bestScore < move3&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3; best = 38; }
if(bestScore < move3+attack29&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack29; best = 39; }
if(bestScore < move3+attack23&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack23; best = 40; }
if(bestScore < move3+attack9&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack9; best = 41; }
if(bestScore < move3+attack13&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack13; best = 42; }
if(bestScore < move3+attack24&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack24; best = 43; }
if(bestScore < move3+attack26&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack26; best = 44; }
if(bestScore < move3+attack12&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack12; best = 45; }
if(bestScore < move3+attack16&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack16; best = 46; }
if(bestScore < move3+attack15&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack15; best = 47; }
if(bestScore < move3+attack30&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack30; best = 48; }
if(bestScore < move3+attack36&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack36; best = 49; }
if(bestScore < move3+attack17&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack17; best = 50; }
if(bestScore < move3+attack25&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack25; best = 51; }
if(bestScore < move3+attack3&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack3; best = 52; }
if(bestScore < move3+attack34&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack34; best = 53; }
if(bestScore < move3+attack6&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack6; best = 54; }
if(bestScore < move3+attack31&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack31; best = 55; }
if(bestScore < move3+attack33&& rc.canMove(Direction.NORTHWEST)) { bestScore = move3+attack33; best = 56; }
if(bestScore < move8&& rc.canMove(Direction.SOUTH)) { bestScore = move8; best = 57; }
if(bestScore < move8+attack8&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack8; best = 58; }
if(bestScore < move8+attack23&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack23; best = 59; }
if(bestScore < move8+attack11&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack11; best = 60; }
if(bestScore < move8+attack9&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack9; best = 61; }
if(bestScore < move8+attack24&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack24; best = 62; }
if(bestScore < move8+attack12&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack12; best = 63; }
if(bestScore < move8+attack28&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack28; best = 64; }
if(bestScore < move8+attack16&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack16; best = 65; }
if(bestScore < move8+attack15&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack15; best = 66; }
if(bestScore < move8+attack30&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack30; best = 67; }
if(bestScore < move8+attack17&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack17; best = 68; }
if(bestScore < move8+attack3&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack3; best = 69; }
if(bestScore < move8+attack35&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack35; best = 70; }
if(bestScore < move8+attack34&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack34; best = 71; }
if(bestScore < move8+attack6&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack6; best = 72; }
if(bestScore < move8+attack31&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack31; best = 73; }
if(bestScore < move8+attack18&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack18; best = 74; }
if(bestScore < move8+attack33&& rc.canMove(Direction.SOUTH)) { bestScore = move8+attack33; best = 75; }
if(bestScore < move2) { bestScore = move2; best = 76; }
if(bestScore < move2+attack23) { bestScore = move2+attack23; best = 77; }
if(bestScore < move2+attack9) { bestScore = move2+attack9; best = 78; }
if(bestScore < move2+attack24) { bestScore = move2+attack24; best = 79; }
if(bestScore < move2+attack12) { bestScore = move2+attack12; best = 80; }
if(bestScore < move2+attack16) { bestScore = move2+attack16; best = 81; }
if(bestScore < move2+attack15) { bestScore = move2+attack15; best = 82; }
if(bestScore < move2+attack30) { bestScore = move2+attack30; best = 83; }
if(bestScore < move2+attack17) { bestScore = move2+attack17; best = 84; }
if(bestScore < move2+attack3) { bestScore = move2+attack3; best = 85; }
if(bestScore < move2+attack34) { bestScore = move2+attack34; best = 86; }
if(bestScore < move2+attack6) { bestScore = move2+attack6; best = 87; }
if(bestScore < move2+attack31) { bestScore = move2+attack31; best = 88; }
if(bestScore < move2+attack33) { bestScore = move2+attack33; best = 89; }
if(bestScore < move0&& rc.canMove(Direction.NORTH)) { bestScore = move0; best = 90; }
if(bestScore < move0+attack13&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack13; best = 91; }
if(bestScore < move0+attack23&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack23; best = 92; }
if(bestScore < move0+attack24&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack24; best = 93; }
if(bestScore < move0+attack9&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack9; best = 94; }
if(bestScore < move0+attack12&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack12; best = 95; }
if(bestScore < move0+attack36&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack36; best = 96; }
if(bestScore < move0+attack15&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack15; best = 97; }
if(bestScore < move0+attack16&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack16; best = 98; }
if(bestScore < move0+attack30&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack30; best = 99; }
if(bestScore < move0+attack17&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack17; best = 100; }
if(bestScore < move0+attack3&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack3; best = 101; }
if(bestScore < move0+attack32&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack32; best = 102; }
if(bestScore < move0+attack6&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack6; best = 103; }
if(bestScore < move0+attack34&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack34; best = 104; }
if(bestScore < move0+attack31&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack31; best = 105; }
if(bestScore < move0+attack20&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack20; best = 106; }
if(bestScore < move0+attack21&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack21; best = 107; }
if(bestScore < move0+attack33&& rc.canMove(Direction.NORTH)) { bestScore = move0+attack33; best = 108; }
if(bestScore < move5&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5; best = 109; }
if(bestScore < move5+attack9&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack9; best = 110; }
if(bestScore < move5+attack23&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack23; best = 111; }
if(bestScore < move5+attack16&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack16; best = 112; }
if(bestScore < move5+attack15&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack15; best = 113; }
if(bestScore < move5+attack24&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack24; best = 114; }
if(bestScore < move5+attack30&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack30; best = 115; }
if(bestScore < move5+attack12&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack12; best = 116; }
if(bestScore < move5+attack4&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack4; best = 117; }
if(bestScore < move5+attack35&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack35; best = 118; }
if(bestScore < move5+attack34&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack34; best = 119; }
if(bestScore < move5+attack6&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack6; best = 120; }
if(bestScore < move5+attack17&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack17; best = 121; }
if(bestScore < move5+attack31&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack31; best = 122; }
if(bestScore < move5+attack3&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack3; best = 123; }
if(bestScore < move5+attack19&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack19; best = 124; }
if(bestScore < move5+attack18&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack18; best = 125; }
if(bestScore < move5+attack33&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack33; best = 126; }
if(bestScore < move5+attack0&& rc.canMove(Direction.SOUTHEAST)) { bestScore = move5+attack0; best = 127; }
if(bestScore < move7&& rc.canMove(Direction.EAST)) { bestScore = move7; best = 128; }
if(bestScore < move7+attack24&& rc.canMove(Direction.EAST)) { bestScore = move7+attack24; best = 129; }
if(bestScore < move7+attack23&& rc.canMove(Direction.EAST)) { bestScore = move7+attack23; best = 130; }
if(bestScore < move7+attack15&& rc.canMove(Direction.EAST)) { bestScore = move7+attack15; best = 131; }
if(bestScore < move7+attack9&& rc.canMove(Direction.EAST)) { bestScore = move7+attack9; best = 132; }
if(bestScore < move7+attack30&& rc.canMove(Direction.EAST)) { bestScore = move7+attack30; best = 133; }
if(bestScore < move7+attack17&& rc.canMove(Direction.EAST)) { bestScore = move7+attack17; best = 134; }
if(bestScore < move7+attack12&& rc.canMove(Direction.EAST)) { bestScore = move7+attack12; best = 135; }
if(bestScore < move7+attack35&& rc.canMove(Direction.EAST)) { bestScore = move7+attack35; best = 136; }
if(bestScore < move7+attack16&& rc.canMove(Direction.EAST)) { bestScore = move7+attack16; best = 137; }
if(bestScore < move7+attack34&& rc.canMove(Direction.EAST)) { bestScore = move7+attack34; best = 138; }
if(bestScore < move7+attack6&& rc.canMove(Direction.EAST)) { bestScore = move7+attack6; best = 139; }
if(bestScore < move7+attack31&& rc.canMove(Direction.EAST)) { bestScore = move7+attack31; best = 140; }
if(bestScore < move7+attack20&& rc.canMove(Direction.EAST)) { bestScore = move7+attack20; best = 141; }
if(bestScore < move7+attack3&& rc.canMove(Direction.EAST)) { bestScore = move7+attack3; best = 142; }
if(bestScore < move7+attack18&& rc.canMove(Direction.EAST)) { bestScore = move7+attack18; best = 143; }
if(bestScore < move7+attack33&& rc.canMove(Direction.EAST)) { bestScore = move7+attack33; best = 144; }
if(bestScore < move7+attack21&& rc.canMove(Direction.EAST)) { bestScore = move7+attack21; best = 145; }
if(bestScore < move7+attack14&& rc.canMove(Direction.EAST)) { bestScore = move7+attack14; best = 146; }
if(bestScore < move4&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4; best = 147; }
if(bestScore < move4+attack12&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack12; best = 148; }
if(bestScore < move4+attack23&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack23; best = 149; }
if(bestScore < move4+attack30&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack30; best = 150; }
if(bestScore < move4+attack9&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack9; best = 151; }
if(bestScore < move4+attack17&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack17; best = 152; }
if(bestScore < move4+attack24&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack24; best = 153; }
if(bestScore < move4+attack3&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack3; best = 154; }
if(bestScore < move4+attack34&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack34; best = 155; }
if(bestScore < move4+attack16&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack16; best = 156; }
if(bestScore < move4+attack6&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack6; best = 157; }
if(bestScore < move4+attack15&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack15; best = 158; }
if(bestScore < move4+attack31&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack31; best = 159; }
if(bestScore < move4+attack20&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack20; best = 160; }
if(bestScore < move4+attack7&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack7; best = 161; }
if(bestScore < move4+attack33&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack33; best = 162; }
if(bestScore < move4+attack21&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack21; best = 163; }
if(bestScore < move4+attack5&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack5; best = 164; }
if(bestScore < move4+attack1&& rc.canMove(Direction.NORTHEAST)) { bestScore = move4+attack1; best = 165; }
switch(best){
    case 0:
        rc.move(Direction.SOUTHWEST);
        return true;
    case 1:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-3, -1));
        return true;
    case 2:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-2, 0));
        return true;
    case 3:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-2, -2));
        return true;
    case 4:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-1, -1));
        return true;
    case 5:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-2, -1));
        return true;
    case 6:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-1, 0));
        return true;
    case 7:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-1, 1));
        return true;
    case 8:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-1, -3));
        return true;
    case 9:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(0, -2));
        return true;
    case 10:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(-1, -2));
        return true;
    case 11:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(0, -1));
        return true;
    case 12:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(0, 0));
        return true;
    case 13:
        rc.attack(myLoc.translate(0, 1));
        rc.move(Direction.SOUTHWEST);
        return true;
    case 14:
        rc.attack(myLoc.translate(0, 2));
        rc.move(Direction.SOUTHWEST);
        return true;
    case 15:
        rc.move(Direction.SOUTHWEST);
        rc.attack(myLoc.translate(1, -1));
        return true;
    case 16:
        rc.attack(myLoc.translate(1, 0));
        rc.move(Direction.SOUTHWEST);
        return true;
    case 17:
        rc.attack(myLoc.translate(1, 1));
        rc.move(Direction.SOUTHWEST);
        return true;
    case 18:
        rc.attack(myLoc.translate(2, 0));
        rc.move(Direction.SOUTHWEST);
        return true;
    case 19:
        rc.move(Direction.WEST);
        return true;
    case 20:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-3, 0));
        return true;
    case 21:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-2, 0));
        return true;
    case 22:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-2, -1));
        return true;
    case 23:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-1, -1));
        return true;
    case 24:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-1, 0));
        return true;
    case 25:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-2, 1));
        return true;
    case 26:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-1, 1));
        return true;
    case 27:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-1, -2));
        return true;
    case 28:
        rc.attack(myLoc.translate(0, -2));
        rc.move(Direction.WEST);
        return true;
    case 29:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(0, -1));
        return true;
    case 30:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(0, 0));
        return true;
    case 31:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(0, 1));
        return true;
    case 32:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(-1, 2));
        return true;
    case 33:
        rc.attack(myLoc.translate(0, 2));
        rc.move(Direction.WEST);
        return true;
    case 34:
        rc.attack(myLoc.translate(1, -1));
        rc.move(Direction.WEST);
        return true;
    case 35:
        rc.move(Direction.WEST);
        rc.attack(myLoc.translate(1, 0));
        return true;
    case 36:
        rc.attack(myLoc.translate(1, 1));
        rc.move(Direction.WEST);
        return true;
    case 37:
        rc.attack(myLoc.translate(2, 0));
        rc.move(Direction.WEST);
        return true;
    case 38:
        rc.move(Direction.NORTHWEST);
        return true;
    case 39:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-3, 1));
        return true;
    case 40:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-2, 0));
        return true;
    case 41:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-1, -1));
        return true;
    case 42:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-2, 1));
        return true;
    case 43:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-1, 0));
        return true;
    case 44:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-2, 2));
        return true;
    case 45:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-1, 1));
        return true;
    case 46:
        rc.attack(myLoc.translate(0, -2));
        rc.move(Direction.NORTHWEST);
        return true;
    case 47:
        rc.attack(myLoc.translate(0, -1));
        rc.move(Direction.NORTHWEST);
        return true;
    case 48:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(0, 0));
        return true;
    case 49:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-1, 2));
        return true;
    case 50:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(0, 1));
        return true;
    case 51:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(-1, 3));
        return true;
    case 52:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(0, 2));
        return true;
    case 53:
        rc.attack(myLoc.translate(1, -1));
        rc.move(Direction.NORTHWEST);
        return true;
    case 54:
        rc.attack(myLoc.translate(1, 0));
        rc.move(Direction.NORTHWEST);
        return true;
    case 55:
        rc.move(Direction.NORTHWEST);
        rc.attack(myLoc.translate(1, 1));
        return true;
    case 56:
        rc.attack(myLoc.translate(2, 0));
        rc.move(Direction.NORTHWEST);
        return true;
    case 57:
        rc.move(Direction.SOUTH);
        return true;
    case 58:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(-2, -1));
        return true;
    case 59:
        rc.attack(myLoc.translate(-2, 0));
        rc.move(Direction.SOUTH);
        return true;
    case 60:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(-1, -2));
        return true;
    case 61:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(-1, -1));
        return true;
    case 62:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(-1, 0));
        return true;
    case 63:
        rc.attack(myLoc.translate(-1, 1));
        rc.move(Direction.SOUTH);
        return true;
    case 64:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(0, -3));
        return true;
    case 65:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(0, -2));
        return true;
    case 66:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(0, -1));
        return true;
    case 67:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(0, 0));
        return true;
    case 68:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(0, 1));
        return true;
    case 69:
        rc.attack(myLoc.translate(0, 2));
        rc.move(Direction.SOUTH);
        return true;
    case 70:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(1, -2));
        return true;
    case 71:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(1, -1));
        return true;
    case 72:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(1, 0));
        return true;
    case 73:
        rc.attack(myLoc.translate(1, 1));
        rc.move(Direction.SOUTH);
        return true;
    case 74:
        rc.move(Direction.SOUTH);
        rc.attack(myLoc.translate(2, -1));
        return true;
    case 75:
        rc.attack(myLoc.translate(2, 0));
        rc.move(Direction.SOUTH);
        return true;
    case 76:
        return true;
    case 77:
        rc.attack(myLoc.translate(-2, 0));
        return true;
    case 78:
        rc.attack(myLoc.translate(-1, -1));
        return true;
    case 79:
        rc.attack(myLoc.translate(-1, 0));
        return true;
    case 80:
        rc.attack(myLoc.translate(-1, 1));
        return true;
    case 81:
        rc.attack(myLoc.translate(0, -2));
        return true;
    case 82:
        rc.attack(myLoc.translate(0, -1));
        return true;
    case 83:
        rc.attack(myLoc.translate(0, 0));
        return true;
    case 84:
        rc.attack(myLoc.translate(0, 1));
        return true;
    case 85:
        rc.attack(myLoc.translate(0, 2));
        return true;
    case 86:
        rc.attack(myLoc.translate(1, -1));
        return true;
    case 87:
        rc.attack(myLoc.translate(1, 0));
        return true;
    case 88:
        rc.attack(myLoc.translate(1, 1));
        return true;
    case 89:
        rc.attack(myLoc.translate(2, 0));
        return true;
    case 90:
        rc.move(Direction.NORTH);
        return true;
    case 91:
        rc.move(Direction.NORTH);
        rc.attack(myLoc.translate(-2, 1));
        return true;
    case 92:
        rc.attack(myLoc.translate(-2, 0));
        rc.move(Direction.NORTH);
        return true;
    case 93:
        rc.attack(myLoc.translate(-1, 0));
        rc.move(Direction.NORTH);
        return true;
    case 94:
        rc.attack(myLoc.translate(-1, -1));
        rc.move(Direction.NORTH);
        return true;
    case 95:
        rc.attack(myLoc.translate(-1, 1));
        rc.move(Direction.NORTH);
        return true;
    case 96:
        rc.move(Direction.NORTH);
        rc.attack(myLoc.translate(-1, 2));
        return true;
    case 97:
        rc.attack(myLoc.translate(0, -1));
        rc.move(Direction.NORTH);
        return true;
    case 98:
        rc.attack(myLoc.translate(0, -2));
        rc.move(Direction.NORTH);
        return true;
    case 99:
        rc.attack(myLoc.translate(0, 0));
        rc.move(Direction.NORTH);
        return true;
    case 100:
        rc.attack(myLoc.translate(0, 1));
        rc.move(Direction.NORTH);
        return true;
    case 101:
        rc.attack(myLoc.translate(0, 2));
        rc.move(Direction.NORTH);
        return true;
    case 102:
        rc.move(Direction.NORTH);
        rc.attack(myLoc.translate(0, 3));
        return true;
    case 103:
        rc.attack(myLoc.translate(1, 0));
        rc.move(Direction.NORTH);
        return true;
    case 104:
        rc.attack(myLoc.translate(1, -1));
        rc.move(Direction.NORTH);
        return true;
    case 105:
        rc.attack(myLoc.translate(1, 1));
        rc.move(Direction.NORTH);
        return true;
    case 106:
        rc.move(Direction.NORTH);
        rc.attack(myLoc.translate(1, 2));
        return true;
    case 107:
        rc.move(Direction.NORTH);
        rc.attack(myLoc.translate(2, 1));
        return true;
    case 108:
        rc.attack(myLoc.translate(2, 0));
        rc.move(Direction.NORTH);
        return true;
    case 109:
        rc.move(Direction.SOUTHEAST);
        return true;
    case 110:
        rc.attack(myLoc.translate(-1, -1));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 111:
        rc.attack(myLoc.translate(-2, 0));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 112:
        rc.attack(myLoc.translate(0, -2));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 113:
        rc.attack(myLoc.translate(0, -1));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 114:
        rc.attack(myLoc.translate(-1, 0));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 115:
        rc.attack(myLoc.translate(0, 0));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 116:
        rc.attack(myLoc.translate(-1, 1));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 117:
        rc.move(Direction.SOUTHEAST);
        rc.attack(myLoc.translate(1, -3));
        return true;
    case 118:
        rc.move(Direction.SOUTHEAST);
        rc.attack(myLoc.translate(1, -2));
        return true;
    case 119:
        rc.attack(myLoc.translate(1, -1));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 120:
        rc.attack(myLoc.translate(1, 0));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 121:
        rc.attack(myLoc.translate(0, 1));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 122:
        rc.attack(myLoc.translate(1, 1));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 123:
        rc.attack(myLoc.translate(0, 2));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 124:
        rc.move(Direction.SOUTHEAST);
        rc.attack(myLoc.translate(2, -2));
        return true;
    case 125:
        rc.move(Direction.SOUTHEAST);
        rc.attack(myLoc.translate(2, -1));
        return true;
    case 126:
        rc.attack(myLoc.translate(2, 0));
        rc.move(Direction.SOUTHEAST);
        return true;
    case 127:
        rc.move(Direction.SOUTHEAST);
        rc.attack(myLoc.translate(3, -1));
        return true;
    case 128:
        rc.move(Direction.EAST);
        return true;
    case 129:
        rc.attack(myLoc.translate(-1, 0));
        rc.move(Direction.EAST);
        return true;
    case 130:
        rc.attack(myLoc.translate(-2, 0));
        rc.move(Direction.EAST);
        return true;
    case 131:
        rc.attack(myLoc.translate(0, -1));
        rc.move(Direction.EAST);
        return true;
    case 132:
        rc.attack(myLoc.translate(-1, -1));
        rc.move(Direction.EAST);
        return true;
    case 133:
        rc.attack(myLoc.translate(0, 0));
        rc.move(Direction.EAST);
        return true;
    case 134:
        rc.attack(myLoc.translate(0, 1));
        rc.move(Direction.EAST);
        return true;
    case 135:
        rc.attack(myLoc.translate(-1, 1));
        rc.move(Direction.EAST);
        return true;
    case 136:
        rc.move(Direction.EAST);
        rc.attack(myLoc.translate(1, -2));
        return true;
    case 137:
        rc.attack(myLoc.translate(0, -2));
        rc.move(Direction.EAST);
        return true;
    case 138:
        rc.attack(myLoc.translate(1, -1));
        rc.move(Direction.EAST);
        return true;
    case 139:
        rc.attack(myLoc.translate(1, 0));
        rc.move(Direction.EAST);
        return true;
    case 140:
        rc.attack(myLoc.translate(1, 1));
        rc.move(Direction.EAST);
        return true;
    case 141:
        rc.move(Direction.EAST);
        rc.attack(myLoc.translate(1, 2));
        return true;
    case 142:
        rc.attack(myLoc.translate(0, 2));
        rc.move(Direction.EAST);
        return true;
    case 143:
        rc.move(Direction.EAST);
        rc.attack(myLoc.translate(2, -1));
        return true;
    case 144:
        rc.attack(myLoc.translate(2, 0));
        rc.move(Direction.EAST);
        return true;
    case 145:
        rc.move(Direction.EAST);
        rc.attack(myLoc.translate(2, 1));
        return true;
    case 146:
        rc.move(Direction.EAST);
        rc.attack(myLoc.translate(3, 0));
        return true;
    case 147:
        rc.move(Direction.NORTHEAST);
        return true;
    case 148:
        rc.attack(myLoc.translate(-1, 1));
        rc.move(Direction.NORTHEAST);
        return true;
    case 149:
        rc.attack(myLoc.translate(-2, 0));
        rc.move(Direction.NORTHEAST);
        return true;
    case 150:
        rc.attack(myLoc.translate(0, 0));
        rc.move(Direction.NORTHEAST);
        return true;
    case 151:
        rc.attack(myLoc.translate(-1, -1));
        rc.move(Direction.NORTHEAST);
        return true;
    case 152:
        rc.attack(myLoc.translate(0, 1));
        rc.move(Direction.NORTHEAST);
        return true;
    case 153:
        rc.attack(myLoc.translate(-1, 0));
        rc.move(Direction.NORTHEAST);
        return true;
    case 154:
        rc.attack(myLoc.translate(0, 2));
        rc.move(Direction.NORTHEAST);
        return true;
    case 155:
        rc.attack(myLoc.translate(1, -1));
        rc.move(Direction.NORTHEAST);
        return true;
    case 156:
        rc.attack(myLoc.translate(0, -2));
        rc.move(Direction.NORTHEAST);
        return true;
    case 157:
        rc.attack(myLoc.translate(1, 0));
        rc.move(Direction.NORTHEAST);
        return true;
    case 158:
        rc.attack(myLoc.translate(0, -1));
        rc.move(Direction.NORTHEAST);
        return true;
    case 159:
        rc.attack(myLoc.translate(1, 1));
        rc.move(Direction.NORTHEAST);
        return true;
    case 160:
        rc.move(Direction.NORTHEAST);
        rc.attack(myLoc.translate(1, 2));
        return true;
    case 161:
        rc.move(Direction.NORTHEAST);
        rc.attack(myLoc.translate(1, 3));
        return true;
    case 162:
        rc.attack(myLoc.translate(2, 0));
        rc.move(Direction.NORTHEAST);
        return true;
    case 163:
        rc.move(Direction.NORTHEAST);
        rc.attack(myLoc.translate(2, 1));
        return true;
    case 164:
        rc.move(Direction.NORTHEAST);
        rc.attack(myLoc.translate(2, 2));
        return true;
    case 165:
        rc.move(Direction.NORTHEAST);
        rc.attack(myLoc.translate(3, 1));
        return true;
}
return false;


    }
}
