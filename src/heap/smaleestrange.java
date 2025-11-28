package heap;

import java.util.List;
import java.util.PriorityQueue;

public class smaleestrange {



 public class triplet implements Comparable<triplet>{
        int ele,row,col;
        triplet(int ele,int row,int col){
            this.col=col;
            this.row=row;
            this.ele=ele;
        }
        public int compareTo(triplet t){
                return this.ele-t.ele;

            }

}

    public int[] smallestRange(List<List<Integer>> nums) {
 int [] ans= {0,Integer.MAX_VALUE};
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        int k = nums.size();
        int max= Integer.MIN_VALUE;
        for (int i=0; i<k;i++){
            int ele = nums.get(i).get(0);
            pq.add(new triplet(ele,i,0));
            max= Math.max(max,ele);
        }

        while (true){
            triplet top = pq.remove();
            int ele= top.ele;  int row = top.row; int col = top.col;
            if(max-ele<ans[1]-ans[0]){
                ans[0]= ele;
                ans[1] = max;
            }
              if(col == nums.get(row).size()-1) break;
              int next = nums.get(row).get(col+1);
              max = Math.max(max,next);
              pq.add(new triplet(next,row,col+1));
        }
        return ans;

    }
}
