package Graphs;

import java.util.*;

/**
 * Use bellman ford when there are negative weights in the graph 
 * Compared to dijkstra bellman ford doesn't perform well so, if there are no negative weights 
 * use dijkstra
 * 
 * Bellman ford doesn't work when there is a cycle in the graph whose edge weights on addition
 * gives negative value
 * 
 * same logic of edge relaxation as dijkstra but we have to run the loop for v-1 times 
 * where v is no. of edges
 */
public class BellmanFord {
    public void bellmanFord(List<List<Pair>> weightedGraph,int V){
        int [] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] = 0;

        for(int i=0;i<V-1;i++){
            //for every vertex starting from 0
            for(int u=0;u<V;u++){
                for(Pair pair:weightedGraph.get(u)){

                    if(dist[u] != Integer.MAX_VALUE &&
                       dist[pair.v] > dist[u] + pair.weight){

                        dist[pair.v] = dist[u] + pair.weight;
                    }
                }
            }
        }

        //negative cycle check
        for(int u=0;u<V;u++){
            for(Pair pair : weightedGraph.get(u)){

                if(dist[u] != Integer.MAX_VALUE &&
                   dist[pair.v] > dist[u] + pair.weight){

                    System.out.println("Negative cycle detected");
                    return;
                }
            }
        }

        for(int i:dist){
            System.out.println(i);
        }

    }

    public static void main(String [] args){
        int V = 5;// no of vertices
        List<List<Pair>> weightedGraph = new ArrayList<>(V);

        //initialize adjacency lists
        for(int i=0;i<V;i++){
            weightedGraph.add(new ArrayList<>());
        }

        //vertex 0's neighbors
        weightedGraph.get(0).add(new Pair(1, 2));
        weightedGraph.get(0).add(new Pair(2, 4));

        //vertex 1's neigbors
        weightedGraph.get(1).add(new Pair(2, -4));
        weightedGraph.get(1).add(new Pair(4, -1));

        //vertex 2's neighbors
        weightedGraph.get(2).add(new Pair(3, 2));

        //vertex 3's neighbors
        weightedGraph.get(3).add(new Pair(4, 4));

        BellmanFord obj = new BellmanFord();
        obj.bellmanFord(weightedGraph,V);

    }
}

class Pair{
    int v;
    int weight;

    public Pair(int v,int weight){
        this.v = v;
        this.weight = weight;
    }
}