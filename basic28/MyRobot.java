package basic28;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.RobotController;

public abstract class MyRobot {

    static final Direction[] directions = {
            Direction.NORTH,
            Direction.NORTHEAST,
            Direction.EAST,
            Direction.SOUTHEAST,
            Direction.SOUTH,
            Direction.SOUTHWEST,
            Direction.WEST,
            Direction.NORTHWEST,
    };

    static RobotController rc;
    static int H, W;
    static int creationTurn;


    //static String debugLine;

    MyRobot(RobotController rc){
        MyRobot.rc = rc;
        H = rc.getMapHeight(); W = rc.getMapWidth();
        creationTurn = rc.getRoundNum();
    }

    abstract void startTurn() throws GameActionException;

    abstract void endTurn() throws GameActionException;

    abstract void runTurn() throws GameActionException;

}
