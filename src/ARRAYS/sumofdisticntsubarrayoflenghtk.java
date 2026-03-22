package ARRAYS;

import java.util.HashMap;

public class sumofdisticntsubarrayoflenghtk {
    class Solution {
        public long maximumSubarraySum(int[] nums, int k) {
            int left=0,sum=0,maxsum=0;
            HashMap<Integer,Integer> map = new HashMap<>();

            for (int right = 0; right < nums.length; right++) {

                sum+=nums[right];
                map.put(nums[right], map.getOrDefault(nums[right],0)+1);
                //check overflow ofwindow
                if(right-left+1>k){
                    map.put(nums[left], map.get(nums[left])-1);
                    if(map.get(nums[left])==0){
                        map.remove(nums[left]);
                    }
                    sum-=nums[left];
                    left++;
                }

                //validating maxsum

                if(right-left+1==k && map.size()==k){
                    maxsum=Math.max(sum,maxsum);
                }
            }
return maxsum;
        }
    }
}
