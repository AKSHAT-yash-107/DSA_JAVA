package binarysearch;

public class firstandlastoccurence {

    class Solution {
        public int[] searchRange(int[] nums, int target) {

            int l=0,h= nums.length-1,fp=-1,lp=-1;

            while(l<=h){
                int m = l+(h-l)/2;

                if(nums[m]==target){

                    if(m>0 && nums[m-1]==nums[m]) h=m-1;

                    else {
                        fp=m;
                        break;
                    }
                }

                else if (nums[m]<target) l=m+1;

                else h=m-1;

            }

            l=0;
            h= nums.length-1;

            while(l<=h){
                int m = l+(h-l)/2;

                if(nums[m]==target){
                    if(m+1 < nums.length&& nums[m+1]==nums[m])l=m+1;

                    else{
                        lp=m;
                        break;
                    }

                }

                else if (nums[m]<target)
                    l=m+1;
                else h=m-1;
            }

            return new int[]{fp,lp};

        }
    }
}
