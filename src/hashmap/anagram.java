package hashmap;

import java.util.HashMap;

public class anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i =0 ; i< s.length(); i++){
            if(map1.containsKey(s.charAt(i))){
                int f = map1.get(s.charAt(i));
                map1.put(s.charAt(i),f+1);
            }
            else map1.put(s.charAt(i),1);
        }

        for(int i =0 ; i< t.length(); i++){
            if(map2.containsKey(t.charAt(i))){
                int f = map2.get(t.charAt(i));
                map2.put(t.charAt(i),f+1);
            }
            else map2.put(t.charAt(i),1);
        }
        for(char n : map1.keySet()){
            int v = map1.get(n);
            if(!map2.containsKey(n)) return false;
            if(v!=map2.get(n)) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String s= "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
