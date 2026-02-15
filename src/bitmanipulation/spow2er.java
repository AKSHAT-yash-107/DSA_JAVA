package bitmanipulation;

public class spow2er {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n>0) return ((n & n-1) == 0);
            return false ;
        }
    }

    public static void main(String[] args) {
        System.out.println(4^3^3^3^3^3^5);
    }
}
