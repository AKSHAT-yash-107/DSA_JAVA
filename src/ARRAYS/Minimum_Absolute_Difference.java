package ARRAYS;

import java.util.*;

public class Minimum_Absolute_Difference {
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            List<List<Integer>> result = new ArrayList<>();
            int mind = Integer.MAX_VALUE;
            Arrays.sort(arr);
            for (int i = 1; i < arr.length; i++) {
                mind = Math.min(mind, arr[i] - arr[i - 1]);
            }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] == mind) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(arr[i - 1]);
                    ans.add(arr[i]);
                    result.add(ans);
                }
            }
            return result;
        }
    }
}
