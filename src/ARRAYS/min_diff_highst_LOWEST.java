package ARRAYS;

import java.io.FileWriter;
import java.util.Arrays;

public class min_diff_highst_LOWEST {

    class Solution {
        public int minimumDifference(int[] nums, int k) {
            Arrays.sort(nums);
            int mind = Integer.MAX_VALUE;
            if(nums.length ==1) return 0;
            int n =  nums.length;
            for(int i =0;i+k-1<n;i++){
                int min= nums[k+i-1]-nums[i];
                mind=Math.min(mind,min);

            }
            return mind;
        }


    }
}
