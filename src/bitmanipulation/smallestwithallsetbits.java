package bitmanipulation;

public class smallestwithallsetbits {
    class Solution {
        public int smallestNumber(int n) {
            int temp =0;
            int count =0;
            while(n>0){
                count++;
                n>>=1;
            }
            return (1<<count)-1;
        }
    }
}
