package basic45;

import battlecode.common.*;

/**
 * Main pathfinding class. It first attempts to move with an unrolled BFS, but if it can't find anything useful or if it ever goes back to an
 * already visited tile, it switched to bugnav for a while.
 */

public class Pathfinding {

    static BugNav bugNav;
    static final int GREEDY_TURNS = 4;
    static int turnsBugNav = 0;
    static MapLocation currentTarget = null;

    static void reset(){
        turnsBugNav = 0;
        MapTracker.reset();
        bugNav.resetPathfinding();
    }

    void update(MapLocation target){
        if (currentTarget == null || target.distanceSquaredTo(currentTarget) > 0){
            reset();
        } else --turnsBugNav;
        currentTarget = target;
        MapTracker.add(MyRobot.rc.getLocation());
    }

    Pathfinding(){
        bugNav = new BugNav();
    }

    /**
     * Main movement method.
     */
    void moveTo(MapLocation target) throws GameActionException {
        RobotController rc = MyRobot.rc;
        if (target == null) return;

        if (!rc.isMovementReady()) return;
        if (rc.getLocation().distanceSquaredTo(target) == 0) return;

        update(target);

        if (!bugNav.isUsingBugnav() && turnsBugNav <= 0){
            Direction dir = VisionManager.getBestDirection(target);

            /* Only use unrolled BFS if I find something and I haven't passed through that tile yet. */
            if (dir != null && !MapTracker.check(rc.getLocation().add(dir))){
                MovementManager.move(dir);
            } else {
                turnsBugNav = GREEDY_TURNS;
                bugNav.moveTo(target);
            }
        }
        else {
            bugNav.moveTo(target);
        }
    }
}
