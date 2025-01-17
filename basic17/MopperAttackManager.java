
package basic17;

import battlecode.common.*;

public class MopperAttackManager {
    static RobotController rc;
    public static void calc() throws GameActionException {
        rc = MyRobot.rc;


MapLocation myLoc = rc.getLocation();
MapLocation loc;
MapInfo i;
RobotInfo r;
PaintType p;
Team myTeam = rc.getTeam();

int action53 = 0;
int action0 = 0;
int action47 = 0;
int action37 = 0;
int action59 = 0;
int action55 = 0;
int action60 = 0;
int action14 = 0;
int action18 = 0;
int action27 = 0;
int action34 = 0;
int action2 = 0;
int action15 = 0;
int action31 = 0;
int action19 = 0;
int action32 = 0;
int action33 = 0;
int action28 = 0;
int action22 = 0;
int action35 = 0;
int action17 = 0;
int action44 = 0;
int action3 = 0;
int action52 = 0;
int action54 = 0;
int action51 = 0;
int action10 = 0;
int action7 = 0;
int action23 = 0;
int action21 = 0;
int action24 = 0;
int action38 = 0;
int action40 = 0;
int action43 = 0;
int action4 = 0;
int action6 = 0;
int action57 = 0;
int action12 = 0;
int action30 = 0;
int action39 = 0;
int action1 = 0;
int action58 = 0;
int action9 = 0;
int action13 = 0;
int action46 = 0;
int action11 = 0;
int action5 = 0;
int action29 = 0;
int action41 = 0;
int action26 = 0;
int action25 = 0;
int action56 = 0;
int action36 = 0;
int action50 = 0;
int action49 = 0;
int action20 = 0;
int action42 = 0;
int action16 = 0;
int action48 = 0;
int action45 = 0;
int action8 = 0;
i = rc.senseMapInfo(myLoc);
p = i.getPaint();
loc = myLoc.translate(0, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action3 += 4;
    action8 += 4;
    action13 += 4;
    action26 += 4;
    action34 += 4;
    action36 += 4;
    action45 += 4;
    action56 += 4;
}
if(p.isEnemy()){
    action13 += 4;
}
}
loc = myLoc.translate(-1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action8 += 4;
    action26 += 4;
    action34 += 4;
    action47 += 4;
    action52 += 4;
    action56 += 4;
}
if(p.isEnemy()){
    action52 += 4;
}
}
loc = myLoc.translate(0, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action8 += 4;
    action9 += 4;
    action10 += 4;
    action12 += 4;
    action22 += 4;
    action26 += 4;
    action36 += 4;
    action40 += 4;
    action42 += 4;
    action45 += 4;
}
if(p.isEnemy()){
    action12 += 4;
}
}
loc = myLoc.translate(-1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action8 += 4;
    action22 += 4;
    action23 += 4;
    action26 += 4;
    action40 += 4;
    action42 += 4;
    action47 += 4;
    action54 += 4;
}
if(p.isEnemy()){
    action54 += 4;
}
}
loc = myLoc.translate(0, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action7 += 4;
    action9 += 4;
    action10 += 4;
    action17 += 4;
    action22 += 4;
    action24 += 4;
    action25 += 4;
    action29 += 4;
    action36 += 4;
    action40 += 4;
    action42 += 4;
    action57 += 4;
}
if(p.isEnemy()){
    action24 += 4;
}
}
loc = myLoc.translate(-1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action6 += 4;
    action7 += 4;
    action17 += 4;
    action22 += 4;
    action23 += 4;
    action32 += 4;
    action40 += 4;
    action42 += 4;
    action47 += 4;
    action57 += 4;
}
if(p.isEnemy()){
    action6 += 4;
}
}
loc = myLoc.translate(0, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action7 += 4;
    action10 += 4;
    action17 += 4;
    action25 += 4;
    action29 += 4;
    action33 += 4;
    action38 += 4;
    action42 += 4;
    action50 += 4;
    action57 += 4;
}
if(p.isEnemy()){
    action38 += 4;
}
}
loc = myLoc.translate(0, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action7 += 4;
    action25 += 4;
    action33 += 4;
    action35 += 4;
    action48 += 4;
    action50 += 4;
    action59 += 4;
    action60 += 4;
}
if(p.isEnemy()){
    action60 += 4;
}
}
loc = myLoc.translate(1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action10 += 4;
    action17 += 4;
    action20 += 4;
    action25 += 4;
    action29 += 4;
    action30 += 4;
    action37 += 4;
    action50 += 4;
}
if(p.isEnemy()){
    action20 += 4;
}
}
loc = myLoc.translate(1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action25 += 4;
    action28 += 4;
    action35 += 4;
    action37 += 4;
    action50 += 4;
    action59 += 4;
}
if(p.isEnemy()){
    action28 += 4;
}
}
loc = myLoc.translate(2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action11 += 4;
    action18 += 4;
    action29 += 4;
    action30 += 4;
    action37 += 4;
    action46 += 4;
}
if(p.isEnemy()){
    action18 += 4;
}
}
loc = myLoc.translate(2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action11 += 4;
    action21 += 4;
    action35 += 4;
    action37 += 4;
}
if(p.isEnemy()){
    action21 += 4;
}
}
loc = myLoc.translate(-2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action8 += 4;
    action22 += 4;
    action23 += 4;
    action27 += 4;
    action47 += 4;
    action53 += 4;
}
if(p.isEnemy()){
    action53 += 4;
}
}
loc = myLoc.translate(-3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action27 += 4;
}
}
loc = myLoc.translate(-2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action5 += 4;
    action19 += 4;
    action22 += 4;
    action23 += 4;
    action27 += 4;
    action32 += 4;
    action47 += 4;
    action57 += 4;
}
if(p.isEnemy()){
    action5 += 4;
}
}
loc = myLoc.translate(-3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action19 += 4;
    action27 += 4;
}
}
loc = myLoc.translate(-2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action15 += 4;
    action19 += 4;
    action23 += 4;
    action32 += 4;
    action33 += 4;
    action57 += 4;
}
if(p.isEnemy()){
    action15 += 4;
}
}
loc = myLoc.translate(-3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action19 += 4;
}
}
loc = myLoc.translate(2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
    action4 += 4;
    action39 += 4;
    action45 += 4;
    action55 += 4;
}
if(p.isEnemy()){
    action39 += 4;
}
}
loc = myLoc.translate(2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
}
}
loc = myLoc.translate(1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
    action26 += 4;
    action36 += 4;
    action45 += 4;
    action55 += 4;
    action56 += 4;
    action58 += 4;
}
if(p.isEnemy()){
    action58 += 4;
}
}
loc = myLoc.translate(1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
    action56 += 4;
}
}
loc = myLoc.translate(0, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
    action34 += 4;
    action56 += 4;
}
}
loc = myLoc.translate(2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
    action9 += 4;
    action11 += 4;
    action29 += 4;
    action30 += 4;
    action37 += 4;
    action46 += 4;
    action49 += 4;
    action55 += 4;
}
if(p.isEnemy()){
    action49 += 4;
}
}
loc = myLoc.translate(3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
    action11 += 4;
    action46 += 4;
}
}
loc = myLoc.translate(2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
    action9 += 4;
    action30 += 4;
    action41 += 4;
    action45 += 4;
    action46 += 4;
    action55 += 4;
}
if(p.isEnemy()){
    action41 += 4;
}
}
loc = myLoc.translate(3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
    action46 += 4;
}
}
loc = myLoc.translate(3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
}
}
loc = myLoc.translate(-1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action7 += 4;
    action14 += 4;
    action17 += 4;
    action23 += 4;
    action32 += 4;
    action33 += 4;
    action42 += 4;
    action50 += 4;
    action57 += 4;
}
if(p.isEnemy()){
    action14 += 4;
}
}
loc = myLoc.translate(-1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action7 += 4;
    action32 += 4;
    action33 += 4;
    action44 += 4;
    action48 += 4;
    action50 += 4;
    action59 += 4;
}
if(p.isEnemy()){
    action44 += 4;
}
}
loc = myLoc.translate(-2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action8 += 4;
    action27 += 4;
    action34 += 4;
    action47 += 4;
    action51 += 4;
}
if(p.isEnemy()){
    action51 += 4;
}
}
loc = myLoc.translate(1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action9 += 4;
    action10 += 4;
    action16 += 4;
    action17 += 4;
    action25 += 4;
    action29 += 4;
    action30 += 4;
    action36 += 4;
    action37 += 4;
    action40 += 4;
    action55 += 4;
}
if(p.isEnemy()){
    action16 += 4;
}
}
loc = myLoc.translate(1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action9 += 4;
    action10 += 4;
    action26 += 4;
    action30 += 4;
    action31 += 4;
    action36 += 4;
    action40 += 4;
    action45 += 4;
    action55 += 4;
}
if(p.isEnemy()){
    action31 += 4;
}
}
loc = myLoc.translate(3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action11 += 4;
}
}
loc = myLoc.translate(3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action11 += 4;
    action46 += 4;
}
}
loc = myLoc.translate(-2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action19 += 4;
    action32 += 4;
    action33 += 4;
    action43 += 4;
    action48 += 4;
}
if(p.isEnemy()){
    action43 += 4;
}
}
loc = myLoc.translate(-3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action19 += 4;
}
}
loc = myLoc.translate(-3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action27 += 4;
}
}
loc = myLoc.translate(-1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action34 += 4;
    action56 += 4;
}
}
loc = myLoc.translate(-2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action34 += 4;
}
}
loc = myLoc.translate(0, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action35 += 4;
    action48 += 4;
    action59 += 4;
}
}
loc = myLoc.translate(1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action35 += 4;
    action59 += 4;
}
}
loc = myLoc.translate(2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action35 += 4;
}
}
loc = myLoc.translate(-2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action48 += 4;
}
}
loc = myLoc.translate(-1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action48 += 4;
    action59 += 4;
}
}
if(rc.canMove(Direction.SOUTHWEST)){
int best = -1; int bestScore = 0;
if(bestScore < action12) { bestScore = action12; best = 12; } // ActionAttack(loc=(0, -1))
if(bestScore < action34) { bestScore = action34; best = 34; } // ActionMopSwing(loc=(-1, -1), dir=(0, -1))
if(bestScore < action36) { bestScore = action36; best = 36; } // ActionMopSwing(loc=(-1, -1), dir=(1, 0))
if(bestScore < action51) { bestScore = action51; best = 51; } // ActionAttack(loc=(-2, -2))
if(bestScore < action52) { bestScore = action52; best = 52; } // ActionAttack(loc=(-1, -2))
if(bestScore < action53) { bestScore = action53; best = 53; } // ActionAttack(loc=(-2, -1))
if(bestScore < action5) { bestScore = action5; best = 5; } // ActionAttack(loc=(-2, 0))
if(bestScore < action54) { bestScore = action54; best = 54; } // ActionAttack(loc=(-1, -1))
if(bestScore < action6) { bestScore = action6; best = 6; } // ActionAttack(loc=(-1, 0))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action57) { bestScore = action57; best = 57; } // ActionMopSwing(loc=(-1, -1), dir=(0, 1))
if(bestScore < action27) { bestScore = action27; best = 27; } // ActionMopSwing(loc=(-1, -1), dir=(-1, 0))
if(bestScore < action13) { bestScore = action13; best = 13; } // ActionAttack(loc=(0, -2))
var info = MicroManagerMopper.microInfos[Direction.SOUTHWEST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.WEST)){
int best = -1; int bestScore = 0;
if(bestScore < action33) { bestScore = action33; best = 33; } // ActionMopSwing(loc=(-1, 0), dir=(0, 1))
if(bestScore < action2) { bestScore = action2; best = 2; } // ActionMopSwing(loc=(-1, 0), dir=(-1, 0))
if(bestScore < action53) { bestScore = action53; best = 53; } // ActionAttack(loc=(-2, -1))
if(bestScore < action54) { bestScore = action54; best = 54; } // ActionAttack(loc=(-1, -1))
if(bestScore < action38) { bestScore = action38; best = 38; } // ActionAttack(loc=(0, 1))
if(bestScore < action5) { bestScore = action5; best = 5; } // ActionAttack(loc=(-2, 0))
if(bestScore < action6) { bestScore = action6; best = 6; } // ActionAttack(loc=(-1, 0))
if(bestScore < action8) { bestScore = action8; best = 8; } // ActionMopSwing(loc=(-1, 0), dir=(0, -1))
if(bestScore < action14) { bestScore = action14; best = 14; } // ActionAttack(loc=(-1, 1))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action10) { bestScore = action10; best = 10; } // ActionMopSwing(loc=(-1, 0), dir=(1, 0))
if(bestScore < action12) { bestScore = action12; best = 12; } // ActionAttack(loc=(0, -1))
if(bestScore < action15) { bestScore = action15; best = 15; } // ActionAttack(loc=(-2, 1))
var info = MicroManagerMopper.microInfos[Direction.WEST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.NORTHWEST)){
int best = -1; int bestScore = 0;
if(bestScore < action48) { bestScore = action48; best = 48; } // ActionMopSwing(loc=(-1, 1), dir=(0, 1))
if(bestScore < action19) { bestScore = action19; best = 19; } // ActionMopSwing(loc=(-1, 1), dir=(-1, 0))
if(bestScore < action38) { bestScore = action38; best = 38; } // ActionAttack(loc=(0, 1))
if(bestScore < action5) { bestScore = action5; best = 5; } // ActionAttack(loc=(-2, 0))
if(bestScore < action6) { bestScore = action6; best = 6; } // ActionAttack(loc=(-1, 0))
if(bestScore < action43) { bestScore = action43; best = 43; } // ActionAttack(loc=(-2, 2))
if(bestScore < action44) { bestScore = action44; best = 44; } // ActionAttack(loc=(-1, 2))
if(bestScore < action22) { bestScore = action22; best = 22; } // ActionMopSwing(loc=(-1, 1), dir=(0, -1))
if(bestScore < action14) { bestScore = action14; best = 14; } // ActionAttack(loc=(-1, 1))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action25) { bestScore = action25; best = 25; } // ActionMopSwing(loc=(-1, 1), dir=(1, 0))
if(bestScore < action15) { bestScore = action15; best = 15; } // ActionAttack(loc=(-2, 1))
if(bestScore < action60) { bestScore = action60; best = 60; } // ActionAttack(loc=(0, 2))
var info = MicroManagerMopper.microInfos[Direction.NORTHWEST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.SOUTH)){
int best = -1; int bestScore = 0;
if(bestScore < action12) { bestScore = action12; best = 12; } // ActionAttack(loc=(0, -1))
if(bestScore < action52) { bestScore = action52; best = 52; } // ActionAttack(loc=(-1, -2))
if(bestScore < action54) { bestScore = action54; best = 54; } // ActionAttack(loc=(-1, -1))
if(bestScore < action56) { bestScore = action56; best = 56; } // ActionMopSwing(loc=(0, -1), dir=(0, -1))
if(bestScore < action6) { bestScore = action6; best = 6; } // ActionAttack(loc=(-1, 0))
if(bestScore < action55) { bestScore = action55; best = 55; } // ActionMopSwing(loc=(0, -1), dir=(1, 0))
if(bestScore < action47) { bestScore = action47; best = 47; } // ActionMopSwing(loc=(0, -1), dir=(-1, 0))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action13) { bestScore = action13; best = 13; } // ActionAttack(loc=(0, -2))
if(bestScore < action58) { bestScore = action58; best = 58; } // ActionAttack(loc=(1, -2))
if(bestScore < action17) { bestScore = action17; best = 17; } // ActionMopSwing(loc=(0, -1), dir=(0, 1))
if(bestScore < action16) { bestScore = action16; best = 16; } // ActionAttack(loc=(1, 0))
if(bestScore < action31) { bestScore = action31; best = 31; } // ActionAttack(loc=(1, -1))
var info = MicroManagerMopper.microInfos[Direction.SOUTH.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.CENTER)){
int best = -1; int bestScore = 0;
if(bestScore < action50) { bestScore = action50; best = 50; } // ActionMopSwing(loc=(0, 0), dir=(0, 1))
if(bestScore < action30) { bestScore = action30; best = 30; } // ActionMopSwing(loc=(0, 0), dir=(1, 0))
if(bestScore < action54) { bestScore = action54; best = 54; } // ActionAttack(loc=(-1, -1))
if(bestScore < action38) { bestScore = action38; best = 38; } // ActionAttack(loc=(0, 1))
if(bestScore < action20) { bestScore = action20; best = 20; } // ActionAttack(loc=(1, 1))
if(bestScore < action6) { bestScore = action6; best = 6; } // ActionAttack(loc=(-1, 0))
if(bestScore < action23) { bestScore = action23; best = 23; } // ActionMopSwing(loc=(0, 0), dir=(-1, 0))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action26) { bestScore = action26; best = 26; } // ActionMopSwing(loc=(0, 0), dir=(0, -1))
if(bestScore < action12) { bestScore = action12; best = 12; } // ActionAttack(loc=(0, -1))
if(bestScore < action31) { bestScore = action31; best = 31; } // ActionAttack(loc=(1, -1))
if(bestScore < action14) { bestScore = action14; best = 14; } // ActionAttack(loc=(-1, 1))
if(bestScore < action16) { bestScore = action16; best = 16; } // ActionAttack(loc=(1, 0))
var info = MicroManagerMopper.microInfos[Direction.CENTER.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.NORTH)){
int best = -1; int bestScore = 0;
if(bestScore < action37) { bestScore = action37; best = 37; } // ActionMopSwing(loc=(0, 1), dir=(1, 0))
if(bestScore < action38) { bestScore = action38; best = 38; } // ActionAttack(loc=(0, 1))
if(bestScore < action20) { bestScore = action20; best = 20; } // ActionAttack(loc=(1, 1))
if(bestScore < action40) { bestScore = action40; best = 40; } // ActionMopSwing(loc=(0, 1), dir=(0, -1))
if(bestScore < action6) { bestScore = action6; best = 6; } // ActionAttack(loc=(-1, 0))
if(bestScore < action44) { bestScore = action44; best = 44; } // ActionAttack(loc=(-1, 2))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action28) { bestScore = action28; best = 28; } // ActionAttack(loc=(1, 2))
if(bestScore < action14) { bestScore = action14; best = 14; } // ActionAttack(loc=(-1, 1))
if(bestScore < action59) { bestScore = action59; best = 59; } // ActionMopSwing(loc=(0, 1), dir=(0, 1))
if(bestScore < action16) { bestScore = action16; best = 16; } // ActionAttack(loc=(1, 0))
if(bestScore < action60) { bestScore = action60; best = 60; } // ActionAttack(loc=(0, 2))
if(bestScore < action32) { bestScore = action32; best = 32; } // ActionMopSwing(loc=(0, 1), dir=(-1, 0))
var info = MicroManagerMopper.microInfos[Direction.NORTH.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.SOUTHEAST)){
int best = -1; int bestScore = 0;
if(bestScore < action12) { bestScore = action12; best = 12; } // ActionAttack(loc=(0, -1))
if(bestScore < action0) { bestScore = action0; best = 0; } // ActionMopSwing(loc=(1, -1), dir=(-1, 0))
if(bestScore < action49) { bestScore = action49; best = 49; } // ActionAttack(loc=(2, 0))
if(bestScore < action3) { bestScore = action3; best = 3; } // ActionMopSwing(loc=(1, -1), dir=(0, -1))
if(bestScore < action39) { bestScore = action39; best = 39; } // ActionAttack(loc=(2, -2))
if(bestScore < action41) { bestScore = action41; best = 41; } // ActionAttack(loc=(2, -1))
if(bestScore < action4) { bestScore = action4; best = 4; } // ActionMopSwing(loc=(1, -1), dir=(1, 0))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action29) { bestScore = action29; best = 29; } // ActionMopSwing(loc=(1, -1), dir=(0, 1))
if(bestScore < action13) { bestScore = action13; best = 13; } // ActionAttack(loc=(0, -2))
if(bestScore < action31) { bestScore = action31; best = 31; } // ActionAttack(loc=(1, -1))
if(bestScore < action16) { bestScore = action16; best = 16; } // ActionAttack(loc=(1, 0))
if(bestScore < action58) { bestScore = action58; best = 58; } // ActionAttack(loc=(1, -2))
var info = MicroManagerMopper.microInfos[Direction.SOUTHEAST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.EAST)){
int best = -1; int bestScore = 0;
if(bestScore < action49) { bestScore = action49; best = 49; } // ActionAttack(loc=(2, 0))
if(bestScore < action1) { bestScore = action1; best = 1; } // ActionMopSwing(loc=(1, 0), dir=(0, 1))
if(bestScore < action41) { bestScore = action41; best = 41; } // ActionAttack(loc=(2, -1))
if(bestScore < action42) { bestScore = action42; best = 42; } // ActionMopSwing(loc=(1, 0), dir=(-1, 0))
if(bestScore < action38) { bestScore = action38; best = 38; } // ActionAttack(loc=(0, 1))
if(bestScore < action20) { bestScore = action20; best = 20; } // ActionAttack(loc=(1, 1))
if(bestScore < action45) { bestScore = action45; best = 45; } // ActionMopSwing(loc=(1, 0), dir=(0, -1))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action46) { bestScore = action46; best = 46; } // ActionMopSwing(loc=(1, 0), dir=(1, 0))
if(bestScore < action12) { bestScore = action12; best = 12; } // ActionAttack(loc=(0, -1))
if(bestScore < action31) { bestScore = action31; best = 31; } // ActionAttack(loc=(1, -1))
if(bestScore < action16) { bestScore = action16; best = 16; } // ActionAttack(loc=(1, 0))
if(bestScore < action18) { bestScore = action18; best = 18; } // ActionAttack(loc=(2, 1))
var info = MicroManagerMopper.microInfos[Direction.EAST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.NORTHEAST)){
int best = -1; int bestScore = 0;
if(bestScore < action49) { bestScore = action49; best = 49; } // ActionAttack(loc=(2, 0))
if(bestScore < action35) { bestScore = action35; best = 35; } // ActionMopSwing(loc=(1, 1), dir=(0, 1))
if(bestScore < action38) { bestScore = action38; best = 38; } // ActionAttack(loc=(0, 1))
if(bestScore < action20) { bestScore = action20; best = 20; } // ActionAttack(loc=(1, 1))
if(bestScore < action21) { bestScore = action21; best = 21; } // ActionAttack(loc=(2, 2))
if(bestScore < action7) { bestScore = action7; best = 7; } // ActionMopSwing(loc=(1, 1), dir=(-1, 0))
if(bestScore < action9) { bestScore = action9; best = 9; } // ActionMopSwing(loc=(1, 1), dir=(0, -1))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionAttack(loc=(0, 0))
if(bestScore < action11) { bestScore = action11; best = 11; } // ActionMopSwing(loc=(1, 1), dir=(1, 0))
if(bestScore < action28) { bestScore = action28; best = 28; } // ActionAttack(loc=(1, 2))
if(bestScore < action16) { bestScore = action16; best = 16; } // ActionAttack(loc=(1, 0))
if(bestScore < action60) { bestScore = action60; best = 60; } // ActionAttack(loc=(0, 2))
if(bestScore < action18) { bestScore = action18; best = 18; } // ActionAttack(loc=(2, 1))
var info = MicroManagerMopper.microInfos[Direction.NORTHEAST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
}
static void id2info(int id, MicroManagerMopper.MicroInfo info) {
MapLocation myLoc = rc.getLocation();
switch(id) {
    case 0: info.atkDirection = Direction.WEST; break;
    case 1: info.atkDirection = Direction.NORTH; break;
    case 2: info.atkDirection = Direction.WEST; break;
    case 3: info.atkDirection = Direction.SOUTH; break;
    case 4: info.atkDirection = Direction.EAST; break;
    case 5: info.atkLoc = myLoc.translate(-2,0); break;
    case 6: info.atkLoc = myLoc.translate(-1,0); break;
    case 7: info.atkDirection = Direction.WEST; break;
    case 8: info.atkDirection = Direction.SOUTH; break;
    case 9: info.atkDirection = Direction.SOUTH; break;
    case 10: info.atkDirection = Direction.EAST; break;
    case 11: info.atkDirection = Direction.EAST; break;
    case 12: info.atkLoc = myLoc.translate(0,-1); break;
    case 13: info.atkLoc = myLoc.translate(0,-2); break;
    case 14: info.atkLoc = myLoc.translate(-1,1); break;
    case 15: info.atkLoc = myLoc.translate(-2,1); break;
    case 16: info.atkLoc = myLoc.translate(1,0); break;
    case 17: info.atkDirection = Direction.NORTH; break;
    case 18: info.atkLoc = myLoc.translate(2,1); break;
    case 19: info.atkDirection = Direction.WEST; break;
    case 20: info.atkLoc = myLoc.translate(1,1); break;
    case 21: info.atkLoc = myLoc.translate(2,2); break;
    case 22: info.atkDirection = Direction.SOUTH; break;
    case 23: info.atkDirection = Direction.WEST; break;
    case 24: info.atkLoc = myLoc.translate(0,0); break;
    case 25: info.atkDirection = Direction.EAST; break;
    case 26: info.atkDirection = Direction.SOUTH; break;
    case 27: info.atkDirection = Direction.WEST; break;
    case 28: info.atkLoc = myLoc.translate(1,2); break;
    case 29: info.atkDirection = Direction.NORTH; break;
    case 30: info.atkDirection = Direction.EAST; break;
    case 31: info.atkLoc = myLoc.translate(1,-1); break;
    case 32: info.atkDirection = Direction.WEST; break;
    case 33: info.atkDirection = Direction.NORTH; break;
    case 34: info.atkDirection = Direction.SOUTH; break;
    case 35: info.atkDirection = Direction.NORTH; break;
    case 36: info.atkDirection = Direction.EAST; break;
    case 37: info.atkDirection = Direction.EAST; break;
    case 38: info.atkLoc = myLoc.translate(0,1); break;
    case 39: info.atkLoc = myLoc.translate(2,-2); break;
    case 40: info.atkDirection = Direction.SOUTH; break;
    case 41: info.atkLoc = myLoc.translate(2,-1); break;
    case 42: info.atkDirection = Direction.WEST; break;
    case 43: info.atkLoc = myLoc.translate(-2,2); break;
    case 44: info.atkLoc = myLoc.translate(-1,2); break;
    case 45: info.atkDirection = Direction.SOUTH; break;
    case 46: info.atkDirection = Direction.EAST; break;
    case 47: info.atkDirection = Direction.WEST; break;
    case 48: info.atkDirection = Direction.NORTH; break;
    case 49: info.atkLoc = myLoc.translate(2,0); break;
    case 50: info.atkDirection = Direction.NORTH; break;
    case 51: info.atkLoc = myLoc.translate(-2,-2); break;
    case 52: info.atkLoc = myLoc.translate(-1,-2); break;
    case 53: info.atkLoc = myLoc.translate(-2,-1); break;
    case 54: info.atkLoc = myLoc.translate(-1,-1); break;
    case 55: info.atkDirection = Direction.EAST; break;
    case 56: info.atkDirection = Direction.SOUTH; break;
    case 57: info.atkDirection = Direction.NORTH; break;
    case 58: info.atkLoc = myLoc.translate(1,-2); break;
    case 59: info.atkDirection = Direction.NORTH; break;
    case 60: info.atkLoc = myLoc.translate(0,2); break;
}
}
}
