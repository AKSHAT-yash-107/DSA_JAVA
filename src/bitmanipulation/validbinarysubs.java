package bitmanipulation;

public class validbinarysubs {
    class Solution {
        public int countBinarySubstrings(String s) {

            int prev = 0;      // previous group length
            int curr = 1;      // current group length
            int count = 0;

            for(int i = 1; i < s.length(); i++){

                if(s.charAt(i) == s.charAt(i-1)){
                    curr++;   // same group continues
                }
                else{
                    // group changed (0->1 or 1->0)
                    count += Math.min(prev, curr);
                    prev = curr;
                    curr = 1;
                }
            }

            // last pair
            count += Math.min(prev, curr);

            return count;
        }
    }

}
