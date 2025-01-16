from dataclasses import dataclass

SCORE_ATTACK = -18
SCORE_ATTACK_PAINT = 1
SCORE_ATTACK_PAINT_ENEMY = 4
SCORE_ATTACK_TOWER = 10

SCORE_MOVE_TOWER_RANGE = -20
SCORE_MOVE_PAINT_NEUTRAL = -1
SCORE_MOVE_PAINT_ENEMY = -2
SCORE_MOVE_CLUMP = -1
SCORE_MOVE_CLUMP_ENEMY = -2

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

@dataclass(frozen=True)
class ActionMove:
    move: Vec

@dataclass(frozen=True)
class ActionMoveAttack:
    move: Vec
    attack: Vec

@dataclass(frozen=True)
class ActionAttackMove:
    attack: Vec
    move: Vec

def radius(d):
    for dx in range(-2, 3):
        for dy in range(-2, 3):
            v = Vec(dx, dy)
            if v.d2() <= d:
                yield v

# Generate all possible actions.
def all_actions():
    for move in radius(2):
        yield ActionMove(move)
        for attack in radius(4):
            yield ActionMoveAttack(move, attack+move)  # move, then attack
            yield ActionAttackMove(attack, move)  # attack, then move

# dedup actions that end up moving+attacking to the same places.
actions = dedup_by(all_actions(), lambda a: (a.move, getattr(a, 'attack', None)))

score_ids = set()
locations = {}
def score(loc, cond, id, score):
    loc = locations.setdefault(loc, {})
    loc.setdefault(cond, []).append((id, score))
    score_ids.add(id)
    
# score moves
moves = list(set((a.move for a in actions)))
for id, a in enumerate(moves):
    id = f'move{id}'
    score(a, 'p == PaintType.EMPTY', id, SCORE_MOVE_PAINT_NEUTRAL)
    score(a, 'p.isEnemy()', id, SCORE_MOVE_PAINT_ENEMY)
    for d in radius(2):
        score(a+d, 'r != null && r.team == myTeam', id, 'clumpScore')
    for d in radius(3*3):
        score(a+d, 'r != null && r.team != myTeam && r.type.isTowerType()', id, SCORE_MOVE_TOWER_RANGE)
    for d in radius(4*4):
        score(a+d, 'r != null && r.team != myTeam && r.type.ordinal() >= 9', id, SCORE_MOVE_TOWER_RANGE)

# score attacks
attacks = list(set((a.attack for a in actions if hasattr(a, 'attack'))))
for id, a in enumerate(attacks):
    id = f'attack{id}'
    for d in radius(2):
        score(a+d, 'p.isEnemy()', id, SCORE_ATTACK_PAINT_ENEMY)
    for d in radius(4):
        score(a+d, 'p == PaintType.EMPTY && i.isPassable()', id, SCORE_ATTACK_PAINT)
        score(a+d, 'r != null && r.team != myTeam && r.type.isTowerType()', id, SCORE_ATTACK_TOWER)

for id in score_ids:
    val = 0
    if id.startswith('attack'):
        val = SCORE_ATTACK
    print(f'int {id} = {val};')

print(f'MapLocation myLoc = rc.getLocation();')
print(f'MapLocation loc;')
print(f'MapInfo i;')
print(f'RobotInfo r;')
print(f'PaintType p;')
print(f'Team myTeam = rc.getTeam();')

print('i = rc.senseMapInfo(myLoc);')
print('p = i.getPaint();')
print(f'int clumpScore = p.isEnemy() ? {SCORE_MOVE_CLUMP_ENEMY} : {SCORE_MOVE_CLUMP};')

for loc, l in locations.items():
    if loc.d2() > 20: continue
    print(f'loc = myLoc.translate({loc.x}, {loc.y});')
    print('if(rc.canSenseLocation(loc)) {')
    print('i = rc.senseMapInfo(loc);')
    print('r = rc.senseRobotAtLocation(loc);')
    print('p = i.getPaint();')

    for cond, scores in l.items():
        print(f'if({cond}){{')
        for (id, score) in scores: print(f'    {id} += {score};')
        print('}')

    print('}') # endif canSenseLocation


print('int best = -1;')
print('int bestScore = -10000000;')
for id, a in enumerate(actions):
    move_cond = ''
    if a.move:
        move_cond = f'&& rc.canMove({a.move.direction()})'
    score_expr = f'move{moves.index(a.move)}'
    if hasattr(a, 'attack'):
        score_expr += f'+attack{attacks.index(a.attack)}'
    print(f'if(bestScore < {score_expr}{move_cond}) {{ bestScore = {score_expr}; best = {id}; }}')

print('switch(best){')
for id, a in enumerate(actions):
    print(f'    case {id}:')
    match a:
        case ActionMove(move):
            if move:
                print(f'        rc.move({a.move.direction()});')
        case ActionMoveAttack(move, attack):
            if move:
                print(f'        rc.move({a.move.direction()});')
            print(f'        rc.attack(myLoc.translate({a.attack.x}, {a.attack.y}));')
        case ActionAttackMove(attack, move):
            print(f'        rc.attack(myLoc.translate({a.attack.x}, {a.attack.y}));')
            if move:
                print(f'        rc.move({a.move.direction()});')
    print(f'        return;')
print('}') # switch
