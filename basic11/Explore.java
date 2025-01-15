package basic11;

import battlecode.common.*;

public class Explore {

    RobotController rc;
    MapLocation explore3Target;
    Direction exploreDir = null; //TODO
    double angle = 0;
    double exploreDist = 100;

    static final Direction[] directions = Direction.values();

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
        if (!movingOutOfMap(exploreDir)) return;

        Direction[] possibleDirs = new Direction[8];
        int cont = 0;
        Direction d = exploreDir.rotateLeft().rotateLeft();
        if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
        d = d.rotateLeft();
        if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
        d = d.rotateLeft();
        if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
        d = d.rotateLeft();
        if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
        d = d.rotateLeft();
        if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
        if (cont == 0) {
            d = d.rotateLeft();
            if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
            d = d.rotateLeft();
            //if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
            d = d.rotateLeft();
            if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
        }

        int randomDir = (int)(Math.random()*cont);

        assignExplore3Dir(possibleDirs[randomDir]);

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
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


}
