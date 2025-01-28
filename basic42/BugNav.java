package basic42;

import battlecode.common.*;

public class BugNav {

    RobotController rc;

    static int H,W;

    BugNav(){
        this.rc = MyRobot.rc;
        H = MyRobot.H; W = MyRobot.W;
        states = new int[W][];
    }

    int arrayIndex = 0;

    boolean finished(){
        return arrayIndex >= W;
    }

    void run(){
        while (arrayIndex < W && Clock.getBytecodesLeft() > 300){
            states[arrayIndex++] = new int[H];
        }
    }

    int bugPathIndex = 0;

    Boolean rotateRight = null; //if I should rotate right or left
    //Boolean rotateRightAux = null;
    MapLocation lastObstacleFound = null; //latest obstacle I've found in my way

    MapLocation lastCurrent = null;
    int minDistToTarget = Constants.INF; //minimum distance I've been to the enemy while going around an obstacle
    MapLocation minLocationToTarget = null;
    MapLocation prevTarget = null; //previous target
    Direction[] dirs = Direction.values();
    //HashSet<Integer> states = new HashSet<>();

    int[][] states;

    MapLocation myLoc;
    //boolean[] canMoveArray;
    int round;

    int turnsMovingToObstacle = 0;
    final int MAX_TURNS_MOVING_TO_OBSTACLE = 2;
    final int MIN_DIST_RESET = 3;

    boolean isUsingBugnav(){
        return lastObstacleFound != null;
    }

    void update(){
        if (!rc.isMovementReady()) return;
        myLoc = rc.getLocation();
        round = rc.getRoundNum();
    }

    void debugMovement(){
        try{
            for (Direction dir : dirs){
                MapLocation newLoc = myLoc.add(dir);
                //if (rc.canSenseLocation(newLoc) && MovementManager.canMove(dir)) rc.setIndicatorDot(newLoc, 0, 0, 255);
            }
        } catch (Throwable t){
            t.printStackTrace();
        }
    }

    void moveTo(MapLocation target){

        //No target? ==> bye!
        if (!rc.isMovementReady()) return;
        if (target == null) target = rc.getLocation();

        update();
        //if (target == null) return;


        //different target? ==> previous data does not help!
        if (prevTarget == null){
            resetPathfinding();
            rotateRight = null;
            //rotateRightAux = null;
        }


        else {
            int distTargets = target.distanceSquaredTo(prevTarget);
            if (distTargets > 0) {
                if (distTargets >= MIN_DIST_RESET){
                    rotateRight = null;
                    //rotateRightAux = null;
                    resetPathfinding();
                }
                else{
                    softReset(target);
                }
            }
        }

        //Update data
        prevTarget = target;

        checkState();
        myLoc = rc.getLocation();



        int d = myLoc.distanceSquaredTo(target);
        if (d == 0){
            return;
        }

        //If I'm at a minimum distance to the target, I'm free!
        if (d < minDistToTarget){
            resetPathfinding();
            minDistToTarget = d;
            minLocationToTarget = myLoc;
        }

        //If there's an obstacle I try to go around it [until I'm free] instead of going to the target directly
        Direction dir = myLoc.directionTo(target);
        if (lastObstacleFound == null){
            if (tryGreedyMove()){
                resetPathfinding();
                return;
            }
        }
        else{
            dir = myLoc.directionTo(lastObstacleFound);
            //rc.setIndicatorDot(lastObstacleFound, 0, 255, 0);
            //if (lastCurrent != null) rc.setIndicatorDot(lastCurrent, 255, 0, 0);
        }

        try {

            if (MovementManager.canMove(dir)){
                MovementManager.move(dir);
                if (lastObstacleFound != null) {
                    ++turnsMovingToObstacle;
                    lastObstacleFound = rc.getLocation().add(dir);
                    if (turnsMovingToObstacle >= MAX_TURNS_MOVING_TO_OBSTACLE){
                        resetPathfinding();
                    } else if (!rc.onTheMap(lastObstacleFound)){
                        resetPathfinding();
                    }
                }
                return;
            } else turnsMovingToObstacle = 0;

            checkRotate(dir);

            //I rotate clockwise or counterclockwise (depends on 'rotateRight'). If I try to go out of the map I change the orientation
            //Note that we have to try at most 16 times since we can switch orientation in the middle of the loop. (It can be done more efficiently)
            int i = 16;
            while (i-- > 0) {
                if (MovementManager.canMove(dir)) {
                    MovementManager.move(dir);
                    return;
                }
                MapLocation newLoc = myLoc.add(dir);
                if (!rc.onTheMap(newLoc)) rotateRight = !rotateRight;
                    //If I could not go in that direction and it was not outside of the map, then this is the latest obstacle found
                else lastObstacleFound = newLoc;
                if (rotateRight) dir = dir.rotateRight();
                else dir = dir.rotateLeft();
            }

            if  (MovementManager.canMove(dir)){
                MovementManager.move(dir);
                return;
            }
        } catch (Throwable t){
            t.printStackTrace();
        }
    }

    boolean tryGreedyMove(){
        try {
            //if (rotateRightAux != null) return false;
            MapLocation myLoc = rc.getLocation();
            Direction dir = myLoc.directionTo(prevTarget);
            if (MovementManager.canMove(dir)) {
                MovementManager.move(dir);
                return true;
            }
            int dist = myLoc.distanceSquaredTo(prevTarget);
            int dist1 = Constants.INF, dist2 = Constants.INF;
            Direction dir1 = dir.rotateRight();
            MapLocation newLoc = myLoc.add(dir1);
            if (MovementManager.canMove(dir1)) dist1 = newLoc.distanceSquaredTo(prevTarget);
            Direction dir2 = dir.rotateLeft();
            newLoc = myLoc.add(dir2);
            if (MovementManager.canMove(dir2)) dist2 = newLoc.distanceSquaredTo(prevTarget);
            if (dist1 < dist && dist1 < dist2) {
                //rotateRightAux = true;
                MovementManager.move(dir1);
                return true;
            }
            if (dist2 < dist && dist2 < dist1) {
                ;//rotateRightAux = false;
                MovementManager.move(dir2);
                return true;
            }
        } catch(Throwable t){
            t.printStackTrace();
        }
        return false;
    }

    //TODO: check remaining cases
    //TODO: move obstacle if can move to obstacle lol
    void checkRotate(Direction dir) throws GameActionException {
        if (rotateRight != null) return;
        Direction dirLeft = dir;
        Direction dirRight = dir;
        int i = 8;
        while (--i >= 0) {
            if (!MovementManager.canMove(dirLeft)) dirLeft = dirLeft.rotateLeft();
            else break;
        }
        i = 8;
        while (--i >= 0){
            if (!MovementManager.canMove(dirRight)) dirRight = dirRight.rotateRight();
            else break;
        }
        int distLeft = myLoc.add(dirLeft).distanceSquaredTo(prevTarget), distRight = myLoc.add(dirRight).distanceSquaredTo(prevTarget);
        if (distRight < distLeft) rotateRight = true;
        else rotateRight = false;
    }

    //clear some of the previous data
    void resetPathfinding(){
        lastObstacleFound = null;
        minDistToTarget = Constants.INF;
        ++bugPathIndex;
        turnsMovingToObstacle = 0;
    }

    void softReset(MapLocation target){
        /*if (rc.getType() == MyRobotType.AMPLIFIER){
            resetPathfinding();
            return;
        }*/
        if (minLocationToTarget != null) minDistToTarget = minLocationToTarget.distanceSquaredTo(target);
        else resetPathfinding();
    }

    void checkState(){
        if (!finished()) return;
        if (lastObstacleFound == null) return;
        int dir = myLoc.directionTo(lastObstacleFound).ordinal();
        int state = (bugPathIndex << 6);
        if (rotateRight != null) {
            if (rotateRight) state |= 1;
            else state |= 2;
        }
        state |= (dir << 2);
        if (states[myLoc.x][myLoc.y] == state){
            resetPathfinding();
        }
        states[myLoc.x][myLoc.y] = state;
    }

}
