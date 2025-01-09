package basic1;

import battlecode.common.GameActionException;
import battlecode.common.RobotController;

public abstract class MyRobot {

    static RobotController rc;
    static int H, W;

    MyRobot(RobotController rc){
        MyRobot.rc = rc;
        H = rc.getMapHeight(); W = rc.getMapWidth();
    }

    abstract void startTurn() throws GameActionException;

    abstract void endTurn() throws GameActionException;

    abstract void runTurn() throws GameActionException;

}
