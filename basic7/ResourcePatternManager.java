package basic7;
import battlecode.common.*;

public class ResourcePatternManager {


    static MapLocation l2;
    static MapInfo m2;
    static MapLocation l3;
    static MapInfo m3;
    static MapLocation l4;
    static MapInfo m4;
    static MapLocation l5;
    static MapInfo m5;
    static MapLocation l6;
    static MapInfo m6;
    static MapLocation l10;
    static MapInfo m10;
    static MapLocation l11;
    static MapInfo m11;
    static MapLocation l12;
    static MapInfo m12;
    static MapLocation l13;
    static MapInfo m13;
    static MapLocation l14;
    static MapInfo m14;
    static MapLocation l15;
    static MapInfo m15;
    static MapLocation l16;
    static MapInfo m16;
    static MapLocation l18;
    static MapInfo m18;
    static MapLocation l19;
    static MapInfo m19;
    static MapLocation l20;
    static MapInfo m20;
    static MapLocation l21;
    static MapInfo m21;
    static MapLocation l22;
    static MapInfo m22;
    static MapLocation l23;
    static MapInfo m23;
    static MapLocation l24;
    static MapInfo m24;
    static MapLocation l25;
    static MapInfo m25;
    static MapLocation l26;
    static MapInfo m26;
    static MapLocation l27;
    static MapInfo m27;
    static MapLocation l28;
    static MapInfo m28;
    static MapLocation l29;
    static MapInfo m29;
    static MapLocation l30;
    static MapInfo m30;
    static MapLocation l31;
    static MapInfo m31;
    static MapLocation l32;
    static MapInfo m32;
    static MapLocation l33;
    static MapInfo m33;
    static MapLocation l34;
    static MapInfo m34;
    static MapLocation l35;
    static MapInfo m35;
    static MapLocation l36;
    static MapInfo m36;
    static MapLocation l37;
    static MapInfo m37;
    static MapLocation l38;
    static MapInfo m38;
    static MapLocation l39;
    static MapInfo m39;
    static MapLocation l40;
    static MapInfo m40;
    static MapLocation l41;
    static MapInfo m41;
    static MapLocation l42;
    static MapInfo m42;
    static MapLocation l43;
    static MapInfo m43;
    static MapLocation l44;
    static MapInfo m44;
    static MapLocation l45;
    static MapInfo m45;
    static MapLocation l46;
    static MapInfo m46;
    static MapLocation l47;
    static MapInfo m47;
    static MapLocation l48;
    static MapInfo m48;
    static MapLocation l49;
    static MapInfo m49;
    static MapLocation l50;
    static MapInfo m50;
    static MapLocation l51;
    static MapInfo m51;
    static MapLocation l52;
    static MapInfo m52;
    static MapLocation l53;
    static MapInfo m53;
    static MapLocation l54;
    static MapInfo m54;
    static MapLocation l55;
    static MapInfo m55;
    static MapLocation l56;
    static MapInfo m56;
    static MapLocation l57;
    static MapInfo m57;
    static MapLocation l58;
    static MapInfo m58;
    static MapLocation l59;
    static MapInfo m59;
    static MapLocation l60;
    static MapInfo m60;
    static MapLocation l61;
    static MapInfo m61;
    static MapLocation l62;
    static MapInfo m62;
    static MapLocation l64;
    static MapInfo m64;
    static MapLocation l65;
    static MapInfo m65;
    static MapLocation l66;
    static MapInfo m66;
    static MapLocation l67;
    static MapInfo m67;
    static MapLocation l68;
    static MapInfo m68;
    static MapLocation l69;
    static MapInfo m69;
    static MapLocation l70;
    static MapInfo m70;
    static MapLocation l74;
    static MapInfo m74;
    static MapLocation l75;
    static MapInfo m75;
    static MapLocation l76;
    static MapInfo m76;
    static MapLocation l77;
    static MapInfo m77;
    static MapLocation l78;
    static MapInfo m78;

    static RobotController rc;

    static boolean ready;
    static boolean maxT;
    static MapLocation getBestTarget () throws GameActionException {

        rc = MyRobot.rc;
        ready = rc.isActionReady() && rc.getPaint() > 10;
        maxT = Util.towerMax();

        MapLocation myLoc = rc.getLocation();
        l2 = myLoc.translate(-4,-2);
        if (rc.canSenseLocation(l2)) m2 = rc.senseMapInfo(l2);
        l3 = myLoc.translate(-4,-1);
        if (rc.canSenseLocation(l3)) m3 = rc.senseMapInfo(l3);
        l4 = myLoc.translate(-4,0);
        if (rc.canSenseLocation(l4)) m4 = rc.senseMapInfo(l4);
        l5 = myLoc.translate(-4,1);
        if (rc.canSenseLocation(l5)) m5 = rc.senseMapInfo(l5);
        l6 = myLoc.translate(-4,2);
        if (rc.canSenseLocation(l6)) m6 = rc.senseMapInfo(l6);
        l10 = myLoc.translate(-3,-3);
        if (rc.canSenseLocation(l10)) m10 = rc.senseMapInfo(l10);
        l11 = myLoc.translate(-3,-2);
        if (rc.canSenseLocation(l11)) m11 = rc.senseMapInfo(l11);
        l12 = myLoc.translate(-3,-1);
        if (rc.canSenseLocation(l12)) m12 = rc.senseMapInfo(l12);
        l13 = myLoc.translate(-3,0);
        if (rc.canSenseLocation(l13)) m13 = rc.senseMapInfo(l13);
        l14 = myLoc.translate(-3,1);
        if (rc.canSenseLocation(l14)) m14 = rc.senseMapInfo(l14);
        l15 = myLoc.translate(-3,2);
        if (rc.canSenseLocation(l15)) m15 = rc.senseMapInfo(l15);
        l16 = myLoc.translate(-3,3);
        if (rc.canSenseLocation(l16)) m16 = rc.senseMapInfo(l16);
        l18 = myLoc.translate(-2,-4);
        if (rc.canSenseLocation(l18)) m18 = rc.senseMapInfo(l18);
        l19 = myLoc.translate(-2,-3);
        if (rc.canSenseLocation(l19)) m19 = rc.senseMapInfo(l19);
        l20 = myLoc.translate(-2,-2);
        if (rc.canSenseLocation(l20)) m20 = rc.senseMapInfo(l20);
        l21 = myLoc.translate(-2,-1);
        if (rc.canSenseLocation(l21)) m21 = rc.senseMapInfo(l21);
        l22 = myLoc.translate(-2,0);
        if (rc.canSenseLocation(l22)) m22 = rc.senseMapInfo(l22);
        l23 = myLoc.translate(-2,1);
        if (rc.canSenseLocation(l23)) m23 = rc.senseMapInfo(l23);
        l24 = myLoc.translate(-2,2);
        if (rc.canSenseLocation(l24)) m24 = rc.senseMapInfo(l24);
        l25 = myLoc.translate(-2,3);
        if (rc.canSenseLocation(l25)) m25 = rc.senseMapInfo(l25);
        l26 = myLoc.translate(-2,4);
        if (rc.canSenseLocation(l26)) m26 = rc.senseMapInfo(l26);
        l27 = myLoc.translate(-1,-4);
        if (rc.canSenseLocation(l27)) m27 = rc.senseMapInfo(l27);
        l28 = myLoc.translate(-1,-3);
        if (rc.canSenseLocation(l28)) m28 = rc.senseMapInfo(l28);
        l29 = myLoc.translate(-1,-2);
        if (rc.canSenseLocation(l29)) m29 = rc.senseMapInfo(l29);
        l30 = myLoc.translate(-1,-1);
        if (rc.canSenseLocation(l30)) m30 = rc.senseMapInfo(l30);
        l31 = myLoc.translate(-1,0);
        if (rc.canSenseLocation(l31)) m31 = rc.senseMapInfo(l31);
        l32 = myLoc.translate(-1,1);
        if (rc.canSenseLocation(l32)) m32 = rc.senseMapInfo(l32);
        l33 = myLoc.translate(-1,2);
        if (rc.canSenseLocation(l33)) m33 = rc.senseMapInfo(l33);
        l34 = myLoc.translate(-1,3);
        if (rc.canSenseLocation(l34)) m34 = rc.senseMapInfo(l34);
        l35 = myLoc.translate(-1,4);
        if (rc.canSenseLocation(l35)) m35 = rc.senseMapInfo(l35);
        l36 = myLoc.translate(0,-4);
        if (rc.canSenseLocation(l36)) m36 = rc.senseMapInfo(l36);
        l37 = myLoc.translate(0,-3);
        if (rc.canSenseLocation(l37)) m37 = rc.senseMapInfo(l37);
        l38 = myLoc.translate(0,-2);
        if (rc.canSenseLocation(l38)) m38 = rc.senseMapInfo(l38);
        l39 = myLoc.translate(0,-1);
        if (rc.canSenseLocation(l39)) m39 = rc.senseMapInfo(l39);
        l40 = myLoc.translate(0,0);
        if (rc.canSenseLocation(l40)) m40 = rc.senseMapInfo(l40);
        l41 = myLoc.translate(0,1);
        if (rc.canSenseLocation(l41)) m41 = rc.senseMapInfo(l41);
        l42 = myLoc.translate(0,2);
        if (rc.canSenseLocation(l42)) m42 = rc.senseMapInfo(l42);
        l43 = myLoc.translate(0,3);
        if (rc.canSenseLocation(l43)) m43 = rc.senseMapInfo(l43);
        l44 = myLoc.translate(0,4);
        if (rc.canSenseLocation(l44)) m44 = rc.senseMapInfo(l44);
        l45 = myLoc.translate(1,-4);
        if (rc.canSenseLocation(l45)) m45 = rc.senseMapInfo(l45);
        l46 = myLoc.translate(1,-3);
        if (rc.canSenseLocation(l46)) m46 = rc.senseMapInfo(l46);
        l47 = myLoc.translate(1,-2);
        if (rc.canSenseLocation(l47)) m47 = rc.senseMapInfo(l47);
        l48 = myLoc.translate(1,-1);
        if (rc.canSenseLocation(l48)) m48 = rc.senseMapInfo(l48);
        l49 = myLoc.translate(1,0);
        if (rc.canSenseLocation(l49)) m49 = rc.senseMapInfo(l49);
        l50 = myLoc.translate(1,1);
        if (rc.canSenseLocation(l50)) m50 = rc.senseMapInfo(l50);
        l51 = myLoc.translate(1,2);
        if (rc.canSenseLocation(l51)) m51 = rc.senseMapInfo(l51);
        l52 = myLoc.translate(1,3);
        if (rc.canSenseLocation(l52)) m52 = rc.senseMapInfo(l52);
        l53 = myLoc.translate(1,4);
        if (rc.canSenseLocation(l53)) m53 = rc.senseMapInfo(l53);
        l54 = myLoc.translate(2,-4);
        if (rc.canSenseLocation(l54)) m54 = rc.senseMapInfo(l54);
        l55 = myLoc.translate(2,-3);
        if (rc.canSenseLocation(l55)) m55 = rc.senseMapInfo(l55);
        l56 = myLoc.translate(2,-2);
        if (rc.canSenseLocation(l56)) m56 = rc.senseMapInfo(l56);
        l57 = myLoc.translate(2,-1);
        if (rc.canSenseLocation(l57)) m57 = rc.senseMapInfo(l57);
        l58 = myLoc.translate(2,0);
        if (rc.canSenseLocation(l58)) m58 = rc.senseMapInfo(l58);
        l59 = myLoc.translate(2,1);
        if (rc.canSenseLocation(l59)) m59 = rc.senseMapInfo(l59);
        l60 = myLoc.translate(2,2);
        if (rc.canSenseLocation(l60)) m60 = rc.senseMapInfo(l60);
        l61 = myLoc.translate(2,3);
        if (rc.canSenseLocation(l61)) m61 = rc.senseMapInfo(l61);
        l62 = myLoc.translate(2,4);
        if (rc.canSenseLocation(l62)) m62 = rc.senseMapInfo(l62);
        l64 = myLoc.translate(3,-3);
        if (rc.canSenseLocation(l64)) m64 = rc.senseMapInfo(l64);
        l65 = myLoc.translate(3,-2);
        if (rc.canSenseLocation(l65)) m65 = rc.senseMapInfo(l65);
        l66 = myLoc.translate(3,-1);
        if (rc.canSenseLocation(l66)) m66 = rc.senseMapInfo(l66);
        l67 = myLoc.translate(3,0);
        if (rc.canSenseLocation(l67)) m67 = rc.senseMapInfo(l67);
        l68 = myLoc.translate(3,1);
        if (rc.canSenseLocation(l68)) m68 = rc.senseMapInfo(l68);
        l69 = myLoc.translate(3,2);
        if (rc.canSenseLocation(l69)) m69 = rc.senseMapInfo(l69);
        l70 = myLoc.translate(3,3);
        if (rc.canSenseLocation(l70)) m70 = rc.senseMapInfo(l70);
        l74 = myLoc.translate(4,-2);
        if (rc.canSenseLocation(l74)) m74 = rc.senseMapInfo(l74);
        l75 = myLoc.translate(4,-1);
        if (rc.canSenseLocation(l75)) m75 = rc.senseMapInfo(l75);
        l76 = myLoc.translate(4,0);
        if (rc.canSenseLocation(l76)) m76 = rc.senseMapInfo(l76);
        l77 = myLoc.translate(4,1);
        if (rc.canSenseLocation(l77)) m77 = rc.senseMapInfo(l77);
        l78 = myLoc.translate(4,2);
        if (rc.canSenseLocation(l78)) m78 = rc.senseMapInfo(l78);

        int dx = myLoc.x%5, dy = myLoc.y%5;
        int dencode = dx*5 + dy;
        switch(dencode){
            case 0:
                return process0();
            case 1:
                return process1();
            case 2:
                return process2();
            case 3:
                return process3();
            case 4:
                return process4();
            case 5:
                return process5();
            case 6:
                return process6();
            case 7:
                return process7();
            case 8:
                return process8();
            case 9:
                return process9();
            case 10:
                return process10();
            case 11:
                return process11();
            case 12:
                return process12();
            case 13:
                return process13();
            case 14:
                return process14();
            case 15:
                return process15();
            case 16:
                return process16();
            case 17:
                return process17();
            case 18:
                return process18();
            case 19:
                return process19();
            case 20:
                return process20();
            case 21:
                return process21();
            case 22:
                return process22();
            case 23:
                return process23();
            case 24:
                return process24();
        }
        return null;
    }


    static MapLocation process0() throws GameActionException { // (0,0)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                else return ans;
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process1() throws GameActionException { // (0,1)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process2() throws GameActionException { // (0,2)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process3() throws GameActionException { // (0,3)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process4() throws GameActionException { // (0,4)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                else return ans;
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process5() throws GameActionException { // (1,0)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process6() throws GameActionException { // (1,1)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process7() throws GameActionException { // (1,2)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process8() throws GameActionException { // (1,3)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process9() throws GameActionException { // (1,4)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                if (ready){
                    rc.attack(l67, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process10() throws GameActionException { // (2,0)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process11() throws GameActionException { // (2,1)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process12() throws GameActionException { // (2,2)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                if (ready){
                    rc.attack(l60, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process13() throws GameActionException { // (2,3)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                if (ready){
                    rc.attack(l59, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process14() throws GameActionException { // (2,4)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                if (ready){
                    rc.attack(l58, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                if (ready){
                    rc.attack(l57, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                if (ready){
                    rc.attack(l56, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process15() throws GameActionException { // (3,0)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !basic7.Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !basic7.Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !basic7.Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !basic7.Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !basic7.Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !basic7.Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !basic7.Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !basic7.Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process16() throws GameActionException { // (3,1)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !basic7.Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !basic7.Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !basic7.Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !basic7.Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !basic7.Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !basic7.Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !basic7.Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !basic7.Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !basic7.Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !basic7.Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !basic7.Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !basic7.Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !basic7.Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !basic7.Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !basic7.Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !basic7.Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !basic7.Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !basic7.Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !basic7.Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !basic7.Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !basic7.Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !basic7.Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !basic7.Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !basic7.Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !basic7.Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !basic7.Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !basic7.Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !basic7.Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !basic7.Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !basic7.Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !basic7.Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !basic7.Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !basic7.Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !basic7.Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !basic7.Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !basic7.Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !basic7.Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !basic7.Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !basic7.Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !basic7.Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !basic7.Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !basic7.Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !basic7.Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !basic7.Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !basic7.Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !basic7.Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !basic7.Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !basic7.Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !basic7.Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !basic7.Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !basic7.Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !basic7.Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !basic7.Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !basic7.Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !basic7.Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !basic7.Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !basic7.Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !basic7.Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !basic7.Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !basic7.Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !basic7.Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process17() throws GameActionException { // (3,2)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                if (ready){
                    rc.attack(l51, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process18() throws GameActionException { // (3,3)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                if (ready){
                    rc.attack(l50, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process19() throws GameActionException { // (3,4)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                if (ready){
                    rc.attack(l49, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                if (ready){
                    rc.attack(l48, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                if (ready){
                    rc.attack(l47, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process20() throws GameActionException { // (4,0)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                else return ans;
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process21() throws GameActionException { // (4,1)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                if (ready){
                    rc.attack(l43, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                else return ans;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process22() throws GameActionException { // (4,2)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                if (ready){
                    rc.attack(l42, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                if (ready){
                    rc.attack(l33, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                if (ready){
                    rc.attack(l24, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l14;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l5;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process23() throws GameActionException { // (4,3)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                if (ready){
                    rc.attack(l41, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                if (ready){
                    rc.attack(l32, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                if (ready){
                    rc.attack(l23, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l12;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l28;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l11;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l19;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l4;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l3;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l10;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l2;
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l49;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        return ans;
    }


    static MapLocation process24() throws GameActionException { // (4,4)
        MapLocation ans = null;
        if (rc.onTheMap(l40) && !m40.isWall() && !m40.hasRuin() && (maxT || !Map.isNearRuin(l40))){ // (0,0)
            PaintType p = m40.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l40;
                if (ready){
                    rc.attack(l40, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l31) && !m31.isWall() && !m31.hasRuin() && (maxT || !Map.isNearRuin(l31))){ // (-1,0)
            PaintType p = m31.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l31;
                if (ready){
                    rc.attack(l31, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l39) && !m39.isWall() && !m39.hasRuin() && (maxT || !Map.isNearRuin(l39))){ // (0,-1)
            PaintType p = m39.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l39;
                if (ready){
                    rc.attack(l39, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l30) && !m30.isWall() && !m30.hasRuin() && (maxT || !Map.isNearRuin(l30))){ // (-1,-1)
            PaintType p = m30.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l30;
                if (ready){
                    rc.attack(l30, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l22) && !m22.isWall() && !m22.hasRuin() && (maxT || !Map.isNearRuin(l22))){ // (-2,0)
            PaintType p = m22.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l22;
                if (ready){
                    rc.attack(l22, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l38) && !m38.isWall() && !m38.hasRuin() && (maxT || !Map.isNearRuin(l38))){ // (0,-2)
            PaintType p = m38.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l38;
                if (ready){
                    rc.attack(l38, true);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l21) && !m21.isWall() && !m21.hasRuin() && (maxT || !Map.isNearRuin(l21))){ // (-2,-1)
            PaintType p = m21.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l21;
                if (ready){
                    rc.attack(l21, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l29) && !m29.isWall() && !m29.hasRuin() && (maxT || !Map.isNearRuin(l29))){ // (-1,-2)
            PaintType p = m29.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l29;
                if (ready){
                    rc.attack(l29, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l20) && !m20.isWall() && !m20.hasRuin() && (maxT || !Map.isNearRuin(l20))){ // (-2,-2)
            PaintType p = m20.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l20;
                if (ready){
                    rc.attack(l20, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l13) && !m13.isWall() && !m13.hasRuin() && (maxT || !Map.isNearRuin(l13))){ // (-3,0)
            PaintType p = m13.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l13;
                if (ready){
                    rc.attack(l13, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l37) && !m37.isWall() && !m37.hasRuin() && (maxT || !Map.isNearRuin(l37))){ // (0,-3)
            PaintType p = m37.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l37;
                if (ready){
                    rc.attack(l37, false);
                    ready = false;
                }
            }
        }
        if (rc.onTheMap(l12) && !m12.isWall() && !m12.hasRuin() && (maxT || !Map.isNearRuin(l12))){ // (-3,-1)
            PaintType p = m12.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l12;
            }
        }
        if (rc.onTheMap(l28) && !m28.isWall() && !m28.hasRuin() && (maxT || !Map.isNearRuin(l28))){ // (-1,-3)
            PaintType p = m28.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l28;
            }
        }
        if (rc.onTheMap(l11) && !m11.isWall() && !m11.hasRuin() && (maxT || !Map.isNearRuin(l11))){ // (-3,-2)
            PaintType p = m11.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l11;
            }
        }
        if (rc.onTheMap(l19) && !m19.isWall() && !m19.hasRuin() && (maxT || !Map.isNearRuin(l19))){ // (-2,-3)
            PaintType p = m19.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l19;
            }
        }
        if (rc.onTheMap(l4) && !m4.isWall() && !m4.hasRuin() && (maxT || !Map.isNearRuin(l4))){ // (-4,0)
            PaintType p = m4.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l4;
            }
        }
        if (rc.onTheMap(l36) && !m36.isWall() && !m36.hasRuin() && (maxT || !Map.isNearRuin(l36))){ // (0,-4)
            PaintType p = m36.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l36;
            }
        }
        if (rc.onTheMap(l3) && !m3.isWall() && !m3.hasRuin() && (maxT || !Map.isNearRuin(l3))){ // (-4,-1)
            PaintType p = m3.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l3;
            }
        }
        if (rc.onTheMap(l27) && !m27.isWall() && !m27.hasRuin() && (maxT || !Map.isNearRuin(l27))){ // (-1,-4)
            PaintType p = m27.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l27;
            }
        }
        if (rc.onTheMap(l10) && !m10.isWall() && !m10.hasRuin() && (maxT || !Map.isNearRuin(l10))){ // (-3,-3)
            PaintType p = m10.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l10;
            }
        }
        if (rc.onTheMap(l2) && !m2.isWall() && !m2.hasRuin() && (maxT || !Map.isNearRuin(l2))){ // (-4,-2)
            PaintType p = m2.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l2;
            }
        }
        if (rc.onTheMap(l18) && !m18.isWall() && !m18.hasRuin() && (maxT || !Map.isNearRuin(l18))){ // (-2,-4)
            PaintType p = m18.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l18;
            }
        }
        if (rc.onTheMap(l41) && !m41.isWall() && !m41.hasRuin() && (maxT || !Map.isNearRuin(l41))){ // (0,1)
            PaintType p = m41.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l41;
                else return ans;
            }
        }
        if (rc.onTheMap(l49) && !m49.isWall() && !m49.hasRuin() && (maxT || !Map.isNearRuin(l49))){ // (1,0)
            PaintType p = m49.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l49;
                else return ans;
            }
        }
        if (rc.onTheMap(l32) && !m32.isWall() && !m32.hasRuin() && (maxT || !Map.isNearRuin(l32))){ // (-1,1)
            PaintType p = m32.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l32;
                else return ans;
            }
        }
        if (rc.onTheMap(l48) && !m48.isWall() && !m48.hasRuin() && (maxT || !Map.isNearRuin(l48))){ // (1,-1)
            PaintType p = m48.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l48;
                else return ans;
            }
        }
        if (rc.onTheMap(l50) && !m50.isWall() && !m50.hasRuin() && (maxT || !Map.isNearRuin(l50))){ // (1,1)
            PaintType p = m50.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l50;
                else return ans;
            }
        }
        if (rc.onTheMap(l42) && !m42.isWall() && !m42.hasRuin() && (maxT || !Map.isNearRuin(l42))){ // (0,2)
            PaintType p = m42.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l42;
                else return ans;
            }
        }
        if (rc.onTheMap(l58) && !m58.isWall() && !m58.hasRuin() && (maxT || !Map.isNearRuin(l58))){ // (2,0)
            PaintType p = m58.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l58;
                else return ans;
            }
        }
        if (rc.onTheMap(l23) && !m23.isWall() && !m23.hasRuin() && (maxT || !Map.isNearRuin(l23))){ // (-2,1)
            PaintType p = m23.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l23;
                else return ans;
            }
        }
        if (rc.onTheMap(l33) && !m33.isWall() && !m33.hasRuin() && (maxT || !Map.isNearRuin(l33))){ // (-1,2)
            PaintType p = m33.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l33;
                else return ans;
            }
        }
        if (rc.onTheMap(l47) && !m47.isWall() && !m47.hasRuin() && (maxT || !Map.isNearRuin(l47))){ // (1,-2)
            PaintType p = m47.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l47;
                else return ans;
            }
        }
        if (rc.onTheMap(l51) && !m51.isWall() && !m51.hasRuin() && (maxT || !Map.isNearRuin(l51))){ // (1,2)
            PaintType p = m51.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l51;
                else return ans;
            }
        }
        if (rc.onTheMap(l57) && !m57.isWall() && !m57.hasRuin() && (maxT || !Map.isNearRuin(l57))){ // (2,-1)
            PaintType p = m57.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l57;
                else return ans;
            }
        }
        if (rc.onTheMap(l59) && !m59.isWall() && !m59.hasRuin() && (maxT || !Map.isNearRuin(l59))){ // (2,1)
            PaintType p = m59.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l59;
                else return ans;
            }
        }
        if (rc.onTheMap(l24) && !m24.isWall() && !m24.hasRuin() && (maxT || !Map.isNearRuin(l24))){ // (-2,2)
            PaintType p = m24.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l24;
                else return ans;
            }
        }
        if (rc.onTheMap(l56) && !m56.isWall() && !m56.hasRuin() && (maxT || !Map.isNearRuin(l56))){ // (2,-2)
            PaintType p = m56.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l56;
                else return ans;
            }
        }
        if (rc.onTheMap(l60) && !m60.isWall() && !m60.hasRuin() && (maxT || !Map.isNearRuin(l60))){ // (2,2)
            PaintType p = m60.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l60;
                else return ans;
            }
        }
        if (rc.onTheMap(l43) && !m43.isWall() && !m43.hasRuin() && (maxT || !Map.isNearRuin(l43))){ // (0,3)
            PaintType p = m43.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l43;
                else return ans;
            }
        }
        if (rc.onTheMap(l67) && !m67.isWall() && !m67.hasRuin() && (maxT || !Map.isNearRuin(l67))){ // (3,0)
            PaintType p = m67.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l67;
                else return ans;
            }
        }
        if (rc.onTheMap(l14) && !m14.isWall() && !m14.hasRuin() && (maxT || !Map.isNearRuin(l14))){ // (-3,1)
            PaintType p = m14.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l14;
                else return ans;
            }
        }
        if (rc.onTheMap(l34) && !m34.isWall() && !m34.hasRuin() && (maxT || !Map.isNearRuin(l34))){ // (-1,3)
            PaintType p = m34.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l34;
                else return ans;
            }
        }
        if (rc.onTheMap(l46) && !m46.isWall() && !m46.hasRuin() && (maxT || !Map.isNearRuin(l46))){ // (1,-3)
            PaintType p = m46.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l46;
                else return ans;
            }
        }
        if (rc.onTheMap(l52) && !m52.isWall() && !m52.hasRuin() && (maxT || !Map.isNearRuin(l52))){ // (1,3)
            PaintType p = m52.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l52;
                else return ans;
            }
        }
        if (rc.onTheMap(l66) && !m66.isWall() && !m66.hasRuin() && (maxT || !Map.isNearRuin(l66))){ // (3,-1)
            PaintType p = m66.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l66;
                else return ans;
            }
        }
        if (rc.onTheMap(l68) && !m68.isWall() && !m68.hasRuin() && (maxT || !Map.isNearRuin(l68))){ // (3,1)
            PaintType p = m68.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l68;
                else return ans;
            }
        }
        if (rc.onTheMap(l15) && !m15.isWall() && !m15.hasRuin() && (maxT || !Map.isNearRuin(l15))){ // (-3,2)
            PaintType p = m15.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l15;
                else return ans;
            }
        }
        if (rc.onTheMap(l25) && !m25.isWall() && !m25.hasRuin() && (maxT || !Map.isNearRuin(l25))){ // (-2,3)
            PaintType p = m25.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l25;
                else return ans;
            }
        }
        if (rc.onTheMap(l55) && !m55.isWall() && !m55.hasRuin() && (maxT || !Map.isNearRuin(l55))){ // (2,-3)
            PaintType p = m55.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l55;
                else return ans;
            }
        }
        if (rc.onTheMap(l61) && !m61.isWall() && !m61.hasRuin() && (maxT || !Map.isNearRuin(l61))){ // (2,3)
            PaintType p = m61.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l61;
                else return ans;
            }
        }
        if (rc.onTheMap(l65) && !m65.isWall() && !m65.hasRuin() && (maxT || !Map.isNearRuin(l65))){ // (3,-2)
            PaintType p = m65.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l65;
                else return ans;
            }
        }
        if (rc.onTheMap(l69) && !m69.isWall() && !m69.hasRuin() && (maxT || !Map.isNearRuin(l69))){ // (3,2)
            PaintType p = m69.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l69;
                else return ans;
            }
        }
        if (rc.onTheMap(l44) && !m44.isWall() && !m44.hasRuin() && (maxT || !Map.isNearRuin(l44))){ // (0,4)
            PaintType p = m44.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l44;
                else return ans;
            }
        }
        if (rc.onTheMap(l76) && !m76.isWall() && !m76.hasRuin() && (maxT || !Map.isNearRuin(l76))){ // (4,0)
            PaintType p = m76.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l76;
                else return ans;
            }
        }
        if (rc.onTheMap(l5) && !m5.isWall() && !m5.hasRuin() && (maxT || !Map.isNearRuin(l5))){ // (-4,1)
            PaintType p = m5.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l5;
                else return ans;
            }
        }
        if (rc.onTheMap(l35) && !m35.isWall() && !m35.hasRuin() && (maxT || !Map.isNearRuin(l35))){ // (-1,4)
            PaintType p = m35.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l35;
                else return ans;
            }
        }
        if (rc.onTheMap(l45) && !m45.isWall() && !m45.hasRuin() && (maxT || !Map.isNearRuin(l45))){ // (1,-4)
            PaintType p = m45.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l45;
                else return ans;
            }
        }
        if (rc.onTheMap(l53) && !m53.isWall() && !m53.hasRuin() && (maxT || !Map.isNearRuin(l53))){ // (1,4)
            PaintType p = m53.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l53;
                else return ans;
            }
        }
        if (rc.onTheMap(l75) && !m75.isWall() && !m75.hasRuin() && (maxT || !Map.isNearRuin(l75))){ // (4,-1)
            PaintType p = m75.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l75;
                else return ans;
            }
        }
        if (rc.onTheMap(l77) && !m77.isWall() && !m77.hasRuin() && (maxT || !Map.isNearRuin(l77))){ // (4,1)
            PaintType p = m77.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l77;
                else return ans;
            }
        }
        if (rc.onTheMap(l16) && !m16.isWall() && !m16.hasRuin() && (maxT || !Map.isNearRuin(l16))){ // (-3,3)
            PaintType p = m16.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l16;
                else return ans;
            }
        }
        if (rc.onTheMap(l64) && !m64.isWall() && !m64.hasRuin() && (maxT || !Map.isNearRuin(l64))){ // (3,-3)
            PaintType p = m64.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l64;
                else return ans;
            }
        }
        if (rc.onTheMap(l70) && !m70.isWall() && !m70.hasRuin() && (maxT || !Map.isNearRuin(l70))){ // (3,3)
            PaintType p = m70.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l70;
                else return ans;
            }
        }
        if (rc.onTheMap(l6) && !m6.isWall() && !m6.hasRuin() && (maxT || !Map.isNearRuin(l6))){ // (-4,2)
            PaintType p = m6.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l6;
                else return ans;
            }
        }
        if (rc.onTheMap(l26) && !m26.isWall() && !m26.hasRuin() && (maxT || !Map.isNearRuin(l26))){ // (-2,4)
            PaintType p = m26.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l26;
                else return ans;
            }
        }
        if (rc.onTheMap(l54) && !m54.isWall() && !m54.hasRuin() && (maxT || !Map.isNearRuin(l54))){ // (2,-4)
            PaintType p = m54.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l54;
                else return ans;
            }
        }
        if (rc.onTheMap(l62) && !m62.isWall() && !m62.hasRuin() && (maxT || !Map.isNearRuin(l62))){ // (2,4)
            PaintType p = m62.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l62;
                else return ans;
            }
        }
        if (rc.onTheMap(l74) && !m74.isWall() && !m74.hasRuin() && (maxT || !Map.isNearRuin(l74))){ // (4,-2)
            PaintType p = m74.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_PRIMARY){
                if (ans == null) ans = l74;
                else return ans;
            }
        }
        if (rc.onTheMap(l78) && !m78.isWall() && !m78.hasRuin() && (maxT || !Map.isNearRuin(l78))){ // (4,2)
            PaintType p = m78.getPaint();
            if (p.isEnemy() || p != PaintType.ALLY_SECONDARY){
                if (ans == null) ans = l78;
                else return ans;
            }
        }
        return ans;
    }
}
