package greedy;

import java.util.Collections;
import java.util.List;

public class max_dist_array {
    class Solution {
        public int maxDistance(List<List<Integer>> arrays) {


            int first= arrays.getFirst().getFirst();
            int end=arrays.getFirst().getLast();
            int  ans=0;

            for (int i = 1; i < arrays.size(); i++) {
                int currmin=arrays.get(i).getFirst();
                int currmax=arrays.get(i).getLast();
                int temp = Math.max(Math.abs(currmin - first), Math.abs(currmax-end));
                ans = Math.max(ans, temp);

                first= Math.max(currmin,first);
                end=Math.max(currmax,end);
            }
            return ans;


        }
    }
}
