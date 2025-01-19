package basic19;

import battlecode.common.GameConstants;
import battlecode.common.UnitType;

public class Constants {

    static final int INF = 1000000000;

    static final int MIN_TRANSFER_PAINT = 5;

    static final int CRITICAL_PAINT_SOLDIER = 35;
    static final int CRITICAL_PAINT_MOPPER = 55;
    static final int CRITICAL_PAINT_SPLASHER = 55;
    static final int EXPLORE_TURNS = 20;

    static final int SCORE_EMPTY_SPLASHER = 1;
    static final int SCORE_ENEMY_SPLASHER = 4;
    static final int SCORE_TOWER_SPLASHER = 10;

    static final int DESTRUCTION_THRESHOLD = 6000;

    static final int EMPTY_TILES_ROUND = 200;

    static final int MOP_SWEEP_SCORE = 5;

    static final int MIN_GIVING_THRESHOLD = 20;

    static final int NO_HEAL_CHIPS = 6000;

    static final int MIN_SOLDIER_MOVEMENT = UnitType.SOLDIER.attackCost + GameConstants.PENALTY_ENEMY_TERRITORY + 1;

    static final int MIN_PAINT_MOPPER_ATTACK = 5;

    static final int HP_NO_FIGHT = 40;

}
