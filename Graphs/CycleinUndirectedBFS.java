package Graphs;

import java.util.*;

public class CycleinUndirectedBFS {

    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public boolean isCycle(List<List<Integer>> graph) {

        boolean[] visited = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++) {

            if(!visited[i]) {

                if(bfs(graph, i, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean bfs(List<List<Integer>> graph,
                       int src,
                       boolean[] visited) {

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(src, -1));

        visited[src] = true;

        while(!q.isEmpty()) {

            Pair curr = q.poll();

            int node = curr.node;
            int parent = curr.parent;

            for(int neighbor : graph.get(node)) {

                if(!visited[neighbor]) {

                    visited[neighbor] = true;

                    q.offer(new Pair(neighbor, node));
                }
                //main condition
                else if(neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }
}