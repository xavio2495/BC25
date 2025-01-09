package basic1;

import battlecode.common.GameConstants;
import battlecode.common.UnitType;

public class Constants {

    static int INF = 1000000000;

    static int MIN_SOLDIER_MOVEMENT = UnitType.SOLDIER.attackCost + GameConstants.PENALTY_ENEMY_TERRITORY + 1;

}
