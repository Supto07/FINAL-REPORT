import java.util.*;



class Pair {
    public int node;
    public int cost;

    public Pair(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }
}


class PairComparator implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        return a.cost - b.cost;
    }
}

class Graph {
    public ArrayList<ArrayList<Pair>> adj;
    public int[] dis;
    public int nodes;

    public Graph(int n) {
        nodes = n;
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
    }

    public void addEdge(int u, int v, int w) {
        adj.get(u).add(new Pair(v, w));
        adj.get(v).add(new Pair(u, w));
    }

    public void dijkstra(int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
        dis[src] = 0;
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            int cost = current.cost;

            for (Pair neighbor : adj.get(node)) {
                int next = neighbor.node;
                int nextCost = neighbor.cost;
                if (cost + nextCost < dis[next]) {
                    dis[next] = cost + nextCost;
                    pq.add(new Pair(next, dis[next]));
                }
            }
        }
    }

    public void printDistances() {
        for (int i = 0; i < nodes; i++) {
            System.out.println(i + " -> " + dis[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of nodes
        int e = sc.nextInt(); // number of edges

        Graph g = new Graph(n);

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g.addEdge(u, v, w);
        }

        int src = sc.nextInt(); // source node
        g.dijkstra(src);
        g.printDistances();
    }
}
