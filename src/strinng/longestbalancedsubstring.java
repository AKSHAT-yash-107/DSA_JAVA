package strinng;
import java.util.*;
public class longestbalancedsubstring {
    class Solution {
        public int longestBalanced(String s) {
            int n = s.length();
            int maxLen = 0;

            for (int i = 0; i < n; i++) {
                Map<Character, Integer> freq = new HashMap<>();
                int mxfreq = 0;
                for (int j = i; j < n; j++) {
                    char c = s.charAt(j);
                    freq.put(c, freq.getOrDefault(c, 0) + 1);
                    mxfreq = Math.max(mxfreq, freq.get(c));

                    int length = j - i + 1;
                    if (mxfreq * freq.size() == length) {
                        maxLen = Math.max(maxLen,length);
                    }
                }
            }
            return maxLen;


        }
    }
}