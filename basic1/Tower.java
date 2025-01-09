package basic1;

import battlecode.common.*;

public class Tower extends MyRobot {

    static final Direction[] directions = {
            Direction.NORTH,
            Direction.NORTHEAST,
            Direction.EAST,
            Direction.SOUTHEAST,
            Direction.SOUTH,
            Direction.SOUTHWEST,
            Direction.WEST,
            Direction.NORTHWEST,
    };

    Tower(RobotController rc){
        super(rc);
    }

    void startTurn(){

    }

    void runTurn(){
        spawn(UnitType.SOLDIER, null);
    }

    void endTurn(){

    }

    void spawn(UnitType type, MapLocation target){
        MapLocation bestLoc = null;
        int bestDist = -1;
        Direction dir = directions[(int)(Math.random() * 8.0)];
        for (int i = 0; i < 8; ++i){
            MapLocation loc = rc.adjacentLocation(dir);
            if (!rc.canBuildRobot(type, rc.adjacentLocation(dir))) continue;
            if (target == null){
                bestLoc = loc;
            } else {
                int d = loc.distanceSquaredTo(target);
                if (bestDist < 0 || d < bestDist) {
                    bestDist = d;
                    bestLoc = loc;
                }
            }
            dir = dir.rotateLeft();
        }
        try {
            if (bestLoc != null){
                rc.buildRobot(type, bestLoc);
            }
        } catch (GameActionException e){
            e.printStackTrace();
        }
    }
}