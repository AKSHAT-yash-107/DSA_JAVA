package bitmanipulation;

public class sumofallsubs {
    class Solution {
        public int subsetXORSum(int[] nums) {
                int n = nums.length;
                int sum=0;
                for(int mask =0;mask<1<<n;mask++){
                    int res=0;
                    for (int i = 0; i < n; i++) {
                        if((mask&1<<i)!=0){
                            res^=nums[i];
                        }

                    }
                    sum+=res;
                }
                return sum;
        }
    }
}
