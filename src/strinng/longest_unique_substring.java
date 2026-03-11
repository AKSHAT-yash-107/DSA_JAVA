package strinng;

public class longest_unique_substring {


        public static int lengthOfLongestSubstring(String s) {

            int n = s.length();
            int maxlen=0,left=0;

            int [] freqs1= new int[128];

            for (int right = 0; right < n; right++) {
                freqs1[s.charAt(right)]++;
                while (freqs1[s.charAt(right)]>1){
                    freqs1[s.charAt(left)]--;
                    left++;
                }
                maxlen=Math.max(maxlen,right-left+1);
            }

        return maxlen;

        }

        public static void main(String[] args) {
            System.out.println(lengthOfLongestSubstring("abcabcbb"));

        }
    }

