package Graphs;

import java.util.*;

public class DFS {
    protected void dfs(List<List<Integer>> graph){
        boolean[] visited = new boolean[graph.size()];
        int src = 0;
        dfsHelper(graph, visited, src);
    }

    private void dfsHelper(List<List<Integer>> graph, boolean[] visited, int src){
        visited[src] = true;
        System.out.print(src + " ");

        for(int u : graph.get(src)){
            if(!visited[u]){
                dfsHelper(graph, visited, u);
            }
        }
    }
}