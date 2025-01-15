
targets = {}
locations = {}

# attack target
for ax in range(-2, 3):
    for ay in range(-2, 3):
        if ax*ax+ay*ay>4: continue
        attack_id = len(targets)
        targets[(ax, ay)] = attack_id
        
        # affected position
        for dx in range(-2, 3):
            for dy in range(-2, 3):
                if dx*dx+dy*dy>4: continue
                can_remove_enemy_paint = dx*dx+dy*dy<=2

                ddx = ax+dx
                ddy = ay+dy
                if (ddx,ddy) not in locations:
                    locations[(ddx,ddy)] = {
                        'paint1': [],
                        'paint2': [],
                        'tower': [],
                    }
                
                if can_remove_enemy_paint:
                    locations[(ddx,ddy)]['paint1'].append(attack_id)
                else:
                    locations[(ddx,ddy)]['paint2'].append(attack_id)
                locations[(ddx,ddy)]['tower'].append(attack_id)

for (dx, dy) in targets:
    id = targets[(dx,dy)]
    print(f'int score{id} = 0;')


print(f'MapLocation myLoc = rc.getLocation();')
print(f'MapLocation loc;')
print(f'MapInfo i;')
print(f'RobotInfo r;')
print(f'PaintType p;')
print(f'Team myTeam = rc.getTeam();')
for (dx, dy) in locations:
    print(f'loc = myLoc.translate({dx}, {dy});')
    print('if(rc.canSenseLocation(loc)) {')
    print(f'i = rc.senseMapInfo(loc);')
    print(f'r = rc.senseRobotAtLocation(loc);')
    l = locations[(dx,dy)]

    print('p = i.getPaint();')
    if ids := l['paint1']:
        print('if(p.isEnemy()){')
        for id in ids: print(f'    score{id} += 4;')
        print('} else if (p == PaintType.EMPTY && i.isPassable()) {')
        for id in ids: print(f'    score{id} += 1;')
        print('}')
    if ids := l['paint2']:
        print('if (p == PaintType.EMPTY && i.isPassable()) {')
        for id in ids: print(f'    score{id} += 1;')
        print('}')
    if ids := l['tower']:
        print('if(r != null && r.team != myTeam && r.type.isTowerType()){')
        for id in ids: print(f'    score{id} += 10;')
        print('}')
    print('}')


print('MapLocation best = null;')
print('int bestScore = 10;')
for (dx, dy) in targets:
    id = targets[(dx,dy)]
    print(f'if(bestScore < score{id}) {{ bestScore = score{id}; best = myLoc.translate({dx}, {dy}); }}')
print('return best;')
