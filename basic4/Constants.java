package basic4;

import battlecode.common.GameConstants;
import battlecode.common.UnitType;

public class Constants {

    static int INF = 1000000000;

    static int MIN_TRANSFER_PAINT = 20;

    static int CRITICAL_PAINT = 100;

    static int MIN_SOLDIER_MOVEMENT = UnitType.SOLDIER.attackCost + GameConstants.PENALTY_ENEMY_TERRITORY + 1;

}
