package Graphs;

import java.util.*;

public class CycleInDirectedDFS {

    public boolean isCycle(List<List<Integer>> graph) {

        boolean[] vis = new boolean[graph.size()];
        boolean[] recPath = new boolean[graph.size()];

        for (int i = 0; i < graph.size(); i++) {

            if (!vis[i]) {

                if (CycleInGraphDFS(i, graph, vis, recPath)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean CycleInGraphDFS(int src,
                                   List<List<Integer>> graph,
                                   boolean[] vis,
                                   boolean[] recPath) {

        vis[src] = true;
        recPath[src] = true;

        for (int neighbor : graph.get(src)) {

            if (!vis[neighbor]) {

                if (CycleInGraphDFS(neighbor, graph, vis, recPath)) {
                    return true;
                }

            } else if (recPath[neighbor]) {

                return true;
            }
        }

        recPath[src] = false;

        return false;
    }
}