
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

int action22 = 0;
int action28 = 0;
int action14 = 0;
int action24 = 0;
int action31 = 0;
int action9 = 0;
int action26 = 0;
int action20 = 0;
int action33 = 0;
int action3 = 0;
int action1 = 0;
int action19 = 0;
int action5 = 0;
int action13 = 0;
int action21 = 0;
int action35 = 0;
int action34 = 0;
int action6 = 0;
int action7 = 0;
int action15 = 0;
int action17 = 0;
int action18 = 0;
int action27 = 0;
int action25 = 0;
int action30 = 0;
int action23 = 0;
int action2 = 0;
int action16 = 0;
int action29 = 0;
int action4 = 0;
int action0 = 0;
int action8 = 0;
int action11 = 0;
int action32 = 0;
int action12 = 0;
int action10 = 0;
i = rc.senseMapInfo(myLoc);
p = i.getPaint();
loc = myLoc.translate(0, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action4 += 4;
    action7 += 4;
    action9 += 4;
    action13 += 4;
    action16 += 4;
    action19 += 4;
    action24 += 4;
    action30 += 4;
    action33 += 4;
}
}
loc = myLoc.translate(0, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action4 += 4;
    action13 += 4;
    action19 += 4;
    action21 += 4;
    action29 += 4;
    action30 += 4;
    action35 += 4;
}
}
loc = myLoc.translate(1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action7 += 4;
    action9 += 4;
    action13 += 4;
    action16 += 4;
    action17 += 4;
    action23 += 4;
    action30 += 4;
}
}
loc = myLoc.translate(1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action13 += 4;
    action21 += 4;
    action23 += 4;
    action30 += 4;
    action35 += 4;
}
}
loc = myLoc.translate(2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action8 += 4;
    action16 += 4;
    action17 += 4;
    action23 += 4;
    action27 += 4;
}
}
loc = myLoc.translate(2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action0 += 4;
    action8 += 4;
    action21 += 4;
    action23 += 4;
}
}
loc = myLoc.translate(-2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action5 += 4;
    action11 += 4;
    action12 += 4;
    action15 += 4;
    action28 += 4;
}
}
loc = myLoc.translate(-3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action15 += 4;
}
}
loc = myLoc.translate(-2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action10 += 4;
    action11 += 4;
    action12 += 4;
    action15 += 4;
    action18 += 4;
    action28 += 4;
    action33 += 4;
}
}
loc = myLoc.translate(-3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action10 += 4;
    action15 += 4;
}
}
loc = myLoc.translate(-2, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action10 += 4;
    action12 += 4;
    action18 += 4;
    action19 += 4;
    action33 += 4;
}
}
loc = myLoc.translate(-3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action1 += 4;
    action10 += 4;
}
}
loc = myLoc.translate(2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action3 += 4;
    action26 += 4;
    action32 += 4;
}
}
loc = myLoc.translate(2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
}
}
loc = myLoc.translate(1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action14 += 4;
    action22 += 4;
    action26 += 4;
    action31 += 4;
    action32 += 4;
}
}
loc = myLoc.translate(1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action31 += 4;
}
}
loc = myLoc.translate(0, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action5 += 4;
    action14 += 4;
    action20 += 4;
    action22 += 4;
    action26 += 4;
    action31 += 4;
    action34 += 4;
}
}
loc = myLoc.translate(0, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action2 += 4;
    action20 += 4;
    action31 += 4;
}
}
loc = myLoc.translate(2, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
    action6 += 4;
    action8 += 4;
    action16 += 4;
    action17 += 4;
    action23 += 4;
    action27 += 4;
    action32 += 4;
}
}
loc = myLoc.translate(3, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
    action8 += 4;
    action27 += 4;
}
}
loc = myLoc.translate(2, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
    action6 += 4;
    action17 += 4;
    action26 += 4;
    action27 += 4;
    action32 += 4;
}
}
loc = myLoc.translate(3, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
    action27 += 4;
}
}
loc = myLoc.translate(3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action3 += 4;
}
}
loc = myLoc.translate(0, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
    action6 += 4;
    action7 += 4;
    action9 += 4;
    action11 += 4;
    action13 += 4;
    action16 += 4;
    action22 += 4;
    action24 += 4;
    action25 += 4;
    action33 += 4;
    action34 += 4;
}
}
loc = myLoc.translate(-1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
    action9 += 4;
    action11 += 4;
    action12 += 4;
    action18 += 4;
    action24 += 4;
    action25 += 4;
    action28 += 4;
    action33 += 4;
    action34 += 4;
}
}
loc = myLoc.translate(-1, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
    action9 += 4;
    action12 += 4;
    action18 += 4;
    action19 += 4;
    action24 += 4;
    action30 += 4;
    action33 += 4;
}
}
loc = myLoc.translate(-1, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action4 += 4;
    action18 += 4;
    action19 += 4;
    action29 += 4;
    action30 += 4;
    action35 += 4;
}
}
loc = myLoc.translate(0, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action5 += 4;
    action6 += 4;
    action7 += 4;
    action11 += 4;
    action14 += 4;
    action22 += 4;
    action24 += 4;
    action25 += 4;
    action26 += 4;
    action34 += 4;
}
}
loc = myLoc.translate(-1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action5 += 4;
    action11 += 4;
    action12 += 4;
    action14 += 4;
    action24 += 4;
    action25 += 4;
    action28 += 4;
    action34 += 4;
}
}
loc = myLoc.translate(-1, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action5 += 4;
    action14 += 4;
    action20 += 4;
    action28 += 4;
    action31 += 4;
    action34 += 4;
}
}
loc = myLoc.translate(-2, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action5 += 4;
    action15 += 4;
    action20 += 4;
    action28 += 4;
}
}
loc = myLoc.translate(1, 0);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action6 += 4;
    action7 += 4;
    action9 += 4;
    action13 += 4;
    action16 += 4;
    action17 += 4;
    action22 += 4;
    action23 += 4;
    action25 += 4;
    action32 += 4;
}
}
loc = myLoc.translate(1, -1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action6 += 4;
    action7 += 4;
    action14 += 4;
    action17 += 4;
    action22 += 4;
    action25 += 4;
    action26 += 4;
    action32 += 4;
}
}
loc = myLoc.translate(3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action8 += 4;
}
}
loc = myLoc.translate(3, 1);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action8 += 4;
    action27 += 4;
}
}
loc = myLoc.translate(-2, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action10 += 4;
    action18 += 4;
    action19 += 4;
    action29 += 4;
}
}
loc = myLoc.translate(-3, 2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action10 += 4;
}
}
loc = myLoc.translate(-3, -2);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action15 += 4;
}
}
loc = myLoc.translate(-1, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action20 += 4;
    action31 += 4;
}
}
loc = myLoc.translate(-2, -3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action20 += 4;
}
}
loc = myLoc.translate(0, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action21 += 4;
    action29 += 4;
    action35 += 4;
}
}
loc = myLoc.translate(1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action21 += 4;
    action35 += 4;
}
}
loc = myLoc.translate(2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action21 += 4;
}
}
loc = myLoc.translate(-2, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action29 += 4;
}
}
loc = myLoc.translate(-1, 3);
if(rc.canSenseLocation(loc)) {
i = rc.senseMapInfo(loc);
r = rc.senseRobotAtLocation(loc);
p = i.getPaint();
if(r != null && r.team != myTeam){
    action29 += 4;
    action35 += 4;
}
}
if(rc.canMove(Direction.SOUTHWEST)){
int best = -1; int bestScore = 0;
if(bestScore < action15) { bestScore = action15; best = 15; } // ActionMopSwing(loc=(-1, -1), dir=(-1, 0))
if(bestScore < action20) { bestScore = action20; best = 20; } // ActionMopSwing(loc=(-1, -1), dir=(0, -1))
if(bestScore < action33) { bestScore = action33; best = 33; } // ActionMopSwing(loc=(-1, -1), dir=(0, 1))
if(bestScore < action22) { bestScore = action22; best = 22; } // ActionMopSwing(loc=(-1, -1), dir=(1, 0))
var info = MicroManagerMopper.microInfos[Direction.SOUTHWEST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.WEST)){
int best = -1; int bestScore = 0;
if(bestScore < action5) { bestScore = action5; best = 5; } // ActionMopSwing(loc=(-1, 0), dir=(0, -1))
if(bestScore < action19) { bestScore = action19; best = 19; } // ActionMopSwing(loc=(-1, 0), dir=(0, 1))
if(bestScore < action7) { bestScore = action7; best = 7; } // ActionMopSwing(loc=(-1, 0), dir=(1, 0))
if(bestScore < action1) { bestScore = action1; best = 1; } // ActionMopSwing(loc=(-1, 0), dir=(-1, 0))
var info = MicroManagerMopper.microInfos[Direction.WEST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.NORTHWEST)){
int best = -1; int bestScore = 0;
if(bestScore < action11) { bestScore = action11; best = 11; } // ActionMopSwing(loc=(-1, 1), dir=(0, -1))
if(bestScore < action29) { bestScore = action29; best = 29; } // ActionMopSwing(loc=(-1, 1), dir=(0, 1))
if(bestScore < action10) { bestScore = action10; best = 10; } // ActionMopSwing(loc=(-1, 1), dir=(-1, 0))
if(bestScore < action13) { bestScore = action13; best = 13; } // ActionMopSwing(loc=(-1, 1), dir=(1, 0))
var info = MicroManagerMopper.microInfos[Direction.NORTHWEST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.SOUTH)){
int best = -1; int bestScore = 0;
if(bestScore < action28) { bestScore = action28; best = 28; } // ActionMopSwing(loc=(0, -1), dir=(-1, 0))
if(bestScore < action31) { bestScore = action31; best = 31; } // ActionMopSwing(loc=(0, -1), dir=(0, -1))
if(bestScore < action9) { bestScore = action9; best = 9; } // ActionMopSwing(loc=(0, -1), dir=(0, 1))
if(bestScore < action32) { bestScore = action32; best = 32; } // ActionMopSwing(loc=(0, -1), dir=(1, 0))
var info = MicroManagerMopper.microInfos[Direction.SOUTH.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.CENTER)){
int best = -1; int bestScore = 0;
if(bestScore < action12) { bestScore = action12; best = 12; } // ActionMopSwing(loc=(0, 0), dir=(-1, 0))
if(bestScore < action17) { bestScore = action17; best = 17; } // ActionMopSwing(loc=(0, 0), dir=(1, 0))
if(bestScore < action14) { bestScore = action14; best = 14; } // ActionMopSwing(loc=(0, 0), dir=(0, -1))
if(bestScore < action30) { bestScore = action30; best = 30; } // ActionMopSwing(loc=(0, 0), dir=(0, 1))
var info = MicroManagerMopper.microInfos[Direction.CENTER.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.NORTH)){
int best = -1; int bestScore = 0;
if(bestScore < action23) { bestScore = action23; best = 23; } // ActionMopSwing(loc=(0, 1), dir=(1, 0))
if(bestScore < action25) { bestScore = action25; best = 25; } // ActionMopSwing(loc=(0, 1), dir=(0, -1))
if(bestScore < action35) { bestScore = action35; best = 35; } // ActionMopSwing(loc=(0, 1), dir=(0, 1))
if(bestScore < action18) { bestScore = action18; best = 18; } // ActionMopSwing(loc=(0, 1), dir=(-1, 0))
var info = MicroManagerMopper.microInfos[Direction.NORTH.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.SOUTHEAST)){
int best = -1; int bestScore = 0;
if(bestScore < action3) { bestScore = action3; best = 3; } // ActionMopSwing(loc=(1, -1), dir=(1, 0))
if(bestScore < action2) { bestScore = action2; best = 2; } // ActionMopSwing(loc=(1, -1), dir=(0, -1))
if(bestScore < action16) { bestScore = action16; best = 16; } // ActionMopSwing(loc=(1, -1), dir=(0, 1))
if(bestScore < action34) { bestScore = action34; best = 34; } // ActionMopSwing(loc=(1, -1), dir=(-1, 0))
var info = MicroManagerMopper.microInfos[Direction.SOUTHEAST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.EAST)){
int best = -1; int bestScore = 0;
if(bestScore < action26) { bestScore = action26; best = 26; } // ActionMopSwing(loc=(1, 0), dir=(0, -1))
if(bestScore < action0) { bestScore = action0; best = 0; } // ActionMopSwing(loc=(1, 0), dir=(0, 1))
if(bestScore < action24) { bestScore = action24; best = 24; } // ActionMopSwing(loc=(1, 0), dir=(-1, 0))
if(bestScore < action27) { bestScore = action27; best = 27; } // ActionMopSwing(loc=(1, 0), dir=(1, 0))
var info = MicroManagerMopper.microInfos[Direction.EAST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
if(rc.canMove(Direction.NORTHEAST)){
int best = -1; int bestScore = 0;
if(bestScore < action6) { bestScore = action6; best = 6; } // ActionMopSwing(loc=(1, 1), dir=(0, -1))
if(bestScore < action21) { bestScore = action21; best = 21; } // ActionMopSwing(loc=(1, 1), dir=(0, 1))
if(bestScore < action4) { bestScore = action4; best = 4; } // ActionMopSwing(loc=(1, 1), dir=(-1, 0))
if(bestScore < action8) { bestScore = action8; best = 8; } // ActionMopSwing(loc=(1, 1), dir=(1, 0))
var info = MicroManagerMopper.microInfos[Direction.NORTHEAST.ordinal()];
info.atkValue=bestScore;
id2info(best, info);
}
}
static void id2info(int id, MicroManagerMopper.MicroInfo info) {
MapLocation myLoc = rc.getLocation();
switch(id) {
    case 0: info.atkDirection = Direction.NORTH; break;
    case 1: info.atkDirection = Direction.WEST; break;
    case 2: info.atkDirection = Direction.SOUTH; break;
    case 3: info.atkDirection = Direction.EAST; break;
    case 4: info.atkDirection = Direction.WEST; break;
    case 5: info.atkDirection = Direction.SOUTH; break;
    case 6: info.atkDirection = Direction.SOUTH; break;
    case 7: info.atkDirection = Direction.EAST; break;
    case 8: info.atkDirection = Direction.EAST; break;
    case 9: info.atkDirection = Direction.NORTH; break;
    case 10: info.atkDirection = Direction.WEST; break;
    case 11: info.atkDirection = Direction.SOUTH; break;
    case 12: info.atkDirection = Direction.WEST; break;
    case 13: info.atkDirection = Direction.EAST; break;
    case 14: info.atkDirection = Direction.SOUTH; break;
    case 15: info.atkDirection = Direction.WEST; break;
    case 16: info.atkDirection = Direction.NORTH; break;
    case 17: info.atkDirection = Direction.EAST; break;
    case 18: info.atkDirection = Direction.WEST; break;
    case 19: info.atkDirection = Direction.NORTH; break;
    case 20: info.atkDirection = Direction.SOUTH; break;
    case 21: info.atkDirection = Direction.NORTH; break;
    case 22: info.atkDirection = Direction.EAST; break;
    case 23: info.atkDirection = Direction.EAST; break;
    case 24: info.atkDirection = Direction.WEST; break;
    case 25: info.atkDirection = Direction.SOUTH; break;
    case 26: info.atkDirection = Direction.SOUTH; break;
    case 27: info.atkDirection = Direction.EAST; break;
    case 28: info.atkDirection = Direction.WEST; break;
    case 29: info.atkDirection = Direction.NORTH; break;
    case 30: info.atkDirection = Direction.NORTH; break;
    case 31: info.atkDirection = Direction.SOUTH; break;
    case 32: info.atkDirection = Direction.EAST; break;
    case 33: info.atkDirection = Direction.NORTH; break;
    case 34: info.atkDirection = Direction.WEST; break;
    case 35: info.atkDirection = Direction.NORTH; break;
}
}
}
