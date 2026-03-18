package slidingwindow;

public class longestcharactereplacement {

    class Solution {
        public int characterReplacement(String s, int k) {

            int [] freq = new int[26];

            int left =0,maxfreq=0,maxlen=0;

            for(int r =0;r<s.length();r++){
                freq[s.charAt(r)-'A']++;
                maxfreq=Math.max(maxfreq,freq[s.charAt(left)-'A']);
                while((r-left+1)-maxfreq>k){
                    freq[s.charAt(left)-'A']--;
                    left++;
                }
                maxlen=Math.max(maxlen,r-left+1);
            }
return maxlen;
        }
    }
}
