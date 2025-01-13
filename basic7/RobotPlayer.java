package basic7;

import battlecode.common.Clock;
import battlecode.common.GameActionException;
import battlecode.common.Message;
import battlecode.common.RobotController;

public class RobotPlayer {


    @SuppressWarnings("unused")
    public static void run(RobotController rc) throws GameActionException {

        boolean msg = false;
        Message[] m = rc.readMessages(rc.getRoundNum());
        if (m.length > 0 || rc.getRoundNum() == 3) msg = true;

        MyRobot myRobot = switch (rc.getType()) {
            case MOPPER -> new Mopper(rc);
            case SOLDIER -> msg ? new SoldierResource(rc) : new SoldierTower(rc);
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
