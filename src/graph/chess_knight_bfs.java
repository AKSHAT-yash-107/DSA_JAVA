package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class chess_knight_bfs {

    public  static class Node{
        int x,y,steps;
        Node(int x, int y , int steps) {
            this.x = x;this.y=y;this.steps=steps;
        }
    }

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  n = sc.nextInt();
        int sx=sc.nextInt();
        int sy=sc.nextInt();

        int dx=sc.nextInt();
        int dy=sc.nextInt();

        boolean[][] visited = new boolean[n][n];

        int [] valid_row={2,2,1,1,-2,-2,-1,-1};
        int [] valid_cols={1,-1,2,-2,-1,1,-2,-2};

        Queue<Node> graph = new LinkedList<>();
        visited[sx][sy]=true;
        graph.offer(new Node(sx,sy,0));

        while(!graph.isEmpty()){
            Node curr = graph.poll();
            if(dx==curr.x && dy==curr.y) {System.out.println(curr.steps); return;}
            visited[curr.x][curr.y]=true;

            for (int i =0;i<8;i++){
                int row = curr.x+valid_row[i];
                int col= curr.y+valid_cols[i];
                if(row>=0 && row<n && col>=0 && col<n){
                    if(!visited[row][col]){
                        visited[row][col]=true;
                        graph.offer(new Node(row,col,curr.steps+1));
                    }
                }
            }
        }


    }

}

}
