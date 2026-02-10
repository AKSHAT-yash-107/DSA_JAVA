package slidingwindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class balancedsubarray {


    class Solution {
        public int longestBalanced(int[] nums) {

            int n = nums.length;
            int maxLen = 0;

            for (int i = 0; i < n; i++) {

                Map<Integer, Integer> freq = new HashMap<>();
                int distinctEven = 0;
                int distinctOdd = 0;

                for (int j = i; j < n; j++) {

                    int val = nums[j];


                    if (!freq.containsKey(val)) {
                        freq.put(val, 1);

                        if (val % 2 == 0) distinctEven++;
                        else distinctOdd++;
                    } else {
                        freq.put(val, freq.get(val) + 1);
                    }

                    if (distinctEven == distinctOdd) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }

            return maxLen;
        }
    }

}
