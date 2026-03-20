package ARRAYS;

public class maxprodsub {
    class Solution {
        public int maxProduct(int[] arr) {
            long maxP = arr[0], minP = arr[0], ans = arr[0];
            for (int i = 1; i < arr.length; i++) {
                long a = arr[i], tmp = maxP;
                maxP = Math.max(a, Math.max(maxP*a, minP*a));
                minP = Math.min(a, Math.min(tmp*a, minP*a));
                ans = Math.max(ans, maxP);
            }
            return (int ) ans;

        }
    }
}
