package bitmanipulation;

import java.util.ArrayList;

public class countingbits {
    class Solution {
        public int[] countBits(int n) {
            int [] result = new int[n];
            for (int i = 0; i <= n; i++) {
                int count =Integer.bitCount(i);
                result[i]=count;

            }

return result;
        }
    }

    class Solution2 {
        public int[] countBits(int n) {

            int[] dp = new int[n+1];

            for(int i=1;i<=n;i++){
                dp[i] = dp[i>>1] + (i & 1);
            }

            return dp;
        }
    }

}
