package basic45;

import battlecode.common.*;

/**
 * Class with a bunch of generic methods.
 */
public class Util {

    static boolean towerMax(){
        return MyRobot.rc.getNumberTowers() >= GameConstants.MAX_NUMBER_OF_TOWERS;
    }

    static int getPaintLost(Direction dir){
        return switch(MyRobot.rc.getType()){
            case SOLDIER -> MicroManagerSoldier.microInfos[dir.ordinal()].paintLost();
            case MOPPER -> MicroManagerMopper.microInfos[dir.ordinal()].paintLost();
            case SPLASHER -> MicroManagerSplasher.microInfos[dir.ordinal()].paintLost();
            default -> 0;
        };
    }
}
