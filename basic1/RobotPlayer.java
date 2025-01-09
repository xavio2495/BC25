package basic1;

import battlecode.common.*;

import java.util.Random;
public class RobotPlayer {


    @SuppressWarnings("unused")
    public static void run(RobotController rc) throws GameActionException {

        MyRobot myRobot = switch (rc.getType()) {
            case MOPPER -> new Mopper(rc);
            case SOLDIER -> new Soldier(rc);
            case SPLASHER -> new Splasher(rc);
            default -> new Tower(rc);
        };

        while (true) {
            myRobot.startTurn();
            myRobot.runTurn();
            myRobot.endTurn();
            Clock.yield();
        }
    }
}
