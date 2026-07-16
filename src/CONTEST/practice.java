package CONTEST;

import java.util.HashMap;

public class practice {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int [] arr= new int [2];
            for (int i = 0; i < nums.length; i++) {
                int need = target-nums[i];
                if(map.containsKey(need )){
                    arr[0]=i;
                    arr[1]=map.get(need);
                }
                map.put(nums[i],i);

            }
return arr;
        }
    }
    class Solution1 {
        public int maxSubArray(int[] nums) {

            int currsum=nums[0],ans=nums[0];
            for(int i =1;i<nums.length;i++){
                currsum=Math.max(nums[i],currsum+nums[i]);
                ans=Math.max(currsum,ans);
            }
            return ans;
        }
        }
        class Solution2 {
            public int maxProduct(int[] nums) {
                int ans=nums[0],maxp=nums[0],minp=nums[0];
                for(int i =1;i<nums.length;i++){
                    int prevmaxp=maxp,prevminp=minp;
                    maxp= Math.max(nums[i],Math.max(prevmaxp*nums[i],prevminp*nums[i]));
                    minp=Math.min(nums[i],Math.min(prevmaxp*nums[i],prevminp*nums[i]));
                    ans= Math.min(ans,maxp);
                }
return maxp;
            }
        }
    class Solution4 {
        public void reverse (int nums[],int end, int st){
            while(st<=end){
                int temp = nums[st];

            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }}
        public void rotateright(int nums[],int k){
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
        public void rotateleft(int [] nums, int k){
            reverse(nums,0,k);
            reverse(nums,k+1, nums.length-1);
            reverse(nums,0, nums.length-1);
        }
        public void rotate(int[] nums, int k) {

        }
    }
    class Solution5 {
        public void moveZeroes(int[] nums) {
            int j =0;
            for(int i =0;i<nums.length;i++){
                if(nums[i]!=0){
                    int temp =nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                }
            }

        }
    }
    }
