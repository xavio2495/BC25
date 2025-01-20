from dataclasses import dataclass

SCORE_ATTACK_UNPAINT = 5
SCORE_ATTACK_ENEMY = 5
SCORE_MOPSWING_ENEMY = 5

def group_by(items, key):
    r = {}
    for i in items:
        k = key(i)
        if k not in r:
            r[k] = []
        r[k].append(i)
    return r

def dedup_by(items, key):
    r = {}
    for i in items:
        r[key(i)] = i
    return list(r.values())

@dataclass(frozen=True)
class Vec:
    x: int
    y: int

    def d2(self):
        return self.x*self.x+self.y*self.y
    def __add__(self,other):
        return Vec(self.x+other.x, self.y+other.y)
    def __mul__(self,other):
        return Vec(self.x*other, self.y*other)
    def __str__(self):
        return f'({self.x}, {self.y})'
    def __repr__(self):
        return f'({self.x}, {self.y})'
    def direction(self):
        match self:
            case Vec(0, 1): return 'Direction.NORTH'
            case Vec(1, 1): return 'Direction.NORTHEAST'
            case Vec(1, 0): return 'Direction.EAST'
            case Vec(1, -1): return 'Direction.SOUTHEAST'
            case Vec(0, -1): return 'Direction.SOUTH'
            case Vec(-1, -1): return 'Direction.SOUTHWEST'
            case Vec(-1, 0): return 'Direction.WEST'
            case Vec(-1, 1): return 'Direction.NORTHWEST'
            case Vec(0, 0): return 'Direction.CENTER'
            case _: raise Exception(f'Bad direction vec {self}')
    def __bool__(self):
        return self.x != 0 or self.y != 0


@dataclass(frozen=True)
class ActionAttack:
    loc: Vec

@dataclass(frozen=True)
class ActionMopSwing:
    loc: Vec
    dir: Vec

def radius(d):
    for dx in range(-2, 3):
        for dy in range(-2, 3):
            v = Vec(dx, dy)
            if v.d2() <= d:
                yield v

DIRS = [
    Vec(1, 0),
    Vec(0, 1),
    Vec(-1, 0),
    Vec(0, -1),
]

# Generate all possible actions.
def all_actions():
    for move in radius(2):
        # for attack in radius(2):
        #     yield move, ActionAttack(attack+move)
        for dir in DIRS:
            yield move, ActionMopSwing(move, dir)
            
moveActions = {}
actions = set()
for move, action in all_actions():
    actions.add(action)
    moveActions.setdefault(move, set()).add(action)
actions = list(actions)

score_ids = set()
locations = {}    
# score attacks
for id, a in enumerate(actions):
    id = f'action{id}'

    #if isinstance(a, ActionAttack):
    #    score(a.loc, 'p.isEnemy()', id, SCORE_ATTACK_UNPAINT)
    #    score(a.loc, 'r != null && r.team != myTeam && r.getPaintAmount() != 0 && !r.type.isTowerType()', id, SCORE_ATTACK_ENEMY)
    if isinstance(a, ActionMopSwing):
        d = a.dir
        j = Vec(d.y, -d.x)
        for xx in range(-1,2):
            for yy in range(1,3):
                loc = a.loc + j*xx + d*yy
                locations.setdefault(loc, []).append((id, SCORE_MOPSWING_ENEMY))
                score_ids.add(id)
    else:
        raise Exception('wtf')  

def p(what):
    global f
    f.write(what + '\n')

f = open('MopperAttackManager.java', 'w')

p('''
package basic26;

import battlecode.common.*;

public class MopperAttackManager {
    static RobotController rc;
    public static void calc() throws GameActionException {
        rc = MyRobot.rc;
''')

p('''
MapLocation myLoc = rc.getLocation();
''')

for id in sorted(list(score_ids)):
    p(f'int {id} = 0;')

p('for(RobotInfo r : rc.senseNearbyRobots(13, rc.getTeam().opponent())) {')
p('    if(r.getPaintAmount() != 0 && !r.type.isTowerType()) {')
p('        MapLocation loc = r.location;')
p('        int dx = loc.x - myLoc.x;')
p('        int dy = loc.y - myLoc.y;')
p('        switch(dx+dy*10) {')


for loc, l in locations.items():
    if loc.d2() > 20: continue

    x = loc.x + loc.y*10
    p(f'            case {x}:')
    for (id, score) in l: 
        p(f'                {id} += {score};')
    p('                break;')
p('        }')
p('    }')
p('}')


for move in radius(2):
    p(f'if(rc.canMove({move.direction()})){{')
    p('int best = -1; int bestScore = 0;')
    for action in moveActions[move]:
        id = actions.index(action)
        p(f'if(bestScore < action{id}) {{ bestScore = action{id}; best = {id}; }} // {action}')
    p(f'var info = MicroManagerMopper.microInfos[{move.direction()}.ordinal()];')
    p('info.atkValue=bestScore;')
    p(f'id2info(best, info);')
    p('}') # if canMove
    
p('}') # void calc



p('static void id2info(int id, MicroManagerMopper.MicroInfo info) {')
p('MapLocation myLoc = rc.getLocation();')
p('switch(id) {')
for id, a in enumerate(actions):
    if isinstance(a, ActionAttack):
        p(f'    case {id}: info.atkLoc = myLoc.translate({a.loc.x},{a.loc.y}); break;')
    elif isinstance(a, ActionMopSwing):
        p(f'    case {id}: info.atkDirection = {a.dir.direction()}; break;')
    else:
        raise Exception('wtf')

p('}') # switch
p('}') # static void id2info

p('}') # class
