package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class ryr {
    public static boolean containsDuplicate(int[] num) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (set.contains(num[i])) {
                return true;

            }
            set.add(num[i]);

        }
        return false;

    }

}