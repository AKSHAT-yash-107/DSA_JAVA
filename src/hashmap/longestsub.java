package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class longestsub {
    public  static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n<=1) return n;
        int i=0,j=0;
        int maxlen=0;
        HashMap<Character,Integer> map = new HashMap<>();
       // while (j<n){
        //      char ch = s.charAt(j);
        //
        //  if (map.containsKey(ch)&&map.get(ch)>=i){
        //      int len = j-i;
        //      maxlen = Math.max(len,maxlen);
        ////     // while(s.charAt(i)!=ch){
        //        i++;i++;
        //  }
        //}
        // }

        //}
        // map.put(ch,j);
        // j++;
        //}
        //  return maxlen;
        HashSet<Character> SET = new HashSet<>();
        while (j<n){
            char ch = s.charAt(j);
            while (SET.contains(ch)){
                SET.remove(s.charAt(i));
                i++;
            }
            SET.add(s.charAt(j));
            maxlen= Math.max(maxlen,j-i+1);
            j++;
        }
return maxlen;

    }

    public static void main(String[] args) {
        String s = "aabbeeddccas";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
