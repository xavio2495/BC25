package basic23;


import battlecode.common.*;

public class BFSTower extends BFS {


    static void computeDists() throws GameActionException {
        l84 = rc.getLocation();
        v84 = 0;
        l85 = l84.add(Direction.NORTH);
        v85 = 1000000;
        d85 = null;
        l72 = l85.add(Direction.WEST);
        v72 = 1000000;
        d72 = null;
        l71 = l72.add(Direction.SOUTH);
        v71 = 1000000;
        d71 = null;
        l70 = l71.add(Direction.SOUTH);
        v70 = 1000000;
        d70 = null;
        l83 = l70.add(Direction.EAST);
        v83 = 1000000;
        d83 = null;
        l96 = l83.add(Direction.EAST);
        v96 = 1000000;
        d96 = null;
        l97 = l96.add(Direction.NORTH);
        v97 = 1000000;
        d97 = null;
        l98 = l97.add(Direction.NORTH);
        v98 = 1000000;
        d98 = null;
        l99 = l98.add(Direction.NORTH);
        v99 = 1000000;
        d99 = null;
        l86 = l99.add(Direction.WEST);
        v86 = 1000000;
        d86 = null;
        l73 = l86.add(Direction.WEST);
        v73 = 1000000;
        d73 = null;
        l60 = l73.add(Direction.WEST);
        v60 = 1000000;
        d60 = null;
        l59 = l60.add(Direction.SOUTH);
        v59 = 1000000;
        d59 = null;
        l58 = l59.add(Direction.SOUTH);
        v58 = 1000000;
        d58 = null;
        l57 = l58.add(Direction.SOUTH);
        v57 = 1000000;
        d57 = null;
        l56 = l57.add(Direction.SOUTH);
        v56 = 1000000;
        d56 = null;
        l69 = l56.add(Direction.EAST);
        v69 = 1000000;
        d69 = null;
        l82 = l69.add(Direction.EAST);
        v82 = 1000000;
        d82 = null;
        l95 = l82.add(Direction.EAST);
        v95 = 1000000;
        d95 = null;
        l108 = l95.add(Direction.EAST);
        v108 = 1000000;
        d108 = null;
        l109 = l108.add(Direction.NORTH);
        v109 = 1000000;
        d109 = null;
        l110 = l109.add(Direction.NORTH);
        v110 = 1000000;
        d110 = null;
        l111 = l110.add(Direction.NORTH);
        v111 = 1000000;
        d111 = null;
        l112 = l111.add(Direction.NORTH);
        v112 = 1000000;
        d112 = null;
        l100 = l112.add(Direction.NORTHWEST);
        v100 = 1000000;
        d100 = null;
        l87 = l100.add(Direction.WEST);
        v87 = 1000000;
        d87 = null;
        l74 = l87.add(Direction.WEST);
        v74 = 1000000;
        d74 = null;
        l61 = l74.add(Direction.WEST);
        v61 = 1000000;
        d61 = null;
        l47 = l61.add(Direction.SOUTHWEST);
        v47 = 1000000;
        d47 = null;
        l46 = l47.add(Direction.SOUTH);
        v46 = 1000000;
        d46 = null;
        l45 = l46.add(Direction.SOUTH);
        v45 = 1000000;
        d45 = null;
        l44 = l45.add(Direction.SOUTH);
        v44 = 1000000;
        d44 = null;
        l43 = l44.add(Direction.SOUTH);
        v43 = 1000000;
        d43 = null;
        l55 = l43.add(Direction.SOUTHEAST);
        v55 = 1000000;
        d55 = null;
        l68 = l55.add(Direction.EAST);
        v68 = 1000000;
        d68 = null;
        l81 = l68.add(Direction.EAST);
        v81 = 1000000;
        d81 = null;
        l94 = l81.add(Direction.EAST);
        v94 = 1000000;
        d94 = null;
        l107 = l94.add(Direction.EAST);
        v107 = 1000000;
        d107 = null;
        l121 = l107.add(Direction.NORTHEAST);
        v121 = 1000000;
        d121 = null;
        l122 = l121.add(Direction.NORTH);
        v122 = 1000000;
        d122 = null;
        l123 = l122.add(Direction.NORTH);
        v123 = 1000000;
        d123 = null;
        l124 = l123.add(Direction.NORTH);
        v124 = 1000000;
        d124 = null;
        l125 = l124.add(Direction.NORTH);
        v125 = 1000000;
        d125 = null;
        l113 = l125.add(Direction.NORTHWEST);
        v113 = 1000000;
        d113 = null;
        l101 = l113.add(Direction.NORTHWEST);
        v101 = 1000000;
        d101 = null;
        l88 = l101.add(Direction.WEST);
        v88 = 1000000;
        d88 = null;
        l75 = l88.add(Direction.WEST);
        v75 = 1000000;
        d75 = null;
        l62 = l75.add(Direction.WEST);
        v62 = 1000000;
        d62 = null;
        l48 = l62.add(Direction.SOUTHWEST);
        v48 = 1000000;
        d48 = null;
        l34 = l48.add(Direction.SOUTHWEST);
        v34 = 1000000;
        d34 = null;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        d33 = null;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        d32 = null;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        d31 = null;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        d30 = null;
        l42 = l30.add(Direction.SOUTHEAST);
        v42 = 1000000;
        d42 = null;
        l54 = l42.add(Direction.SOUTHEAST);
        v54 = 1000000;
        d54 = null;
        l67 = l54.add(Direction.EAST);
        v67 = 1000000;
        d67 = null;
        l80 = l67.add(Direction.EAST);
        v80 = 1000000;
        d80 = null;
        l93 = l80.add(Direction.EAST);
        v93 = 1000000;
        d93 = null;
        l106 = l93.add(Direction.EAST);
        v106 = 1000000;
        d106 = null;
        l120 = l106.add(Direction.NORTHEAST);
        v120 = 1000000;
        d120 = null;
        l134 = l120.add(Direction.NORTHEAST);
        v134 = 1000000;
        d134 = null;
        l135 = l134.add(Direction.NORTH);
        v135 = 1000000;
        d135 = null;
        l136 = l135.add(Direction.NORTH);
        v136 = 1000000;
        d136 = null;
        l137 = l136.add(Direction.NORTH);
        v137 = 1000000;
        d137 = null;
        l138 = l137.add(Direction.NORTH);
        v138 = 1000000;
        d138 = null;
        l126 = l138.add(Direction.NORTHWEST);
        v126 = 1000000;
        d126 = null;
        l114 = l126.add(Direction.NORTHWEST);
        v114 = 1000000;
        d114 = null;

        if (rc.onTheMap(l71)){
            m71 =  rc.senseMapInfo(l71);
            if (m71.isPassable()){
                p71 = 10 + switch(m71.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                p71 += 5*Util.getPaintLost(Direction.WEST);
                v71 = v84 + p71;
                d71 = Direction.WEST;
            }
        }
        if (rc.onTheMap(l83)){
            m83 =  rc.senseMapInfo(l83);
            if (m83.isPassable()){
                p83 = 10 + switch(m83.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                p83 += 5*Util.getPaintLost(Direction.SOUTH);
                if (v84 > v71) {
                    v83 = v71 + p83;
                    d83 = d71;
                }
                else {
                    v83 = v84 + p83;
                    d83 = Direction.SOUTH;
                }
            }
        }
        if (rc.onTheMap(l85)){
            m85 =  rc.senseMapInfo(l85);
            if (m85.isPassable()){
                p85 = 10 + switch(m85.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                p85 += 5*Util.getPaintLost(Direction.NORTH);
                if (v84 > v71) {
                    v85 = v71 + p85;
                    d85 = d71;
                }
                else {
                    v85 = v84 + p85;
                    d85 = Direction.NORTH;
                }
            }
        }
        if (rc.onTheMap(l97)){
            m97 =  rc.senseMapInfo(l97);
            if (m97.isPassable()){
                p97 = 10 + switch(m97.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                p97 += 5*Util.getPaintLost(Direction.EAST);
                if (v84 > v85) {
                    if (v85 > v83) {
                        v97 = v83 + p97;
                        d97 = d83;
                    }
                    else {
                        v97 = v85 + p97;
                        d97 = d85;
                    }
                }
                else {
                    if (v84 > v83) {
                        v97 = v83 + p97;
                        d97 = d83;
                    }
                    else {
                        v97 = v84 + p97;
                        d97 = Direction.EAST;
                    }
                }
            }
        }
        if (rc.onTheMap(l70)){
            m70 =  rc.senseMapInfo(l70);
            if (m70.isPassable()){
                p70 = 10 + switch(m70.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                p70 += 5*Util.getPaintLost(Direction.SOUTHWEST);
                if (v84 > v71) {
                    if (v71 > v83) {
                        v70 = v83 + p70;
                        d70 = d83;
                    }
                    else {
                        v70 = v71 + p70;
                        d70 = d71;
                    }
                }
                else {
                    if (v84 > v83) {
                        v70 = v83 + p70;
                        d70 = d83;
                    }
                    else {
                        v70 = v84 + p70;
                        d70 = Direction.SOUTHWEST;
                    }
                }
            }
        }
        if (rc.onTheMap(l72)){
            m72 =  rc.senseMapInfo(l72);
            if (m72.isPassable()){
                p72 = 10 + switch(m72.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                p72 += 5*Util.getPaintLost(Direction.NORTHWEST);
                if (v84 > v71) {
                    if (v71 > v85) {
                        v72 = v85 + p72;
                        d72 = d85;
                    }
                    else {
                        v72 = v71 + p72;
                        d72 = d71;
                    }
                }
                else {
                    if (v84 > v85) {
                        v72 = v85 + p72;
                        d72 = d85;
                    }
                    else {
                        v72 = v84 + p72;
                        d72 = Direction.NORTHWEST;
                    }
                }
            }
        }
        if (rc.onTheMap(l96)){
            m96 =  rc.senseMapInfo(l96);
            if (m96.isPassable()){
                p96 = 10 + switch(m96.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                p96 += 5*Util.getPaintLost(Direction.SOUTHEAST);
                if (v84 > v97) {
                    if (v97 > v83) {
                        v96 = v83 + p96;
                        d96 = d83;
                    }
                    else {
                        v96 = v97 + p96;
                        d96 = d97;
                    }
                }
                else {
                    if (v84 > v83) {
                        v96 = v83 + p96;
                        d96 = d83;
                    }
                    else {
                        v96 = v84 + p96;
                        d96 = Direction.SOUTHEAST;
                    }
                }
            }
        }
        if (rc.onTheMap(l98)){
            m98 =  rc.senseMapInfo(l98);
            if (m98.isPassable()){
                p98 = 10 + switch(m98.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                p98 += 5*Util.getPaintLost(Direction.NORTHEAST);
                if (v84 > v85) {
                    if (v85 > v97) {
                        v98 = v97 + p98;
                        d98 = d97;
                    }
                    else {
                        v98 = v85 + p98;
                        d98 = d85;
                    }
                }
                else {
                    if (v84 > v97) {
                        v98 = v97 + p98;
                        d98 = d97;
                    }
                    else {
                        v98 = v84 + p98;
                        d98 = Direction.NORTHEAST;
                    }
                }
            }
        }
        if (rc.onTheMap(l58)){
            m58 =  rc.senseMapInfo(l58);
            if (m58.isPassable()){
                p58 = 10 + switch(m58.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v71 > v70) {
                    if (v70 > v72) {
                        v58 = v72 + p58;
                        d58 = d72;
                    }
                    else {
                        v58 = v70 + p58;
                        d58 = d70;
                    }
                }
                else {
                    if (v71 > v72) {
                        v58 = v72 + p58;
                        d58 = d72;
                    }
                    else {
                        v58 = v71 + p58;
                        d58 = d71;
                    }
                }
            }
        }
        if (rc.onTheMap(l82)){
            m82 =  rc.senseMapInfo(l82);
            if (m82.isPassable()){
                p82 = 10 + switch(m82.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v83 > v70) {
                    if (v70 > v96) {
                        v82 = v96 + p82;
                        d82 = d96;
                    }
                    else {
                        v82 = v70 + p82;
                        d82 = d70;
                    }
                }
                else {
                    if (v83 > v96) {
                        v82 = v96 + p82;
                        d82 = d96;
                    }
                    else {
                        v82 = v83 + p82;
                        d82 = d83;
                    }
                }
            }
        }
        if (rc.onTheMap(l86)){
            m86 =  rc.senseMapInfo(l86);
            if (m86.isPassable()){
                p86 = 10 + switch(m86.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v85 > v72) {
                    if (v72 > v98) {
                        v86 = v98 + p86;
                        d86 = d98;
                    }
                    else {
                        v86 = v72 + p86;
                        d86 = d72;
                    }
                }
                else {
                    if (v85 > v98) {
                        v86 = v98 + p86;
                        d86 = d98;
                    }
                    else {
                        v86 = v85 + p86;
                        d86 = d85;
                    }
                }
            }
        }
        if (rc.onTheMap(l110)){
            m110 =  rc.senseMapInfo(l110);
            if (m110.isPassable()){
                p110 = 10 + switch(m110.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v97 > v98) {
                    if (v98 > v96) {
                        v110 = v96 + p110;
                        d110 = d96;
                    }
                    else {
                        v110 = v98 + p110;
                        d110 = d98;
                    }
                }
                else {
                    if (v97 > v96) {
                        v110 = v96 + p110;
                        d110 = d96;
                    }
                    else {
                        v110 = v97 + p110;
                        d110 = d97;
                    }
                }
            }
        }
        if (rc.onTheMap(l57)){
            m57 =  rc.senseMapInfo(l57);
            if (m57.isPassable()){
                p57 = 10 + switch(m57.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v71 > v70) {
                    if (v70 > v58) {
                        v57 = v58 + p57;
                        d57 = d58;
                    }
                    else {
                        v57 = v70 + p57;
                        d57 = d70;
                    }
                }
                else {
                    if (v71 > v58) {
                        v57 = v58 + p57;
                        d57 = d58;
                    }
                    else {
                        v57 = v71 + p57;
                        d57 = d71;
                    }
                }
            }
        }
        if (rc.onTheMap(l59)){
            m59 =  rc.senseMapInfo(l59);
            if (m59.isPassable()){
                p59 = 10 + switch(m59.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v71 > v72) {
                    if (v72 > v58) {
                        v59 = v58 + p59;
                        d59 = d58;
                    }
                    else {
                        v59 = v72 + p59;
                        d59 = d72;
                    }
                }
                else {
                    if (v71 > v58) {
                        v59 = v58 + p59;
                        d59 = d58;
                    }
                    else {
                        v59 = v71 + p59;
                        d59 = d71;
                    }
                }
            }
        }
        if (rc.onTheMap(l69)){
            m69 =  rc.senseMapInfo(l69);
            if (m69.isPassable()){
                p69 = 10 + switch(m69.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v83 > v70) {
                    if (v70 > v82) {
                        if (v82 > v57) {
                            v69 = v57 + p69;
                            d69 = d57;
                        }
                        else {
                            v69 = v82 + p69;
                            d69 = d82;
                        }
                    }
                    else {
                        if (v70 > v57) {
                            v69 = v57 + p69;
                            d69 = d57;
                        }
                        else {
                            v69 = v70 + p69;
                            d69 = d70;
                        }
                    }
                }
                else {
                    if (v83 > v82) {
                        if (v82 > v57) {
                            v69 = v57 + p69;
                            d69 = d57;
                        }
                        else {
                            v69 = v82 + p69;
                            d69 = d82;
                        }
                    }
                    else {
                        if (v83 > v57) {
                            v69 = v57 + p69;
                            d69 = d57;
                        }
                        else {
                            v69 = v83 + p69;
                            d69 = d83;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l73)){
            m73 =  rc.senseMapInfo(l73);
            if (m73.isPassable()){
                p73 = 10 + switch(m73.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v85 > v72) {
                    if (v72 > v86) {
                        if (v86 > v59) {
                            v73 = v59 + p73;
                            d73 = d59;
                        }
                        else {
                            v73 = v86 + p73;
                            d73 = d86;
                        }
                    }
                    else {
                        if (v72 > v59) {
                            v73 = v59 + p73;
                            d73 = d59;
                        }
                        else {
                            v73 = v72 + p73;
                            d73 = d72;
                        }
                    }
                }
                else {
                    if (v85 > v86) {
                        if (v86 > v59) {
                            v73 = v59 + p73;
                            d73 = d59;
                        }
                        else {
                            v73 = v86 + p73;
                            d73 = d86;
                        }
                    }
                    else {
                        if (v85 > v59) {
                            v73 = v59 + p73;
                            d73 = d59;
                        }
                        else {
                            v73 = v85 + p73;
                            d73 = d85;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l95)){
            m95 =  rc.senseMapInfo(l95);
            if (m95.isPassable()){
                p95 = 10 + switch(m95.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v83 > v96) {
                    if (v96 > v82) {
                        v95 = v82 + p95;
                        d95 = d82;
                    }
                    else {
                        v95 = v96 + p95;
                        d95 = d96;
                    }
                }
                else {
                    if (v83 > v82) {
                        v95 = v82 + p95;
                        d95 = d82;
                    }
                    else {
                        v95 = v83 + p95;
                        d95 = d83;
                    }
                }
            }
        }
        if (rc.onTheMap(l99)){
            m99 =  rc.senseMapInfo(l99);
            if (m99.isPassable()){
                p99 = 10 + switch(m99.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v85 > v98) {
                    if (v98 > v86) {
                        v99 = v86 + p99;
                        d99 = d86;
                    }
                    else {
                        v99 = v98 + p99;
                        d99 = d98;
                    }
                }
                else {
                    if (v85 > v86) {
                        v99 = v86 + p99;
                        d99 = d86;
                    }
                    else {
                        v99 = v85 + p99;
                        d99 = d85;
                    }
                }
            }
        }
        if (rc.onTheMap(l109)){
            m109 =  rc.senseMapInfo(l109);
            if (m109.isPassable()){
                p109 = 10 + switch(m109.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v97 > v96) {
                    if (v96 > v110) {
                        if (v110 > v95) {
                            v109 = v95 + p109;
                            d109 = d95;
                        }
                        else {
                            v109 = v110 + p109;
                            d109 = d110;
                        }
                    }
                    else {
                        if (v96 > v95) {
                            v109 = v95 + p109;
                            d109 = d95;
                        }
                        else {
                            v109 = v96 + p109;
                            d109 = d96;
                        }
                    }
                }
                else {
                    if (v97 > v110) {
                        if (v110 > v95) {
                            v109 = v95 + p109;
                            d109 = d95;
                        }
                        else {
                            v109 = v110 + p109;
                            d109 = d110;
                        }
                    }
                    else {
                        if (v97 > v95) {
                            v109 = v95 + p109;
                            d109 = d95;
                        }
                        else {
                            v109 = v97 + p109;
                            d109 = d97;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l111)){
            m111 =  rc.senseMapInfo(l111);
            if (m111.isPassable()){
                p111 = 10 + switch(m111.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v97 > v98) {
                    if (v98 > v110) {
                        if (v110 > v99) {
                            v111 = v99 + p111;
                            d111 = d99;
                        }
                        else {
                            v111 = v110 + p111;
                            d111 = d110;
                        }
                    }
                    else {
                        if (v98 > v99) {
                            v111 = v99 + p111;
                            d111 = d99;
                        }
                        else {
                            v111 = v98 + p111;
                            d111 = d98;
                        }
                    }
                }
                else {
                    if (v97 > v110) {
                        if (v110 > v99) {
                            v111 = v99 + p111;
                            d111 = d99;
                        }
                        else {
                            v111 = v110 + p111;
                            d111 = d110;
                        }
                    }
                    else {
                        if (v97 > v99) {
                            v111 = v99 + p111;
                            d111 = d99;
                        }
                        else {
                            v111 = v97 + p111;
                            d111 = d97;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l56)){
            m56 =  rc.senseMapInfo(l56);
            if (m56.isPassable()){
                p56 = 10 + switch(m56.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v70 > v57) {
                    if (v57 > v69) {
                        v56 = v69 + p56;
                        d56 = d69;
                    }
                    else {
                        v56 = v57 + p56;
                        d56 = d57;
                    }
                }
                else {
                    if (v70 > v69) {
                        v56 = v69 + p56;
                        d56 = d69;
                    }
                    else {
                        v56 = v70 + p56;
                        d56 = d70;
                    }
                }
            }
        }
        if (rc.onTheMap(l60)){
            m60 =  rc.senseMapInfo(l60);
            if (m60.isPassable()){
                p60 = 10 + switch(m60.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v72 > v59) {
                    if (v59 > v73) {
                        v60 = v73 + p60;
                        d60 = d73;
                    }
                    else {
                        v60 = v59 + p60;
                        d60 = d59;
                    }
                }
                else {
                    if (v72 > v73) {
                        v60 = v73 + p60;
                        d60 = d73;
                    }
                    else {
                        v60 = v72 + p60;
                        d60 = d72;
                    }
                }
            }
        }
        if (rc.onTheMap(l108)){
            m108 =  rc.senseMapInfo(l108);
            if (m108.isPassable()){
                p108 = 10 + switch(m108.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v96 > v109) {
                    if (v109 > v95) {
                        v108 = v95 + p108;
                        d108 = d95;
                    }
                    else {
                        v108 = v109 + p108;
                        d108 = d109;
                    }
                }
                else {
                    if (v96 > v95) {
                        v108 = v95 + p108;
                        d108 = d95;
                    }
                    else {
                        v108 = v96 + p108;
                        d108 = d96;
                    }
                }
            }
        }
        if (rc.onTheMap(l112)){
            m112 =  rc.senseMapInfo(l112);
            if (m112.isPassable()){
                p112 = 10 + switch(m112.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v98 > v99) {
                    if (v99 > v111) {
                        v112 = v111 + p112;
                        d112 = d111;
                    }
                    else {
                        v112 = v99 + p112;
                        d112 = d99;
                    }
                }
                else {
                    if (v98 > v111) {
                        v112 = v111 + p112;
                        d112 = d111;
                    }
                    else {
                        v112 = v98 + p112;
                        d112 = d98;
                    }
                }
            }
        }
        if (rc.onTheMap(l45)){
            m45 =  rc.senseMapInfo(l45);
            if (m45.isPassable()){
                p45 = 10 + switch(m45.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v58 > v57) {
                    if (v57 > v59) {
                        v45 = v59 + p45;
                        d45 = d59;
                    }
                    else {
                        v45 = v57 + p45;
                        d45 = d57;
                    }
                }
                else {
                    if (v58 > v59) {
                        v45 = v59 + p45;
                        d45 = d59;
                    }
                    else {
                        v45 = v58 + p45;
                        d45 = d58;
                    }
                }
            }
        }
        if (rc.onTheMap(l81)){
            m81 =  rc.senseMapInfo(l81);
            if (m81.isPassable()){
                p81 = 10 + switch(m81.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v82 > v69) {
                    if (v69 > v95) {
                        v81 = v95 + p81;
                        d81 = d95;
                    }
                    else {
                        v81 = v69 + p81;
                        d81 = d69;
                    }
                }
                else {
                    if (v82 > v95) {
                        v81 = v95 + p81;
                        d81 = d95;
                    }
                    else {
                        v81 = v82 + p81;
                        d81 = d82;
                    }
                }
            }
        }
        if (rc.onTheMap(l87)){
            m87 =  rc.senseMapInfo(l87);
            if (m87.isPassable()){
                p87 = 10 + switch(m87.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v86 > v73) {
                    if (v73 > v99) {
                        v87 = v99 + p87;
                        d87 = d99;
                    }
                    else {
                        v87 = v73 + p87;
                        d87 = d73;
                    }
                }
                else {
                    if (v86 > v99) {
                        v87 = v99 + p87;
                        d87 = d99;
                    }
                    else {
                        v87 = v86 + p87;
                        d87 = d86;
                    }
                }
            }
        }
        if (rc.onTheMap(l123)){
            m123 =  rc.senseMapInfo(l123);
            if (m123.isPassable()){
                p123 = 10 + switch(m123.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v110 > v111) {
                    if (v111 > v109) {
                        v123 = v109 + p123;
                        d123 = d109;
                    }
                    else {
                        v123 = v111 + p123;
                        d123 = d111;
                    }
                }
                else {
                    if (v110 > v109) {
                        v123 = v109 + p123;
                        d123 = d109;
                    }
                    else {
                        v123 = v110 + p123;
                        d123 = d110;
                    }
                }
            }
        }
        if (rc.onTheMap(l44)){
            m44 =  rc.senseMapInfo(l44);
            if (m44.isPassable()){
                p44 = 10 + switch(m44.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v58 > v57) {
                    if (v57 > v56) {
                        if (v56 > v45) {
                            v44 = v45 + p44;
                            d44 = d45;
                        }
                        else {
                            v44 = v56 + p44;
                            d44 = d56;
                        }
                    }
                    else {
                        if (v57 > v45) {
                            v44 = v45 + p44;
                            d44 = d45;
                        }
                        else {
                            v44 = v57 + p44;
                            d44 = d57;
                        }
                    }
                }
                else {
                    if (v58 > v56) {
                        if (v56 > v45) {
                            v44 = v45 + p44;
                            d44 = d45;
                        }
                        else {
                            v44 = v56 + p44;
                            d44 = d56;
                        }
                    }
                    else {
                        if (v58 > v45) {
                            v44 = v45 + p44;
                            d44 = d45;
                        }
                        else {
                            v44 = v58 + p44;
                            d44 = d58;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l46)){
            m46 =  rc.senseMapInfo(l46);
            if (m46.isPassable()){
                p46 = 10 + switch(m46.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v58 > v59) {
                    if (v59 > v60) {
                        if (v60 > v45) {
                            v46 = v45 + p46;
                            d46 = d45;
                        }
                        else {
                            v46 = v60 + p46;
                            d46 = d60;
                        }
                    }
                    else {
                        if (v59 > v45) {
                            v46 = v45 + p46;
                            d46 = d45;
                        }
                        else {
                            v46 = v59 + p46;
                            d46 = d59;
                        }
                    }
                }
                else {
                    if (v58 > v60) {
                        if (v60 > v45) {
                            v46 = v45 + p46;
                            d46 = d45;
                        }
                        else {
                            v46 = v60 + p46;
                            d46 = d60;
                        }
                    }
                    else {
                        if (v58 > v45) {
                            v46 = v45 + p46;
                            d46 = d45;
                        }
                        else {
                            v46 = v58 + p46;
                            d46 = d58;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l68)){
            m68 =  rc.senseMapInfo(l68);
            if (m68.isPassable()){
                p68 = 10 + switch(m68.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v82 > v69) {
                    if (v69 > v56) {
                        if (v56 > v81) {
                            v68 = v81 + p68;
                            d68 = d81;
                        }
                        else {
                            v68 = v56 + p68;
                            d68 = d56;
                        }
                    }
                    else {
                        if (v69 > v81) {
                            v68 = v81 + p68;
                            d68 = d81;
                        }
                        else {
                            v68 = v69 + p68;
                            d68 = d69;
                        }
                    }
                }
                else {
                    if (v82 > v56) {
                        if (v56 > v81) {
                            v68 = v81 + p68;
                            d68 = d81;
                        }
                        else {
                            v68 = v56 + p68;
                            d68 = d56;
                        }
                    }
                    else {
                        if (v82 > v81) {
                            v68 = v81 + p68;
                            d68 = d81;
                        }
                        else {
                            v68 = v82 + p68;
                            d68 = d82;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l74)){
            m74 =  rc.senseMapInfo(l74);
            if (m74.isPassable()){
                p74 = 10 + switch(m74.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v86 > v73) {
                    if (v73 > v60) {
                        if (v60 > v87) {
                            v74 = v87 + p74;
                            d74 = d87;
                        }
                        else {
                            v74 = v60 + p74;
                            d74 = d60;
                        }
                    }
                    else {
                        if (v73 > v87) {
                            v74 = v87 + p74;
                            d74 = d87;
                        }
                        else {
                            v74 = v73 + p74;
                            d74 = d73;
                        }
                    }
                }
                else {
                    if (v86 > v60) {
                        if (v60 > v87) {
                            v74 = v87 + p74;
                            d74 = d87;
                        }
                        else {
                            v74 = v60 + p74;
                            d74 = d60;
                        }
                    }
                    else {
                        if (v86 > v87) {
                            v74 = v87 + p74;
                            d74 = d87;
                        }
                        else {
                            v74 = v86 + p74;
                            d74 = d86;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l94)){
            m94 =  rc.senseMapInfo(l94);
            if (m94.isPassable()){
                p94 = 10 + switch(m94.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v82 > v95) {
                    if (v95 > v108) {
                        if (v108 > v81) {
                            v94 = v81 + p94;
                            d94 = d81;
                        }
                        else {
                            v94 = v108 + p94;
                            d94 = d108;
                        }
                    }
                    else {
                        if (v95 > v81) {
                            v94 = v81 + p94;
                            d94 = d81;
                        }
                        else {
                            v94 = v95 + p94;
                            d94 = d95;
                        }
                    }
                }
                else {
                    if (v82 > v108) {
                        if (v108 > v81) {
                            v94 = v81 + p94;
                            d94 = d81;
                        }
                        else {
                            v94 = v108 + p94;
                            d94 = d108;
                        }
                    }
                    else {
                        if (v82 > v81) {
                            v94 = v81 + p94;
                            d94 = d81;
                        }
                        else {
                            v94 = v82 + p94;
                            d94 = d82;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l100)){
            m100 =  rc.senseMapInfo(l100);
            if (m100.isPassable()){
                p100 = 10 + switch(m100.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v86 > v99) {
                    if (v99 > v112) {
                        if (v112 > v87) {
                            v100 = v87 + p100;
                            d100 = d87;
                        }
                        else {
                            v100 = v112 + p100;
                            d100 = d112;
                        }
                    }
                    else {
                        if (v99 > v87) {
                            v100 = v87 + p100;
                            d100 = d87;
                        }
                        else {
                            v100 = v99 + p100;
                            d100 = d99;
                        }
                    }
                }
                else {
                    if (v86 > v112) {
                        if (v112 > v87) {
                            v100 = v87 + p100;
                            d100 = d87;
                        }
                        else {
                            v100 = v112 + p100;
                            d100 = d112;
                        }
                    }
                    else {
                        if (v86 > v87) {
                            v100 = v87 + p100;
                            d100 = d87;
                        }
                        else {
                            v100 = v86 + p100;
                            d100 = d86;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l122)){
            m122 =  rc.senseMapInfo(l122);
            if (m122.isPassable()){
                p122 = 10 + switch(m122.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v110 > v109) {
                    if (v109 > v108) {
                        if (v108 > v123) {
                            v122 = v123 + p122;
                            d122 = d123;
                        }
                        else {
                            v122 = v108 + p122;
                            d122 = d108;
                        }
                    }
                    else {
                        if (v109 > v123) {
                            v122 = v123 + p122;
                            d122 = d123;
                        }
                        else {
                            v122 = v109 + p122;
                            d122 = d109;
                        }
                    }
                }
                else {
                    if (v110 > v108) {
                        if (v108 > v123) {
                            v122 = v123 + p122;
                            d122 = d123;
                        }
                        else {
                            v122 = v108 + p122;
                            d122 = d108;
                        }
                    }
                    else {
                        if (v110 > v123) {
                            v122 = v123 + p122;
                            d122 = d123;
                        }
                        else {
                            v122 = v110 + p122;
                            d122 = d110;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l124)){
            m124 =  rc.senseMapInfo(l124);
            if (m124.isPassable()){
                p124 = 10 + switch(m124.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v110 > v111) {
                    if (v111 > v112) {
                        if (v112 > v123) {
                            v124 = v123 + p124;
                            d124 = d123;
                        }
                        else {
                            v124 = v112 + p124;
                            d124 = d112;
                        }
                    }
                    else {
                        if (v111 > v123) {
                            v124 = v123 + p124;
                            d124 = d123;
                        }
                        else {
                            v124 = v111 + p124;
                            d124 = d111;
                        }
                    }
                }
                else {
                    if (v110 > v112) {
                        if (v112 > v123) {
                            v124 = v123 + p124;
                            d124 = d123;
                        }
                        else {
                            v124 = v112 + p124;
                            d124 = d112;
                        }
                    }
                    else {
                        if (v110 > v123) {
                            v124 = v123 + p124;
                            d124 = d123;
                        }
                        else {
                            v124 = v110 + p124;
                            d124 = d110;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l43)){
            m43 =  rc.senseMapInfo(l43);
            if (m43.isPassable()){
                p43 = 10 + switch(m43.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v57 > v56) {
                    if (v56 > v44) {
                        v43 = v44 + p43;
                        d43 = d44;
                    }
                    else {
                        v43 = v56 + p43;
                        d43 = d56;
                    }
                }
                else {
                    if (v57 > v44) {
                        v43 = v44 + p43;
                        d43 = d44;
                    }
                    else {
                        v43 = v57 + p43;
                        d43 = d57;
                    }
                }
            }
        }
        if (rc.onTheMap(l47)){
            m47 =  rc.senseMapInfo(l47);
            if (m47.isPassable()){
                p47 = 10 + switch(m47.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v59 > v60) {
                    if (v60 > v46) {
                        v47 = v46 + p47;
                        d47 = d46;
                    }
                    else {
                        v47 = v60 + p47;
                        d47 = d60;
                    }
                }
                else {
                    if (v59 > v46) {
                        v47 = v46 + p47;
                        d47 = d46;
                    }
                    else {
                        v47 = v59 + p47;
                        d47 = d59;
                    }
                }
            }
        }
        if (rc.onTheMap(l55)){
            m55 =  rc.senseMapInfo(l55);
            if (m55.isPassable()){
                p55 = 10 + switch(m55.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v69 > v56) {
                    if (v56 > v68) {
                        if (v68 > v43) {
                            v55 = v43 + p55;
                            d55 = d43;
                        }
                        else {
                            v55 = v68 + p55;
                            d55 = d68;
                        }
                    }
                    else {
                        if (v56 > v43) {
                            v55 = v43 + p55;
                            d55 = d43;
                        }
                        else {
                            v55 = v56 + p55;
                            d55 = d56;
                        }
                    }
                }
                else {
                    if (v69 > v68) {
                        if (v68 > v43) {
                            v55 = v43 + p55;
                            d55 = d43;
                        }
                        else {
                            v55 = v68 + p55;
                            d55 = d68;
                        }
                    }
                    else {
                        if (v69 > v43) {
                            v55 = v43 + p55;
                            d55 = d43;
                        }
                        else {
                            v55 = v69 + p55;
                            d55 = d69;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l61)){
            m61 =  rc.senseMapInfo(l61);
            if (m61.isPassable()){
                p61 = 10 + switch(m61.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v73 > v60) {
                    if (v60 > v74) {
                        if (v74 > v47) {
                            v61 = v47 + p61;
                            d61 = d47;
                        }
                        else {
                            v61 = v74 + p61;
                            d61 = d74;
                        }
                    }
                    else {
                        if (v60 > v47) {
                            v61 = v47 + p61;
                            d61 = d47;
                        }
                        else {
                            v61 = v60 + p61;
                            d61 = d60;
                        }
                    }
                }
                else {
                    if (v73 > v74) {
                        if (v74 > v47) {
                            v61 = v47 + p61;
                            d61 = d47;
                        }
                        else {
                            v61 = v74 + p61;
                            d61 = d74;
                        }
                    }
                    else {
                        if (v73 > v47) {
                            v61 = v47 + p61;
                            d61 = d47;
                        }
                        else {
                            v61 = v73 + p61;
                            d61 = d73;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l107)){
            m107 =  rc.senseMapInfo(l107);
            if (m107.isPassable()){
                p107 = 10 + switch(m107.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v95 > v108) {
                    if (v108 > v94) {
                        v107 = v94 + p107;
                        d107 = d94;
                    }
                    else {
                        v107 = v108 + p107;
                        d107 = d108;
                    }
                }
                else {
                    if (v95 > v94) {
                        v107 = v94 + p107;
                        d107 = d94;
                    }
                    else {
                        v107 = v95 + p107;
                        d107 = d95;
                    }
                }
            }
        }
        if (rc.onTheMap(l113)){
            m113 =  rc.senseMapInfo(l113);
            if (m113.isPassable()){
                p113 = 10 + switch(m113.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v99 > v112) {
                    if (v112 > v100) {
                        v113 = v100 + p113;
                        d113 = d100;
                    }
                    else {
                        v113 = v112 + p113;
                        d113 = d112;
                    }
                }
                else {
                    if (v99 > v100) {
                        v113 = v100 + p113;
                        d113 = d100;
                    }
                    else {
                        v113 = v99 + p113;
                        d113 = d99;
                    }
                }
            }
        }
        if (rc.onTheMap(l121)){
            m121 =  rc.senseMapInfo(l121);
            if (m121.isPassable()){
                p121 = 10 + switch(m121.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v109 > v108) {
                    if (v108 > v122) {
                        if (v122 > v107) {
                            v121 = v107 + p121;
                            d121 = d107;
                        }
                        else {
                            v121 = v122 + p121;
                            d121 = d122;
                        }
                    }
                    else {
                        if (v108 > v107) {
                            v121 = v107 + p121;
                            d121 = d107;
                        }
                        else {
                            v121 = v108 + p121;
                            d121 = d108;
                        }
                    }
                }
                else {
                    if (v109 > v122) {
                        if (v122 > v107) {
                            v121 = v107 + p121;
                            d121 = d107;
                        }
                        else {
                            v121 = v122 + p121;
                            d121 = d122;
                        }
                    }
                    else {
                        if (v109 > v107) {
                            v121 = v107 + p121;
                            d121 = d107;
                        }
                        else {
                            v121 = v109 + p121;
                            d121 = d109;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l125)){
            m125 =  rc.senseMapInfo(l125);
            if (m125.isPassable()){
                p125 = 10 + switch(m125.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v111 > v112) {
                    if (v112 > v124) {
                        if (v124 > v113) {
                            v125 = v113 + p125;
                            d125 = d113;
                        }
                        else {
                            v125 = v124 + p125;
                            d125 = d124;
                        }
                    }
                    else {
                        if (v112 > v113) {
                            v125 = v113 + p125;
                            d125 = d113;
                        }
                        else {
                            v125 = v112 + p125;
                            d125 = d112;
                        }
                    }
                }
                else {
                    if (v111 > v124) {
                        if (v124 > v113) {
                            v125 = v113 + p125;
                            d125 = d113;
                        }
                        else {
                            v125 = v124 + p125;
                            d125 = d124;
                        }
                    }
                    else {
                        if (v111 > v113) {
                            v125 = v113 + p125;
                            d125 = d113;
                        }
                        else {
                            v125 = v111 + p125;
                            d125 = d111;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l32)){
            m32 =  rc.senseMapInfo(l32);
            if (m32.isPassable()){
                p32 = 10 + switch(m32.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v45 > v44) {
                    if (v44 > v46) {
                        v32 = v46 + p32;
                        d32 = d46;
                    }
                    else {
                        v32 = v44 + p32;
                        d32 = d44;
                    }
                }
                else {
                    if (v45 > v46) {
                        v32 = v46 + p32;
                        d32 = d46;
                    }
                    else {
                        v32 = v45 + p32;
                        d32 = d45;
                    }
                }
            }
        }
        if (rc.onTheMap(l80)){
            m80 =  rc.senseMapInfo(l80);
            if (m80.isPassable()){
                p80 = 10 + switch(m80.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v81 > v68) {
                    if (v68 > v94) {
                        v80 = v94 + p80;
                        d80 = d94;
                    }
                    else {
                        v80 = v68 + p80;
                        d80 = d68;
                    }
                }
                else {
                    if (v81 > v94) {
                        v80 = v94 + p80;
                        d80 = d94;
                    }
                    else {
                        v80 = v81 + p80;
                        d80 = d81;
                    }
                }
            }
        }
        if (rc.onTheMap(l88)){
            m88 =  rc.senseMapInfo(l88);
            if (m88.isPassable()){
                p88 = 10 + switch(m88.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v87 > v74) {
                    if (v74 > v100) {
                        v88 = v100 + p88;
                        d88 = d100;
                    }
                    else {
                        v88 = v74 + p88;
                        d88 = d74;
                    }
                }
                else {
                    if (v87 > v100) {
                        v88 = v100 + p88;
                        d88 = d100;
                    }
                    else {
                        v88 = v87 + p88;
                        d88 = d87;
                    }
                }
            }
        }
        if (rc.onTheMap(l136)){
            m136 =  rc.senseMapInfo(l136);
            if (m136.isPassable()){
                p136 = 10 + switch(m136.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v123 > v124) {
                    if (v124 > v122) {
                        v136 = v122 + p136;
                        d136 = d122;
                    }
                    else {
                        v136 = v124 + p136;
                        d136 = d124;
                    }
                }
                else {
                    if (v123 > v122) {
                        v136 = v122 + p136;
                        d136 = d122;
                    }
                    else {
                        v136 = v123 + p136;
                        d136 = d123;
                    }
                }
            }
        }
        if (rc.onTheMap(l31)){
            m31 =  rc.senseMapInfo(l31);
            if (m31.isPassable()){
                p31 = 10 + switch(m31.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v45 > v44) {
                    if (v44 > v43) {
                        if (v43 > v32) {
                            v31 = v32 + p31;
                            d31 = d32;
                        }
                        else {
                            v31 = v43 + p31;
                            d31 = d43;
                        }
                    }
                    else {
                        if (v44 > v32) {
                            v31 = v32 + p31;
                            d31 = d32;
                        }
                        else {
                            v31 = v44 + p31;
                            d31 = d44;
                        }
                    }
                }
                else {
                    if (v45 > v43) {
                        if (v43 > v32) {
                            v31 = v32 + p31;
                            d31 = d32;
                        }
                        else {
                            v31 = v43 + p31;
                            d31 = d43;
                        }
                    }
                    else {
                        if (v45 > v32) {
                            v31 = v32 + p31;
                            d31 = d32;
                        }
                        else {
                            v31 = v45 + p31;
                            d31 = d45;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l33)){
            m33 =  rc.senseMapInfo(l33);
            if (m33.isPassable()){
                p33 = 10 + switch(m33.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v45 > v46) {
                    if (v46 > v47) {
                        if (v47 > v32) {
                            v33 = v32 + p33;
                            d33 = d32;
                        }
                        else {
                            v33 = v47 + p33;
                            d33 = d47;
                        }
                    }
                    else {
                        if (v46 > v32) {
                            v33 = v32 + p33;
                            d33 = d32;
                        }
                        else {
                            v33 = v46 + p33;
                            d33 = d46;
                        }
                    }
                }
                else {
                    if (v45 > v47) {
                        if (v47 > v32) {
                            v33 = v32 + p33;
                            d33 = d32;
                        }
                        else {
                            v33 = v47 + p33;
                            d33 = d47;
                        }
                    }
                    else {
                        if (v45 > v32) {
                            v33 = v32 + p33;
                            d33 = d32;
                        }
                        else {
                            v33 = v45 + p33;
                            d33 = d45;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l67)){
            m67 =  rc.senseMapInfo(l67);
            if (m67.isPassable()){
                p67 = 10 + switch(m67.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v81 > v68) {
                    if (v68 > v55) {
                        if (v55 > v80) {
                            v67 = v80 + p67;
                            d67 = d80;
                        }
                        else {
                            v67 = v55 + p67;
                            d67 = d55;
                        }
                    }
                    else {
                        if (v68 > v80) {
                            v67 = v80 + p67;
                            d67 = d80;
                        }
                        else {
                            v67 = v68 + p67;
                            d67 = d68;
                        }
                    }
                }
                else {
                    if (v81 > v55) {
                        if (v55 > v80) {
                            v67 = v80 + p67;
                            d67 = d80;
                        }
                        else {
                            v67 = v55 + p67;
                            d67 = d55;
                        }
                    }
                    else {
                        if (v81 > v80) {
                            v67 = v80 + p67;
                            d67 = d80;
                        }
                        else {
                            v67 = v81 + p67;
                            d67 = d81;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l75)){
            m75 =  rc.senseMapInfo(l75);
            if (m75.isPassable()){
                p75 = 10 + switch(m75.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v87 > v74) {
                    if (v74 > v61) {
                        if (v61 > v88) {
                            v75 = v88 + p75;
                            d75 = d88;
                        }
                        else {
                            v75 = v61 + p75;
                            d75 = d61;
                        }
                    }
                    else {
                        if (v74 > v88) {
                            v75 = v88 + p75;
                            d75 = d88;
                        }
                        else {
                            v75 = v74 + p75;
                            d75 = d74;
                        }
                    }
                }
                else {
                    if (v87 > v61) {
                        if (v61 > v88) {
                            v75 = v88 + p75;
                            d75 = d88;
                        }
                        else {
                            v75 = v61 + p75;
                            d75 = d61;
                        }
                    }
                    else {
                        if (v87 > v88) {
                            v75 = v88 + p75;
                            d75 = d88;
                        }
                        else {
                            v75 = v87 + p75;
                            d75 = d87;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l93)){
            m93 =  rc.senseMapInfo(l93);
            if (m93.isPassable()){
                p93 = 10 + switch(m93.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v81 > v94) {
                    if (v94 > v107) {
                        if (v107 > v80) {
                            v93 = v80 + p93;
                            d93 = d80;
                        }
                        else {
                            v93 = v107 + p93;
                            d93 = d107;
                        }
                    }
                    else {
                        if (v94 > v80) {
                            v93 = v80 + p93;
                            d93 = d80;
                        }
                        else {
                            v93 = v94 + p93;
                            d93 = d94;
                        }
                    }
                }
                else {
                    if (v81 > v107) {
                        if (v107 > v80) {
                            v93 = v80 + p93;
                            d93 = d80;
                        }
                        else {
                            v93 = v107 + p93;
                            d93 = d107;
                        }
                    }
                    else {
                        if (v81 > v80) {
                            v93 = v80 + p93;
                            d93 = d80;
                        }
                        else {
                            v93 = v81 + p93;
                            d93 = d81;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l101)){
            m101 =  rc.senseMapInfo(l101);
            if (m101.isPassable()){
                p101 = 10 + switch(m101.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v87 > v100) {
                    if (v100 > v113) {
                        if (v113 > v88) {
                            v101 = v88 + p101;
                            d101 = d88;
                        }
                        else {
                            v101 = v113 + p101;
                            d101 = d113;
                        }
                    }
                    else {
                        if (v100 > v88) {
                            v101 = v88 + p101;
                            d101 = d88;
                        }
                        else {
                            v101 = v100 + p101;
                            d101 = d100;
                        }
                    }
                }
                else {
                    if (v87 > v113) {
                        if (v113 > v88) {
                            v101 = v88 + p101;
                            d101 = d88;
                        }
                        else {
                            v101 = v113 + p101;
                            d101 = d113;
                        }
                    }
                    else {
                        if (v87 > v88) {
                            v101 = v88 + p101;
                            d101 = d88;
                        }
                        else {
                            v101 = v87 + p101;
                            d101 = d87;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l135)){
            m135 =  rc.senseMapInfo(l135);
            if (m135.isPassable()){
                p135 = 10 + switch(m135.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v123 > v122) {
                    if (v122 > v121) {
                        if (v121 > v136) {
                            v135 = v136 + p135;
                            d135 = d136;
                        }
                        else {
                            v135 = v121 + p135;
                            d135 = d121;
                        }
                    }
                    else {
                        if (v122 > v136) {
                            v135 = v136 + p135;
                            d135 = d136;
                        }
                        else {
                            v135 = v122 + p135;
                            d135 = d122;
                        }
                    }
                }
                else {
                    if (v123 > v121) {
                        if (v121 > v136) {
                            v135 = v136 + p135;
                            d135 = d136;
                        }
                        else {
                            v135 = v121 + p135;
                            d135 = d121;
                        }
                    }
                    else {
                        if (v123 > v136) {
                            v135 = v136 + p135;
                            d135 = d136;
                        }
                        else {
                            v135 = v123 + p135;
                            d135 = d123;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l137)){
            m137 =  rc.senseMapInfo(l137);
            if (m137.isPassable()){
                p137 = 10 + switch(m137.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v123 > v124) {
                    if (v124 > v125) {
                        if (v125 > v136) {
                            v137 = v136 + p137;
                            d137 = d136;
                        }
                        else {
                            v137 = v125 + p137;
                            d137 = d125;
                        }
                    }
                    else {
                        if (v124 > v136) {
                            v137 = v136 + p137;
                            d137 = d136;
                        }
                        else {
                            v137 = v124 + p137;
                            d137 = d124;
                        }
                    }
                }
                else {
                    if (v123 > v125) {
                        if (v125 > v136) {
                            v137 = v136 + p137;
                            d137 = d136;
                        }
                        else {
                            v137 = v125 + p137;
                            d137 = d125;
                        }
                    }
                    else {
                        if (v123 > v136) {
                            v137 = v136 + p137;
                            d137 = d136;
                        }
                        else {
                            v137 = v123 + p137;
                            d137 = d123;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l42)){
            m42 =  rc.senseMapInfo(l42);
            if (m42.isPassable()){
                p42 = 10 + switch(m42.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v56 > v43) {
                    if (v43 > v55) {
                        v42 = v55 + p42;
                        d42 = d55;
                    }
                    else {
                        v42 = v43 + p42;
                        d42 = d43;
                    }
                }
                else {
                    if (v56 > v55) {
                        v42 = v55 + p42;
                        d42 = d55;
                    }
                    else {
                        v42 = v56 + p42;
                        d42 = d56;
                    }
                }
            }
        }
        if (rc.onTheMap(l48)){
            m48 =  rc.senseMapInfo(l48);
            if (m48.isPassable()){
                p48 = 10 + switch(m48.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v60 > v47) {
                    if (v47 > v61) {
                        v48 = v61 + p48;
                        d48 = d61;
                    }
                    else {
                        v48 = v47 + p48;
                        d48 = d47;
                    }
                }
                else {
                    if (v60 > v61) {
                        v48 = v61 + p48;
                        d48 = d61;
                    }
                    else {
                        v48 = v60 + p48;
                        d48 = d60;
                    }
                }
            }
        }
        if (rc.onTheMap(l120)){
            m120 =  rc.senseMapInfo(l120);
            if (m120.isPassable()){
                p120 = 10 + switch(m120.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v108 > v121) {
                    if (v121 > v107) {
                        v120 = v107 + p120;
                        d120 = d107;
                    }
                    else {
                        v120 = v121 + p120;
                        d120 = d121;
                    }
                }
                else {
                    if (v108 > v107) {
                        v120 = v107 + p120;
                        d120 = d107;
                    }
                    else {
                        v120 = v108 + p120;
                        d120 = d108;
                    }
                }
            }
        }
        if (rc.onTheMap(l126)){
            m126 =  rc.senseMapInfo(l126);
            if (m126.isPassable()){
                p126 = 10 + switch(m126.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v112 > v113) {
                    if (v113 > v125) {
                        v126 = v125 + p126;
                        d126 = d125;
                    }
                    else {
                        v126 = v113 + p126;
                        d126 = d113;
                    }
                }
                else {
                    if (v112 > v125) {
                        v126 = v125 + p126;
                        d126 = d125;
                    }
                    else {
                        v126 = v112 + p126;
                        d126 = d112;
                    }
                }
            }
        }
        if (rc.onTheMap(l30)){
            m30 =  rc.senseMapInfo(l30);
            if (m30.isPassable()){
                p30 = 10 + switch(m30.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v44 > v43) {
                    if (v43 > v31) {
                        if (v31 > v42) {
                            v30 = v42 + p30;
                            d30 = d42;
                        }
                        else {
                            v30 = v31 + p30;
                            d30 = d31;
                        }
                    }
                    else {
                        if (v43 > v42) {
                            v30 = v42 + p30;
                            d30 = d42;
                        }
                        else {
                            v30 = v43 + p30;
                            d30 = d43;
                        }
                    }
                }
                else {
                    if (v44 > v31) {
                        if (v31 > v42) {
                            v30 = v42 + p30;
                            d30 = d42;
                        }
                        else {
                            v30 = v31 + p30;
                            d30 = d31;
                        }
                    }
                    else {
                        if (v44 > v42) {
                            v30 = v42 + p30;
                            d30 = d42;
                        }
                        else {
                            v30 = v44 + p30;
                            d30 = d44;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l34)){
            m34 =  rc.senseMapInfo(l34);
            if (m34.isPassable()){
                p34 = 10 + switch(m34.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v46 > v47) {
                    if (v47 > v33) {
                        if (v33 > v48) {
                            v34 = v48 + p34;
                            d34 = d48;
                        }
                        else {
                            v34 = v33 + p34;
                            d34 = d33;
                        }
                    }
                    else {
                        if (v47 > v48) {
                            v34 = v48 + p34;
                            d34 = d48;
                        }
                        else {
                            v34 = v47 + p34;
                            d34 = d47;
                        }
                    }
                }
                else {
                    if (v46 > v33) {
                        if (v33 > v48) {
                            v34 = v48 + p34;
                            d34 = d48;
                        }
                        else {
                            v34 = v33 + p34;
                            d34 = d33;
                        }
                    }
                    else {
                        if (v46 > v48) {
                            v34 = v48 + p34;
                            d34 = d48;
                        }
                        else {
                            v34 = v46 + p34;
                            d34 = d46;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l54)){
            m54 =  rc.senseMapInfo(l54);
            if (m54.isPassable()){
                p54 = 10 + switch(m54.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v68 > v55) {
                    if (v55 > v67) {
                        if (v67 > v42) {
                            v54 = v42 + p54;
                            d54 = d42;
                        }
                        else {
                            v54 = v67 + p54;
                            d54 = d67;
                        }
                    }
                    else {
                        if (v55 > v42) {
                            v54 = v42 + p54;
                            d54 = d42;
                        }
                        else {
                            v54 = v55 + p54;
                            d54 = d55;
                        }
                    }
                }
                else {
                    if (v68 > v67) {
                        if (v67 > v42) {
                            v54 = v42 + p54;
                            d54 = d42;
                        }
                        else {
                            v54 = v67 + p54;
                            d54 = d67;
                        }
                    }
                    else {
                        if (v68 > v42) {
                            v54 = v42 + p54;
                            d54 = d42;
                        }
                        else {
                            v54 = v68 + p54;
                            d54 = d68;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l62)){
            m62 =  rc.senseMapInfo(l62);
            if (m62.isPassable()){
                p62 = 10 + switch(m62.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v74 > v61) {
                    if (v61 > v75) {
                        if (v75 > v48) {
                            v62 = v48 + p62;
                            d62 = d48;
                        }
                        else {
                            v62 = v75 + p62;
                            d62 = d75;
                        }
                    }
                    else {
                        if (v61 > v48) {
                            v62 = v48 + p62;
                            d62 = d48;
                        }
                        else {
                            v62 = v61 + p62;
                            d62 = d61;
                        }
                    }
                }
                else {
                    if (v74 > v75) {
                        if (v75 > v48) {
                            v62 = v48 + p62;
                            d62 = d48;
                        }
                        else {
                            v62 = v75 + p62;
                            d62 = d75;
                        }
                    }
                    else {
                        if (v74 > v48) {
                            v62 = v48 + p62;
                            d62 = d48;
                        }
                        else {
                            v62 = v74 + p62;
                            d62 = d74;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l106)){
            m106 =  rc.senseMapInfo(l106);
            if (m106.isPassable()){
                p106 = 10 + switch(m106.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v94 > v107) {
                    if (v107 > v93) {
                        if (v93 > v120) {
                            v106 = v120 + p106;
                            d106 = d120;
                        }
                        else {
                            v106 = v93 + p106;
                            d106 = d93;
                        }
                    }
                    else {
                        if (v107 > v120) {
                            v106 = v120 + p106;
                            d106 = d120;
                        }
                        else {
                            v106 = v107 + p106;
                            d106 = d107;
                        }
                    }
                }
                else {
                    if (v94 > v93) {
                        if (v93 > v120) {
                            v106 = v120 + p106;
                            d106 = d120;
                        }
                        else {
                            v106 = v93 + p106;
                            d106 = d93;
                        }
                    }
                    else {
                        if (v94 > v120) {
                            v106 = v120 + p106;
                            d106 = d120;
                        }
                        else {
                            v106 = v94 + p106;
                            d106 = d94;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l114)){
            m114 =  rc.senseMapInfo(l114);
            if (m114.isPassable()){
                p114 = 10 + switch(m114.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v100 > v113) {
                    if (v113 > v101) {
                        if (v101 > v126) {
                            v114 = v126 + p114;
                            d114 = d126;
                        }
                        else {
                            v114 = v101 + p114;
                            d114 = d101;
                        }
                    }
                    else {
                        if (v113 > v126) {
                            v114 = v126 + p114;
                            d114 = d126;
                        }
                        else {
                            v114 = v113 + p114;
                            d114 = d113;
                        }
                    }
                }
                else {
                    if (v100 > v101) {
                        if (v101 > v126) {
                            v114 = v126 + p114;
                            d114 = d126;
                        }
                        else {
                            v114 = v101 + p114;
                            d114 = d101;
                        }
                    }
                    else {
                        if (v100 > v126) {
                            v114 = v126 + p114;
                            d114 = d126;
                        }
                        else {
                            v114 = v100 + p114;
                            d114 = d100;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l134)){
            m134 =  rc.senseMapInfo(l134);
            if (m134.isPassable()){
                p134 = 10 + switch(m134.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v122 > v121) {
                    if (v121 > v135) {
                        if (v135 > v120) {
                            v134 = v120 + p134;
                            d134 = d120;
                        }
                        else {
                            v134 = v135 + p134;
                            d134 = d135;
                        }
                    }
                    else {
                        if (v121 > v120) {
                            v134 = v120 + p134;
                            d134 = d120;
                        }
                        else {
                            v134 = v121 + p134;
                            d134 = d121;
                        }
                    }
                }
                else {
                    if (v122 > v135) {
                        if (v135 > v120) {
                            v134 = v120 + p134;
                            d134 = d120;
                        }
                        else {
                            v134 = v135 + p134;
                            d134 = d135;
                        }
                    }
                    else {
                        if (v122 > v120) {
                            v134 = v120 + p134;
                            d134 = d120;
                        }
                        else {
                            v134 = v122 + p134;
                            d134 = d122;
                        }
                    }
                }
            }
        }
        if (rc.onTheMap(l138)){
            m138 =  rc.senseMapInfo(l138);
            if (m138.isPassable()){
                p138 = 10 + switch(m138.getPaint()){
                    case ENEMY_PRIMARY, ENEMY_SECONDARY -> 10;
                    case EMPTY -> 5;
                    default -> 0;
                };
                if (v124 > v125) {
                    if (v125 > v137) {
                        if (v137 > v126) {
                            v138 = v126 + p138;
                            d138 = d126;
                        }
                        else {
                            v138 = v137 + p138;
                            d138 = d137;
                        }
                    }
                    else {
                        if (v125 > v126) {
                            v138 = v126 + p138;
                            d138 = d126;
                        }
                        else {
                            v138 = v125 + p138;
                            d138 = d125;
                        }
                    }
                }
                else {
                    if (v124 > v137) {
                        if (v137 > v126) {
                            v138 = v126 + p138;
                            d138 = d126;
                        }
                        else {
                            v138 = v137 + p138;
                            d138 = d137;
                        }
                    }
                    else {
                        if (v124 > v126) {
                            v138 = v126 + p138;
                            d138 = d126;
                        }
                        else {
                            v138 = v124 + p138;
                            d138 = d124;
                        }
                    }
                }
            }
        }
    }

    static boolean isClose(MapLocation target){
        int dx = target.x - rc.getLocation().x;
        int dy = target.y - rc.getLocation().y;
        switch(dx){
            case -4:
                switch(dy){
                    case -2: return v30 < 1000;
                    case -1: return v31 < 1000;
                    case 0: return v32 < 1000;
                    case 1: return v33 < 1000;
                    case 2: return v34 < 1000;
                }
                break;
            case -3:
                switch(dy){
                    case -3: return v42 < 1000;
                    case -2: return v43 < 1000;
                    case -1: return v44 < 1000;
                    case 0: return v45 < 1000;
                    case 1: return v46 < 1000;
                    case 2: return v47 < 1000;
                    case 3: return v48 < 1000;
                }
                break;
            case -2:
                switch(dy){
                    case -4: return v54 < 1000;
                    case -3: return v55 < 1000;
                    case -2: return v56 < 1000;
                    case -1: return v57 < 1000;
                    case 0: return v58 < 1000;
                    case 1: return v59 < 1000;
                    case 2: return v60 < 1000;
                    case 3: return v61 < 1000;
                    case 4: return v62 < 1000;
                }
                break;
            case -1:
                switch(dy){
                    case -4: return v67 < 1000;
                    case -3: return v68 < 1000;
                    case -2: return v69 < 1000;
                    case -1: return v70 < 1000;
                    case 0: return v71 < 1000;
                    case 1: return v72 < 1000;
                    case 2: return v73 < 1000;
                    case 3: return v74 < 1000;
                    case 4: return v75 < 1000;
                }
                break;
            case 0:
                switch(dy){
                    case -4: return v80 < 1000;
                    case -3: return v81 < 1000;
                    case -2: return v82 < 1000;
                    case -1: return v83 < 1000;
                    case 0: return v84 < 1000;
                    case 1: return v85 < 1000;
                    case 2: return v86 < 1000;
                    case 3: return v87 < 1000;
                    case 4: return v88 < 1000;
                }
                break;
            case 1:
                switch(dy){
                    case -4: return v93 < 1000;
                    case -3: return v94 < 1000;
                    case -2: return v95 < 1000;
                    case -1: return v96 < 1000;
                    case 0: return v97 < 1000;
                    case 1: return v98 < 1000;
                    case 2: return v99 < 1000;
                    case 3: return v100 < 1000;
                    case 4: return v101 < 1000;
                }
                break;
            case 2:
                switch(dy){
                    case -4: return v106 < 1000;
                    case -3: return v107 < 1000;
                    case -2: return v108 < 1000;
                    case -1: return v109 < 1000;
                    case 0: return v110 < 1000;
                    case 1: return v111 < 1000;
                    case 2: return v112 < 1000;
                    case 3: return v113 < 1000;
                    case 4: return v114 < 1000;
                }
                break;
            case 3:
                switch(dy){
                    case -3: return v120 < 1000;
                    case -2: return v121 < 1000;
                    case -1: return v122 < 1000;
                    case 0: return v123 < 1000;
                    case 1: return v124 < 1000;
                    case 2: return v125 < 1000;
                    case 3: return v126 < 1000;
                }
                break;
            case 4:
                switch(dy){
                    case -2: return v134 < 1000;
                    case -1: return v135 < 1000;
                    case 0: return v136 < 1000;
                    case 1: return v137 < 1000;
                    case 2: return v138 < 1000;
                }
                break;
        }
        return true;
    }


}
