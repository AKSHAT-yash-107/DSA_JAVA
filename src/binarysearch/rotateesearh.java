package binarysearch;

public class rotateesearh {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;

        while (l<=h){
            int m = l+(h-l)/2;
            if (nums[m]==target) return m;

            // sarh in left hafl nums[l]<=nums[mi]
            if (nums[l]<nums[m]){
                if (target>=nums[l]&&target<nums[m]) l=m+1;//abhi ka nums[m] tar s small hai or lft most mmbr target s small h
                else h=m-1;
            }
            else  {
                if (target>nums[m]&&target<=nums[h]) l=m+1;//abhi ka nums[m] tar s small hai or right most mmbr target  s big  h
                else h=m-1;
            }

        }

        return -1;
    }
}
