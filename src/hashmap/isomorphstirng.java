package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class isomorphstirng {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())return false;
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)){
                if (map.get(a)!= b) return false;
            }
            else if (map.containsKey(b))  {
                if (map.get(b)!= a) return false;
                map.put(a,b);
            }


        }
        return true;
    }

    public static void main(String[] args) {
        String S = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(S,t));
    }
}
