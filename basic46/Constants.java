package basic46;

import battlecode.common.GameConstants;
import battlecode.common.UnitType;

public class Constants {
    public static final int MINIMUM_PAINT_RECOVERY = 20;
    public static final int CRITICAL_PAINT_RECOVERY = 5;
    static int MIN_CHIPS_DESTRUCTION = 6500;
    static int MIN_CHIPS_DESTRUCTION_DEFENSE = 7500;


    static int MIN_CHIPS_REVERT_PAINT = 1500;

    static int MIN_CHIPS_PAINT_TOWER = 2500;
    static int MIN_CHIPS_PAINT_TOWER_LATE = 2500;
    static int PAINT_TOWER_LATE_RD = 80;

    static int MIN_CHIPS_REVERT_MONEY = 3000;

    static int WAIT_DESTRUCTION = 40;

    static int INF = 1000000000;

    static int MIN_TOWERS_NO_RECOVERY = 6;
    static int MIN_ROUNDS_NO_RECOVERY = 300;

    static int MIN_TRANSFER_PAINT = 5;

    static int CRITICAL_PAINT_SOLDIER = 35;
    static int CRITICAL_PAINT_MOPPER = 55;
    static int CRITICAL_PAINT_SPLASHER = 55;
    static int EXPLORE_TURNS = 20;

    static int MIN_GIVING_THRESHOLD = 20;

    static int MIN_INCREASE_NO_UPGRADE_2 = 50;

    static int MIN_INCREASE_NO_UPGRADE_3 = 30;

    //static int NO_HEAL_CHIPS = 6000;

    static int MIN_SOLDIER_MOVEMENT = UnitType.SOLDIER.attackCost + GameConstants.PENALTY_ENEMY_TERRITORY + 1;

    static int MIN_PAINT_MOPPER_ATTACK = 5;

    public static final int SPLASHER_SCORE_ATTACK_PAINT = 1;
    public static final int SPLASHER_SCORE_ATTACK_PAINT_ENEMY = 4;
    public static final int SPLASHER_SCORE_ATTACK_TOWER = 10;
    public static final int SPLASHER_ATK_THRESHOLD = 17;

    static int DIST_INF = 100000;

    static int RUSH_TURNS = 20;

}
