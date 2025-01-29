package basic44;

import battlecode.common.*;

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

    /*static int getActualDistanceRuin(MapLocation loc){
        int d = MyRobot.rc.getLocation().distanceSquaredTo(loc);
        if (d <= 8) return 2;
        MapLocation l = loc.add(loc.directionTo(MyRobot.rc.getLocation()));
        return VisionManager.computeDistance(l);
    }*/
}
