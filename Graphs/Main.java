package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> g = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        // use helper
        addEdge(g, 0, 1);
        addEdge(g, 1, 2);
        addEdge(g, 1, 3);

        addEdge(g, 2, 3);
        addEdge(g, 2, 4);
        addEdge(g, 2, 5);

        addEdge(g, 3, 5);

        BFS bfs = new BFS();
        System.out.println("BFS:\n");
        bfs.findBfs(g);
        DFS dfsObj = new DFS();
        System.out.println("DFS:\n");
        dfsObj.dfs(g);

        CycleInUndirectedDFS cycle = new CycleInUndirectedDFS();
        System.out.println("Does the graph have cycle???");
        System.out.println(cycle.isCycle(g)); 
    }
    static void addEdge(List<List<Integer>> g, int u, int v) {
    g.get(u).add(v);
    g.get(v).add(u);
}

}
