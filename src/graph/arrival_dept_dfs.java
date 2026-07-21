package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class arrival_dept_dfs {
   static  ArrayList<ArrayList<Integer>> graph;
    static int [] arrival;
    static int [] dept;
    static boolean [] visited;
    static int timer;

    public static void dfs(int node){
        visited[node ]=true;
        arrival[node]=timer++;

        for(int v : graph.get(node)){
            if (!visited[node]) {
                dfs(node);

            }

        }
        dept[node]=timer++;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] first= br.readLine().trim().split("\\s+");
        int v = Integer.parseInt(first[0]);
        int e= Integer.parseInt(first[1]);

         graph = new ArrayList<>();

        for (int i = 0; i < v; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < v; i++) {
            String [] edge = br.readLine().trim().split("\\s+");
            graph.get(Integer.parseInt(edge[0])).add(Integer.parseInt(edge[1]));
        }
        visited = new boolean[v];
        arrival = new int[v];
        dept = new int[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }



    }




}
