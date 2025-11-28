package slidingwindow;

public class longestsubarryaof1 {
    public int longestSubarray(int[] nums) {
        int left=0,zcount=0,maxlen=0;
        for(int right= 0; right<nums.length;right++){
            if (nums[right]==0) zcount++;

            while(zcount>1){
                if (nums[left]==0) zcount--;
                left++;

            }
            maxlen= Math.max(maxlen,right-left);
        }
        return maxlen;
    }
}
