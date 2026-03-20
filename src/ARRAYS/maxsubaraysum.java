package ARRAYS;

public class maxsubaraysum {
    class Solution {
        public int maxSubArray(int[] nums) {
            long cursum=nums[0],ans=nums[0];
            for(int i =1;i< nums.length;i++){
                cursum=Math.max(nums[i],cursum+nums[i]);
                ans=Math.max(cursum,ans);


            }
            return (int)ans;

        }
    }
}
