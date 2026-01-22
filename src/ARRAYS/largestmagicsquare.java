package ARRAYS;

public class largestmagicsquare {

    class Solution {

        public int largestMagicSquare(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int maxSize = Math.min(n, m);

            for (int size = maxSize; size >= 2; size--) {
                for (int i = 0; i + size <= n; i++) {
                    for (int j = 0; j + size <= m; j++) {
                        if (isMagic(grid, i, j, size)) {
                            return size;
                        }
                    }
                }
            }
            return 1; // single cell is always magic
        }

        private boolean isMagic(int[][] g, int r, int c, int size) {
            int target = 0;
            for (int j = 0; j < size; j++) {
                target += g[r][c + j];
            }

            // rows
            for (int i = 0; i < size; i++) {
                int sum = 0;
                for (int j = 0; j < size; j++) {
                    sum += g[r + i][c + j];
                }
                if (sum != target) return false;
            }

            // columns
            for (int j = 0; j < size; j++) {
                int sum = 0;
                for (int i = 0; i < size; i++) {
                    sum += g[r + i][c + j];
                }
                if (sum != target) return false;
            }

            // diagonals
            int d1 = 0, d2 = 0;
            for (int i = 0; i < size; i++) {
                d1 += g[r + i][c + i];
                d2 += g[r + i][c + size - 1 - i];
            }

            return d1 == target && d2 == target;
        }
    }

}
