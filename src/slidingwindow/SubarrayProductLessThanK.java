package slidingwindow;

public class SubarrayProductLessThanK {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int pro=0;
        int min= Integer.MAX_VALUE;
        for(int right =0;right< nums.length;right++){
            pro*=nums[right];

            while(pro>=target){
                min=Math.min(min,right-left+1);
                pro/=nums[left];
                left++;
            }
        }
        return (min==Integer.MAX_VALUE)? 0:min;
    }
}
