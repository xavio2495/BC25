package resourcepatterndetector;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    static final int VISION_RANGE_SQ = 20;

    static final int ATTACK_RANGE_SQ = 9;

    static final String filename = "ResourcePattern.txt";


    static final int code = 5147;

    static CustomLoc center;


    final static int[] diffX = new int[]{0,1,0,-1,0,1,1,-1,-1,2,0,-2,0};
    final static int[] diffY = new int[]{0,0,1,0,-1,1,-1,-1,1,0,2,0,-2};


    //static int DX, DY;

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
            return Integer.compare(dist(center.dx, center.dy), c.dist(center.dx,center.dy));
        }

        boolean getPaintBit(){
            int cx = (dx - center.dx + 6)%4, cy = (dy - center.dy + 6)%4;
            int c = cx * 4 + cy;
            return (((code >>> c) & 1) >0);

        }

        boolean isCenter(int myX, int myY){
            int cx = (dx + myX + 4)%4, cy = (dy + myY + 4)%4;
            //return !((cx+cy)%2 == 0 || (cx + cy*7)%10 == 1);
            int c = cx * 4 + cy;
            return cx == 2 && cy == 2;
        }

        /*boolean isOtherQuadrant(){
            int cx = dx + Main.dx, cy = dy + Main.dy;
            return (cx < 0 || cx >= 5 || cy < 0 || cy >= 5);
        }*/
    }

    static String getPaint(int dx, int dy){
        int c = ((dx+4)%4)*4 + (dy+4)%4;
        if ((((code >>> c) & 1) >0)) {
            return "PaintType.ALLY_SECONDARY";
        }
        return "PaintType.ALLY_PRIMARY";
    }

    static class PatternDetector{

        static final int UNSEEN = 3;
        static final int ENEMY_PAINT = 4;

        static long newcode = 0;

        static String newCodeName = "ResCodeExtended";

        static ArrayList<CustomLoc> ruinLocs = new ArrayList<>();
        static ArrayList<CustomLoc> fiveByfive = new ArrayList<>();

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
            for (int i = -2; i <= 2; ++i){
                for (int j = -2; j <= 2; ++j){
                    CustomLoc cl = new CustomLoc(i,j);
                    //if (cl.dist(0,0) > VISION_RANGE_SQ) continue;
                    fiveByfive.add(cl);
                }
            }
        }


        String getPaintType(boolean x){
            if (x) return "ALLY_SECONDARY";
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

        CustomLoc getBestCustomLoc(CustomLoc A, CustomLoc C){
            CustomLoc bestLoc = A;
            for (int i = 0; i < ruinLocs.size(); ++i){
                CustomLoc cl = ruinLocs.get(i);
                if (cl.dist(A.dx, A.dy) <= 4 && cl.dist(C.dx, C.dy) < bestLoc.dist(C.dx, C.dy)) bestLoc = cl;
            }
            return bestLoc;
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
            write("static MapLocation ans;");
            write("static MapLocation myLoc;");
            write("static MapLocation attackLoc;");
            write("static MapLocation center;");
            write("static PaintType p;");
            write("static int paintPositions;");

            write("");
            write("");


            /* ================================== CHECK PATTERN =============================== */
            write("static MapLocation getBestTarget () throws GameActionException {");
            ++tabs;
            write("");
            write("rc = MyRobot.rc;");
            write("ready = rc.isActionReady() && rc.getPaint() > 10;");
            write("maxT = Util.towerMax();");
            write("");
            write("myLoc = rc.getLocation();");
            for (int i = 0; i < ruinLocs.size(); ++i){
                write(ruinLocs.get(i).getName() + " = myLoc.translate(" + ruinLocs.get(i).dx + "," + ruinLocs.get(i).dy + ");");
                write("if (rc.canSenseLocation(" + ruinLocs.get(i).getName() + ")) " + ruinLocs.get(i).getMapInfoName() + " = " + "rc.senseMapInfo(" + ruinLocs.get(i).getName() + ");");
            }

            write("");

            write("int dx = myLoc.x%4, dy = myLoc.y%4;");
            write("int dencode = dx*4 + dy;");
            write("ans = null;");

            write("switch(dencode){");
            ++tabs;

            center = new CustomLoc(0,0);
            Collections.sort(ruinLocs);

            //ArrayList<Integer> methods = new ArrayList<>();

            for (int i = 0; i < 16; ++i){
                write("case " + i  + ":");
                ++tabs;
                for (int x = 0; x < ruinLocs.size(); ++x){
                    if (ruinLocs.get(x).isCenter(i/4, i%4)
                            //&& ruinLocs.get(x).dist(0,0) <= 8
                    ){
                        write("checkCenterAt" + x + "();");
                        write("if (ans != null) return ans;");
                        //methods.add(x*100+i);
                    }
                }
                write("break;");

                //write("return process" + i + "();");
                --tabs;
            }
            --tabs;
            write("}");
            write("return null;");
            --tabs;
            write("}");
            write("");
            write("");

            ArrayList<CustomLoc> newRuins = new ArrayList<>(ruinLocs);

            /*================================= CENTERS =================================*/

            //for (int z = 0; z < methods.size(); ++z){
            for (int z = 0; z < newRuins.size(); ++z){
                //int code = methods.get(z);
                //int i = code %100;
                //int x = code /100;
                center = newRuins.get(z);
                Collections.sort(ruinLocs);
                //Main.DX = (6 - center.dx)%4;
                //Main.DY = (6 - center.dy)%4;
                write("static void checkCenterAt" + z + "() throws GameActionException {" + " // (" + center.dx + "," + center.dy + ")");
                ++tabs;
                write ("center = myLoc.translate(" + center.dx + "," + center.dy + ");");
                write ("attackLoc = null;");
                write ("if (Map.forbiddenCenter(center)) return;");

                for (int j = 0; j < ruinLocs.size(); ++j){
                    CustomLoc cl = ruinLocs.get(j);
                    if (cl.dist(center.dx, center.dy) > 8) continue;
                    write("if (!"  + cl.getMapInfoName() + ".isPassable()){ // (" + cl.dx + "," + cl.dy + ")");
                    ++tabs;
                    write("ans = null;");
                    write("Map.markObstructed(" + center.getName() + ");");
                    write("return;");
                    --tabs;
                    write("}");
                    write("p = " + cl.getMapInfoName() + ".getPaint();");
                    write("if ( Map.isNearRuin("  + cl.getName() + ") && !maxT || p.isEnemy()){");
                    ++tabs;
                    write("Map.markCenterNearRuins(" + center.getName() + ");");

                    write("ans = null;");
                    write("return;");
                    --tabs;
                    write("}");
                    CustomLoc bc = getBestCustomLoc(cl, center);
                    write("if (p != PaintType." + getPaintType(cl.getPaintBit()) + "){");
                    ++tabs;
                    write("ans = " + bc.getName() + "; // (" + bc.dx + "," + bc.dy + ")");
                    if (cl.dist(0,0) <= 4) write("attackLoc = " + cl.getName() + ";");
                    --tabs;
                    write("}");
                    write("");
                    write("");
                    //++tabs;
                    //write("ans = " + bc.getName() + "; // (" + bc.dx + "," + bc.dy + ")");
                    //--tabs;
                    //write("}");
                }
                --tabs;
                write("}");
                write("");
            }


            /*================================ CHECK DRAWABILITY =================================================*/
            write("");
            write("");
            write("");
            write("static boolean shouldPaint (MapLocation loc) throws GameActionException {");

            ++tabs;
            write("switch((loc.x*4 + (loc.y%4))%16){");
            ++tabs;
            for (int i = 0; i < 16; ++i){
                int dx = i/4, dy = i%4;
                write("case "+ i + ":");
                ++tabs;
                int[] ddx = switch(dx){
                    case 0 -> new int[]{-2,2};
                    case 1-> new int[]{1};
                    case 2-> new int[]{0};
                    default -> new int[]{-1};
                };
                int[] ddy = switch(dy){
                    case 0 -> new int[]{-2,2};
                    case 1-> new int[]{1};
                    case 2-> new int[]{0};
                    default -> new int[]{-1};
                };
                for (int xx = 0; xx < ddx.length; ++xx){
                    for (int yy = 0; yy < ddy.length; ++yy){
                        write("if (!Map.forbiddenCenter(loc.translate("+ddx[xx]+","+ddy[yy] + "))) return true;");
                    }
                }
                //write("return false;");
                write("break;");
                --tabs;
            }
            --tabs;
            write("}");

            write("return false;");

            --tabs;
            write("}");



            /*=========================================== CHECK CENTERS ============================================*/
            write("");
            write("");
            write("");
            write("static void completePatterns () throws GameActionException {");

            ++tabs;
            write("MapLocation loc = rc.getLocation();");
            write("switch((loc.x*4 + (loc.y%4))%16){");
            ++tabs;
            for (int i = 0; i < 16; ++i){
                int dx = i/4, dy = i%4;
                write("case "+ i + ":");
                ++tabs;
                int[] ddx = switch(dx){
                    case 0 -> new int[]{-2,2};
                    case 1-> new int[]{1};
                    case 2-> new int[]{0};
                    default -> new int[]{-1};
                };
                int[] ddy = switch(dy){
                    case 0 -> new int[]{-2,2};
                    case 1-> new int[]{1};
                    case 2-> new int[]{0};
                    default -> new int[]{-1};
                };
                for (int xx = 0; xx < ddx.length; ++xx){
                    for (int yy = 0; yy < ddy.length; ++yy){
                        write("if (rc.canCompleteResourcePattern(loc.translate("+ddx[xx]+","+ddy[yy] + "))) rc.completeResourcePattern(loc.translate("+ddx[xx] + "," + ddy[yy] + "));");
                    }
                }
                //write("return false;");
                write("break;");
                --tabs;
            }
            --tabs;
            write("}");

            //write("return false");

            --tabs;
            write("}");


            /*=========================================== CHECK PAINTINGLOCS ============================================*/
            write("");
            write("");
            write("");
            write("static void paintNearby () throws GameActionException {");

            ++tabs;
            write("paintPositions = 0;");
            write("MapLocation l0 = rc.getLocation();");
            for (int i = 1; i < 13; ++i){
                write("MapLocation l" + i + " = l0.translate(" + diffX[i] + "," + diffY[i] + ");");
            }
            write("");
            write("int code = (l0.x*4 + (l0.y%4))%16;");
            write("switch(code){");
            ++tabs;
            for (int i = 0; i < 16; ++i){
                int dx = i/4, dy = i%4;
                write("case " + i + ":");
                ++tabs;

                HashMap<Integer, Integer> centerToLoc = new HashMap<>();
                for (int j = 0; j < 13; ++j){
                    int iX = diffX[j], iY = diffY[j];
                    int[] ddx = switch((dx + iX + 4)%4){
                        case 0 -> new int[]{-2,2};
                        case 1-> new int[]{1};
                        case 2-> new int[]{0};
                        default -> new int[]{-1};
                    };
                    int[] ddy = switch((dy + iY + 4)%4){
                        case 0 -> new int[]{-2,2};
                        case 1-> new int[]{1};
                        case 2-> new int[]{0};
                        default -> new int[]{-1};
                    };
                    for (int xx = 0; xx < ddx.length; ++xx){
                        for (int yy = 0; yy < ddy.length; ++yy){
                            int trueDifX = iX + ddx[xx], trueDifY = iY + ddy[yy];
                            int key = (trueDifX + 10)* 100 + (trueDifY + 10);
                            if (!centerToLoc.containsKey(key)) centerToLoc.put(key, 0);
                            centerToLoc.put(key, (centerToLoc.get(key) | (1 << j)));
                        }
                    }
                }
                for (Integer key : centerToLoc.keySet()){
                    int trueDifX = key/100 - 10, trueDifY = (key%100) - 10;
                    int sol = centerToLoc.get(key);
                    write("if (!Map.forbiddenCenter(l0.translate(" + trueDifX + "," + trueDifY+ "))) { paintPositions |= " + sol + "; rc.setIndicatorDot(l0.translate(" + trueDifX + "," + trueDifY + "), 0, 200, 0);}");
                }
                write("if (((paintPositions & 1) != 0) && Soldier.tryPaint(l0, " + getPaint(dx, dy) + ")) return;");
                write("if (ResourcePatternManager.attackLoc != null) {");
                ++tabs;
                write("int dx = ResourcePatternManager.attackLoc.x - l0.x, dy = ResourcePatternManager.attackLoc.y - l0.y;");
                write("switch (dx){");
                ++tabs;
                for (int dxi = -2; dxi <= 2; ++dxi){
                    write("case " + dxi + ":");
                    ++tabs;
                    write("switch(dy){");
                    ++tabs;
                    for (int dyi = -2; dyi <= 2; ++dyi){
                        for (int o = 1; o < 13; ++o){
                            if (dxi == diffX[o] && dyi == diffY[o]){
                                write("case " + dyi + ":");
                                ++tabs;
                                write("if (((paintPositions & " + (1 << o)  + ") != 0) && Soldier.tryPaint(l" + o + ", " + getPaint(dx + diffX[o], dy + diffY[o]) + ")) return;");
                                write("break;");
                                --tabs;
                            }
                        }
                    }
                    --tabs;
                    write("}");
                    write("break;");
                    --tabs;
                }
                --tabs;
                write("}");
                --tabs;
                write("}");

                for (int o = 1; o < 13; ++o){
                    write("if (((paintPositions & " + (1 << o)  + ") != 0) && Soldier.tryPaint(l" + o + ", " + getPaint(dx + diffX[o], dy + diffY[o]) + ")) return;");
                }
                write("break;");
                --tabs;
                //write("}");
            }
            --tabs;
            write("}");

            //write("return false");

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
