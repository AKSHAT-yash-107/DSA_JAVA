package ARRAYS;

public class prime_num_of_set_bits_in_a_range {
    class Solution {

        public static int count0f1(int n ){
            int count =0;
            while(n!=0){
                n=n&n-1;
                count++;
            }
            return count;
        }
        public int countPrimeSetBits(int left, int right) {
            boolean [] isprime= new boolean[21];
            for (int i = 2; i <21 ; i++) {
                isprime[i]=true;

            }
            for (int i = 2; i*i <21 ; i++) {
                if (isprime[i]){
                    for (int j = i*i; j <21 ; j+=i) {
                        isprime[j]=false;
                    }
                }

            }

            int prime_count=0;
            for (int i = left; i <=right ; i++) {
                int bits=count0f1(i);
                if (isprime[bits]) prime_count++;

            }
            return prime_count;


        }
    }
}
