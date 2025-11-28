package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PALINDROME5SEQUENCE {
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
            Set<String> set = new HashSet<>();
            for (int i = fdex+1; i <ldex-2 ; i++) {
                for (int j = i+1; j <ldex-1;j++){
                    for (int k = j+1; k < ldex; k++) {
                        char c1= s.charAt(i);
                        char c2 = s.charAt(j);
                        char c3 = s.charAt(k);
                        String t = ""+c1+c2+c3;
                        set.add(t);
                        
                    }
                }

            }
            count+=set.size();
        }
        return count;
    }
    public static void main(String[] args) {
        String S ="0000001";
        System.out.println(countPalindromicSubsequence(S));
    }
}
