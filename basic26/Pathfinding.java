package basic26;

import battlecode.common.*;

public class Pathfinding {

        //static RobotController rc;
        static BugNav bugNav;
        static final int GREEDY_TURNS = 4;
        static int turnsGreedy = 0;
        static MapLocation currentTarget = null;

        static void reset(){
            turnsGreedy = 0;
            MapTracker.reset();
            bugNav.resetPathfinding();
        }

    void update(MapLocation target){
        if (currentTarget == null || target.distanceSquaredTo(currentTarget) > 0){
            reset();
        } else --turnsGreedy;
        currentTarget = target;
        MapTracker.add(MyRobot.rc.getLocation());
    }

        Pathfinding(){
            //Pathfinding.rc = MyRobot.rc;
            bugNav = new BugNav();
        }

        void moveTo(MapLocation target) throws GameActionException {
            //if (target != null) MyRobot.rc.setIndicatorString("Going to " + target);
            //if (bugNav.isUsingBugnav()) bugNav.moveTo(target);
            //Direction dir = BFS.getBestDir(target);
            RobotController rc = MyRobot.rc;

            if (target == null) return;
            if (!rc.isMovementReady()) return;
            if (rc.getLocation().distanceSquaredTo(target) == 0) return;

            update(target);

            if (!bugNav.isUsingBugnav() && turnsGreedy <= 0){

                //System.err.println("Using bfs");
                Direction dir = BFSUnit.getBestDir(target);
                if (dir != null && !MapTracker.check(rc.getLocation().add(dir))){
                    MovementManager.move(dir);
                    //return;
                } else {
                    turnsGreedy = GREEDY_TURNS;
                    bugNav.moveTo(target);
                }
            }
            else {
                bugNav.moveTo(target);
            }
        }
}
