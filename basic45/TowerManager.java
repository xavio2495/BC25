package basic45;

import battlecode.common.*;

public class TowerManager {

    static final int PAINT = 0;
    static final int MONEY = 1;
    static final int DEFENSE = 2;

    static int[] count = new int[3];

    static MapLocation closestPaintTower = null;
    static int roundPaintTowerSeen = 0;

    static int d = 0;


    static void updateClosest(){
        if (closestPaintTower != null){
            if (MyRobot.rc.canSenseLocation(closestPaintTower)){
                closestPaintTower = null;
                return;
            }
            d = MyRobot.rc.getLocation().distanceSquaredTo(closestPaintTower);
        }
    }


    static void update(RobotInfo r) throws GameActionException  {
        if (r != null && r.getTeam() == MyRobot.rc.getTeam()){
            switch(r.getType()){
                case LEVEL_ONE_PAINT_TOWER:
                case LEVEL_TWO_PAINT_TOWER:
                case LEVEL_THREE_PAINT_TOWER:
                    int newD = MyRobot.rc.getLocation().distanceSquaredTo(r.getLocation());
                    if (closestPaintTower == null || newD < d){
                        closestPaintTower = r.getLocation();
                        d = newD;
                        roundPaintTowerSeen = MyRobot.rc.getRoundNum();
                    }
                    break;
            }
        }
    }


    static void updateAll() throws GameActionException {
        updateClosest();
        RobotInfo[] robots = MyRobot.rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, MyRobot.rc.getTeam());
        for (RobotInfo r : robots){
            switch(r.getType()){
                case LEVEL_ONE_PAINT_TOWER:
                case LEVEL_TWO_PAINT_TOWER:
                case LEVEL_THREE_PAINT_TOWER:
                    int newD = MyRobot.rc.getLocation().distanceSquaredTo(r.getLocation());
                    if (closestPaintTower == null || newD < d){
                        closestPaintTower = r.getLocation();
                        d = newD;
                        roundPaintTowerSeen = MyRobot.rc.getRoundNum();
                    }
                    break;
            }
        }
    }

    static int ruinCountGuess;
    static int[] buildPlan;

    static int[] buildPlanSmall = { MONEY, MONEY, MONEY, PAINT, MONEY, PAINT, PAINT, DEFENSE };
    static int[] buildPlanBig = { MONEY, MONEY, MONEY, MONEY, MONEY, MONEY, MONEY, MONEY, PAINT, PAINT, PAINT, PAINT,
            DEFENSE };

    static void init() {
        int cells = MyRobot.rc.getMapWidth() * MyRobot.rc.getMapHeight();
        ruinCountGuess = cells / 40;
        if (ruinCountGuess < 16)
            buildPlan = buildPlanSmall;
        else
            buildPlan = buildPlanBig;
    }

    static int getNextBuildOld(){
        int i = MyRobot.rc.getNumberTowers();
        if (i >= buildPlan.length) {
            i = buildPlan.length - 1;
        }
        if (MyRobot.rc.getNumberTowers() < 7 && buildPlan[i] == DEFENSE){
            return MONEY;
        }
        return buildPlan[i];
    }


    static int getNextBuild() {
        //int ans = getNextBuildOld();
        int ch = MyRobot.rc.getChips();
        //int tn = MyRobot.rc.getNumberTowers();
        if (ch < Constants.MIN_CHIPS_PAINT_TOWER) return MONEY;
        return PAINT;
        /*if (ch >= Constants.MIN_CHIPS_PAINT_TOWER) return PAINT;
        if (tn < 7 && ans == DEFENSE) ans = MONEY;
        return ans;*/
    }

    static int getNextBuild(int code){
        int ch = MyRobot.rc.getChips();
        switch(code){
            case RuinManager.PAINT:
                if (ch < Constants.MIN_CHIPS_REVERT_PAINT) return MONEY;
                return PAINT;
            case RuinManager.MONEY:
                if (ch > Constants.MIN_CHIPS_REVERT_MONEY) return PAINT;
                return MONEY;
            default:
                return getNextBuild();
        }
    }


    static int towerCountCurrent;
    static int towerCountPrev;
    static int roundDestruction = 0;

    static void updateTowerCount(){
        towerCountPrev = towerCountCurrent;
        towerCountCurrent = MyRobot.rc.getNumberTowers();
    }

    static boolean shouldDestruct() throws GameActionException {
        RobotController rc = MyRobot.rc;
        if (towerCountCurrent < towerCountPrev){
            roundDestruction = rc.getRoundNum();
            return false;
        }
        if (rc.getRoundNum() < MyRobot.creationTurn + 2 || rc.getRoundNum() < roundDestruction + Constants.WAIT_DESTRUCTION) return false;
        if (rc.getChips() < Constants.MIN_CHIPS_DESTRUCTION) return false;
        switch(rc.getType()) {
            case LEVEL_ONE_PAINT_TOWER:
            case LEVEL_TWO_PAINT_TOWER:
            case LEVEL_THREE_PAINT_TOWER:
            case LEVEL_ONE_DEFENSE_TOWER:
            case LEVEL_TWO_DEFENSE_TOWER:
            case LEVEL_THREE_DEFENSE_TOWER:
                return false;
        }
        if (enemyTilesNearby()) return false;
        return (soldierNearby());
    }

    static boolean enemyTilesNearby(){
        MapInfo[] mis = MyRobot.rc.senseNearbyMapInfos();
        for (MapInfo m : mis) if (m.getPaint().isEnemy()) return true;
        return false;
    }

    static boolean soldierNearby() throws GameActionException {
        RobotInfo[] robots = MyRobot.rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, MyRobot.rc.getTeam());
        for (RobotInfo r : robots){
            if (r.getType() == UnitType.SOLDIER && r.getPaintAmount() > 100) return true;
        }
        return false;
    }

    static int getTowerMessage(){
        if (closestPaintTower == null) return -1;
        return closestPaintTower.x | (closestPaintTower.y << 6) | (roundPaintTowerSeen << 12);
    }

    static void reportPaintTowerUnit() throws GameActionException {
        int code = getTowerMessage();
        if (code < 0) return;
        if (Clock.getBytecodesLeft() < 500) return;
        RobotInfo[] allies = MyRobot.rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, MyRobot.rc.getTeam());
        for (RobotInfo r : allies){
            if (Clock.getBytecodesLeft() < 250) return;
            if (!r.getType().isTowerType()) continue;
            if (MyRobot.rc.canSendMessage(r.getLocation())){
                MyRobot.rc.sendMessage(r.getLocation(), code);
                return;
            }
        }
    }

    static void reportPaintTowerTower() throws GameActionException {
        int code = getTowerMessage();
        if (code < 0) return;
        if (MyRobot.rc.canBroadcastMessage()){
            MyRobot.rc.broadcastMessage(code);
        }
        RobotInfo[] allies = MyRobot.rc.senseNearbyRobots(GameConstants.VISION_RADIUS_SQUARED, MyRobot.rc.getTeam());
        for (RobotInfo r : allies){
            if (Clock.getBytecodesLeft() < 250) return;
            if (MyRobot.rc.canSendMessage(r.getLocation())){
                MyRobot.rc.sendMessage(r.getLocation(), code);
            }
        }
    }

    static void readMessages() throws GameActionException {
        int rd = MyRobot.rc.getRoundNum();
        int x, y, rseen, code;
        Message[] messages = MyRobot.rc.readMessages(rd);
        for (Message m : messages){
            code = m.getBytes();
            x = code&0x3F;
            y = (code >>> 6) & 0x3F;
            rseen = (code >>> 12);
            if (closestPaintTower == null || rseen > roundPaintTowerSeen){
                closestPaintTower = new MapLocation(x,y);
                roundPaintTowerSeen = rseen;
            }
        }
        messages = MyRobot.rc.readMessages(rd-1);
        for (Message m : messages){
            code = m.getBytes();
            x = code&0x3F;
            y = (code >>> 6) & 0x3F;
            rseen = (code >>> 12);
            if (closestPaintTower == null || rseen > roundPaintTowerSeen){
                closestPaintTower = new MapLocation(x,y);
                roundPaintTowerSeen = rseen;
            }
        }
    }




}
