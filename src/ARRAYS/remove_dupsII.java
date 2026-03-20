package ARRAYS;

public class remove_dupsII {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int slow=2,fast;
            if(nums.length<=2) return nums.length;

            for( fast =2;fast<nums.length;fast++){
                if( nums[slow-2]!=nums[fast]){
                    nums[slow]=nums[fast];
                    slow++;
                }
            }
            return slow;
        }
    }
}
