package strinng;

import java.util.Arrays;

public class permutation {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if(s1.length()>s2.length()) return false;
            int n = s1.length();
            int m = s2.length();


            int [] freqs1= new int [26];

            for(char c : s1.toCharArray()) freqs1[c-'a']++;

            int [] wind=new int[26];

            for (int i = 0; i < n; i++) {
                wind[s2.charAt(i)-'a']++;
            }
            if(Arrays.equals(freqs1,wind)) return true;

            for(int i =n;i<m;i++){
                wind[s2.charAt(i)-'a']++;
                wind[s2.charAt(i-n)-'a']--;
                if(Arrays.equals(freqs1,wind)) return true;
            }
            return false;
        }
    }
}
