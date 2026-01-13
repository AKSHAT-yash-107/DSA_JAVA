package hashmap;

import java.util.HashMap;

public class wordproblem {

    public boolean wordPattern(String pattern, String s) {
        String[]word = s.split(" ");
        if(pattern.length()!=word.length) return false;

        HashMap<Character,String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(word[i])) return false;
            }
            else {
                if (!map.containsValue(word[i])) map.put(pattern.charAt(i),word[i]);
                else return false;
            }

        }
        return true;
    }
}
