package basic7;

import battlecode.common.*;

public class MicroManager {

    static Direction[] directions = Direction.values();

    static int extraCd = 0; // in cds
    static boolean canAttack;
    static boolean canMoveNextTurn;
    static RobotController rc;

    static boolean doMicro(){
        rc = MyRobot.rc;

        int myPaint = rc.getPaint();

        int frac = (200*myPaint) / rc.getType().paintCapacity;
        extraCd = 100 - frac;
        if (extraCd < 0) extraCd = 0;

        canAttack = rc.isActionReady() && rc.getPaint() > 10;

        //anMoveNextTurn




        //if (myPaint )
        return false;


    }

}
