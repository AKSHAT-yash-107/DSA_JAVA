package bitmanipulation;

public class complement {
    class Solution {
        public int bitwiseComplement(int n) {

            int result=0;
            int power =1;

            while(n>0){
                int lastbit = n&1;
                int flip=lastbit^1;
                result+=flip*power;
                power<<=1;
                n>>=1;
            }
            return result;

        }
    }
}
