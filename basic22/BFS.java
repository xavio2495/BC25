package basic22;

import battlecode.common.Direction;
import battlecode.common.MapInfo;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class BFS {

    static RobotController rc;

    static void initiate() {
        rc = MyRobot.rc;
    }

    static MapLocation l30;
    static int v30;
    static Direction d30;
    static int p30;
    static MapInfo m30;

    static MapLocation l31;
    static int v31;
    static Direction d31;
    static int p31;
    static MapInfo m31;

    static MapLocation l32;
    static int v32;
    static Direction d32;
    static int p32;
    static MapInfo m32;

    static MapLocation l33;
    static int v33;
    static Direction d33;
    static int p33;
    static MapInfo m33;

    static MapLocation l34;
    static int v34;
    static Direction d34;
    static int p34;
    static MapInfo m34;

    static MapLocation l42;
    static int v42;
    static Direction d42;
    static int p42;
    static MapInfo m42;

    static MapLocation l43;
    static int v43;
    static Direction d43;
    static int p43;
    static MapInfo m43;

    static MapLocation l44;
    static int v44;
    static Direction d44;
    static int p44;
    static MapInfo m44;

    static MapLocation l45;
    static int v45;
    static Direction d45;
    static int p45;
    static MapInfo m45;

    static MapLocation l46;
    static int v46;
    static Direction d46;
    static int p46;
    static MapInfo m46;

    static MapLocation l47;
    static int v47;
    static Direction d47;
    static int p47;
    static MapInfo m47;

    static MapLocation l48;
    static int v48;
    static Direction d48;
    static int p48;
    static MapInfo m48;

    static MapLocation l54;
    static int v54;
    static Direction d54;
    static int p54;
    static MapInfo m54;

    static MapLocation l55;
    static int v55;
    static Direction d55;
    static int p55;
    static MapInfo m55;

    static MapLocation l56;
    static int v56;
    static Direction d56;
    static int p56;
    static MapInfo m56;

    static MapLocation l57;
    static int v57;
    static Direction d57;
    static int p57;
    static MapInfo m57;

    static MapLocation l58;
    static int v58;
    static Direction d58;
    static int p58;
    static MapInfo m58;

    static MapLocation l59;
    static int v59;
    static Direction d59;
    static int p59;
    static MapInfo m59;

    static MapLocation l60;
    static int v60;
    static Direction d60;
    static int p60;
    static MapInfo m60;

    static MapLocation l61;
    static int v61;
    static Direction d61;
    static int p61;
    static MapInfo m61;

    static MapLocation l62;
    static int v62;
    static Direction d62;
    static int p62;
    static MapInfo m62;

    static MapLocation l67;
    static int v67;
    static Direction d67;
    static int p67;
    static MapInfo m67;

    static MapLocation l68;
    static int v68;
    static Direction d68;
    static int p68;
    static MapInfo m68;

    static MapLocation l69;
    static int v69;
    static Direction d69;
    static int p69;
    static MapInfo m69;

    static MapLocation l70;
    static int v70;
    static Direction d70;
    static int p70;
    static MapInfo m70;

    static MapLocation l71;
    static int v71;
    static Direction d71;
    static int p71;
    static MapInfo m71;

    static MapLocation l72;
    static int v72;
    static Direction d72;
    static int p72;
    static MapInfo m72;

    static MapLocation l73;
    static int v73;
    static Direction d73;
    static int p73;
    static MapInfo m73;

    static MapLocation l74;
    static int v74;
    static Direction d74;
    static int p74;
    static MapInfo m74;

    static MapLocation l75;
    static int v75;
    static Direction d75;
    static int p75;
    static MapInfo m75;

    static MapLocation l80;
    static int v80;
    static Direction d80;
    static int p80;
    static MapInfo m80;

    static MapLocation l81;
    static int v81;
    static Direction d81;
    static int p81;
    static MapInfo m81;

    static MapLocation l82;
    static int v82;
    static Direction d82;
    static int p82;
    static MapInfo m82;

    static MapLocation l83;
    static int v83;
    static Direction d83;
    static int p83;
    static MapInfo m83;

    static MapLocation l84;
    static int v84;
    static Direction d84;
    static int p84;
    static MapInfo m84;

    static MapLocation l85;
    static int v85;
    static Direction d85;
    static int p85;
    static MapInfo m85;

    static MapLocation l86;
    static int v86;
    static Direction d86;
    static int p86;
    static MapInfo m86;

    static MapLocation l87;
    static int v87;
    static Direction d87;
    static int p87;
    static MapInfo m87;

    static MapLocation l88;
    static int v88;
    static Direction d88;
    static int p88;
    static MapInfo m88;

    static MapLocation l93;
    static int v93;
    static Direction d93;
    static int p93;
    static MapInfo m93;

    static MapLocation l94;
    static int v94;
    static Direction d94;
    static int p94;
    static MapInfo m94;

    static MapLocation l95;
    static int v95;
    static Direction d95;
    static int p95;
    static MapInfo m95;

    static MapLocation l96;
    static int v96;
    static Direction d96;
    static int p96;
    static MapInfo m96;

    static MapLocation l97;
    static int v97;
    static Direction d97;
    static int p97;
    static MapInfo m97;

    static MapLocation l98;
    static int v98;
    static Direction d98;
    static int p98;
    static MapInfo m98;

    static MapLocation l99;
    static int v99;
    static Direction d99;
    static int p99;
    static MapInfo m99;

    static MapLocation l100;
    static int v100;
    static Direction d100;
    static int p100;
    static MapInfo m100;

    static MapLocation l101;
    static int v101;
    static Direction d101;
    static int p101;
    static MapInfo m101;

    static MapLocation l106;
    static int v106;
    static Direction d106;
    static int p106;
    static MapInfo m106;

    static MapLocation l107;
    static int v107;
    static Direction d107;
    static int p107;
    static MapInfo m107;

    static MapLocation l108;
    static int v108;
    static Direction d108;
    static int p108;
    static MapInfo m108;

    static MapLocation l109;
    static int v109;
    static Direction d109;
    static int p109;
    static MapInfo m109;

    static MapLocation l110;
    static int v110;
    static Direction d110;
    static int p110;
    static MapInfo m110;

    static MapLocation l111;
    static int v111;
    static Direction d111;
    static int p111;
    static MapInfo m111;

    static MapLocation l112;
    static int v112;
    static Direction d112;
    static int p112;
    static MapInfo m112;

    static MapLocation l113;
    static int v113;
    static Direction d113;
    static int p113;
    static MapInfo m113;

    static MapLocation l114;
    static int v114;
    static Direction d114;
    static int p114;
    static MapInfo m114;

    static MapLocation l120;
    static int v120;
    static Direction d120;
    static int p120;
    static MapInfo m120;

    static MapLocation l121;
    static int v121;
    static Direction d121;
    static int p121;
    static MapInfo m121;

    static MapLocation l122;
    static int v122;
    static Direction d122;
    static int p122;
    static MapInfo m122;

    static MapLocation l123;
    static int v123;
    static Direction d123;
    static int p123;
    static MapInfo m123;

    static MapLocation l124;
    static int v124;
    static Direction d124;
    static int p124;
    static MapInfo m124;

    static MapLocation l125;
    static int v125;
    static Direction d125;
    static int p125;
    static MapInfo m125;

    static MapLocation l126;
    static int v126;
    static Direction d126;
    static int p126;
    static MapInfo m126;

    static MapLocation l134;
    static int v134;
    static Direction d134;
    static int p134;
    static MapInfo m134;

    static MapLocation l135;
    static int v135;
    static Direction d135;
    static int p135;
    static MapInfo m135;

    static MapLocation l136;
    static int v136;
    static Direction d136;
    static int p136;
    static MapInfo m136;

    static MapLocation l137;
    static int v137;
    static Direction d137;
    static int p137;
    static MapInfo m137;

    static MapLocation l138;
    static int v138;
    static Direction d138;
    static int p138;
    static MapInfo m138;

}
