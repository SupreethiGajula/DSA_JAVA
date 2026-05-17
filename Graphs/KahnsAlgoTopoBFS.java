package Graphs;

import java.util.List;
import java.util.Queue;

//step 1: calculate indegree of each node-no of incoming edges to the node
//step 2: push the nodes in the queue whose indegree is 0
//step 3:pop the nodes 1 by 1 and decrease the indegree of the neighbors of the popped by 1
//step 4:if indegree is 0 put it in the queue
public class KahnsAlgoTopoBFS {
    public void kahns(List<List<Integer>> graph){

    int n = graph.size();
    int[] indegree = new int[n];

    // 1. compute indegree
    for(int i=0;i<n;i++){
        for(int neighbor : graph.get(i)){
            indegree[neighbor]++;
        }
    }

    // 2. add indegree 0 nodes
    Queue<Integer> q = new LinkedList<>();

    for(int i=0;i<n;i++){
        if(indegree[i]==0){
            q.offer(i);
        }
    }

    // 3. BFS
    while(!q.isEmpty()){

        int node = q.poll();
        System.out.print(node + " ");

        for(int neighbor : graph.get(node)){

            indegree[neighbor]--;

            if(indegree[neighbor]==0){
                q.offer(neighbor);
            }
        }
    }
}
}
