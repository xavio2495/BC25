package pathcount;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    final int MAX_DIST = 20;
    int count = 0;
    Node root;
    static boolean printed = false;

    static final Direction[] directions = {
            Direction.NORTH,
            Direction.NORTHEAST,
            Direction.EAST,
            Direction.SOUTHEAST,
            Direction.SOUTH,
            Direction.SOUTHWEST,
            Direction.WEST,
            Direction.NORTHWEST,
    };

    void buildGraph(){
        Location initLoc = new Location(0,0);
        root = new Node(initLoc);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node n = queue.poll();
            //System.out.println(n.loc);
            boolean leaf = true;
            for (Direction dir : directions){
                Location newLoc = n.loc.add(dir);
                if (newLoc.distanceSquared(root.loc) > MAX_DIST) continue;
                Node newNode = new Node(newLoc);
                if (n.canAdd(newNode)){
                    n.add(newNode);
                    queue.add(newNode);
                    leaf = false;
                }
            }
            if (leaf) ++count;
            if (count == 73630 && !printed){
                n.print();
                printed = true;
            }
            //System.out.println(count);
        }
    }

    void run(){
        buildGraph();
        System.out.println(count);
    }

    class Node{
        Node parent = null;
        Location loc = null;
        ArrayList<Node> children = new ArrayList<Node>();
        Node(Location loc){
            this.loc = loc;
        }

        void add(Node n){
            children.add(n);
            n.parent = this;
        }

        boolean canAdd(Node node){
            Node n = parent;
            while (n != null){
                if (n.loc.distanceSquared(node.loc) <= 2) return false;
                n = n.parent;
            }
            return true;
        }

        void print(){
            System.out.println(loc);
            if (parent != null) parent.print();
        }
    }

}
