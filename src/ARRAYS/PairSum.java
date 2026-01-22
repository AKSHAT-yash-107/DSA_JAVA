package ARRAYS;

import java.util.HashSet;

public class PairSum {
    public static String solve(int[] A, int K) {
        // Use a HashSet to store numbers we have already seen
        HashSet<Integer> seen = new HashSet<>();

        for (int num : A) {
            int complement = K - num;

            // If the complement exists in the set, we found our pair
            if (seen.contains(complement)) {
                return "YES";
            }

            // Otherwise, add the current number to the set and keep moving
            seen.add(num);
        }

        return "NO";
    }

    public static void main(String[] args) {
        int[] A = {10, 5, 2, 3};
        int K = 8;
        System.out.println(solve(A, K)); // Output: YES (5 + 3)
    }

    public static class PairSum {
        public static String solve(int[] A, int K) {
            // Use a HashSet to store numbers we have already seen
            HashSet<Integer> seen = new HashSet<>();

            for (int num : A) {
                int complement = K - num;

                // If the complement exists in the set, we found our pair
                if (seen.contains(complement)) {
                    return "YES";
                }

                // Otherwise, add the current number to the set and keep moving
                seen.add(num);
            }

            return "NO";
        }

        public static void main(String[] args) {
            int[] A = {10, 5, 2, 3};
            int K = 8;
            System.out.println(solve(A, K)); // Output: YES (5 + 3)
        }
    }
}