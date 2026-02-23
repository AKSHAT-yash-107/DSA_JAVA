package bitmanipulation;
import java.util.*;
public class allbinarycode {
    class Solution {
        public boolean hasAllCodes(String s, int k) {

            int totalcount=1<<k;
            HashSet<String> set = new HashSet<>();

            for (int i = 0; i+k <s.length() ; i++) {
                String t = s.substring(i,i+k);
                set.add(t);
                    if (set.size()==totalcount) return true;
            }
            return false;

        }
    }
}
