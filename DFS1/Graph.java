
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

   
    public void dfs(int src) {
        System.out.println(src);
        visited[src] = true;

        for (int neighbor : adj[src]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    
    public void resetVisited() {
        Arrays.fill(visited, false);
    }
}
