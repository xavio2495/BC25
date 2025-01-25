package visionmanager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static final int VISION_RANGE_SQ = 20;
    final static int DIST_SENSE = 2;

    static final String filename = "BFS.txt";

    static final int PAINT_CODE = 5147;

    static final String packname = "basic36";


    static final int MAP_SIZE = 5;
    static final String locVar = "l";
    static final String valueVar = "v";
    static final String dirVar = "d";
    static final String passVar = "p";
    static final String distVar = "dist";
    static final String mapVar = "m";

    static final String infinity = "1000000";

    static final boolean euclid = true;

    static final int PENALTY_NEUTRAL = 5;
    static final int PENALTY_ENEMY = 10;




    static int locIndex = 0;

    static Direction[][] dirPath = new Direction[36][];

    static class CustomLocation{
        Integer id;
        Location loc;
        Direction dir = null;
        Integer dist = null;
        boolean endPoint = false;

        CustomLocation(){
        }

        CustomLocation(int dx, int dy){
            loc = new Location(dx,dy);
        }

        void reset(){
            dir = null;
            dist = null;
            endPoint = false;
        }

        String getLocVar(){
            return locVar + id.toString();
        }

        String getValueVar(){
            return valueVar + id.toString();
        }

        String getDirVar(){
            return dirVar + id.toString();
        }

        String getPassVar(){
            return passVar + id.toString();
        }

        String getMapVar(){
            return mapVar + id.toString();
        }

        String getDistVar(){
            return distVar + id.toString();
        }

        String getPaintType(int myLocX, int myLocY){
            int dx = myLocX + loc.x, dy = myLocY + loc.y;
            int c = ((dx + 8)%4)*4 + ((dy+8)%4);
            return ((PAINT_CODE >>> c)&1) != 0 ? "ALLY_SECONDARY" : "ALLY_PRIMARY";
        }

        int getDistToOrigin(){
            return loc.x*loc.x + loc.y*loc.y;
        }

        int getDistTo(CustomLocation cl){
            return loc.distanceSquared(cl.loc);
        }

        boolean border(){
            for (Direction dir: Direction.values()){
                Location newLoc = loc.add(dir);
                if (newLoc.x*newLoc.x + newLoc.y*newLoc.y > VISION_RANGE_SQ) return true;
            }
            return false;
        }

        boolean in(){
            return getDistToOrigin() <= VISION_RANGE_SQ;
        }
    }

    static class BFSSimulator{

        PrintWriter writer;
        int tabs = 0;

        String getTabs(){
            String ans = "";
            for (int i = 0; i < tabs; ++i){
                ans += "\t";
            }
            return ans;
        }

        void write(Object s){
            writer.println(getTabs() + s);
        }


        CustomLocation[][] visited = new CustomLocation[2*MAP_SIZE+1][2*MAP_SIZE+1];

        CustomLocation getCustomLocation(int i, int j){
            if (visited[i+MAP_SIZE][j+MAP_SIZE] == null){
                visited[i+MAP_SIZE][j+MAP_SIZE] = new CustomLocation();
                visited[i+MAP_SIZE][j+MAP_SIZE].id = locIndex++;
                visited[i+MAP_SIZE][j+MAP_SIZE].loc = new Location(i ,j);
            }
            return visited[i+MAP_SIZE][j+MAP_SIZE];
        }

        CustomLocation getCustomLocation(Location loc){
            return getCustomLocation(loc.x, loc.y);
        }

        ArrayList<Direction> makeCopy(ArrayList<Direction> a){
            ArrayList<Direction> ans = new ArrayList<>();
            for (int i = 0; i < a.size(); ++i){
                ans.add(a.get(i));
            }
            return ans;
        }

        void writeRecurrence2(CustomLocation dest, ArrayList<Direction> dirs){
            //CASE 1 DIR
            if (dirs.size() < 1) return; //Can't happen?
            if (dirs.size() == 1){
                CustomLocation origin = getCustomLocation(dest.loc.add(dirs.get(0)));
                write(dest.getValueVar() + " = " + origin.getValueVar()  + " + " + dest.getPassVar() + ";");
                if (origin.getDistToOrigin() == 0) write(dest.getDirVar() + " = Direction." + dirs.get(0).opposite().name() + ";");
                else write(dest.getDirVar() + " = " + origin.getDirVar() + ";");
                return;
            }
            //MORE THAN 1:
            CustomLocation origin1 = getCustomLocation(dest.loc.add(dirs.get(0)));
            CustomLocation origin2 = getCustomLocation(dest.loc.add(dirs.get(1)));

            write("if (" + origin1.getValueVar() + " > " + origin2.getValueVar() + ") {");
            ++tabs;
            ArrayList<Direction> newDirs = makeCopy(dirs);
            newDirs.remove(0);
            writeRecurrence2(dest, newDirs);
            --tabs;
            write("}");


            write("else {");
            ++tabs;
            newDirs = makeCopy(dirs);
            newDirs.remove(1);
            writeRecurrence2(dest, newDirs);
            --tabs;
            write("}");
        }

        void writeRecurrence(CustomLocation dest, CustomLocation origin, Direction dir, boolean o){
            write("if (" + dest.getValueVar() + " > " + origin.getValueVar() + " + " + dest.getPassVar() + ") {");
            ++tabs;
            write(dest.getValueVar() + " = " + origin.getValueVar()  + " + " + dest.getPassVar() + ";");
            if (o) write(dest.getDirVar() + " = Direction." + dir.name() + ";");
            else write(dest.getDirVar() + " = " + origin.getDirVar() + ";");
            --tabs;
            write("}");
        }

        CustomLocation[] getSortedLocs(){
            int n = visited.length;
            CustomLocation[] ans = new CustomLocation[n*n];
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j){
                    ans[i*n + j] = getCustomLocation(i-MAP_SIZE,j-MAP_SIZE);
                }
            }
            Arrays.sort(ans, new Comparator<CustomLocation> () {
                public int compare(CustomLocation A, CustomLocation B){
                    return Integer.compare(A.getDistToOrigin(), B.getDistToOrigin());
                }
            });
            return ans;
        }

        Direction[] sortedDirs(CustomLocation c){
            Direction[] ans = Direction.values();
            Arrays.sort(ans, new Comparator<Direction> () {
                public int compare(Direction A, Direction B){
                    return Integer.compare(c.loc.add(A).distanceSquared(new Location(0,0)), c.loc.add(B).distanceSquared(new Location(0,0)));
                }
            });
            return ans;
        }

        void printBFS2 (boolean tower) {

            if (tower) write("static void computeDistsTower() throws GameActionException {");
            else write("static void computeDistsUnit() throws GameActionException {");
            ++tabs;

            CustomLocation[] locs = getSortedLocs();

            CustomLocation initialLoc = getCustomLocation(0,0);
            initialLoc.dist = 0;
            initialLoc.endPoint = false;
            initialLoc.dir = null;

            for (int i = 1; i < locs.length; ++i){
                CustomLocation currentLoc = locs[i];
                if (currentLoc.getDistToOrigin() > VISION_RANGE_SQ){
                    continue;
                }

                if (tower || currentLoc.getDistToOrigin() > DIST_SENSE) {
                    write("if (" + currentLoc.getMapVar() + " != null && " + currentLoc.getMapVar() + ".isPassable()){");
                    ++tabs;
                }
                else {
                    if (currentLoc.getDistToOrigin() <= DIST_SENSE) {
                        write("if (MovementManager.canMove(Direction." + new Location(0,0).directionTo(currentLoc.loc).name() + ")){");
                        ++tabs;
                    }
                }


                write(currentLoc.getPassVar() + " = 10 + switch(" + currentLoc.getMapVar() + ".getPaint()){");
                ++tabs;
                write("case ENEMY_PRIMARY, ENEMY_SECONDARY -> " + PENALTY_ENEMY + ";");
                write("case EMPTY -> " + PENALTY_NEUTRAL+ ";");
                write("default -> " + 0+ ";");
                --tabs;
                write("};");
                if (currentLoc.getDistToOrigin() <= DIST_SENSE){
                    write(currentLoc.getPassVar() + " += " + PENALTY_NEUTRAL + "*Util.getPaintLost(Direction." + new Location(0,0).directionTo(currentLoc.loc).name() + ");");
                }
                Location l = currentLoc.loc;

                ArrayList<Direction> validDirs = new ArrayList<>();

                for (Direction dir : sortedDirs(currentLoc)){
                    Location nLoc = l.add(dir);
                    CustomLocation newLoc = getCustomLocation(nLoc);
                    if (newLoc.dist == null) continue;
                    validDirs.add(dir);
                }

                writeRecurrence2(currentLoc, makeCopy(validDirs));

                --tabs;
                write("}");

                currentLoc.dist = 0;

            }

            --tabs;
            write("}");
        }

        void printVariables(){
            int n = visited.length;
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j){
                    CustomLocation c = getCustomLocation(i-MAP_SIZE,j-MAP_SIZE);
                    if (c.getDistToOrigin() > VISION_RANGE_SQ) continue;
                    write("static MapLocation " + c.getLocVar() + ";");
                    write("static int " + c.getValueVar() + ";");
                    write("static Direction " + c.getDirVar() + ";");
                    write("static int " + c.getPassVar() + ";");
                    write("static MapInfo " + c.getMapVar() + ";");
                    write("");
                }
            }
        }

        void fillDirPath(){
            dirPath[0] = new Direction[]{};
            dirPath[1] = new Direction[]{Direction.NORTHWEST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.WEST};
            dirPath[2] = new Direction[]{Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[3] = new Direction[]{Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[4] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.WEST};
            dirPath[5] = new Direction[]{Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[6] = new Direction[]{Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[7] = new Direction[]{Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[8] = new Direction[]{Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[9] = new Direction[]{Direction.NORTHWEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.WEST};
            dirPath[10] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[11] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[12] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[13] = new Direction[]{Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[14] = new Direction[]{Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[15] = new Direction[]{Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[16] = new Direction[]{Direction.NORTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.WEST};
            dirPath[17] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[18] = new Direction[]{Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[19] = new Direction[]{Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[20] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[21] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[22] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[23] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[24] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[25] = new Direction[]{Direction.NORTHWEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHEAST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHEAST, Direction.SOUTHEAST, Direction.WEST};
            dirPath[26] = new Direction[]{Direction.NORTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[27] = new Direction[]{Direction.NORTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[28] = new Direction[]{Direction.NORTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[29] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[30] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[31] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[32] = new Direction[]{Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[33] = new Direction[]{Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTH, Direction.EAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.EAST, Direction.SOUTH, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTH, Direction.WEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[34] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
            dirPath[35] = new Direction[]{Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTHEAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTHEAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTHWEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTHWEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST, Direction.WEST, Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.NORTH};
        }


        void printAssignments(){
            write("static void makeAssignments() throws GameActionException {");
            ++tabs;
            write(getCustomLocation(0,0).getLocVar() + " = rc.getLocation();");
            write(getCustomLocation(0,0).getValueVar() + " = 0;");
            Location loc = new Location(0,0);
            for (int i = dirPath[VISION_RANGE_SQ].length; i-- > 0; ){
                Location newLoc = loc.add(dirPath[VISION_RANGE_SQ][i]);
                write(getCustomLocation(newLoc).getLocVar() + " = " + getCustomLocation(loc).getLocVar() + ".add(Direction." + dirPath[VISION_RANGE_SQ][i].name() + ");");
                write(getCustomLocation(newLoc).getValueVar() + " = " + infinity + ";");
                write(getCustomLocation(newLoc).getDirVar() + " = " + "null;");
                write("if (" + "rc.onTheMap(" + getCustomLocation(newLoc).getLocVar() + ")) " + getCustomLocation(newLoc).getMapVar() + " =  rc.senseMapInfo(" + getCustomLocation(newLoc).getLocVar() + ");");
                write("else " + getCustomLocation(newLoc).getMapVar() + " =  null;");
                loc = newLoc;
            }
            --tabs;
            write("}");
            write("");
        }

        void printDistances(){
            write("static int computeDistance(MapLocation target){");
            ++tabs;
            write("int dx = target.x - rc.getLocation().x;");
            write("int dy = target.y - rc.getLocation().y;");
            write("switch(dx){");
            ++tabs;

            int maxX = (int) Math.sqrt(VISION_RANGE_SQ);

            for (int i = -maxX; i <= maxX; ++i){
                write("case " + i + ":");
                ++tabs;

                int maxY = (int) Math.sqrt(VISION_RANGE_SQ - i*i);

                write("switch(dy){");
                ++tabs;

                for (int j = -maxY; j <= maxY; ++j){
                    write("case " + j + ": return " + getCustomLocation(i,j).getValueVar() + ";");
                }

                write("}");
                --tabs;


                write("break;");
                --tabs;
            }

            --tabs;
            write("}");

            write("return " + infinity + ";");
            --tabs;
            write("}");
        }

        void printCloseOptimal(){
            write("int dx = target.x - " + getCustomLocation(0,0).getLocVar() + ".x;");
            write("int dy = target.y - " + getCustomLocation(0,0).getLocVar() + ".y;");
            write("switch(dx){");
            ++tabs;

            int maxX = (int) Math.sqrt(VISION_RANGE_SQ);

            for (int i = -maxX; i <= maxX; ++i){
                write("case " + i + ":");
                ++tabs;

                int maxY = (int) Math.sqrt(VISION_RANGE_SQ - i*i);

                write("switch(dy){");
                ++tabs;

                for (int j = -maxY; j <= maxY; ++j){
                    write("case " + j + ": return " + getCustomLocation(i,j).getDirVar() + ";");
                }

                write("}");
                --tabs;


                write("break;");
                --tabs;
            }

            --tabs;
            write("}");
        }

        String sqrtDist(CustomLocation c){
            return "Math.sqrt(" + c.getLocVar() + ".distanceSquaredTo(target))";
        }

        String getEstimationFormula(CustomLocation c){
            if (euclid){
                return "(initialDist - " + sqrtDist(c) + ")/" + c.getValueVar();
            }
            else return " ";
        }

        void printOptimal(){
            write("static Direction getBestDirection(MapLocation target){");
            ++tabs;
            printCloseOptimal();

            write("");

            write("Direction ans = null;");
            write("double bestEstimation = 0;");
            write("double initialDist = " + sqrtDist(getCustomLocation(0,0)) + ";");

            write("");


            int n = visited.length;
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j){
                    CustomLocation c = getCustomLocation(i-MAP_SIZE,j-MAP_SIZE);
                    if (!c.in()) continue;
                    if (!c.border()) continue;
                    write("double " + c.getDistVar() + " = " + getEstimationFormula(c) + ";");
                    write("if (" + c.getDistVar()  + " > bestEstimation) {");
                    ++tabs;
                    write("bestEstimation = " + c.getDistVar() + ";");
                    write("ans = " + c.getDirVar() + ";");
                    --tabs;
                    write("}");
                }
            }

            write("return ans;");

            --tabs;
            write("}");

        }

        CustomLocation[] createCenterLocs(int z){
            HashSet<Integer> visited = new HashSet<>();
            for (int x = -4; x <= 4; ++x){
                for (int y = -4; y <= 4; ++y){
                    if (x*x + y*y > VISION_RANGE_SQ) continue;
                    for (int dx = -2; dx <= 2; ++dx){
                        for (int dy = -2; dy <= 2; ++dy){
                            int DX = x + dx + 12, DY = y + dy + 12;
                            if ((DX + z/4)%4 != 2 || (DY + z%4)%4 != 2) continue;
                            visited.add((x + dx + 10)*100 + (y + dy + 10));
                        }
                    }
                }
            }
            CustomLocation[] ans = new CustomLocation[visited.size()];
            int cont = 0;
            for (Integer c : visited){
                int dx = c/100 - 10, dy = c%100 - 10;
                ans[cont++] = new CustomLocation(dx,dy);

            }
            Arrays.sort(ans, new Comparator<CustomLocation> () {
                public int compare(CustomLocation A, CustomLocation B){
                    return Integer.compare(A.getDistToOrigin(), B.getDistToOrigin());
                }
            });
            return ans;
        }

        int getCentersCode(CustomLocation loc, CustomLocation[] centers){
            int ans = 0;
            for (int i = 0; i < centers.length; ++i){
                if (loc.getDistTo(centers[i]) <= 8) ans |= (1 << i);
            }
            return ans;
        }

        void printResourcePatternAnalysis(){

            write("static boolean maxT;");
            write("static MapLocation bestSRPSpot;");
            write("static MapLocation myLoc;");
            write("static MapLocation emptyLoc;");
            write("static MapLocation bestCenter;");
            for (int i = 0; i < 16; ++i){
                write("static MapLocation bestSpot" + i + ";");
            }

            write("");
            write("");


            /* ================================== CHECK PATTERN =============================== */
            write("static void scanRSPs () throws GameActionException {");
            ++tabs;
            write("");
            write("maxT = Util.towerMax();");
            write("");
            write("myLoc = rc.getLocation();");
            write("emptyLoc = null;");
            write("bestSRPSpot = null;");
            write("bestCenter = null;");

            write("");

            write("int dx = myLoc.x%4, dy = myLoc.y%4;");
            write("int dencode = dx*4 + dy;");

            write("switch(dencode){");
            ++tabs;

            for (int i = 0; i < 16; ++i){
                write("case " + i  + ":");
                ++tabs;
                write("scan" + i + "();");
                write("break;");

                //write("return process" + i + "();");
                --tabs;
            }
            --tabs;
            write("}");
            --tabs;
            write("}");
            write("");
            write("");

            /*================================= CASES =================================*/


            CustomLocation[] locs = getSortedLocs();
            for (int z = 0; z < 16; ++z){
                int dx = z/4, dy = z%4;
                CustomLocation[] centerLocs = createCenterLocs(z);
                write("static void scan" + z + "() throws GameActionException {");
                ++tabs;
                write("int obstructedCenters = 0;");
                write("int unavailableCenters = 0;");
                write("int targetCenters = 0;");
                for (int i = 0; i < centerLocs.length; ++i){
                    write("bestSpot" + i + " = null;");
                }

                for (int j = locs.length - 1; j >= 0; --j){
                    CustomLocation loc = locs[j];
                    if (loc.getDistToOrigin() > VISION_RANGE_SQ) continue;
                    int codes = getCentersCode(loc, centerLocs);
                    write("if (" + loc.getMapVar() + " != null){");
                    ++tabs;
                    write("if (!"  + loc.getMapVar() + ".isPassable()) obstructedCenters |= " + codes + ";");
                    write("else if (Map.isNearRuin("  + loc.getLocVar() + ") && !maxT) unavailableCenters |= " + codes + ";");
                    write("else{");
                    ++tabs;
                    write("switch(" + loc.getMapVar() + ".getPaint()){");
                    ++tabs;
                    write("case ENEMY_PRIMARY, ENEMY_SECONDARY:");
                    ++tabs;
                    write("unavailableCenters |= " + codes + ";");
                    write("break;");
                    --tabs;
                    write("case " + loc.getPaintType(dx, dy) + ":");
                    ++tabs;
                    write("break;");
                    --tabs;
                    write("case EMPTY:");
                    ++tabs;
                    write("emptyLoc = " + loc.getLocVar() + ";");
                    --tabs;
                    write("default:");
                    ++tabs;
                    write("targetCenters |= " + codes + ";");
                    for (int i = 0; i < centerLocs.length; ++i){
                        if (((codes >>> i) & 1)!= 0) write("bestSpot" + i + " = " + loc.getLocVar() + ";");
                    }
                    --tabs;
                    --tabs;
                    write("}");
                    --tabs;
                    write("}");
                    --tabs;
                    write("}");
                }

                write("");

                write("MapLocation center;");

                for (int i = centerLocs.length - 1; i >= 0; --i){
                    write("center = myLoc.translate(" + centerLocs[i].loc.x + "," + centerLocs[i].loc.y + ");");
                    write("if (Map.canBeCenter(center)){");
                    ++tabs;
                    //write("rc.setIndicatorDot(center, 0, 200, 0);");
                    write("if ((obstructedCenters & " + (1 << i) + ") > 0) Map.markObstructed(center);");
                    write("else if ((unavailableCenters & " + (1 << i) + ") > 0) Map.markCenterNearRuins(center);");
                    write("else if ((targetCenters & " + (1 << i) + ") > 0 && Map.canBeCenterNoCheck(center)){");
                    ++tabs;
                    write("bestSRPSpot = bestSpot" + i +";");
                    write("bestCenter = center;");
                    --tabs;
                    write("}");
                    --tabs;
                    write("}");
                }

                //write("return bestSpot;");



                --tabs;
                write("}");
                write("");
                write("");
                write("");
            }

        }

        void resetAll(){
            for (int i = 0; i < visited.length; ++i){
                for (int j = 0; j < visited[i].length; ++j) visited[i][j].reset();
            }
        }

        void run(){
            try {
                writer = new PrintWriter(filename, "UTF-8");
            } catch (IOException e){
                e.printStackTrace();
            }

            fillDirPath();

            write("package " + packname + ";");
            write("import battlecode.common.*;");



            write("public class VisionManager {");
            ++tabs;

            write("");
            write("static RobotController rc;");
            write("");

            write ("static void init(){");
            ++tabs;
            write("rc = MyRobot.rc;");
            --tabs;
            write("}");


            write("");

            printVariables(); //Variables

            write("");

            //write("static void computeDists(MapLocation target) throws GameActionException {");

            //++tabs;

            printAssignments(); //var assignments

            write("");


            printBFS2(false); //computes Distances

            write("");

            resetAll();

            printBFS2(true); //computes Distances

            //--tabs;

            //write("}");

            write("");

            printOptimal();

            write("");


            printDistances(); //printDistances


            printResourcePatternAnalysis();

            --tabs;
            write("}");


            writer.close();
        }
    }



    public static void main(String[] args){

        BFSSimulator bfs = new BFSSimulator();
        bfs.run();

    }

}
