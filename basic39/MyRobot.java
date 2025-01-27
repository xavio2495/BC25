package basic39;

import battlecode.common.*;

public abstract class MyRobot {

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

    static RobotController rc;
    static int H, W;
    static int creationTurn;


    //static String debugLine;

    MyRobot(RobotController rc){
        MyRobot.rc = rc;
        H = rc.getMapHeight(); W = rc.getMapWidth();
        creationTurn = rc.getRoundNum();
        VisionManager.init();
    }

    abstract void startTurn() throws GameActionException;

    abstract void endTurn() throws GameActionException;

    abstract void runTurn() throws GameActionException;

    static MapLocation getClosestEnemyPaint(){
        MapLocation ans = null;
        int bestDist = 0;
        MapInfo[] tiles = rc.senseNearbyMapInfos();
        for (MapInfo m : tiles){
            if (m.getPaint().isEnemy()) {
                int d = VisionManager.computeDistance(m.getMapLocation());
                if (d > Constants.DIST_INF) continue;
                if (ans == null || d < bestDist) {
                    ans = m.getMapLocation();
                    bestDist = d;
                }
            }
        }
        return ans;
    }

}
