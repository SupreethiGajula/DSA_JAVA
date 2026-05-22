package Graphs;

import java.util.*;

public class Dijkstra {

    public void dijkstra(List<List<Pair>> weightedGraph, int src) {

        // Step 1: initialise distance array
        int[] dist = new int[weightedGraph.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Step 2: min heap (distance of the vertex, vertex)
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);

        pq.offer(new Pair(0, src));

        while (!pq.isEmpty()) {

            Pair p = pq.poll();

            int u = p.vertex;
            int currDist = p.distance;

            // skip stale entries -- optional for optimisation
            // if (currDist > dist[u])
            //     continue;

            // Step 3: traverse neighbours
            for (Pair edge : weightedGraph.get(u)) {

                int v = edge.vertex;
                int wt = edge.weight;

                // Step 4: Edge relaxation
                if (dist[v] > dist[u] + wt) {

                    dist[v] = dist[u] + wt;
                    pq.offer(new Pair(dist[v], v));
                }
            }
        }

        // print shortest distances
        for (int d : dist) {
            System.out.println(d);
        }
    }

    static class Pair {
        int distance;
        int vertex;
        int weight;

        // for priority queue (distance, vertex)
        Pair(int distance, int vertex) {
            this.distance = distance;
            this.vertex = vertex;
        }

        // for graph edges (vertex, weight)
        Pair(int vertex, int weight, boolean edge) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int V = 4;

        List<List<Pair>> weightedGraph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            weightedGraph.add(new ArrayList<>());
        }

        // add weighted edges

        weightedGraph.get(0).add(new Pair(1, 4, true));
        weightedGraph.get(0).add(new Pair(2, 1, true));

        weightedGraph.get(1).add(new Pair(3, 1, true));

        weightedGraph.get(2).add(new Pair(1, 2, true));
        weightedGraph.get(2).add(new Pair(3, 5, true));

        Dijkstra obj = new Dijkstra();
        obj.dijkstra(weightedGraph, 0);
    }
}