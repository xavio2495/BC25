package patterndetector;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    static final int VISION_RANGE_SQ = 20;

    static final int ATTACK_RANGE_SQ = 9;

    static final String filename = "PatternDetector.txt";


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
            this.index = (dx+2)*5 + (dy+2);
        }

        int dist (int x, int y){
            int ddx = x - dx, ddy = y - dy;
            return ddx*ddx + ddy*ddy;
        }

        public int compareTo(CustomLoc c){
            return Integer.compare(-dist(0, 0), -c.dist(0, 0));
        }

    }

    static class PatternDetector{

        static final int PAINT = 0, MONEY = 1, DEFENSE = 2;
        static final int UNSEEN = 3;
        static final int ENEMY_PAINT = 4;
        static final int ALLY_PAINT = 5;

        static final int[] OgCodes = new int[]{18157905, 15583086, 4685252};

        static final String[] Names = new String[]{"Paint", "Money", "Defense"};

        static final String[] varNames = new String[]{"codePaint", "codeMoney", "codeDefense"};

        long[] newCodes = new long[3];

        CustomLoc[] ruinLocs = new CustomLoc[24];




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
            for (int i = 0; i < 3; ++i){
                int c = OgCodes[i];
                long newC = 0;
                for (int j = 0; j < 25; ++j){
                    long bit = ((c >>> j)&1) + 1;
                    newC = (newC | (bit << (2*j)));
                }
                newCodes[i] = newC;
            }
        }

        void createCustomLocs(){
            int cont = 0;
            for (int i = -2; i <= 2; ++i){
                for (int j = -2; j <= 2; ++j){
                    if (i == 0 && j == 0) continue;
                    ruinLocs[cont++] = new CustomLoc(i,j);
                }
            }
        }

        String getPaintType(int x){
            if (x == 1) return "ALLY_SECONDARY";
            return "ALLY_PRIMARY";
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
                if (ruinLocs[i].dist(dx,dy) <= VISION_RANGE_SQ) ans |= (1 << ruinLocs[i].index);
            }
            return ans;
        }

        int getAttack(int dx, int dy){
            int ans = 0;
            for (int i = 0; i < 24; ++i){
                if (ruinLocs[i].dist(dx,dy) <= ATTACK_RANGE_SQ) ans |= (1 << ruinLocs[i].index);
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
            for (int i = 0; i < 3; ++i) write("static final long " + varNames[i] + " = " + getLongLong(newCodes[i]) + ";");
            write("static final int PAINT = 0, MONEY = 1, DEFENSE = 2, UNSEEN = 3;");
            write("");
            for (int i = 0; i < 24; ++i){
                write("static MapLocation " + ruinLocs[i].getName() + ";");
                write("static MapInfo " + ruinLocs[i].getMapInfoName() + ";");
            }

            write("");
            write("static RobotController rc;");
            write("");


            /* ================================== CHECK PATTERN =============================== */
            write("static int checkPattern (MapLocation ruinLoc) throws GameActionException {");
            ++tabs;
            write("");
            write("rc = MyRobot.rc;");
            write("");
            for (int i = 0; i < 24; ++i){
                write(ruinLocs[i].getName() + " = ruinLoc.translate(" + ruinLocs[i].dx + "," + ruinLocs[i].dy + ");");
                write("if (rc.canSenseLocation(" + ruinLocs[i].getName() + ")) " + ruinLocs[i].getMapInfoName() + " = " + "rc.senseMapInfo(" + ruinLocs[i].getName() + ");");
            }

            write("");

            write( "MapLocation myLoc = rc.getLocation();");
            write("int dx = myLoc.x - ruinLoc.x, dy = myLoc.y - ruinLoc.y;");
            write("int dencode = (dx+4)*9 + (dy+4);");

            write("switch(dencode){");
            ++tabs;

            boolean[] used = new boolean[81];

            ArrayList<Integer> vals = new ArrayList<>();

            for (int i = 0; i < 81; ++i){
                if (used[i]) continue;
                int dx = (i/9) - 4, dy = (i%9) - 4;
                if (dx*dx + dy*dy > VISION_RANGE_SQ) continue;
                vals.add(i);
                int vision = getVision(dx,dy);
                for (int j = 0; j < 81; ++j){
                    int dxj = (j/9) - 4, dyj = (j%9) - 4;
                    if (getVision(dxj, dyj) == vision){
                        write("case "+ j + ":");
                        used[j] = true;
                    }
                }
                ++tabs;

                write("return process" + i + "();");
                //write("break;");
                --tabs;

                /*boolean unseen = false;
                for (int j = 0; j < 24; ++j){
                    int ind = ruinLocs[j].index;
                    if (((vision >>> ind)& 1) == 0){
                        unseen = true;
                        continue;
                    }
                    write("colorBit = switch(" + ruinLocs[j].getMapInfoName() + ".getPaint()) {");
                    ++tabs;
                    write("case ALLY_PRIMARY -> 2;");
                    write("case ALLY_SECONDARY -> 1;");
                    write ("case EMPTY -> 0;");
                    write ("default -> 3;");
                    --tabs;
                    write("};");
                    write("c = (c | (colorBit << " + 2*ind + "));");
                }
                --tabs;
                for (int k = 0; k < 3; ++k){
                    write ("if ((c | " + getLongLong(newCodes[k]) + ") == " + getLongLong(newCodes[k]) + ") ans |= " + (1 << k) + ";");
                }
                if (unseen) write ("ans |= " + (1 << UNSEEN) + ";");
                write("return ans;");*/
            }
            --tabs;
            write("}");
            write("return 0;");
            --tabs;
            write("}");
            write("");
            write("");

            for (int x = 0; x < vals.size(); ++x){
                int i = vals.get(x);
                int dx = (i/9) - 4, dy = (i%9) - 4;
                int vision = getVision(dx,dy);

                write("static int process" + i + "(){");

                ++tabs;
                write("long c = 0;");
                write("int ans = 0;");
                write("long colorBit;");
                write("boolean enemyPaint = false;");
                write("boolean allyPaint = false;");



                boolean unseen = false;
                for (int j = 0; j < 24; ++j){
                    int ind = ruinLocs[j].index;
                    if (((vision >>> ind)& 1) == 0){
                        unseen = true;
                        continue;
                    }
                    write("switch(" + ruinLocs[j].getMapInfoName() + ".getPaint()) {");
                    ++tabs;
                    write("case ALLY_PRIMARY:");
                    ++tabs;
                    write("colorBit = 1;");
                    write("allyPaint = true;");
                    write("break;");
                    --tabs;
                    write("case ALLY_SECONDARY:");
                    ++tabs;
                    write("allyPaint = true;");
                    write("colorBit = 2;");
                    write("break;");
                    --tabs;
                    write("case EMPTY:");
                    ++tabs;
                    write("colorBit = 0;");
                    write("break;");
                    --tabs;
                    write("default:");
                    ++tabs;
                    write("colorBit = 3;");
                    write("enemyPaint = true;");
                    write("break;");
                    --tabs;
                    /*write("colorBit = switch(" + ruinLocs[j].getMapInfoName() + ".getPaint()) {");
                    ++tabs;
                    write("case ALLY_PRIMARY -> 1;");
                    write("case ALLY_SECONDARY -> 2;");
                    write ("case EMPTY -> 0;");
                    write ("default -> 3;");*/
                    --tabs;
                    write("}");
                    write("c = (c | (colorBit << " + 2*ind + "));");
                }
                for (int k = 0; k < 3; ++k){
                    write ("if ((c | " + getLongLong(newCodes[k]) + ") == " + getLongLong(newCodes[k]) + ") ans |= " + (1 << k) + ";");
                }
                if (unseen) write ("ans |= " + (1 << UNSEEN) + ";");
                write("if (enemyPaint) ans |= " + (1 << ENEMY_PAINT) + ";");
                write("if (allyPaint) ans |= " + (1 << ALLY_PAINT) + ";");
                write("return ans;");
                --tabs;
                write("}");
                write ("");
                write ("");
            }

            write("static void drawPattern (MapLocation ruinLoc, int pattern) throws GameActionException {");
            ++tabs;
            for (int i = 0; i < 24; ++i){
                write(ruinLocs[i].getName() + " = ruinLoc.translate(" + ruinLocs[i].dx + "," + ruinLocs[i].dy + ");");
                write("if (rc.canSenseLocation(" + ruinLocs[i].getName() + ")) " + ruinLocs[i].getMapInfoName() + " = " + "rc.senseMapInfo(" + ruinLocs[i].getName() + ");");
            }
            write("switch (pattern) {");
            ++tabs;
            write("case PAINT:");
            ++tabs;
            write("drawPattern" + Names[0] + "(ruinLoc);");
            write("break;");
            --tabs;
            write("case MONEY:");
            ++tabs;
            write("drawPattern" + Names[1] + "(ruinLoc);");
            write("break;");
            --tabs;
            write("case DEFENSE:");
            ++tabs;
            write("drawPattern" + Names[2] + "(ruinLoc);");
            write("break;");
            --tabs;
            --tabs;
            write("}");
            --tabs;
            write("}");

            write ("");
            write ("");
            write ("");



            /* =============================== DRAW ========================================*/

            ArrayList<CustomLoc> newRuinLocs = new ArrayList<>(Arrays.asList(ruinLocs));

            Collections.sort(newRuinLocs);


            for(int t = 0; t < 3; ++t) {
                write("");
                write("");
                write("");

                write("static void drawPattern" + Names[t] + " (MapLocation ruinLoc) throws GameActionException {");
                ++tabs;
                write("");

                write("if (rc.getPaint() <= Constants.MIN_SOLDIER_MOVEMENT) return;");

                write("if (!rc.isActionReady()) return;");

                write("");


                write("MapLocation myLoc = rc.getLocation();");
                write("int dx = myLoc.x - ruinLoc.x, dy = myLoc.y - ruinLoc.y;");
                write("int dencode = (dx+4)*9 + (dy+4);");

            /*write("int pt = switch(pattern){");
            ++tabs;
            write("case PAINT -> " + OgCodes[PAINT] + ";");
            write("case MONEY -> " + OgCodes[MONEY]+ ";");
            write("default -> " + OgCodes[DEFENSE]+ ";");
            --tabs;
            write("};");*/

                write("switch(dencode){");
                ++tabs;

                used = new boolean[81];

                for (int i = 0; i < 81; ++i) {
                    if (used[i]) continue;
                    int dx = (i / 9) - 4, dy = (i % 9) - 4;
                    if (dx * dx + dy * dy > VISION_RANGE_SQ) continue;
                    int attack = getAttack(dx, dy);
                    for (int j = 0; j < 81; ++j) {
                        int dxj = (j / 9) - 4, dyj = (j % 9) - 4;
                        if (dxj * dxj + dyj * dyj > VISION_RANGE_SQ) continue;
                        if (getAttack(dxj, dyj) == attack) {
                            write("case " + j + ":");
                            used[j] = true;
                        }
                    }
                    ++tabs;

                    for (int j = 0; j < 24; ++j) {
                        int ind = newRuinLocs.get(j).index;
                        if (((attack >>> ind) & 1) == 0) {
                            continue;
                        }


                        write("if(" +  newRuinLocs.get(j).getMapInfoName() + ".getPaint() != PaintType." + getPaintType((OgCodes[t] >>>  newRuinLocs.get(j).index) & 1) + ") {");
                        ++tabs;
                        //write("case EMPTY:");
                        //++tabs;

                        write("rc.attack(" +  newRuinLocs.get(j).getName() + ", " + (((OgCodes[t] >>>  newRuinLocs.get(j).index) & 1) > 0) + ");");
                        write("return;");
                        //--tabs;
                        --tabs;
                        write("}");
                    }
                    write("break;");
                    --tabs;

                }
                --tabs;
                write("}");
                --tabs;
                write("}");
            }



            writer.close();


        }

    }



    public static void main(String[] args){

        PatternDetector p = new PatternDetector();
        p.run();

    }

}
