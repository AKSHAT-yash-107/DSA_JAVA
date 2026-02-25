package bitmanipulation;

import java.util.Arrays;

public class SORT_INTERGERBY_NUM_OF1BITS {
    class Solution {
        public int[] sortByBits(int[] arr) {

            Integer[] nums = new Integer[arr.length];
            for(int i=0;i<arr.length;i++)
                nums[i] = arr[i];

            Arrays.sort(nums, (a, b)->{
                int bitA = countBits(a);
                int bitB = countBits(b);

                if(bitA == bitB)
                    return a - b;

                return bitA - bitB;
            });

            for(int i=0;i<arr.length;i++)
                arr[i] = nums[i];

            return arr;
        }

        private int countBits(int n){
            int count = 0;
            while(n>0){
                n = n & (n-1);
                count++;
            }
            return count;
        }
    }
}
