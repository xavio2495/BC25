package basic7;

import battlecode.common.Direction;
import battlecode.common.GameActionException;

public class MovementManager {

    static boolean canMove(Direction dir){
        return MyRobot.rc.canMove(dir);
    }

    static void move(Direction dir) throws GameActionException {
        MyRobot.rc.move(dir);
    }

}
