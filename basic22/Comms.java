package basic22;

import battlecode.common.*;

public class Comms {
    // alert encoding
    // 6 bits: x
    // 6 bits: y
    // 4 bits: count
    // 11 bits: round

    static RobotController rc;
    static DecodedMessage best;

    static MapLocation lastTarget;
    static boolean lastTargetReached;

    public static MapLocation getTarget() throws GameActionException {
        if(rc.getRoundNum() < Constants.COMMS_MIN_ROUND) return null;
        if(best == null) return null;
        return best.loc;
    }
    public static MapLocation getTarget2() throws GameActionException {
        if(rc.getRoundNum() < Constants.COMMS_MIN_ROUND) return null;

        // if target from comms moved, reset.
        if(best != null && lastTarget != null && best.loc.distanceSquaredTo(lastTarget) > 40) {
            lastTarget = null;
            lastTargetReached = false;
        }

        // if we reached target, start ignoring it.
        if(!lastTargetReached && lastTarget != null && lastTarget.distanceSquaredTo(rc.getLocation()) < 6) {
            lastTargetReached = true;
        }

        // if we have no target, set it.
        if(best != null && lastTarget == null) {
            lastTarget = best.loc;
        }
        if(lastTargetReached) {
            rc.setIndicatorString("reached");
            return null;
        }
        rc.setIndicatorString(lastTarget + " " + best);
        if(best != null) {
            rc.setIndicatorDot(best.loc, 0, 0, 255);
        }
        if(lastTarget != null) {
            if(lastTargetReached) {
                rc.setIndicatorDot(lastTarget, 0, 255, 0);
            } else {
                rc.setIndicatorDot(lastTarget, 255, 0, 0);
            }
        }
        return lastTarget;
    }

    static class DecodedMessage {
        MapLocation loc;
        int count;
        int round;

        public DecodedMessage(MapLocation loc, int count, int round) {
            this.loc = loc;
            this.count = count;
            this.round = round;
        }

        public DecodedMessage(int coded) {
            this.loc = new MapLocation(coded & 0x3f, (coded >> 6) & 0x3f);
            this.count = (coded >> 12) & 0xf;
            this.round = (coded >> 16) & 0x7ff;
        }

        public int coded() {
            return this.loc.x | (this.loc.y << 6) | (this.count << 12) | (this.round << 16);
        }

        public double score(MapLocation myLoc) {
            //return count*3 + round - Math.sqrt(myLoc.distanceSquaredTo(loc))*2;
            return count*10 + round;
        }

        @Override
        public String toString() {
            return "DecodedMessage [loc=" + loc + ", count=" + count + ", round=" + round + "]";
        }
    }

    public static void run() throws GameActionException {
        MapLocation myLoc = rc.getLocation();
        int round = rc.getRoundNum();

        double score = -1e9;
        double bestScore = -1e9;
        if(best != null) {
            bestScore = best.score(myLoc);
        }

        for(Message m : rc.readMessages(round)) {
            DecodedMessage dm = new DecodedMessage(m.getBytes());
            //System.out.println("received " + dm + " " + m.getBytes());
            score = dm.score(myLoc);
            if(score > bestScore) {
                bestScore = score;
                best = dm;
            }
        }

        for(Message m : rc.readMessages(round-1)) {
            DecodedMessage dm = new DecodedMessage(m.getBytes());
            score = dm.score(myLoc);
            if(score > bestScore) {
                bestScore = score;
                best = dm;
            }
        }

        // also create a message with what we see now.
        var enemies = rc.senseNearbyRobots(20, rc.getTeam().opponent());
        int count = enemies.length;
        if(count >= 1) {
            if(count > 15) count = 15;
            DecodedMessage dm = new DecodedMessage(enemies[0].getLocation(), count, round);
            score = dm.score(myLoc);
            if(score > bestScore) {
                bestScore = score;
                best = dm;
            }
        }

        if(best == null) return;

        rc.setIndicatorString("comms: " + best);
        rc.setIndicatorDot(best.loc, 0, 0, 255);

        int coded = best.coded();
        //System.out.println("sending " + best + " " + coded);

        if(rc.getType().isTowerType()) {
            // breadcast it
            if(rc.canBroadcastMessage()) {
                rc.broadcastMessage(coded);
            }

            // unicast it
            for(RobotInfo i : rc.senseNearbyRobots(20, rc.getTeam())) {
                if(!i.type.isTowerType()) {
                    MapLocation loc = i.getLocation();
                    if(rc.canSendMessage(loc)) {
                        rc.sendMessage(loc, coded);
                    }
                }
            }
        } else {
            for(RobotInfo i : rc.senseNearbyRobots(20, rc.getTeam())) {
                if(i.type.isTowerType()) {
                    MapLocation loc = i.getLocation();
                    if(rc.canSendMessage(loc)) {
                        rc.sendMessage(loc, coded);
                        break; // we can send ONE message per turn.
                    }
                }
            }
        }
    }
}
