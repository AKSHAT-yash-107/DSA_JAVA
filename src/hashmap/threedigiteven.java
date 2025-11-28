package hashmap;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;

public class threedigiteven {
    public static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int atom : digits) {
            if (map.containsKey(atom)) {
                int frq = map.get(atom);
                map.put(atom, frq + 1);
            } else map.put(atom, 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            if (i % 2 != 0) continue; // only even numbers

            int x = i;
            int v = x % 10;
            x /= 10;
            int b = x % 10;
            x /= 10;
            int a = x;

            // Make a copy of the original map to track usage
            HashMap<Integer, Integer> temp = new HashMap<>(map);

            if (temp.containsKey(a) && temp.get(a) > 0) {
                temp.put(a, temp.get(a) - 1);

                if (temp.containsKey(b) && temp.get(b) > 0) {
                    temp.put(b, temp.get(b) - 1);

                    if (temp.containsKey(v) && temp.get(v) > 0) {
                        ans.add(i);
                    }
                }
            }
        }

        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8}; // must use only single-digit numbers
        int[] result = findEvenNumbers(a);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
