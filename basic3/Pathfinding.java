package basic3;

import battlecode.common.MapLocation;

public class Pathfinding {

        //static RobotController rc;
        static BugNav bugNav;

        Pathfinding(){
            //Pathfinding.rc = MyRobot.rc;
            bugNav = new BugNav();
        }

        void moveTo(MapLocation target){
            bugNav.moveTo(target);
        }
}
