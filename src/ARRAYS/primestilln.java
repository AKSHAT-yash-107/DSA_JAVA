package ARRAYS;
// using seive of eratosthenes
// we will be eliminating all the multiples of prime number <= root N
// we will set up a boolean arrray[N+1] marking all elements as prime
// starting from i=2 til i<=sqroot(n) : meaning primes below root n
// then we check if current index is prime or not : is yes then we start making its multiples till N as non prime
// finally print the prime elements .
public class primestilln {
    class Solution {
        public int countPrimes(int n) {


                boolean []isprime= new boolean [n+1];

            for (int i = 2; i <=n ; i++) {
                isprime[i]=true;
            }


            for(int i =2;i*i<=n;i++){
                if(isprime[i]){
                    // eliminate its multiples
                    for(int j =i*i;j<=n;j=j+i){
                        // j=j+i jumps on multiples of i
                        isprime[j]=false;
                    }
                }
            }

            int count =0;
            for(int i =2;i<n;i++){
                if (isprime[i]) count++;
            }
            return count ;
        }
    }

}
