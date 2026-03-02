package strinng;

import java.util.*;

public class findallanagrams {

    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res= new ArrayList<>();

        if(p.length()>s.length()) return res;

        int [] freq= new int [26];
        int [] wind=new int[26];


        for(char c : p.toCharArray()){
            freq[c-'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
                wind[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(freq,wind)) res.add(0);

        for(int i =p.length();i<s.length();i++){
            wind[s.charAt(i)-'a']++;
            wind[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(freq,wind)) res.add(i-p.length()+1);
        }

return res;
        }
    }
}
