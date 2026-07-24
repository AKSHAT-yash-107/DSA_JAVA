package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cycle_detection_in_undirect_bfs {

    // for cycle detection each node must remember their parent
    /*
    * only three cases
    * if not visited node visite it
    * if visited node is parent of current node ignore it
    * if its not parent then defenately cycle is present */

    public boolean iscycle(int v, ArrayList<ArrayList<Integer>> graph ){
        boolean [] visited = new boolean[v];

        for(int i=0;i<v;i++){
            if(!visited[i]){
                if(bfs(i,graph,visited)) return true;
            }

        }
        return false;

    }
    public boolean bfs (int src, ArrayList<ArrayList<Integer>> graph, boolean[]visited){

        Queue<int[]> q= new LinkedList<>();

        q.offer(new int[]{src,-1});
        while(!q.isEmpty()){
            int [] curr =q.poll();
            int node= curr[0];
            int parent=curr[1];
            for( int ng: graph.get(node)){
                if(!visited[node]){
                    visited[ng]=true;
                    q.offer(new int []{ng,node});

                }
                else if(ng!=node) return true;


            }

        }
        return false;
    }
}
