package basic22;

import battlecode.common.Clock;
import battlecode.common.GameActionException;
import battlecode.common.RobotController;

public class RobotPlayer {

    @SuppressWarnings("unused")
    public static void run(RobotController rc) throws GameActionException {
        Math.random(); // lmao

        MyRobot myRobot = switch (rc.getType()) {
            case MOPPER -> new Mopper(rc);
            case SOLDIER -> new Soldier(rc);
            case SPLASHER -> new Splasher(rc);
            default -> new Tower(rc);
        };

        TowerManager.init();
        boolean tower = rc.getType().isTowerType();
        Comms.rc = rc;

        while (true) {
            //if (!tower && rc.getPaint() == 0) rc.disintegrate();

            Comms.run();
            myRobot.startTurn();
            myRobot.runTurn();
            myRobot.endTurn();
            //if (!tower && rc.getPaint() == 0) rc.disintegrate();
            Clock.yield();
        }
    }
}
