package resourcepatterndetector;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static final int VISION_RANGE_SQ = 20;

    static final int ATTACK_RANGE_SQ = 9;

    static final String filename = "ResourcePattern.txt";


    static final int code = 22365525;


    static int dx, dy;

    static class CustomLoc implements Comparable<CustomLoc> {
        int dx, dy;
        int index;
        static final String varName = "l";
        static final String mapInfoVarName = "m";
        Object getName(){
            return varName + index;
        }

        Object getMapInfoName(){
            return mapInfoVarName + index;
        }

        CustomLoc(int dx, int dy){
            this.dx = dx;
            this.dy = dy;
            this.index = (dx+4)*9 + (dy+4);
        }

        int dist (int x, int y){
            int ddx = x - dx, ddy = y - dy;
            return ddx*ddx + ddy*ddy;
        }

        public int compareTo(CustomLoc c){
            if (!isOtherQuadrant() && c.isOtherQuadrant()) return -1;
            if (isOtherQuadrant() && !c.isOtherQuadrant()) return 1;
            return Integer.compare(dist(0, 0), c.dist(0, 0));
        }

        int getPaintBit(){
            int cx = (dx + Main.dx + 5)%5, cy = (dy + Main.dy + 5)%5;
            int c = cx*5 + cy;
            return ((code >>> c)&1);
        }

        boolean isOtherQuadrant(){
            int cx = dx + Main.dx, cy = dy + Main.dy;
            return (cx < 0 || cx >= 5 || cy < 0 || cy >= 5);
        }
    }

    static class PatternDetector{

        static final int UNSEEN = 3;
        static final int ENEMY_PAINT = 4;

        static long newcode = 0;

        static String newCodeName = "ResCodeExtended";

        static ArrayList<CustomLoc> ruinLocs = new ArrayList<>();

        static int rlSize = 0;




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

        void getNewCodes(){
            long newCode = 0;
            for (int j = 0; j < 25; ++j){
                long bit = ((code >>> j)&1) + 1;
                newCode = (newCode | (bit << (2*j)));
            }
        }

        void createCustomLocs(){
            for (int i = -4; i <= 4; ++i){
                for (int j = -4; j <= 4; ++j){
                    CustomLoc cl = new CustomLoc(i,j);
                    if (cl.dist(0,0) > VISION_RANGE_SQ) continue;
                    ruinLocs.add(cl);
                }
            }
        }


        String getPaintType(int x){
            if (x == 1) return "ALLY_SECONDARY";
            return "ALLY_PRIMARY";
        }

        String addComment(int x){
            return " // (" + ruinLocs.get(x).dx + "," +  ruinLocs.get(x).dy + ")";
        }


        int encode (int dx, int dy){
            return (dx+4)*9 + (dy+4);
        }

        Object getLongLong(long x){
            return x + "L";
        }

        int getVision(int dx, int dy){
            int ans = 0;
            for (int i = 0; i < 24; ++i){
                if (ruinLocs.get(i).dist(dx,dy) <= VISION_RANGE_SQ) ans |= (1 << ruinLocs.get(i).index);
            }
            return ans;
        }

        int getAttack(int dx, int dy){
            int ans = 0;
            for (int i = 0; i < 24; ++i){
                if (ruinLocs.get(i).dist(dx,dy) <= ATTACK_RANGE_SQ) ans |= (1 << ruinLocs.get(i).index);
            }
            return ans;
        }

        void run(){
            try {
                writer = new PrintWriter(filename, "UTF-8");
            } catch (IOException e){
                e.printStackTrace();
            }

            getNewCodes();
            createCustomLocs();
            //write("static final long " + newCodeName + " = " + newcode + ";");
            //("static final int UNSEEN = 3;");
            write("");
            for (int i = 0; i < ruinLocs.size(); ++i){
                write("static MapLocation " + ruinLocs.get(i).getName() + ";");
                write("static MapInfo " + ruinLocs.get(i).getMapInfoName() + ";");
            }

            write("");
            write("static RobotController rc;");
            write("");

            write("static boolean ready;");
            write("static boolean maxT;");


            /* ================================== CHECK PATTERN =============================== */
            write("static MapLocation getBestTarget () throws GameActionException {");
            ++tabs;
            write("");
            write("rc = MyRobot.rc;");
            write("ready = rc.isActionReady() && rc.getPaint() > 10;");
            write("maxT = Util.towerMax();");
            write("");
            write("MapLocation myLoc = rc.getLocation();");
            for (int i = 0; i < ruinLocs.size(); ++i){
                write(ruinLocs.get(i).getName() + " = myLoc.translate(" + ruinLocs.get(i).dx + "," + ruinLocs.get(i).dy + ");");
                write("if (rc.canSenseLocation(" + ruinLocs.get(i).getName() + ")) " + ruinLocs.get(i).getMapInfoName() + " = " + "rc.senseMapInfo(" + ruinLocs.get(i).getName() + ");");
            }

            write("");

            write("int dx = myLoc.x%5, dy = myLoc.y%5;");
            write("int dencode = dx*5 + dy;");

            write("switch(dencode){");
            ++tabs;

            for (int i = 0; i < 25; ++i){
                write("case " + i  + ":");
                ++tabs;

                write("return process" + i + "();");
                --tabs;
            }
            --tabs;
            write("}");
            write("return null;");
            --tabs;
            write("}");
            write("");
            write("");


             /*================================= CASES =============*/

            for (int i = 0; i < 25; ++i) {
                Main.dx = i / 5;
                Main.dy = i % 5;
                Collections.sort(ruinLocs);

                write("static MapLocation process" + i + "() throws GameActionException {" + " // (" + Main.dx + "," + Main.dy + ")");

                ++tabs;
                write("MapLocation ans = null;");

                for (int x = 0; x < ruinLocs.size(); ++x) {
                    write("if (rc.onTheMap(" + ruinLocs.get(x).getName() + ") && " + "!" + ruinLocs.get(x).getMapInfoName() + ".isWall()" + " && "
                            + "!" + ruinLocs.get(x).getMapInfoName() + ".hasRuin()" + " && "
                            + "(maxT || !Map.isNearRuin(" + ruinLocs.get(x).getName() + "))){" + addComment(x));
                    ++tabs;

                    write("PaintType p = " + ruinLocs.get(x).getMapInfoName() + ".getPaint();");
                    write("if (p.isEnemy() || p != PaintType." + getPaintType(ruinLocs.get(x).getPaintBit()) + "){");
                    ++tabs;
                    write("if (ans == null) ans = " + ruinLocs.get(x).getName() + ";");
                    if (ruinLocs.get(x).isOtherQuadrant()){
                        write("else return ans;");
                    }
                    if (ruinLocs.get(x).dist(0, 0) <= ATTACK_RANGE_SQ && !ruinLocs.get(x).isOtherQuadrant()) {
                        write("if (ready){ ");
                        ++tabs;
                        write("rc.attack(" + ruinLocs.get(x).getName() + ", " + (ruinLocs.get(x).getPaintBit() > 0 ? "true" : "false" )+ ");");
                        write("ready = false;");
                        --tabs;
                        write("}");
                    }

                    --tabs;
                    write("}");
                    --tabs;
                    write("}");
                }

                write("return ans;");

                --tabs;
                write("}");

                write("");
                write("");


            }

            writer.close();


        }

    }



    public static void main(String[] args){

        PatternDetector p = new PatternDetector();
        p.run();

    }

}
