package strinng;

public class repeated_tring_match {
    class Solution {
        public int repeatedStringMatch(String a, String b) {
        int count=0;
        StringBuilder s= new StringBuilder("");
        while(s.length()!=b.length()){
            s.append(a);
            count++;
        }
        if(s.toString().contains(b)) return count;

        s.append(a);
        count++;
        if(s.toString().contains(b)) return count;

        return -1;
        }
    }
}
