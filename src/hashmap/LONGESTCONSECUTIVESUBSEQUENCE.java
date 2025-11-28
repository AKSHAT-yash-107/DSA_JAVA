package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LONGESTCONSECUTIVESUBSEQUENCE {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) return 1;
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) {
            set.add(ele);
        }
        int longest = 0;
        for (int i : nums) {
            if (!set.contains(i - 1)) {

                int current = i;
                int streak = 1;

                while (set.contains(current + 1)) {
                    streak++;
                    current++;

                }
                longest = Math.max(streak, longest);
            }
        }
        return longest;

    }
}
