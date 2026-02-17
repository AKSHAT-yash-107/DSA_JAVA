package bitmanipulation;

public class noofevenoddbits {
    class Solution {
        public int[] evenOddBit(int n) {
            int i =0;int even=0;int odd=0;
            while(n>0){

                if((n&1)==1){
                    if((i%2)==0)  even++;
                    else odd++;
                }

                n=n>>1;
                i++;
            }
            return new int[]{even,odd};
        }

    }

}
