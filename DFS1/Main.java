import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int e = sc.nextInt(); 

        Graph g = new Graph(n); 
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }

        g.resetVisited(); 
        g.dfs(0); 
    }
}
