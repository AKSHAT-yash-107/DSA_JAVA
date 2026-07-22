package graph;

import java.util.ArrayList;

public class if_path_exists {

    class Solution {
        public boolean dfs(int node, int destination,  ArrayList<ArrayList<Integer>> graph,boolean[]visited){
            if(node== destination) return true;

            visited[node]=true;

            for(int v : graph.get(node)){
                if(!visited[v]){
                    if (dfs(v,destination,graph,visited)) return true;


                }
            }
            return false;
        }
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            boolean [] visited = new boolean[n];

            for(int i=0 ; i<n; i++) graph.add(new ArrayList<>());

            for(int i =0;i<edges.length;i++){
                int v= edges[i][0];
                int u = edges[i][1];
                graph.get(v).add(u);
                graph.get(u).add(v);

            }
            return dfs( source, destination,graph,visited);

        }
    }
}
