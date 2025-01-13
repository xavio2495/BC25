package basic6;

import battlecode.common.GameConstants;
import battlecode.common.UnitType;

public class Constants {

    static int INF = 1000000000;

    static int MIN_TRANSFER_PAINT = 5;

    static int CRITICAL_PAINT_SOLDIER_TOWER = 100;

    static int CRITICAL_PAINT_SOLDIER_RESOURCE = 100;

    static int CRITICAL_PAINT_MOPPER = 60;

    static int MIN_SOLDIER_MOVEMENT = UnitType.SOLDIER.attackCost + GameConstants.PENALTY_ENEMY_TERRITORY + 1;

    static int MIN_PAINT_MOPPER_ATTACK = 5;

}
