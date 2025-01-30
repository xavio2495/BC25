package basic45;

import battlecode.common.*;
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
            case SPLASHER -> MicroManagerSplasher.microInfos[dir.ordinal()].towersInRange > 0;
            default -> true;
        };
    }

    static void move(Direction dir) throws GameActionException {
        if (MyRobot.rc.getType() == UnitType.MOPPER && !MyRobot.rc.isActionReady()){
            MapLocation newLoc = MyRobot.rc.getLocation().add(dir);
            if (MyRobot.rc.canSenseLocation(newLoc)){
                if(MyRobot.rc.senseMapInfo(newLoc).getPaint().isEnemy()) return;
            }
        }
        if (dir == Direction.CENTER) return;
        MyRobot.rc.move(dir);
        if (MyRobot.rc.getType() == UnitType.SOLDIER){
            Map.fill();
            VisionManager.addNewFlags(dir);
        }
    }
}

