package patterndetector;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

    static final int VISION_RANGE_SQ = 20;

    static final int ATTACK_RANGE_SQ = 9;

    static final String filename = "PatternDetector.txt";


    static class CustomLoc{
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
    }

    static class PatternDetector{

        static final int PAINT = 0, MONEY = 1, DEFENSE = 2;
        static final int UNSEEN = 3;
        static final int WRONG = -1;

        static final int[] OgCodes = new int[]{18157905, 15583086, 4685252};

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
                vals.add(i);
                int dx = (i/9) - 4, dy = (i%9) - 4;
                if (dx*dx + dy*dy > VISION_RANGE_SQ) continue;
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



                boolean unseen = false;
                for (int j = 0; j < 24; ++j){
                    int ind = ruinLocs[j].index;
                    if (((vision >>> ind)& 1) == 0){
                        unseen = true;
                        continue;
                    }
                    write("colorBit = switch(" + ruinLocs[j].getMapInfoName() + ".getPaint()) {");
                    ++tabs;
                    write("case ALLY_PRIMARY -> 1;");
                    write("case ALLY_SECONDARY -> 2;");
                    write ("case EMPTY -> 0;");
                    write ("default -> 3;");
                    --tabs;
                    write("};");
                    write("c = (c | (colorBit << " + 2*ind + "));");
                }
                for (int k = 0; k < 3; ++k){
                    write ("if ((c | " + getLongLong(newCodes[k]) + ") == " + getLongLong(newCodes[k]) + ") ans |= " + (1 << k) + ";");
                }
                if (unseen) write ("ans |= " + (1 << UNSEEN) + ";");
                write("return ans;");
                --tabs;
                write("}");
                write ("");
                write ("");
            }





            write("");
            write("");
            write("");

            write("static void drawPattern (MapLocation ruinLoc, int pattern) throws GameActionException {");
            ++tabs;
            write("");

            write("if (rc.getPaint() <= Constants.MIN_SOLDIER_MOVEMENT) return;");

            write("if (!rc.isActionReady()) return;");

            write("");



            write( "MapLocation myLoc = rc.getLocation();");
            write("int dx = myLoc.x - ruinLoc.x, dy = myLoc.y - ruinLoc.y;");
            write("int dencode = (dx+4)*9 + (dy+4);");

            write("int pt = switch(pattern){");
            ++tabs;
            write("case PAINT -> " + OgCodes[PAINT] + ";");
            write("case MONEY -> " + OgCodes[MONEY]+ ";");
            write("default -> " + OgCodes[DEFENSE]+ ";");
            --tabs;
            write("};");

            write("switch(dencode){");
            ++tabs;

            used = new boolean[81];

            for (int i = 0; i < 81; ++i){
                if (used[i]) continue;
                int dx = (i/9) - 4, dy = (i%9) - 4;
                if (dx*dx + dy*dy > VISION_RANGE_SQ) continue;
                //int vision = getVision(dx,dy);
                int attack = getAttack(dx,dy);
                for (int j = 0; j < 81; ++j){
                    int dxj = (j/9) - 4, dyj = (j%9) - 4;
                    if (dxj*dxj + dyj*dyj > VISION_RANGE_SQ) continue;
                    if (getAttack(dxj, dyj) == attack){
                        write("case "+ j + ":");
                        used[j] = true;
                    }
                }
                ++tabs;

                for (int j = 0; j < 24; ++j){
                    int ind = ruinLocs[j].index;
                    if (((attack >>> ind)& 1) == 0){
                        continue;
                    }

                    write("if(" + ruinLocs[j].getMapInfoName() + ".getPaint() == PaintType.EMPTY) {");
                    ++tabs;
                    //write("case EMPTY:");
                    //++tabs;

                    if (ruinLocs[j].index > 0) write("rc.attack(" + ruinLocs[j].getName() + ", ((pt >>> " + ruinLocs[j].index + ")&1) > 0);");
                    else write("rc.attack(" + ruinLocs[j].getName() + ", (pt&1) > 0);");
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




            writer.close();


        }

    }



    public static void main(String[] args){

        PatternDetector p = new PatternDetector();
        p.run();

    }

}
