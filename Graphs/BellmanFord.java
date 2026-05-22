package Graphs;

import java.util.List;

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
    public void bellmanFord(List<List<Pair>> weightedGraph){

    }

    public static void main(String [] args){
        int V = 5// no of vertices
        List<List<Pair>> weightedGraph = new ArrayList<>(V);


        //vertex 0's neighbors
        weightedGraph.get(0).add(new Pair(1, 2));
        weightedGraph.get(0).add(new Pair(2, 4));

        //vertex 1's neigbors
        weightedGraph.get(1).add(new Pair(2, -4));
        weightedGraph.get(1).add(new Pair(4, -1));

        //vertex 2's neighbors


        
    }
}

public class Pair{
    int v;
    int weight;

    public Pair(int v,int weight){
        this.v = v;
        this.weight = weight;
    }

}


