package ARRAYS;

import java.util.*;

public class minimumpairremoval {
    public boolean helper(int []arr){

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int minimumPairRemoval(int[] arr) {
        int count =0;
        int n =arr.length;

        while(!helper(arr)){
            int sum = arr[0]+arr[1];
            int index=0;

            for (int i = 1; i <n-1 ; i++) {
                int asum= arr[i]+arr[i+1];
                if(asum<sum){
                    sum=asum;
                    index=i;
                }
            }
            arr[index]=sum;

            for (int i = index+1; i <n-1 ; i++) {
                arr[i]=arr[i+1];
            }
            n--;
            count++;
        }



        return count;
    }
}
class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);

        int count = 0;

        while (true) {
            boolean sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) break;

            int minSum = Integer.MAX_VALUE;
            int idx = 0;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            list.set(idx, minSum);
            list.remove(idx + 1);
            count++;
        }

        return count;
    }
}
