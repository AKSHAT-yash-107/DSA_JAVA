package ARRAYS;

public class MAXXAVERAGESUBARRYA {
    public static double findMaxAverage(int[] nums, int k) {
        int firstwindowsum =0;
        for (int i = 0; i < k; i++) {
            firstwindowsum+= nums[i];
        }
        int maxsum = firstwindowsum;
        for (int i = k; i <nums.length ; i++) {
            firstwindowsum+= nums[i]-nums[i-k];
            maxsum= Math.max(firstwindowsum,maxsum);
        }
        return (double)maxsum/k;
    }

    public static void main(String[] args) {
        int arr[]= {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr,4));
    }
}
