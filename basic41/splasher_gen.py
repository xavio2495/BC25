from dataclasses import dataclass

SCORE_ATTACK_PAINT = 'Constants.SPLASHER_SCORE_ATTACK_PAINT'
SCORE_ATTACK_PAINT_ENEMY = 'Constants.SPLASHER_SCORE_ATTACK_PAINT_ENEMY'
SCORE_ATTACK_TOWER = 'Constants.SPLASHER_SCORE_ATTACK_TOWER'

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

def radius(d):
    for dx in range(-2, 3):
        for dy in range(-2, 3):
            v = Vec(dx, dy)
            if v.d2() <= d:
                yield v

# Generate all possible actions.
def all_actions():
    for move in radius(2):
        for attack in radius(4):
            yield attack+move

# dedup actions that end up moving+attacking to the same places.
actions = list(set(all_actions()))

score_ids = set()
locations = {}
def score(loc, cond, id, score):
    loc = locations.setdefault(loc, {})
    loc.setdefault(cond, []).append((id, score))
    score_ids.add(id)
    
# score attacks
for id, a in enumerate(actions):
    id = f'attack{id}'
    for d in radius(2):
        score(a+d, 'p.isEnemy()', id, SCORE_ATTACK_PAINT_ENEMY)
    for d in radius(4):
        score(a+d, 'p == PaintType.EMPTY && i.isPassable()', id, SCORE_ATTACK_PAINT)
        score(a+d, 'r != null && r.team != myTeam && r.type.isTowerType()', id, SCORE_ATTACK_TOWER)

def p(what):
    global f
    f.write(what + '\n')

f = open('SplasherAttackManager.java', 'w')

p('''
package basic41;

import battlecode.common.*;

public class SplasherAttackManager {
    static RobotController rc;
    public static void calc() throws GameActionException {
        rc = MyRobot.rc;
''')

p('''
MapLocation myLoc = rc.getLocation();
MapLocation loc;
MapInfo i;
RobotInfo r;
PaintType p;
Team myTeam = rc.getTeam();
''')

for id in score_ids:
    p(f'int {id} = 0;')

p('i = rc.senseMapInfo(myLoc);')
p('p = i.getPaint();')

for loc, l in locations.items():
    if loc.d2() > 20: continue
    p(f'loc = myLoc.translate({loc.x}, {loc.y});')
    p('if(rc.canSenseLocation(loc)) {')
    p('i = rc.senseMapInfo(loc);')
    p('r = rc.senseRobotAtLocation(loc);')
    p('p = i.getPaint();')

    for cond, scores in l.items():
        p(f'if({cond}){{')
        for (id, score) in scores: p(f'    {id} += {score};')
        p('}')

    p('}') # endif canSenseLocation


for move in radius(2):
    p(f'if(rc.canMove({move.direction()})){{')
    p('int best = -1; int bestScore = Constants.SPLASHER_ATK_THRESHOLD;')
    for attack in radius(4):
        id = actions.index(attack+move)
        p(f'if(bestScore < attack{id}) {{ bestScore = attack{id}; best = {id}; }}')
    p(f'var info = MicroManagerSplasher.microInfos[{move.direction()}.ordinal()];')
    p('info.atkValue=bestScore;')
    p('info.atkLoc=id2loc(best);')
    p('}') # if canMove
    
p('}') # void calc


p('static MapLocation id2loc(int id) {')
p('MapLocation myLoc = rc.getLocation();')
p('return switch(id) {')
for id, a in enumerate(actions):
    p(f'    case {id} -> myLoc.translate({a.x},{a.y});')
p('    default -> null;')
p('};')
p('}') # static MapLocation id2loc

p('}') # class
