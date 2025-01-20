package basic22;

import battlecode.common.GameConstants;
import battlecode.common.UnitType;

public class Constants {
    public static final int SPLASHER_SCORE_ATTACK_PAINT = 1;
    public static final int SPLASHER_SCORE_ATTACK_PAINT_ENEMY = 4;
    public static final int SPLASHER_SCORE_ATTACK_TOWER = 10;

    public static final int COMMS_MIN_ROUND = 100;
    public static final double COMMS_USE_PROBABILITY_SPLASHER = 0.1;
    public static final double COMMS_USE_PROBABILITY_MOPPER = 0.3;

    public static final int INF = 1000000000;

    public static final int MIN_TRANSFER_PAINT = 5;

    public static final int CRITICAL_PAINT_SOLDIER = 35;
    public static final int CRITICAL_PAINT_MOPPER = 55;
    public static final int CRITICAL_PAINT_SPLASHER = 55;
    public static final int EXPLORE_TURNS = 20;

    public static final int MIN_GIVING_THRESHOLD = 20;

    public static final int NO_HEAL_CHIPS = 6000;

    public static final int MIN_SOLDIER_MOVEMENT = UnitType.SOLDIER.attackCost + GameConstants.PENALTY_ENEMY_TERRITORY + 1;

    public static final int MIN_PAINT_MOPPER_ATTACK = 5;

}
