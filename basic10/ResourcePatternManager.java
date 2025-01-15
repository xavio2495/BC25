package basic10;
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
    static MapLocation ans;
    static MapLocation myLoc;
    static MapLocation attackLoc;
    static MapLocation center;
    static PaintType p;
    static MapLocation getBestTarget () throws GameActionException {

        rc = MyRobot.rc;
        ready = rc.isActionReady() && rc.getPaint() > 10;
        maxT = Util.towerMax();

        myLoc = rc.getLocation();
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

        int dx = myLoc.x%4, dy = myLoc.y%4;
        int dencode = dx*4 + dy;
        ans = null;
        switch(dencode){
            case 0:
                checkCenterAt21();
                if (ans != null) return ans;
                checkCenterAt22();
                if (ans != null) return ans;
                checkCenterAt23();
                if (ans != null) return ans;
                checkCenterAt24();
                if (ans != null) return ans;
                break;
            case 1:
                checkCenterAt14();
                if (ans != null) return ans;
                checkCenterAt20();
                if (ans != null) return ans;
                checkCenterAt39();
                if (ans != null) return ans;
                checkCenterAt41();
                if (ans != null) return ans;
                break;
            case 2:
                checkCenterAt9();
                if (ans != null) return ans;
                checkCenterAt12();
                if (ans != null) return ans;
                checkCenterAt63();
                if (ans != null) return ans;
                checkCenterAt64();
                if (ans != null) return ans;
                checkCenterAt65();
                if (ans != null) return ans;
                checkCenterAt66();
                if (ans != null) return ans;
                break;
            case 3:
                checkCenterAt13();
                if (ans != null) return ans;
                checkCenterAt19();
                if (ans != null) return ans;
                checkCenterAt40();
                if (ans != null) return ans;
                checkCenterAt42();
                if (ans != null) return ans;
                break;
            case 4:
                checkCenterAt17();
                if (ans != null) return ans;
                checkCenterAt18();
                if (ans != null) return ans;
                checkCenterAt37();
                if (ans != null) return ans;
                checkCenterAt38();
                if (ans != null) return ans;
                break;
            case 5:
                checkCenterAt8();
                if (ans != null) return ans;
                checkCenterAt30();
                if (ans != null) return ans;
                checkCenterAt33();
                if (ans != null) return ans;
                checkCenterAt57();
                if (ans != null) return ans;
                break;
            case 6:
                checkCenterAt4();
                if (ans != null) return ans;
                checkCenterAt25();
                if (ans != null) return ans;
                checkCenterAt53();
                if (ans != null) return ans;
                checkCenterAt54();
                if (ans != null) return ans;
                break;
            case 7:
                checkCenterAt7();
                if (ans != null) return ans;
                checkCenterAt29();
                if (ans != null) return ans;
                checkCenterAt34();
                if (ans != null) return ans;
                checkCenterAt58();
                if (ans != null) return ans;
                break;
            case 8:
                checkCenterAt10();
                if (ans != null) return ans;
                checkCenterAt11();
                if (ans != null) return ans;
                checkCenterAt61();
                if (ans != null) return ans;
                checkCenterAt62();
                if (ans != null) return ans;
                checkCenterAt67();
                if (ans != null) return ans;
                checkCenterAt68();
                if (ans != null) return ans;
                break;
            case 9:
                checkCenterAt3();
                if (ans != null) return ans;
                checkCenterAt26();
                if (ans != null) return ans;
                checkCenterAt50();
                if (ans != null) return ans;
                checkCenterAt56();
                if (ans != null) return ans;
                break;
            case 10:
                checkCenterAt0();
                if (ans != null) return ans;
                checkCenterAt45();
                if (ans != null) return ans;
                checkCenterAt46();
                if (ans != null) return ans;
                checkCenterAt47();
                if (ans != null) return ans;
                checkCenterAt48();
                if (ans != null) return ans;
                break;
            case 11:
                checkCenterAt2();
                if (ans != null) return ans;
                checkCenterAt27();
                if (ans != null) return ans;
                checkCenterAt49();
                if (ans != null) return ans;
                checkCenterAt55();
                if (ans != null) return ans;
                break;
            case 12:
                checkCenterAt15();
                if (ans != null) return ans;
                checkCenterAt16();
                if (ans != null) return ans;
                checkCenterAt43();
                if (ans != null) return ans;
                checkCenterAt44();
                if (ans != null) return ans;
                break;
            case 13:
                checkCenterAt6();
                if (ans != null) return ans;
                checkCenterAt31();
                if (ans != null) return ans;
                checkCenterAt36();
                if (ans != null) return ans;
                checkCenterAt59();
                if (ans != null) return ans;
                break;
            case 14:
                checkCenterAt1();
                if (ans != null) return ans;
                checkCenterAt28();
                if (ans != null) return ans;
                checkCenterAt51();
                if (ans != null) return ans;
                checkCenterAt52();
                if (ans != null) return ans;
                break;
            case 15:
                checkCenterAt5();
                if (ans != null) return ans;
                checkCenterAt32();
                if (ans != null) return ans;
                checkCenterAt35();
                if (ans != null) return ans;
                checkCenterAt60();
                if (ans != null) return ans;
                break;
        }
        return null;
    }


    static void checkCenterAt0() throws GameActionException { // (0,0)
        center = myLoc.translate(0,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l40;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l31;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l39;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l41;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l49;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l30;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l32;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l48;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l50;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l22;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l38;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l42;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l40; // (0,0)
            attackLoc = l58;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l21;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l23;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l29;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l33;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l47;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l51;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l57;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l59;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l20;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l24;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l56;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l40);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l40);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l60;
        }


    }

    static void checkCenterAt1() throws GameActionException { // (-1,0)
        center = myLoc.translate(-1,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l31;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l40;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l30;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l32;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l22;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l39;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l41;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l21;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l23;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l49;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l29;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l33;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l31; // (-1,0)
            attackLoc = l13;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l48;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l50;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l38;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l42;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l20;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l24;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l12;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l14;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l47;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l51;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l11;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l31);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l31);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l15;
        }


    }

    static void checkCenterAt2() throws GameActionException { // (0,-1)
        center = myLoc.translate(0,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l39;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l40;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l30;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l48;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l38;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l31;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l49;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l29;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l47;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l41;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l21;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l57;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l39; // (0,-1)
            attackLoc = l37;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l32;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l22;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l50;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l20;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l58;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l28;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l56;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l46;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l23;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l59;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l19;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l39);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l39);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l55;
        }


    }

    static void checkCenterAt3() throws GameActionException { // (0,1)
        center = myLoc.translate(0,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l41;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l40;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l32;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l50;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l42;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l31;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l49;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l33;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l51;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l39;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l23;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l59;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l41; // (0,1)
            attackLoc = l43;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l30;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l48;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l22;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l58;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l24;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l60;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l34;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l52;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l21;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l57;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l25;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l41);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l41);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l61;
        }


    }

    static void checkCenterAt4() throws GameActionException { // (1,0)
        center = myLoc.translate(1,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l49;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l40;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l50;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l48;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l58;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l41;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l39;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l59;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l57;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l31;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l51;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l47;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l49; // (1,0)
            attackLoc = l67;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l32;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l42;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l30;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l60;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l38;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l68;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l56;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l66;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l33;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l29;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l69;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l49);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l49);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l65;
        }


    }

    static void checkCenterAt5() throws GameActionException { // (-1,-1)
        center = myLoc.translate(-1,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l30;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l39;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l31;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l29;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l21;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l40;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l38;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l22;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l20;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l48;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l32;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l28;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l30; // (-1,-1)
            attackLoc = l12;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l49;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l41;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l47;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l23;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l37;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l13;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l19;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l11;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l50;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l46;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l14;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l30);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l30);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l10;
        }


    }

    static void checkCenterAt6() throws GameActionException { // (-1,1)
        center = myLoc.translate(-1,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l32;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l31;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l41;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l23;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l33;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l40;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l22;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l42;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l24;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l30;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l50;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l14;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l32; // (-1,1)
            attackLoc = l34;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l39;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l21;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l49;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l13;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l51;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l15;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l43;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l25;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l48;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l12;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l52;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l32);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l32);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l16;
        }


    }

    static void checkCenterAt7() throws GameActionException { // (1,-1)
        center = myLoc.translate(1,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l48;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l39;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l49;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l47;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l57;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l40;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l38;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l58;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l56;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l30;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l50;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l46;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l48; // (1,-1)
            attackLoc = l66;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l31;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l41;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l29;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l59;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l37;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l67;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l55;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l65;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l32;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l28;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l68;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l48);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l48);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l64;
        }


    }

    static void checkCenterAt8() throws GameActionException { // (1,1)
        center = myLoc.translate(1,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l50;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l49;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l41;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l59;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l51;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l40;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l58;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l42;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l60;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l48;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l32;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l68;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l50; // (1,1)
            attackLoc = l52;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l39;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l57;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l31;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l67;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l33;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l69;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l43;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l61;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l40; // (0,0)
            attackLoc = l30;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l66;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l34;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l50);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l50);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l70;
        }


    }

    static void checkCenterAt9() throws GameActionException { // (-2,0)
        center = myLoc.translate(-2,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l22;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l31;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l23;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l21;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l13;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l32;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l30;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l14;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l12;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l40;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l24;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l20;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l22; // (-2,0)
            attackLoc = l4;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l41;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l39;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l33;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l29;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l15;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l11;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l5;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l3;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l42;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l38;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l6;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l22);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l22);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l2;
        }


    }

    static void checkCenterAt10() throws GameActionException { // (0,-2)
        center = myLoc.translate(0,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l38;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l39;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l29;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l47;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l37;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l30;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l48;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l28;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l46;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l40;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l20;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l56;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l38; // (0,-2)
            attackLoc = l36;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l31;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l21;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l49;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l19;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l57;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l27;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l55;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l45;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l22;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l58;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l18;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l38);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l38);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l54;
        }


    }

    static void checkCenterAt11() throws GameActionException { // (0,2)
        center = myLoc.translate(0,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l42;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l41;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l33;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l51;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l43;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l32;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l50;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l34;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l52;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l40;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l24;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l60;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l42; // (0,2)
            attackLoc = l44;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l31;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l49;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l23;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l59;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l25;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l61;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l35;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l53;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l22;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l58;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l26;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l42);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l42);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l62;
        }


    }

    static void checkCenterAt12() throws GameActionException { // (2,0)
        center = myLoc.translate(2,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l58;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l49;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l59;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l57;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l67;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l50;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l48;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l68;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l66;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l40;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l60;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l56;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l58; // (2,0)
            attackLoc = l76;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l41;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l51;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l39;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l69;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l47;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l77;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l65;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l75;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l42;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l38;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l78;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l58);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l58);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l74;
        }


    }

    static void checkCenterAt13() throws GameActionException { // (-2,-1)
        center = myLoc.translate(-2,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l21;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l30;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l22;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l20;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l12;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l31;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l29;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l13;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l11;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l39;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l23;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l19;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l21; // (-2,-1)
            attackLoc = l3;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l40;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l38;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l32;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l28;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l14;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l10;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l4;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l2;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l41;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l37;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l21);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l21);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l5;
        }


    }

    static void checkCenterAt14() throws GameActionException { // (-2,1)
        center = myLoc.translate(-2,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l23;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l22;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l32;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l14;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l24;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l31;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l13;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l33;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l15;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l21;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l41;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l5;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l23; // (-2,1)
            attackLoc = l25;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l30;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l12;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l40;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l4;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l42;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l6;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l34;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l16;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l31; // (-1,0)
            attackLoc = l39;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l3;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l23);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l23);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l43;
        }


    }

    static void checkCenterAt15() throws GameActionException { // (-1,-2)
        center = myLoc.translate(-1,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l29;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l30;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l20;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l38;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l28;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l21;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l39;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l19;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l37;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l31;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l11;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l47;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l29; // (-1,-2)
            attackLoc = l27;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l22;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l12;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l40;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l48;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l10;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l18;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l46;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l36;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l13;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l49;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l29);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l29);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l45;
        }


    }

    static void checkCenterAt16() throws GameActionException { // (-1,2)
        center = myLoc.translate(-1,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l33;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l32;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l24;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l42;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l34;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l23;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l41;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l25;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l43;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l31;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l15;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l51;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l33; // (-1,2)
            attackLoc = l35;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l22;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l40;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l14;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l50;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l16;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l52;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l26;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l44;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l13;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l49;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l33);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l33);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l53;
        }


    }

    static void checkCenterAt17() throws GameActionException { // (1,-2)
        center = myLoc.translate(1,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l47;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l48;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l38;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l56;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l46;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l39;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l57;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l37;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l55;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l49;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l29;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l65;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l47; // (1,-2)
            attackLoc = l45;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l40;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l30;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l58;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l28;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l66;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l36;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l64;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l54;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l39; // (0,-1)
            attackLoc = l31;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l67;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l47);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l47);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l27;
        }


    }

    static void checkCenterAt18() throws GameActionException { // (1,2)
        center = myLoc.translate(1,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l51;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l50;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l42;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l60;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l52;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l41;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l59;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l43;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l61;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l49;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l33;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l69;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l51; // (1,2)
            attackLoc = l53;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l40;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l58;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l32;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l68;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l34;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l70;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l44;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l62;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l41; // (0,1)
            attackLoc = l31;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l67;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l51);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l51);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l35;
        }


    }

    static void checkCenterAt19() throws GameActionException { // (2,-1)
        center = myLoc.translate(2,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l57;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l58;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l48;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l66;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l56;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l49;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l67;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l47;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l65;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l59;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l39;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l75;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l57; // (2,-1)
            attackLoc = l55;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l50;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l40;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l68;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l76;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l38;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l46;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l74;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l64;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l41;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l77;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l57);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l57);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l37;
        }


    }

    static void checkCenterAt20() throws GameActionException { // (2,1)
        center = myLoc.translate(2,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l59;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l58;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l50;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l68;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l60;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l49;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l67;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l51;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l69;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l57;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l41;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l77;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l59; // (2,1)
            attackLoc = l61;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l48;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l66;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l40;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l76;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l42;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l78;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l52;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l70;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l49; // (1,0)
            attackLoc = l39;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l75;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l59);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l59);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l43;
        }


    }

    static void checkCenterAt21() throws GameActionException { // (-2,-2)
        center = myLoc.translate(-2,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l20;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l29;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l21;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l19;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l11;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l30;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l28;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l12;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l10;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l38;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l22;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l18;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l20; // (-2,-2)
            attackLoc = l2;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l39;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l31;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l37;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l13;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l27;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l3;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l30; // (-1,-1)
            attackLoc = l40;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l36;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l20);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l20);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l4;
        }


    }

    static void checkCenterAt22() throws GameActionException { // (-2,2)
        center = myLoc.translate(-2,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l24;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l23;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l33;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l15;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l25;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l32;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l14;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l34;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l16;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l22;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l42;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l6;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l24; // (-2,2)
            attackLoc = l26;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l31;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l13;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l41;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l5;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l43;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l35;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l32; // (-1,1)
            attackLoc = l40;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l4;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l24);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l24);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l44;
        }


    }

    static void checkCenterAt23() throws GameActionException { // (2,-2)
        center = myLoc.translate(2,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l56;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l47;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l57;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l55;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l65;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l48;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l46;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l66;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l64;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l38;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l58;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l54;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l56; // (2,-2)
            attackLoc = l74;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l39;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l49;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l37;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l67;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l45;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l75;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l48; // (1,-1)
            attackLoc = l40;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l36;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l56);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l56);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l76;
        }


    }

    static void checkCenterAt24() throws GameActionException { // (2,2)
        center = myLoc.translate(2,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l60;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l59;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l51;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l69;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l61;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l50;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l68;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l52;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l70;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l58;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l42;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l78;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l60; // (2,2)
            attackLoc = l62;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l49;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l67;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l41;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l77;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l43;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l53;
        }


        if (m40.isWall() || m40.hasRuin()){ // (0,0)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m40.getPaint();
        if ( Map.isNearRuin(l40) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l50; // (1,1)
            attackLoc = l40;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l76;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l60);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l60);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l44;
        }


    }

    static void checkCenterAt25() throws GameActionException { // (-3,0)
        center = myLoc.translate(-3,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l13;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l22;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l14;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l12;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l4;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l23;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l21;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l5;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l3;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l31;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l15;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l13; // (-3,0)
            attackLoc = l11;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l32;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l24;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l30;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l20;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l6;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l2;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l33;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l13);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l13);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l29;
        }


    }

    static void checkCenterAt26() throws GameActionException { // (0,-3)
        center = myLoc.translate(0,-3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l37;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l38;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l28;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l46;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l36;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l29;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l47;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l27;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l45;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l39;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l19;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l37; // (0,-3)
            attackLoc = l55;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l30;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l20;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l48;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l18;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l56;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l54;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l21;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l37);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l37);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l57;
        }


    }

    static void checkCenterAt27() throws GameActionException { // (0,3)
        center = myLoc.translate(0,3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l43;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l42;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l34;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l52;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l44;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l33;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l51;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l35;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l53;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l41;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l25;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l43; // (0,3)
            attackLoc = l61;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l32;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l50;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l24;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l60;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l26;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l62;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l23;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l43);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l43);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l59;
        }


    }

    static void checkCenterAt28() throws GameActionException { // (3,0)
        center = myLoc.translate(3,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l67;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l58;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l68;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l66;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l76;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l59;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l57;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l77;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l75;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l49;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l69;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l67; // (3,0)
            attackLoc = l65;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l50;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l60;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l48;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l78;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l56;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l74;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l51;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l67);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l67);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l47;
        }


    }

    static void checkCenterAt29() throws GameActionException { // (-3,-1)
        center = myLoc.translate(-3,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l12;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l21;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l13;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l11;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l3;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l22;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l20;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l4;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l2;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l30;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l14;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l12; // (-3,-1)
            attackLoc = l10;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l31;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l29;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l23;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l19;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l5;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l32;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l12);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l12);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l28;
        }


    }

    static void checkCenterAt30() throws GameActionException { // (-3,1)
        center = myLoc.translate(-3,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l14;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l13;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l23;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l5;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l15;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l22;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l4;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l24;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l6;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l12;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l32;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l14; // (-3,1)
            attackLoc = l16;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l21;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l3;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l31;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l33;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l25;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l22; // (-2,0)
            attackLoc = l30;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l14);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l14);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l34;
        }


    }

    static void checkCenterAt31() throws GameActionException { // (-1,-3)
        center = myLoc.translate(-1,-3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l28;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l29;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l19;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l37;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l27;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l20;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l38;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l18;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l36;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l30;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l10;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l28; // (-1,-3)
            attackLoc = l46;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l21;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l11;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l39;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l47;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l45;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l12;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l28);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l28);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l48;
        }


    }

    static void checkCenterAt32() throws GameActionException { // (-1,3)
        center = myLoc.translate(-1,3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l34;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l33;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l25;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l43;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l35;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l24;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l42;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l26;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l44;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l32;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l16;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l34; // (-1,3)
            attackLoc = l52;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l23;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l41;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l15;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l51;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l53;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l14;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l34);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l34);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l50;
        }


    }

    static void checkCenterAt33() throws GameActionException { // (1,-3)
        center = myLoc.translate(1,-3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l46;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l47;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l37;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l55;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l45;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l38;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l56;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l36;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l54;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l48;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l28;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l46; // (1,-3)
            attackLoc = l64;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l39;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l29;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l57;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l65;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l27;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l38; // (0,-2)
            attackLoc = l30;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l46);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l46);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l66;
        }


    }

    static void checkCenterAt34() throws GameActionException { // (1,3)
        center = myLoc.translate(1,3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l52;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l51;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l43;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l61;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l53;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l42;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l60;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l44;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l62;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l50;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l34;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l52; // (1,3)
            attackLoc = l70;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l41;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l59;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l33;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l69;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l35;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l42; // (0,2)
            attackLoc = l32;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l52);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l52);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l68;
        }


    }

    static void checkCenterAt35() throws GameActionException { // (3,-1)
        center = myLoc.translate(3,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l66;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l67;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l57;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l75;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l65;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l58;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l76;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l56;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l74;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l68;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l48;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l66; // (3,-1)
            attackLoc = l64;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l59;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l49;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l77;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l47;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l55;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l50;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l66);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l66);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l46;
        }


    }

    static void checkCenterAt36() throws GameActionException { // (3,1)
        center = myLoc.translate(3,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l68;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l67;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l59;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l77;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l69;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l58;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l76;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l60;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l78;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l66;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l50;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l68; // (3,1)
            attackLoc = l70;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l57;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l75;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l49;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l51;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l61;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l58; // (2,0)
            attackLoc = l48;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l68);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l68);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l52;
        }


    }

    static void checkCenterAt37() throws GameActionException { // (-3,-2)
        center = myLoc.translate(-3,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l11; // (-3,-2)
            attackLoc = l11;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l20;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l12;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l10;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l2;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l21;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l19;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l3;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l29;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l11; // (-3,-2)
            attackLoc = l13;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l30;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l22;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l28;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l18;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l4;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l21; // (-2,-1)
            attackLoc = l31;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l11);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l11);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l27;
        }


    }

    static void checkCenterAt38() throws GameActionException { // (-3,2)
        center = myLoc.translate(-3,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l15; // (-3,2)
            attackLoc = l15;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l14;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l24;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l6;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l16;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l23;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l5;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l25;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l13;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l15; // (-3,2)
            attackLoc = l33;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l22;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l4;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l32;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l34;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l26;
        }


        if (m31.isWall() || m31.hasRuin()){ // (-1,0)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m31.getPaint();
        if ( Map.isNearRuin(l31) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l23; // (-2,1)
            attackLoc = l31;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l15);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l15);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l25; // (-2,3)
            attackLoc = l35;
        }


    }

    static void checkCenterAt39() throws GameActionException { // (-2,-3)
        center = myLoc.translate(-2,-3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l19;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l20;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l10;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l28;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l18;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l11;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l29;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l27;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l21;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l19; // (-2,-3)
            attackLoc = l37;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l12;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l30;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l2;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l38;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l36;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l11; // (-3,-2)
            attackLoc = l3;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l19);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l19);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l29; // (-1,-2)
            attackLoc = l39;
        }


    }

    static void checkCenterAt40() throws GameActionException { // (-2,3)
        center = myLoc.translate(-2,3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l25; // (-2,3)
            attackLoc = l25;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l24;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l16;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l34;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l26;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l15;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l33;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l35;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l23;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l25; // (-2,3)
            attackLoc = l43;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l14;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l32;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l6;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l42;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l44;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l15; // (-3,2)
            attackLoc = l5;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l25);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l25);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l33; // (-1,2)
            attackLoc = l41;
        }


    }

    static void checkCenterAt41() throws GameActionException { // (2,-3)
        center = myLoc.translate(2,-3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l55;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l56;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l46;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l64;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l54;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l47;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l65;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l45;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l57;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l55; // (2,-3)
            attackLoc = l37;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l48;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l38;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l66;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l36;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l74;
        }


        if (m39.isWall() || m39.hasRuin()){ // (0,-1)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m39.getPaint();
        if ( Map.isNearRuin(l39) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l47; // (1,-2)
            attackLoc = l39;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l55);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l55);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l65; // (3,-2)
            attackLoc = l75;
        }


    }

    static void checkCenterAt42() throws GameActionException { // (2,3)
        center = myLoc.translate(2,3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l61; // (2,3)
            attackLoc = l61;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l60;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l52;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l70;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l62;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l51;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l69;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l53;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l59;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l61; // (2,3)
            attackLoc = l43;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l50;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l68;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l42;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l78;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l44;
        }


        if (m41.isWall() || m41.hasRuin()){ // (0,1)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m41.getPaint();
        if ( Map.isNearRuin(l41) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l51; // (1,2)
            attackLoc = l41;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l61);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l61);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l69; // (3,2)
            attackLoc = l77;
        }


    }

    static void checkCenterAt43() throws GameActionException { // (3,-2)
        center = myLoc.translate(3,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l65; // (3,-2)
            attackLoc = l65;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l66;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l56;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l74;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l64;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l57;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l75;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l55;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l67;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l65; // (3,-2)
            attackLoc = l47;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l58;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l76;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l48;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l46;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l54;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l57; // (2,-1)
            attackLoc = l49;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l65);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l65);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l45;
        }


    }

    static void checkCenterAt44() throws GameActionException { // (3,2)
        center = myLoc.translate(3,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l69; // (3,2)
            attackLoc = l69;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l68;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l60;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l78;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l70;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l59;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l77;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l61;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l67;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l69; // (3,2)
            attackLoc = l51;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l58;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l76;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l50;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l52;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l62;
        }


        if (m49.isWall() || m49.hasRuin()){ // (1,0)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m49.getPaint();
        if ( Map.isNearRuin(l49) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l59; // (2,1)
            attackLoc = l49;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l69);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l69);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l61; // (2,3)
            attackLoc = l53;
        }


    }

    static void checkCenterAt45() throws GameActionException { // (-4,0)
        center = myLoc.translate(-4,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l4; // (-4,0)
            attackLoc = l4;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l4; // (-4,0)
            attackLoc = l13;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l4; // (-4,0)
            attackLoc = l5;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l4; // (-4,0)
            attackLoc = l3;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l4; // (-4,0)
            attackLoc = l14;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l4; // (-4,0)
            attackLoc = l12;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l4; // (-4,0)
            attackLoc = l22;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l4; // (-4,0)
            attackLoc = l6;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l4; // (-4,0)
            attackLoc = l2;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l23;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l21;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l15;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l11;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l24;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l4);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l4);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l20;
        }


    }

    static void checkCenterAt46() throws GameActionException { // (0,-4)
        center = myLoc.translate(0,-4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l36; // (0,-4)
            attackLoc = l36;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l36; // (0,-4)
            attackLoc = l37;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l36; // (0,-4)
            attackLoc = l27;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l36; // (0,-4)
            attackLoc = l45;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l36; // (0,-4)
            attackLoc = l28;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l36; // (0,-4)
            attackLoc = l46;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l36; // (0,-4)
            attackLoc = l38;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l36; // (0,-4)
            attackLoc = l18;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l36; // (0,-4)
            attackLoc = l54;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l29;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l19;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l47;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l55;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l20;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l36);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l36);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l56;
        }


    }

    static void checkCenterAt47() throws GameActionException { // (0,4)
        center = myLoc.translate(0,4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l44; // (0,4)
            attackLoc = l44;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l44; // (0,4)
            attackLoc = l43;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l44; // (0,4)
            attackLoc = l35;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l44; // (0,4)
            attackLoc = l53;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l44; // (0,4)
            attackLoc = l34;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l44; // (0,4)
            attackLoc = l52;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l44; // (0,4)
            attackLoc = l42;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l44; // (0,4)
            attackLoc = l26;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l44; // (0,4)
            attackLoc = l62;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l33;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l51;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l25;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l61;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l24;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l44);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l44);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l60;
        }


    }

    static void checkCenterAt48() throws GameActionException { // (4,0)
        center = myLoc.translate(4,0);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l76; // (4,0)
            attackLoc = l76;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l76; // (4,0)
            attackLoc = l67;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l76; // (4,0)
            attackLoc = l77;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l76; // (4,0)
            attackLoc = l75;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l76; // (4,0)
            attackLoc = l68;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l76; // (4,0)
            attackLoc = l66;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l76; // (4,0)
            attackLoc = l58;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l76; // (4,0)
            attackLoc = l78;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l76; // (4,0)
            attackLoc = l74;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l59;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l69;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l57;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l65;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l60;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l76);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l76);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l56;
        }


    }

    static void checkCenterAt49() throws GameActionException { // (-4,-1)
        center = myLoc.translate(-4,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l3; // (-4,-1)
            attackLoc = l3;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l3; // (-4,-1)
            attackLoc = l12;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l3; // (-4,-1)
            attackLoc = l4;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l3; // (-4,-1)
            attackLoc = l2;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l3; // (-4,-1)
            attackLoc = l13;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l3; // (-4,-1)
            attackLoc = l11;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l3; // (-4,-1)
            attackLoc = l21;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l3; // (-4,-1)
            attackLoc = l5;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l22;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l20;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l14;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l10;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l23;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l3);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l3);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l11; // (-3,-2)
            attackLoc = l19;
        }


    }

    static void checkCenterAt50() throws GameActionException { // (-4,1)
        center = myLoc.translate(-4,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l5; // (-4,1)
            attackLoc = l5;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l5; // (-4,1)
            attackLoc = l4;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l5; // (-4,1)
            attackLoc = l14;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l5; // (-4,1)
            attackLoc = l6;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l5; // (-4,1)
            attackLoc = l13;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l5; // (-4,1)
            attackLoc = l15;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l5; // (-4,1)
            attackLoc = l3;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l5; // (-4,1)
            attackLoc = l23;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l4; // (-4,0)
            attackLoc = l12;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l4; // (-4,0)
            attackLoc = l22;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l24;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l16;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l13; // (-3,0)
            attackLoc = l21;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l5);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l5);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l15; // (-3,2)
            attackLoc = l25;
        }


    }

    static void checkCenterAt51() throws GameActionException { // (-1,-4)
        center = myLoc.translate(-1,-4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l27; // (-1,-4)
            attackLoc = l27;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l27; // (-1,-4)
            attackLoc = l28;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l27; // (-1,-4)
            attackLoc = l18;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l27; // (-1,-4)
            attackLoc = l36;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l27; // (-1,-4)
            attackLoc = l19;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l27; // (-1,-4)
            attackLoc = l37;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l27; // (-1,-4)
            attackLoc = l29;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l27; // (-1,-4)
            attackLoc = l45;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l20;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l10;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l38;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l46;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l11;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l27);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l27);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l47;
        }


    }

    static void checkCenterAt52() throws GameActionException { // (-1,4)
        center = myLoc.translate(-1,4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l35; // (-1,4)
            attackLoc = l35;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l35; // (-1,4)
            attackLoc = l34;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l35; // (-1,4)
            attackLoc = l26;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l35; // (-1,4)
            attackLoc = l44;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l35; // (-1,4)
            attackLoc = l25;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l35; // (-1,4)
            attackLoc = l43;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l35; // (-1,4)
            attackLoc = l33;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l35; // (-1,4)
            attackLoc = l53;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l24;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l42;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l16;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l52;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l25; // (-2,3)
            attackLoc = l15;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l35);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l35);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l51;
        }


    }

    static void checkCenterAt53() throws GameActionException { // (1,-4)
        center = myLoc.translate(1,-4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l45; // (1,-4)
            attackLoc = l45;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l45; // (1,-4)
            attackLoc = l46;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l45; // (1,-4)
            attackLoc = l36;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l45; // (1,-4)
            attackLoc = l54;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l45; // (1,-4)
            attackLoc = l37;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l45; // (1,-4)
            attackLoc = l55;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l45; // (1,-4)
            attackLoc = l47;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l45; // (1,-4)
            attackLoc = l27;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l38;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l56;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l28;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l64;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l37; // (0,-3)
            attackLoc = l29;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l45);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l45);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l65;
        }


    }

    static void checkCenterAt54() throws GameActionException { // (1,4)
        center = myLoc.translate(1,4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l53; // (1,4)
            attackLoc = l53;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l53; // (1,4)
            attackLoc = l52;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l53; // (1,4)
            attackLoc = l44;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l53; // (1,4)
            attackLoc = l62;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l53; // (1,4)
            attackLoc = l43;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l53; // (1,4)
            attackLoc = l61;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l53; // (1,4)
            attackLoc = l51;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l53; // (1,4)
            attackLoc = l35;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l42;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l60;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l34;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l70;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l43; // (0,3)
            attackLoc = l33;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l53);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l53);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l61; // (2,3)
            attackLoc = l69;
        }


    }

    static void checkCenterAt55() throws GameActionException { // (4,-1)
        center = myLoc.translate(4,-1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l75; // (4,-1)
            attackLoc = l75;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l75; // (4,-1)
            attackLoc = l76;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l75; // (4,-1)
            attackLoc = l66;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l75; // (4,-1)
            attackLoc = l74;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l75; // (4,-1)
            attackLoc = l67;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l75; // (4,-1)
            attackLoc = l65;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l75; // (4,-1)
            attackLoc = l77;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l75; // (4,-1)
            attackLoc = l57;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l76; // (4,0)
            attackLoc = l68;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l76; // (4,0)
            attackLoc = l58;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l56;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l64;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l59;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l75);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l75);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l65; // (3,-2)
            attackLoc = l55;
        }


    }

    static void checkCenterAt56() throws GameActionException { // (4,1)
        center = myLoc.translate(4,1);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l77; // (4,1)
            attackLoc = l77;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l77; // (4,1)
            attackLoc = l76;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l77; // (4,1)
            attackLoc = l68;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l77; // (4,1)
            attackLoc = l78;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l77; // (4,1)
            attackLoc = l67;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l77; // (4,1)
            attackLoc = l69;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l77; // (4,1)
            attackLoc = l75;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l77; // (4,1)
            attackLoc = l59;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l76; // (4,0)
            attackLoc = l66;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l76; // (4,0)
            attackLoc = l58;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l60;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l70;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l67; // (3,0)
            attackLoc = l57;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l77);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l77);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l69; // (3,2)
            attackLoc = l61;
        }


    }

    static void checkCenterAt57() throws GameActionException { // (-3,-3)
        center = myLoc.translate(-3,-3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l10; // (-3,-3)
            attackLoc = l10;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l10; // (-3,-3)
            attackLoc = l19;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l10; // (-3,-3)
            attackLoc = l11;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l10; // (-3,-3)
            attackLoc = l20;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l10; // (-3,-3)
            attackLoc = l18;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l10; // (-3,-3)
            attackLoc = l2;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l10; // (-3,-3)
            attackLoc = l28;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l10; // (-3,-3)
            attackLoc = l12;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l29;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l21;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l27;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l11; // (-3,-2)
            attackLoc = l3;
        }


        if (m30.isWall() || m30.hasRuin()){ // (-1,-1)
            ans = null;
            Map.markObstructed(l10);
            return;
        }
        p = m30.getPaint();
        if ( Map.isNearRuin(l30) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l10);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l20; // (-2,-2)
            attackLoc = l30;
        }


    }

    static void checkCenterAt58() throws GameActionException { // (-3,3)
        center = myLoc.translate(-3,3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l16; // (-3,3)
            attackLoc = l16;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l16; // (-3,3)
            attackLoc = l15;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l16; // (-3,3)
            attackLoc = l25;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l16; // (-3,3)
            attackLoc = l24;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l16; // (-3,3)
            attackLoc = l6;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l16; // (-3,3)
            attackLoc = l26;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l16; // (-3,3)
            attackLoc = l14;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l16; // (-3,3)
            attackLoc = l34;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l15; // (-3,2)
            attackLoc = l23;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l15; // (-3,2)
            attackLoc = l5;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l15; // (-3,2)
            attackLoc = l33;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l25; // (-2,3)
            attackLoc = l35;
        }


        if (m32.isWall() || m32.hasRuin()){ // (-1,1)
            ans = null;
            Map.markObstructed(l16);
            return;
        }
        p = m32.getPaint();
        if ( Map.isNearRuin(l32) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l16);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l24; // (-2,2)
            attackLoc = l32;
        }


    }

    static void checkCenterAt59() throws GameActionException { // (3,-3)
        center = myLoc.translate(3,-3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l64; // (3,-3)
            attackLoc = l64;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l64; // (3,-3)
            attackLoc = l55;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l64; // (3,-3)
            attackLoc = l65;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l64; // (3,-3)
            attackLoc = l56;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l64; // (3,-3)
            attackLoc = l54;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l64; // (3,-3)
            attackLoc = l74;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l64; // (3,-3)
            attackLoc = l46;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l64; // (3,-3)
            attackLoc = l66;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l47;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l57;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l45;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l65; // (3,-2)
            attackLoc = l75;
        }


        if (m48.isWall() || m48.hasRuin()){ // (1,-1)
            ans = null;
            Map.markObstructed(l64);
            return;
        }
        p = m48.getPaint();
        if ( Map.isNearRuin(l48) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l64);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l56; // (2,-2)
            attackLoc = l48;
        }


    }

    static void checkCenterAt60() throws GameActionException { // (3,3)
        center = myLoc.translate(3,3);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l70; // (3,3)
            attackLoc = l70;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l70; // (3,3)
            attackLoc = l69;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l70; // (3,3)
            attackLoc = l61;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l70; // (3,3)
            attackLoc = l60;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l70; // (3,3)
            attackLoc = l78;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l70; // (3,3)
            attackLoc = l62;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l70; // (3,3)
            attackLoc = l68;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l70; // (3,3)
            attackLoc = l52;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l69; // (3,2)
            attackLoc = l59;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l69; // (3,2)
            attackLoc = l77;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l69; // (3,2)
            attackLoc = l51;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l61; // (2,3)
            attackLoc = l53;
        }


        if (m50.isWall() || m50.hasRuin()){ // (1,1)
            ans = null;
            Map.markObstructed(l70);
            return;
        }
        p = m50.getPaint();
        if ( Map.isNearRuin(l50) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l70);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l60; // (2,2)
            attackLoc = l50;
        }


    }

    static void checkCenterAt61() throws GameActionException { // (-4,-2)
        center = myLoc.translate(-4,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l2; // (-4,-2)
            attackLoc = l2;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l2; // (-4,-2)
            attackLoc = l11;
        }


        if (m3.isWall() || m3.hasRuin()){ // (-4,-1)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m3.getPaint();
        if ( Map.isNearRuin(l3) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l2; // (-4,-2)
            attackLoc = l3;
        }


        if (m12.isWall() || m12.hasRuin()){ // (-3,-1)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m12.getPaint();
        if ( Map.isNearRuin(l12) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l2; // (-4,-2)
            attackLoc = l12;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l2; // (-4,-2)
            attackLoc = l10;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l2; // (-4,-2)
            attackLoc = l20;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l2; // (-4,-2)
            attackLoc = l4;
        }


        if (m21.isWall() || m21.hasRuin()){ // (-2,-1)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m21.getPaint();
        if ( Map.isNearRuin(l21) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l11; // (-3,-2)
            attackLoc = l21;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l11; // (-3,-2)
            attackLoc = l13;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l11; // (-3,-2)
            attackLoc = l19;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l12; // (-3,-1)
            attackLoc = l22;
        }


        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l2);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l2);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l10; // (-3,-3)
            attackLoc = l18;
        }


    }

    static void checkCenterAt62() throws GameActionException { // (-4,2)
        center = myLoc.translate(-4,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l6; // (-4,2)
            attackLoc = l6;
        }


        if (m5.isWall() || m5.hasRuin()){ // (-4,1)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m5.getPaint();
        if ( Map.isNearRuin(l5) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l6; // (-4,2)
            attackLoc = l5;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l6; // (-4,2)
            attackLoc = l15;
        }


        if (m14.isWall() || m14.hasRuin()){ // (-3,1)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m14.getPaint();
        if ( Map.isNearRuin(l14) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l6; // (-4,2)
            attackLoc = l14;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l6; // (-4,2)
            attackLoc = l16;
        }


        if (m4.isWall() || m4.hasRuin()){ // (-4,0)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m4.getPaint();
        if ( Map.isNearRuin(l4) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l6; // (-4,2)
            attackLoc = l4;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l6; // (-4,2)
            attackLoc = l24;
        }


        if (m13.isWall() || m13.hasRuin()){ // (-3,0)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m13.getPaint();
        if ( Map.isNearRuin(l13) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l5; // (-4,1)
            attackLoc = l13;
        }


        if (m23.isWall() || m23.hasRuin()){ // (-2,1)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m23.getPaint();
        if ( Map.isNearRuin(l23) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l5; // (-4,1)
            attackLoc = l23;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l15; // (-3,2)
            attackLoc = l25;
        }


        if (m22.isWall() || m22.hasRuin()){ // (-2,0)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m22.getPaint();
        if ( Map.isNearRuin(l22) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l14; // (-3,1)
            attackLoc = l22;
        }


        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l6);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l6);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l16; // (-3,3)
            attackLoc = l26;
        }


    }

    static void checkCenterAt63() throws GameActionException { // (-2,-4)
        center = myLoc.translate(-2,-4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m18.isWall() || m18.hasRuin()){ // (-2,-4)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m18.getPaint();
        if ( Map.isNearRuin(l18) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l18; // (-2,-4)
            attackLoc = l18;
        }


        if (m19.isWall() || m19.hasRuin()){ // (-2,-3)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m19.getPaint();
        if ( Map.isNearRuin(l19) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l18; // (-2,-4)
            attackLoc = l19;
        }


        if (m27.isWall() || m27.hasRuin()){ // (-1,-4)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m27.getPaint();
        if ( Map.isNearRuin(l27) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l18; // (-2,-4)
            attackLoc = l27;
        }


        if (m10.isWall() || m10.hasRuin()){ // (-3,-3)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m10.getPaint();
        if ( Map.isNearRuin(l10) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l18; // (-2,-4)
            attackLoc = l10;
        }


        if (m28.isWall() || m28.hasRuin()){ // (-1,-3)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m28.getPaint();
        if ( Map.isNearRuin(l28) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l18; // (-2,-4)
            attackLoc = l28;
        }


        if (m20.isWall() || m20.hasRuin()){ // (-2,-2)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m20.getPaint();
        if ( Map.isNearRuin(l20) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l18; // (-2,-4)
            attackLoc = l20;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l18; // (-2,-4)
            attackLoc = l36;
        }


        if (m11.isWall() || m11.hasRuin()){ // (-3,-2)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m11.getPaint();
        if ( Map.isNearRuin(l11) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l11;
        }


        if (m29.isWall() || m29.hasRuin()){ // (-1,-2)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m29.getPaint();
        if ( Map.isNearRuin(l29) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l29;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l19; // (-2,-3)
            attackLoc = l37;
        }


        if (m2.isWall() || m2.hasRuin()){ // (-4,-2)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m2.getPaint();
        if ( Map.isNearRuin(l2) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l10; // (-3,-3)
            attackLoc = l2;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l18);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l18);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l28; // (-1,-3)
            attackLoc = l38;
        }


    }

    static void checkCenterAt64() throws GameActionException { // (-2,4)
        center = myLoc.translate(-2,4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m26.isWall() || m26.hasRuin()){ // (-2,4)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m26.getPaint();
        if ( Map.isNearRuin(l26) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l26; // (-2,4)
            attackLoc = l26;
        }


        if (m25.isWall() || m25.hasRuin()){ // (-2,3)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m25.getPaint();
        if ( Map.isNearRuin(l25) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l26; // (-2,4)
            attackLoc = l25;
        }


        if (m35.isWall() || m35.hasRuin()){ // (-1,4)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m35.getPaint();
        if ( Map.isNearRuin(l35) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l26; // (-2,4)
            attackLoc = l35;
        }


        if (m16.isWall() || m16.hasRuin()){ // (-3,3)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m16.getPaint();
        if ( Map.isNearRuin(l16) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l26; // (-2,4)
            attackLoc = l16;
        }


        if (m34.isWall() || m34.hasRuin()){ // (-1,3)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m34.getPaint();
        if ( Map.isNearRuin(l34) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l26; // (-2,4)
            attackLoc = l34;
        }


        if (m24.isWall() || m24.hasRuin()){ // (-2,2)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m24.getPaint();
        if ( Map.isNearRuin(l24) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l26; // (-2,4)
            attackLoc = l24;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l26; // (-2,4)
            attackLoc = l44;
        }


        if (m15.isWall() || m15.hasRuin()){ // (-3,2)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m15.getPaint();
        if ( Map.isNearRuin(l15) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l25; // (-2,3)
            attackLoc = l15;
        }


        if (m33.isWall() || m33.hasRuin()){ // (-1,2)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m33.getPaint();
        if ( Map.isNearRuin(l33) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l25; // (-2,3)
            attackLoc = l33;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l25; // (-2,3)
            attackLoc = l43;
        }


        if (m6.isWall() || m6.hasRuin()){ // (-4,2)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m6.getPaint();
        if ( Map.isNearRuin(l6) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l16; // (-3,3)
            attackLoc = l6;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l26);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l26);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l34; // (-1,3)
            attackLoc = l42;
        }


    }

    static void checkCenterAt65() throws GameActionException { // (2,-4)
        center = myLoc.translate(2,-4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l54; // (2,-4)
            attackLoc = l54;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l54; // (2,-4)
            attackLoc = l55;
        }


        if (m45.isWall() || m45.hasRuin()){ // (1,-4)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m45.getPaint();
        if ( Map.isNearRuin(l45) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l54; // (2,-4)
            attackLoc = l45;
        }


        if (m46.isWall() || m46.hasRuin()){ // (1,-3)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m46.getPaint();
        if ( Map.isNearRuin(l46) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l54; // (2,-4)
            attackLoc = l46;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l54; // (2,-4)
            attackLoc = l64;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l54; // (2,-4)
            attackLoc = l56;
        }


        if (m36.isWall() || m36.hasRuin()){ // (0,-4)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m36.getPaint();
        if ( Map.isNearRuin(l36) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l54; // (2,-4)
            attackLoc = l36;
        }


        if (m47.isWall() || m47.hasRuin()){ // (1,-2)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m47.getPaint();
        if ( Map.isNearRuin(l47) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l47;
        }


        if (m37.isWall() || m37.hasRuin()){ // (0,-3)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m37.getPaint();
        if ( Map.isNearRuin(l37) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l37;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l55; // (2,-3)
            attackLoc = l65;
        }


        if (m38.isWall() || m38.hasRuin()){ // (0,-2)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m38.getPaint();
        if ( Map.isNearRuin(l38) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l46; // (1,-3)
            attackLoc = l38;
        }


        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l54);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l54);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l64; // (3,-3)
            attackLoc = l74;
        }


    }

    static void checkCenterAt66() throws GameActionException { // (2,4)
        center = myLoc.translate(2,4);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l62; // (2,4)
            attackLoc = l62;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l62; // (2,4)
            attackLoc = l61;
        }


        if (m53.isWall() || m53.hasRuin()){ // (1,4)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m53.getPaint();
        if ( Map.isNearRuin(l53) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l62; // (2,4)
            attackLoc = l53;
        }


        if (m52.isWall() || m52.hasRuin()){ // (1,3)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m52.getPaint();
        if ( Map.isNearRuin(l52) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l62; // (2,4)
            attackLoc = l52;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l62; // (2,4)
            attackLoc = l70;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l62; // (2,4)
            attackLoc = l60;
        }


        if (m44.isWall() || m44.hasRuin()){ // (0,4)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m44.getPaint();
        if ( Map.isNearRuin(l44) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l62; // (2,4)
            attackLoc = l44;
        }


        if (m51.isWall() || m51.hasRuin()){ // (1,2)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m51.getPaint();
        if ( Map.isNearRuin(l51) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l61; // (2,3)
            attackLoc = l51;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l61; // (2,3)
            attackLoc = l69;
        }


        if (m43.isWall() || m43.hasRuin()){ // (0,3)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m43.getPaint();
        if ( Map.isNearRuin(l43) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l61; // (2,3)
            attackLoc = l43;
        }


        if (m42.isWall() || m42.hasRuin()){ // (0,2)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m42.getPaint();
        if ( Map.isNearRuin(l42) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l52; // (1,3)
            attackLoc = l42;
        }


        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l62);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l62);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l70; // (3,3)
            attackLoc = l78;
        }


    }

    static void checkCenterAt67() throws GameActionException { // (4,-2)
        center = myLoc.translate(4,-2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m74.isWall() || m74.hasRuin()){ // (4,-2)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m74.getPaint();
        if ( Map.isNearRuin(l74) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l74; // (4,-2)
            attackLoc = l74;
        }


        if (m75.isWall() || m75.hasRuin()){ // (4,-1)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m75.getPaint();
        if ( Map.isNearRuin(l75) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l74; // (4,-2)
            attackLoc = l75;
        }


        if (m65.isWall() || m65.hasRuin()){ // (3,-2)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m65.getPaint();
        if ( Map.isNearRuin(l65) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l74; // (4,-2)
            attackLoc = l65;
        }


        if (m66.isWall() || m66.hasRuin()){ // (3,-1)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m66.getPaint();
        if ( Map.isNearRuin(l66) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l74; // (4,-2)
            attackLoc = l66;
        }


        if (m64.isWall() || m64.hasRuin()){ // (3,-3)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m64.getPaint();
        if ( Map.isNearRuin(l64) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l74; // (4,-2)
            attackLoc = l64;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l74; // (4,-2)
            attackLoc = l76;
        }


        if (m56.isWall() || m56.hasRuin()){ // (2,-2)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m56.getPaint();
        if ( Map.isNearRuin(l56) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l74; // (4,-2)
            attackLoc = l56;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l75; // (4,-1)
            attackLoc = l67;
        }


        if (m57.isWall() || m57.hasRuin()){ // (2,-1)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m57.getPaint();
        if ( Map.isNearRuin(l57) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l75; // (4,-1)
            attackLoc = l57;
        }


        if (m55.isWall() || m55.hasRuin()){ // (2,-3)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m55.getPaint();
        if ( Map.isNearRuin(l55) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l65; // (3,-2)
            attackLoc = l55;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l66; // (3,-1)
            attackLoc = l58;
        }


        if (m54.isWall() || m54.hasRuin()){ // (2,-4)
            ans = null;
            Map.markObstructed(l74);
            return;
        }
        p = m54.getPaint();
        if ( Map.isNearRuin(l54) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l74);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l64; // (3,-3)
            attackLoc = l54;
        }


    }

    static void checkCenterAt68() throws GameActionException { // (4,2)
        center = myLoc.translate(4,2);
        attackLoc = null;
        if (Map.forbiddenCenter(center)) return;
        if (m78.isWall() || m78.hasRuin()){ // (4,2)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m78.getPaint();
        if ( Map.isNearRuin(l78) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l78; // (4,2)
            attackLoc = l78;
        }


        if (m77.isWall() || m77.hasRuin()){ // (4,1)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m77.getPaint();
        if ( Map.isNearRuin(l77) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l78; // (4,2)
            attackLoc = l77;
        }


        if (m69.isWall() || m69.hasRuin()){ // (3,2)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m69.getPaint();
        if ( Map.isNearRuin(l69) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l78; // (4,2)
            attackLoc = l69;
        }


        if (m68.isWall() || m68.hasRuin()){ // (3,1)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m68.getPaint();
        if ( Map.isNearRuin(l68) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l78; // (4,2)
            attackLoc = l68;
        }


        if (m70.isWall() || m70.hasRuin()){ // (3,3)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m70.getPaint();
        if ( Map.isNearRuin(l70) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l78; // (4,2)
            attackLoc = l70;
        }


        if (m76.isWall() || m76.hasRuin()){ // (4,0)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m76.getPaint();
        if ( Map.isNearRuin(l76) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l78; // (4,2)
            attackLoc = l76;
        }


        if (m60.isWall() || m60.hasRuin()){ // (2,2)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m60.getPaint();
        if ( Map.isNearRuin(l60) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_PRIMARY){
            ans = l78; // (4,2)
            attackLoc = l60;
        }


        if (m67.isWall() || m67.hasRuin()){ // (3,0)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m67.getPaint();
        if ( Map.isNearRuin(l67) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l77; // (4,1)
            attackLoc = l67;
        }


        if (m59.isWall() || m59.hasRuin()){ // (2,1)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m59.getPaint();
        if ( Map.isNearRuin(l59) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l77; // (4,1)
            attackLoc = l59;
        }


        if (m61.isWall() || m61.hasRuin()){ // (2,3)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m61.getPaint();
        if ( Map.isNearRuin(l61) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l69; // (3,2)
            attackLoc = l61;
        }


        if (m58.isWall() || m58.hasRuin()){ // (2,0)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m58.getPaint();
        if ( Map.isNearRuin(l58) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l68; // (3,1)
            attackLoc = l58;
        }


        if (m62.isWall() || m62.hasRuin()){ // (2,4)
            ans = null;
            Map.markObstructed(l78);
            return;
        }
        p = m62.getPaint();
        if ( Map.isNearRuin(l62) && !maxT || p.isEnemy()){
            Map.markCenterNearRuins(l78);
            ans = null;
            return;
        }
        if (p != PaintType.ALLY_SECONDARY){
            ans = l70; // (3,3)
            attackLoc = l62;
        }


    }


}