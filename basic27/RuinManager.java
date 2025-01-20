package basic27;

import battlecode.common.*;

public class RuinManager {

    static int getType(int typeCode) {
        return switch ((typeCode & 15)) {
            case 1, 9 -> PAINT;
            case 2, 10 -> MONEY;
            case 4, 12 -> DEFENSE;
            default -> -1;
        };
    }

    static void drawPatternEnhanced(MapLocation ruinLoc, int pattern) throws GameActionException {
        if (!rc.isActionReady()) return;
        MapLocation myLoc = rc.getLocation();
        if (myLoc.distanceSquaredTo(ruinLoc) > 8) {
            drawPattern(ruinLoc, pattern);
            return;
        }
        PaintType p = rc.senseMapInfo(myLoc).getPaint();
        int pt = switch (pattern) {
            case PAINT -> 18157905;
            case MONEY -> 15583086;
            default -> 4685252;
        };
        int dx = myLoc.x - ruinLoc.x + 2;
        int dy = myLoc.y - ruinLoc.y + 2;
        int b = dx * 5 + dy;
        boolean sc = (((pt >>> b) & 1) > 0);
        PaintType tp = sc ? PaintType.ALLY_SECONDARY : PaintType.ALLY_PRIMARY;
        if (p != tp && !p.isEnemy() && rc.canAttack(rc.getLocation())) {
            rc.attack(myLoc, sc);
            return;
        }
        drawPattern(ruinLoc, pattern);
    }


    static final long codePaint = 657947488577110L;
    static final long codeMoney = 468008181590441L;
    static final long codeDefense = 392982706955621L;
    static final int PAINT = 0, MONEY = 1, DEFENSE = 2, UNSEEN = 3;

    static MapLocation l0;
    static MapInfo m0;
    static MapLocation l1;
    static MapInfo m1;
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
    static MapLocation l7;
    static MapInfo m7;
    static MapLocation l8;
    static MapInfo m8;
    static MapLocation l9;
    static MapInfo m9;
    static MapLocation l10;
    static MapInfo m10;
    static MapLocation l11;
    static MapInfo m11;
    static MapLocation l13;
    static MapInfo m13;
    static MapLocation l14;
    static MapInfo m14;
    static MapLocation l15;
    static MapInfo m15;
    static MapLocation l16;
    static MapInfo m16;
    static MapLocation l17;
    static MapInfo m17;
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

    static RobotController rc;

    static int checkPattern (MapLocation ruinLoc) throws GameActionException {

        rc = MyRobot.rc;

        l0 = ruinLoc.translate(-2,-2);
        if (rc.canSenseLocation(l0)) m0 = rc.senseMapInfo(l0);
        l1 = ruinLoc.translate(-2,-1);
        if (rc.canSenseLocation(l1)) m1 = rc.senseMapInfo(l1);
        l2 = ruinLoc.translate(-2,0);
        if (rc.canSenseLocation(l2)) m2 = rc.senseMapInfo(l2);
        l3 = ruinLoc.translate(-2,1);
        if (rc.canSenseLocation(l3)) m3 = rc.senseMapInfo(l3);
        l4 = ruinLoc.translate(-2,2);
        if (rc.canSenseLocation(l4)) m4 = rc.senseMapInfo(l4);
        l5 = ruinLoc.translate(-1,-2);
        if (rc.canSenseLocation(l5)) m5 = rc.senseMapInfo(l5);
        l6 = ruinLoc.translate(-1,-1);
        if (rc.canSenseLocation(l6)) m6 = rc.senseMapInfo(l6);
        l7 = ruinLoc.translate(-1,0);
        if (rc.canSenseLocation(l7)) m7 = rc.senseMapInfo(l7);
        l8 = ruinLoc.translate(-1,1);
        if (rc.canSenseLocation(l8)) m8 = rc.senseMapInfo(l8);
        l9 = ruinLoc.translate(-1,2);
        if (rc.canSenseLocation(l9)) m9 = rc.senseMapInfo(l9);
        l10 = ruinLoc.translate(0,-2);
        if (rc.canSenseLocation(l10)) m10 = rc.senseMapInfo(l10);
        l11 = ruinLoc.translate(0,-1);
        if (rc.canSenseLocation(l11)) m11 = rc.senseMapInfo(l11);
        l13 = ruinLoc.translate(0,1);
        if (rc.canSenseLocation(l13)) m13 = rc.senseMapInfo(l13);
        l14 = ruinLoc.translate(0,2);
        if (rc.canSenseLocation(l14)) m14 = rc.senseMapInfo(l14);
        l15 = ruinLoc.translate(1,-2);
        if (rc.canSenseLocation(l15)) m15 = rc.senseMapInfo(l15);
        l16 = ruinLoc.translate(1,-1);
        if (rc.canSenseLocation(l16)) m16 = rc.senseMapInfo(l16);
        l17 = ruinLoc.translate(1,0);
        if (rc.canSenseLocation(l17)) m17 = rc.senseMapInfo(l17);
        l18 = ruinLoc.translate(1,1);
        if (rc.canSenseLocation(l18)) m18 = rc.senseMapInfo(l18);
        l19 = ruinLoc.translate(1,2);
        if (rc.canSenseLocation(l19)) m19 = rc.senseMapInfo(l19);
        l20 = ruinLoc.translate(2,-2);
        if (rc.canSenseLocation(l20)) m20 = rc.senseMapInfo(l20);
        l21 = ruinLoc.translate(2,-1);
        if (rc.canSenseLocation(l21)) m21 = rc.senseMapInfo(l21);
        l22 = ruinLoc.translate(2,0);
        if (rc.canSenseLocation(l22)) m22 = rc.senseMapInfo(l22);
        l23 = ruinLoc.translate(2,1);
        if (rc.canSenseLocation(l23)) m23 = rc.senseMapInfo(l23);
        l24 = ruinLoc.translate(2,2);
        if (rc.canSenseLocation(l24)) m24 = rc.senseMapInfo(l24);

        MapLocation myLoc = rc.getLocation();
        int dx = myLoc.x - ruinLoc.x, dy = myLoc.y - ruinLoc.y;
        int dencode = (dx+4)*9 + (dy+4);
        switch(dencode){
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
            case 18:
                return process18();
            case 19:
                return process19();
            case 20:
                return process20();
            case 21:
            case 29:
                return process21();
            case 22:
            case 30:
            case 31:
            case 32:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 48:
            case 49:
            case 50:
            case 58:
                return process22();
            case 23:
            case 33:
                return process23();
            case 24:
                return process24();
            case 25:
                return process25();
            case 26:
                return process26();
            case 27:
                return process27();
            case 28:
                return process28();
            case 34:
                return process34();
            case 35:
                return process35();
            case 36:
                return process36();
            case 37:
                return process37();
            case 43:
                return process43();
            case 44:
                return process44();
            case 45:
                return process45();
            case 46:
                return process46();
            case 47:
            case 57:
                return process47();
            case 51:
            case 59:
                return process51();
            case 52:
                return process52();
            case 53:
                return process53();
            case 54:
                return process54();
            case 55:
                return process55();
            case 56:
                return process56();
            case 60:
                return process60();
            case 61:
                return process61();
            case 62:
                return process62();
            case 64:
                return process64();
            case 65:
                return process65();
            case 66:
                return process66();
            case 67:
                return process67();
            case 68:
                return process68();
            case 69:
                return process69();
            case 70:
                return process70();
            case 74:
                return process74();
            case 75:
                return process75();
            case 76:
                return process76();
            case 77:
                return process77();
            case 78:
                return process78();
        }
        return 0;
    }


    static int process2(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process3(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process4(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process5(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process6(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process10(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process11(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process12(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process13(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process14(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process15(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process16(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process18(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process19(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process20(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process21(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process22(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process23(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process24(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process25(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process26(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process27(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process28(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process34(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process35(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process36(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process37(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process43(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process44(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process45(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process46(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process47(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process51(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process52(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process53(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process54(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process55(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process56(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m0.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 0));
        switch(m1.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 2));
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process60(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m2.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 4));
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process61(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m3.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 6));
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process62(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m4.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 8));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process64(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process65(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process66(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process67(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m5.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 10));
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process68(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m6.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 12));
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process69(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m7.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 14));
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process70(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m8.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 16));
        switch(m9.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 18));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process74(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process75(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process76(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m10.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 20));
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process77(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m11.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 22));
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m15.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 30));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static int process78(){
        long c = 0;
        int ans = 0;
        long colorBit;
        boolean enemyPaint = false;
        boolean allyPaint = false;
        boolean emptyTiles = false;
        switch(m13.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 26));
        switch(m14.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 28));
        switch(m16.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 32));
        switch(m17.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 34));
        switch(m18.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 36));
        switch(m19.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 38));
        switch(m20.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 40));
        switch(m21.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 42));
        switch(m22.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 44));
        switch(m23.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 46));
        switch(m24.getPaint()) {
            case ALLY_PRIMARY:
                allyPaint = true;
                colorBit = 1;
                break;
            case ALLY_SECONDARY:
                allyPaint = true;
                colorBit = 2;
                break;
            case EMPTY:
                emptyTiles = true;
                colorBit = 0;
                break;
            default:
                colorBit = 3;
                enemyPaint = true;
                break;
        }
        c = (c | (colorBit << 48));
        if ((c | 657947488577110L) == 657947488577110L) ans |= 1;
        if ((c | 468008181590441L) == 468008181590441L) ans |= 2;
        if ((c | 392982706955621L) == 392982706955621L) ans |= 4;
        ans |= 8;
        if (enemyPaint) ans |= 16;
        if (allyPaint || !emptyTiles) ans |= 32;
        return ans;
    }


    static void drawPattern (MapLocation ruinLoc, int pattern) throws GameActionException {
        l0 = ruinLoc.translate(-2,-2);
        if (rc.canSenseLocation(l0)) m0 = rc.senseMapInfo(l0);
        l1 = ruinLoc.translate(-2,-1);
        if (rc.canSenseLocation(l1)) m1 = rc.senseMapInfo(l1);
        l2 = ruinLoc.translate(-2,0);
        if (rc.canSenseLocation(l2)) m2 = rc.senseMapInfo(l2);
        l3 = ruinLoc.translate(-2,1);
        if (rc.canSenseLocation(l3)) m3 = rc.senseMapInfo(l3);
        l4 = ruinLoc.translate(-2,2);
        if (rc.canSenseLocation(l4)) m4 = rc.senseMapInfo(l4);
        l5 = ruinLoc.translate(-1,-2);
        if (rc.canSenseLocation(l5)) m5 = rc.senseMapInfo(l5);
        l6 = ruinLoc.translate(-1,-1);
        if (rc.canSenseLocation(l6)) m6 = rc.senseMapInfo(l6);
        l7 = ruinLoc.translate(-1,0);
        if (rc.canSenseLocation(l7)) m7 = rc.senseMapInfo(l7);
        l8 = ruinLoc.translate(-1,1);
        if (rc.canSenseLocation(l8)) m8 = rc.senseMapInfo(l8);
        l9 = ruinLoc.translate(-1,2);
        if (rc.canSenseLocation(l9)) m9 = rc.senseMapInfo(l9);
        l10 = ruinLoc.translate(0,-2);
        if (rc.canSenseLocation(l10)) m10 = rc.senseMapInfo(l10);
        l11 = ruinLoc.translate(0,-1);
        if (rc.canSenseLocation(l11)) m11 = rc.senseMapInfo(l11);
        l13 = ruinLoc.translate(0,1);
        if (rc.canSenseLocation(l13)) m13 = rc.senseMapInfo(l13);
        l14 = ruinLoc.translate(0,2);
        if (rc.canSenseLocation(l14)) m14 = rc.senseMapInfo(l14);
        l15 = ruinLoc.translate(1,-2);
        if (rc.canSenseLocation(l15)) m15 = rc.senseMapInfo(l15);
        l16 = ruinLoc.translate(1,-1);
        if (rc.canSenseLocation(l16)) m16 = rc.senseMapInfo(l16);
        l17 = ruinLoc.translate(1,0);
        if (rc.canSenseLocation(l17)) m17 = rc.senseMapInfo(l17);
        l18 = ruinLoc.translate(1,1);
        if (rc.canSenseLocation(l18)) m18 = rc.senseMapInfo(l18);
        l19 = ruinLoc.translate(1,2);
        if (rc.canSenseLocation(l19)) m19 = rc.senseMapInfo(l19);
        l20 = ruinLoc.translate(2,-2);
        if (rc.canSenseLocation(l20)) m20 = rc.senseMapInfo(l20);
        l21 = ruinLoc.translate(2,-1);
        if (rc.canSenseLocation(l21)) m21 = rc.senseMapInfo(l21);
        l22 = ruinLoc.translate(2,0);
        if (rc.canSenseLocation(l22)) m22 = rc.senseMapInfo(l22);
        l23 = ruinLoc.translate(2,1);
        if (rc.canSenseLocation(l23)) m23 = rc.senseMapInfo(l23);
        l24 = ruinLoc.translate(2,2);
        if (rc.canSenseLocation(l24)) m24 = rc.senseMapInfo(l24);
        switch (pattern) {
            case PAINT:
                drawPatternPaint(ruinLoc);
                break;
            case MONEY:
                drawPatternMoney(ruinLoc);
                break;
            case DEFENSE:
                drawPatternDefense(ruinLoc);
                break;
        }
    }






    static void drawPatternPaint (MapLocation ruinLoc) throws GameActionException {

        if (rc.getPaint() <= Constants.MIN_SOLDIER_MOVEMENT) return;
        if (!rc.isActionReady()) return;

        MapLocation myLoc = rc.getLocation();
        int dx = myLoc.x - ruinLoc.x, dy = myLoc.y - ruinLoc.y;
        int dencode = (dx+4)*9 + (dy+4);
        switch(dencode){
            case 2:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                break;
            case 3:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 4:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                break;
            case 5:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 6:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                break;
            case 10:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 11:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                break;
            case 12:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 13:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                break;
            case 14:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 15:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                break;
            case 16:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 18:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                break;
            case 19:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 20:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 21:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 22:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 23:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 24:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 25:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 26:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                break;
            case 27:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 28:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 29:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 30:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 31:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 32:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 33:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 34:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 35:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 36:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 37:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 38:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 39:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 40:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 41:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 42:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 43:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 44:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 45:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 46:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 47:
                if(m0.getPaint() != PaintType.ALLY_SECONDARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, true);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 48:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 49:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_PRIMARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 50:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 51:
                if(m4.getPaint() != PaintType.ALLY_SECONDARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 52:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 53:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 54:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                break;
            case 55:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 56:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 57:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 58:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 59:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 60:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 61:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 62:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                break;
            case 64:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 65:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_PRIMARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 66:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 67:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 68:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 69:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_PRIMARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 70:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 74:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                break;
            case 75:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 76:
                if(m20.getPaint() != PaintType.ALLY_SECONDARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, true);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 77:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 78:
                if(m24.getPaint() != PaintType.ALLY_SECONDARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_PRIMARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, false);
                    return;
                }
                break;
        }
    }



    static void drawPatternMoney (MapLocation ruinLoc) throws GameActionException {

        if (rc.getPaint() <= Constants.MIN_SOLDIER_MOVEMENT) return;
        if (!rc.isActionReady()) return;

        MapLocation myLoc = rc.getLocation();
        int dx = myLoc.x - ruinLoc.x, dy = myLoc.y - ruinLoc.y;
        int dencode = (dx+4)*9 + (dy+4);
        switch(dencode){
            case 2:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                break;
            case 3:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 4:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                break;
            case 5:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 6:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                break;
            case 10:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 11:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                break;
            case 12:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 13:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                break;
            case 14:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 15:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                break;
            case 16:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 18:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                break;
            case 19:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 20:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 21:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 22:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 23:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 24:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 25:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 26:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                break;
            case 27:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 28:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 29:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 30:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 31:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 32:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 33:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 34:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 35:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 36:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 37:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 38:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 39:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 40:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 41:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 42:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 43:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 44:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 45:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 46:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 47:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 48:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_SECONDARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, true);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 49:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 50:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_SECONDARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, true);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 51:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 52:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 53:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 54:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                break;
            case 55:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                break;
            case 56:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_SECONDARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, true);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 57:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 58:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_PRIMARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, false);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 59:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 60:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_SECONDARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 61:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                break;
            case 62:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                break;
            case 64:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 65:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 66:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_PRIMARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 67:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 68:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_PRIMARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, false);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 69:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 70:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 74:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_SECONDARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, true);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                break;
            case 75:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 76:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_PRIMARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, false);
                    return;
                }
                break;
            case 77:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_SECONDARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 78:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_SECONDARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, true);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_SECONDARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                break;
        }
    }



    static void drawPatternDefense (MapLocation ruinLoc) throws GameActionException {

        if (rc.getPaint() <= Constants.MIN_SOLDIER_MOVEMENT) return;
        if (!rc.isActionReady()) return;

        MapLocation myLoc = rc.getLocation();
        int dx = myLoc.x - ruinLoc.x, dy = myLoc.y - ruinLoc.y;
        int dencode = (dx+4)*9 + (dy+4);
        switch(dencode){
            case 2:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                break;
            case 3:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 4:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                break;
            case 5:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 6:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                break;
            case 10:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 11:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                break;
            case 12:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                break;
            case 13:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                break;
            case 14:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 15:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                break;
            case 16:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 18:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                break;
            case 19:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                break;
            case 20:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                break;
            case 21:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 22:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 23:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 24:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 25:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 26:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                break;
            case 27:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                break;
            case 28:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                break;
            case 29:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 30:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 31:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 32:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 33:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 34:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 35:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                break;
            case 36:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                break;
            case 37:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                break;
            case 38:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 39:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 40:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 41:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 42:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 43:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 44:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 45:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 46:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 47:
                if(m0.getPaint() != PaintType.ALLY_PRIMARY && !m0.getPaint().isEnemy()) {
                    rc.attack(l0, false);
                    return;
                }
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 48:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m1.getPaint() != PaintType.ALLY_PRIMARY && !m1.getPaint().isEnemy()) {
                    rc.attack(l1, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 49:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m2.getPaint() != PaintType.ALLY_SECONDARY && !m2.getPaint().isEnemy()) {
                    rc.attack(l2, true);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 50:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m3.getPaint() != PaintType.ALLY_PRIMARY && !m3.getPaint().isEnemy()) {
                    rc.attack(l3, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 51:
                if(m4.getPaint() != PaintType.ALLY_PRIMARY && !m4.getPaint().isEnemy()) {
                    rc.attack(l4, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 52:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 53:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 54:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                break;
            case 55:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                break;
            case 56:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m5.getPaint() != PaintType.ALLY_PRIMARY && !m5.getPaint().isEnemy()) {
                    rc.attack(l5, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 57:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m6.getPaint() != PaintType.ALLY_SECONDARY && !m6.getPaint().isEnemy()) {
                    rc.attack(l6, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 58:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m7.getPaint() != PaintType.ALLY_SECONDARY && !m7.getPaint().isEnemy()) {
                    rc.attack(l7, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 59:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m8.getPaint() != PaintType.ALLY_SECONDARY && !m8.getPaint().isEnemy()) {
                    rc.attack(l8, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 60:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m9.getPaint() != PaintType.ALLY_PRIMARY && !m9.getPaint().isEnemy()) {
                    rc.attack(l9, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 61:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                break;
            case 62:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                break;
            case 64:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 65:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m10.getPaint() != PaintType.ALLY_SECONDARY && !m10.getPaint().isEnemy()) {
                    rc.attack(l10, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 66:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m11.getPaint() != PaintType.ALLY_SECONDARY && !m11.getPaint().isEnemy()) {
                    rc.attack(l11, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 67:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 68:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m13.getPaint() != PaintType.ALLY_SECONDARY && !m13.getPaint().isEnemy()) {
                    rc.attack(l13, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 69:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m14.getPaint() != PaintType.ALLY_SECONDARY && !m14.getPaint().isEnemy()) {
                    rc.attack(l14, true);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 70:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 74:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m15.getPaint() != PaintType.ALLY_PRIMARY && !m15.getPaint().isEnemy()) {
                    rc.attack(l15, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                break;
            case 75:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m16.getPaint() != PaintType.ALLY_SECONDARY && !m16.getPaint().isEnemy()) {
                    rc.attack(l16, true);
                    return;
                }
                break;
            case 76:
                if(m20.getPaint() != PaintType.ALLY_PRIMARY && !m20.getPaint().isEnemy()) {
                    rc.attack(l20, false);
                    return;
                }
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m17.getPaint() != PaintType.ALLY_SECONDARY && !m17.getPaint().isEnemy()) {
                    rc.attack(l17, true);
                    return;
                }
                break;
            case 77:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m21.getPaint() != PaintType.ALLY_PRIMARY && !m21.getPaint().isEnemy()) {
                    rc.attack(l21, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                if(m18.getPaint() != PaintType.ALLY_SECONDARY && !m18.getPaint().isEnemy()) {
                    rc.attack(l18, true);
                    return;
                }
                break;
            case 78:
                if(m24.getPaint() != PaintType.ALLY_PRIMARY && !m24.getPaint().isEnemy()) {
                    rc.attack(l24, false);
                    return;
                }
                if(m19.getPaint() != PaintType.ALLY_PRIMARY && !m19.getPaint().isEnemy()) {
                    rc.attack(l19, false);
                    return;
                }
                if(m23.getPaint() != PaintType.ALLY_PRIMARY && !m23.getPaint().isEnemy()) {
                    rc.attack(l23, false);
                    return;
                }
                if(m22.getPaint() != PaintType.ALLY_SECONDARY && !m22.getPaint().isEnemy()) {
                    rc.attack(l22, true);
                    return;
                }
                break;
        }
    }

}
