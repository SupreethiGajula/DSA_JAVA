package Graphs;
import java.util.*;

public class BFS {
    public void findBfs(List<List<Integer>> graph){
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[graph.size()];
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");
            for(int neighbor:graph.get(u)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    q.offer(neighbor);
                }
            }
        }
    }
    
}
