import java.util.*;
public class Graph {
    public ArrayList<Integer>[] adj; 
    public boolean[] visited;
    public int nodes;

    public Graph(int n) {
        nodes = n;
        adj = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); 
    }

    public void bfs(int src) {
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(visited, false); 

        q.add(src);
        visited[src] = true;

        while (!q.isEmpty()) {
            int current = q.poll();
            System.out.println(current);

            for (int neighbor : adj[current]) {
                if (!visited[neighbor]) {
                    q.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}


