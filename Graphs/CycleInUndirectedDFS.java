package Graphs;

import java.util.*;

public class CycleInUndirectedDFS {

    public boolean isCycle(List<List<Integer>> graph) {

        boolean[] visited = new boolean[graph.size()];

        //if the graph has multiple sources example if it is a disconnected graph then,
        for(int i = 0; i < graph.size(); i++) {

            if(!visited[i]) {

                if(cycleExistsdfs(graph, i, -1, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean cycleExistsdfs(List<List<Integer>> graph,
                                  int src,
                                  int parent,
                                  boolean[] visited) {

        visited[src] = true;

        for(int neighbor : graph.get(src)) {

            if(!visited[neighbor]) {

                if(cycleExistsdfs(graph, neighbor, src, visited)) {
                    return true;
                }

            }
            else if(neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}