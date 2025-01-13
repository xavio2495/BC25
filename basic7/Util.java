package basic7;

import battlecode.common.GameConstants;

public class Util {

    static boolean towerMax(){
        return MyRobot.rc.getNumberTowers() >= GameConstants.MAX_NUMBER_OF_TOWERS;
    }

}
