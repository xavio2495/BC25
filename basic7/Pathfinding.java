package basic7;

import battlecode.common.MapLocation;

public class Pathfinding {

        //static RobotController rc;
        static BugNav bugNav;

        Pathfinding(){
            //Pathfinding.rc = MyRobot.rc;
            bugNav = new BugNav();
        }

        void moveTo(MapLocation target){
            if (target != null) MyRobot.rc.setIndicatorString("Going to " + target);
            bugNav.moveTo(target);
        }
}
