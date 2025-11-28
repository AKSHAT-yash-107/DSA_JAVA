package hashmap;

import java.util.*;
class majority {
    public  static void majorityElement(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = -1;
        char t = 'a';
        String q ="";
        for (char y : map.keySet()) {
            int f = map.get(y);
            if (f > max) {
                max = f;
                t = y;
                q=q+ y; map.remove(y);
            }

        }
        System.out.println(" " + max +q);

    }

    public static void main(String[] args) {
        String t = "aaaAAA";
        majorityElement(t);
    }
}
