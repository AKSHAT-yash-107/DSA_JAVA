package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class palindrome3sequenc {
    public static int countPalindromicSubsequence(String s) {
        Map<Character,Integer> first = new HashMap<>();
        Map<Character,Integer> last = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!first.containsKey(ch)) first.put(ch,i);
            last.put(ch,i);
        }
        int count=0;
        for(char ch : first.keySet()){
            int fdex= first.get(ch);
            int ldex = last.get(ch);
            Set<Character> set = new HashSet<>();
            for (int i = fdex+1; i <=ldex-1 ; i++) {
                set.add(s.charAt(i));

            }
            count+=set.size();
        }
return count;
    }

    public static void main(String[] args) {
        String S ="aabca";
        System.out.println(countPalindromicSubsequence(S));
    }
}
