package D2ARRAY;

public class constructproductmatrix {

    class Solution {
        public int[][] constructProductMatrix(int[][] grid) {
            int MOD = 12345;
            int n = grid.length, m = grid[0].length;
            int[][] p = new int[n][m];

            // Pass 1: suffix products (bottom-right → top-left)
            int suf = 1;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    p[i][j] = suf;
                    suf = (int)((long)suf * grid[i][j] % MOD);
                }
            }

            // Pass 2: prefix products (top-left → bottom-right)
            int pre = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    p[i][j] = (int)((long)p[i][j] * pre % MOD);
                    pre = (int)((long)pre * grid[i][j] % MOD);
                }
            }

            return p;
        }
    }
}
