package bitmanipulation;

public class kbitinnstring {

    class Solution {
        public char findKthBit(int n, int k) {
            if (n == 1) return '0';

            int mid = 1 << (n - 1); // 2^(n-1)

            if (k == mid) {
                return '1';
            }
            if (k < mid)  return findKthBit(n - 1, k);

            char mirrored = findKthBit(n - 1, (1<<n )-1 - k+1);
            return mirrored == '0' ? '1' : '0';

        }
    }
}
