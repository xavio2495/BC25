package basic1;

import battlecode.common.*;

public class Explore {

    RobotController rc;
    MapLocation explore3Target;
    Direction exploreDir = null; //TODO
    double angle = 0;
    double exploreDist = 100;

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

    Explore() throws GameActionException {
        this.rc = MyRobot.rc;
        getExploreDir();
    }

    void getExploreDir() throws GameActionException {
        RobotInfo closestTower = null;
        MapLocation myLoc = rc.getLocation();
        RobotInfo[] robots = rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, rc.getTeam());
        for (RobotInfo r : robots){
            if (r.getType().isRobotType()) continue;
            int d = myLoc.distanceSquaredTo(r.getLocation());
            if (closestTower == null || d < myLoc.distanceSquaredTo(closestTower.getLocation())){
                closestTower = r;
            }
        }
        if (closestTower != null){
            assignExplore3Dir(closestTower.getLocation().directionTo(myLoc));
        }
        else assignExplore3Dir(directions[(int)(Math.random()*8)]);
    }

    MapLocation getExplore3Target(){
        checkDirection();
        return explore3Target;
    }

    boolean eastCloser(){
        return  MyRobot.W - rc.getLocation().x <= rc.getLocation().x;
    }

    boolean northCloser(){
        return  MyRobot.H - rc.getLocation().y <= rc.getLocation().y;
    }

    void assignExplore3Dir(Direction dir){
        exploreDir = dir;
        angle = Math.atan2(exploreDir.dy, exploreDir.dx);
        double x = rc.getLocation().x, y = rc.getLocation().y;
        x += Math.cos(angle)*exploreDist;
        y += Math.sin(angle)*exploreDist;
        explore3Target = new MapLocation((int)x, (int)y);
    }

    void checkDirection(){
        //Direction actualDir = rc.getLocation().directionTo(explore3Target);
        if (!movingOutOfMap(exploreDir)) return;
        //System.err.println("Checking new direction!");
        switch(exploreDir){
            case SOUTHEAST:
            case NORTHEAST:
            case NORTHWEST:
            case SOUTHWEST:
                getClosestExplore3Direction();
                return;
            case NORTH:
            case SOUTH:
                if (eastCloser()) {
                    assignExplore3Dir(Direction.WEST);
                }
                else{
                    assignExplore3Dir(Direction.EAST);
                }
                return;
            case EAST:
            case WEST:
                if(northCloser()) {
                    assignExplore3Dir(Direction.SOUTH);

                }
                else{
                    assignExplore3Dir(Direction.NORTH);

                }
                return;
        }
    }

    void getClosestExplore3Direction(){
        Direction dirl = exploreDir.rotateLeft();
        if (!movingOutOfMap(dirl)){
            assignExplore3Dir(dirl);
            return;
        }
        Direction dirr = exploreDir.rotateRight();
        if (!movingOutOfMap(dirr)){
            assignExplore3Dir(dirr);
            return;
        }
        Direction dirll = dirl.rotateLeft();
        if (!movingOutOfMap(dirll)){
            assignExplore3Dir(dirll);
            return;
        }
        Direction dirrr = dirr.rotateRight();
        if (!movingOutOfMap(dirrr)){
            assignExplore3Dir(dirrr);
            return;
        }
        Direction dirlll = dirll.rotateLeft();
        if (!movingOutOfMap(dirlll)){
            assignExplore3Dir(dirlll);
            return;
        }
        Direction dirrrr = dirrr.rotateRight();
        if (!movingOutOfMap(dirrrr)){
            assignExplore3Dir(dirrrr);
            return;
        }
        Direction dirllll = dirlll.rotateLeft();
        if (!movingOutOfMap(dirllll)){
            assignExplore3Dir(dirllll);
            return;
        }
    }

    //todo this may be buggy
    double cosAngle(Direction A, Direction B){
        int a = A.ordinal(), b = B.ordinal();
        if (a > b){
            int aux = b;
            b = a;
            a = aux;
        }
        return Math.min(b - a, a + 8 - b);
    }

    boolean movingOutOfMap(Direction dir){
        try {
            MapLocation loc = rc.getLocation().add(dir);
            if (!rc.onTheMap(loc)) {
                return true;
            }
            loc = loc.add(dir);
            if (!rc.onTheMap(loc)) {
                return true;
            }
            loc = loc.add(dir);
            if (!rc.onTheMap(loc)) {
                return true;
            }
            loc = loc.add(dir);
            if (rc.canSenseLocation(loc) && !rc.onTheMap(loc)) {
                return true;
            }
            loc = loc.add(dir);
            if (rc.canSenseLocation(loc) && !rc.onTheMap(loc)) {
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


}
