package graph;
import java.util.*;
public class bfs_implementation {

    public void bfs(int src,ArrayList<ArrayList<Integer>> graph,boolean[] visited){
        Queue<Integer> q= new LinkedList<>();
        visited[src]=true;
        q.offer(src);

        while(!q.isEmpty()){
            int node=q.poll();

            for(int ng: graph.get(node)){
                if(!visited[ng]){
                    visited[ng]=true;
                    q.offer(ng);
                }
            }
        }
    }
}
