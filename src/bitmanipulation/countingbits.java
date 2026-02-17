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
}
