package basic45;

import battlecode.common.*;


/**
 * Main class used to explore the map. At a high level the getExplore3Target (there were two other versions before!) samples a random direction
 * and attempts to follow it until the edge of the map. Then it chooses another direction prioritizing those that are not immediately adjacent.
 */
public class Explore {

    RobotController rc;
    MapLocation explore3Target;
    Direction exploreDir = null; //TODO

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

    void assignExplore3Dir(Direction dir){
        exploreDir = dir;
        int diffX = Constants.INF, diffY = Constants.INF;
        if (dir.dx > 0) diffX = MyRobot.W - rc.getLocation().x - 1;
        else if (dir.dx < 0) diffX = rc.getLocation().x;
        if (dir.dy > 0) diffY = MyRobot.H - rc.getLocation().y - 1;
        else if (dir.dy < 0) diffY = rc.getLocation().y;
        int diff = diffX;
        if (diffY < diffX) diff = diffY;
        explore3Target = rc.getLocation().translate(diff*dir.dx, diff*dir.dy);
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
            d = d.rotateLeft();
            if (!movingOutOfMap(d)) possibleDirs[cont++] = d;
        }

        int randomDir = (int)(Math.random()*cont);

        assignExplore3Dir(possibleDirs[randomDir]);

    }


    /**
     * Now that I see this, it can probably be done much better, but this was copied from an older code
     * in which we didn't know the size of the map.
     */
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
