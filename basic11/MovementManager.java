package basic11;

import battlecode.common.Direction;
import battlecode.common.GameActionException;

public class MovementManager {

    static boolean canMove(Direction dir){
        if (!MyRobot.rc.canMove(dir)) return false;
        if (isDangerous(dir)) return false;
        return true;
    }

    static boolean isDangerous(Direction dir){
        return switch (MyRobot.rc.getType()) {
            case SOLDIER -> MicroManagerSoldier.microInfos[dir.ordinal()].towersInRange > 0;
            case MOPPER -> MicroManagerMopper.microInfos[dir.ordinal()].towersInRange > 0;
            case SPLASHER -> MicroManagerMopper.microInfos[dir.ordinal()].towersInRange > 0;
            default -> true;
        };
    }

    static void move(Direction dir) throws GameActionException {
        MyRobot.rc.move(dir);
    }

}
