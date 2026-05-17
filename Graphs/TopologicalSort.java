package Graphs;

import java.util.List;
import java.util.Stack;

/** 
 * topological sort
 * it is basically possible in DAG-directed acyclic graphs
 * so topological sort says if there is a directed edge from u->v then 
 * u must always come before v in the sorted order 
 * for example if there is 1->2 and 0->2 then the order could be
 * 0,1,2 or 1,0,2
 * multiple sorted answers could exist in topological sort
 **/
public class TopologicalSort {
    public void TopologicalDFS(List<List<Integer>> graph) {

        Stack<Integer> s = new Stack<>();

        boolean[] visited = new boolean[graph.size()];

        for (int i = 0; i < graph.size(); i++) {

            if (!visited[i]) {
                helper(i, graph, visited, s);
            }
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public void helper(int src,
                       List<List<Integer>> graph,
                       boolean[] visited,
                       Stack<Integer> s) {

        visited[src] = true;

        for (int neighbor : graph.get(src)) {

            if (!visited[neighbor]) {
                helper(neighbor, graph, visited, s);
            }
        }

        s.push(src);
    }
    
}
