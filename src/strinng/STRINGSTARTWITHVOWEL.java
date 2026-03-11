package strinng;

import java.util.*;

public class STRINGSTARTWITHVOWEL {
    public int vowel(String [] s){
        int count =0;
        for (int i =0;i<s.length;i++){
            if(s[i].charAt(0)=='a'||s[i].charAt(0)=='e'||s[i].charAt(0)=='i'||s[i].charAt(0)=='o'||s[i].charAt(0)=='u') count ++;
        }
        return count;
    }

    public static class SolutionsGuide {

        // ========================================================================
        // STRING ARRAY SOLUTIONS
        // ========================================================================

        /**
         * SOLUTION 1: Group Anagrams
         * Time: O(n * k log k) where k is max string length
         * Space: O(n * k)
         */
        public static List<List<String>> groupAnagrams(String[] strs) {
            /*
             * APPROACH:
             * 1. Use sorted string as key
             * 2. Group strings with same sorted form
             * 3. Return all groups
             *
             * EXAMPLE:
             * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
             * - "eat" → sorted: "aet"
             * - "tea" → sorted: "aet"
             * - "tan" → sorted: "ant"
             * Groups: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
             */

            Map<String, List<String>> map = new HashMap<>();

            for (String str : strs) {
                // Convert to char array and sort
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);

                // Add to corresponding group
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
            }

            return new ArrayList<>(map.values());
        }

        /**
         * SOLUTION 2: Longest Common Prefix
         * Time: O(S) where S is sum of all characters
         * Space: O(1)
         */
        public static String longestCommonPrefix(String[] strs) {
            /*
             * APPROACH:
             * 1. Use first string as initial prefix
             * 2. Compare with each subsequent string
             * 3. Reduce prefix until it matches start of current string
             *
             * EXAMPLE:
             * Input: ["flower", "flow", "flight"]
             * - Start with "flower"
             * - Compare with "flow" → reduce to "flow"
             * - Compare with "flight" → reduce to "fl"
             * Result: "fl"
             */

            if (strs == null || strs.length == 0) return "";

            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                // Keep reducing prefix until it matches
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
            }

            return prefix;
        }

        /**
         * SOLUTION 3: Word Break
         * Time: O(n² + m*k) where m is dict size, k is avg word length
         * Space: O(n)
         */
        public static boolean wordBreak(String s, List<String> wordDict) {
            /*
             * APPROACH: Dynamic Programming
             * dp[i] = true if s[0...i-1] can be segmented
             *
             * EXAMPLE:
             * s = "leetcode", wordDict = ["leet", "code"]
             * dp[0] = true (empty string)
             * dp[4] = true ("leet" in dict)
             * dp[8] = true ("code" in dict, and dp[4] is true)
             * Result: true
             */

            Set<String> wordSet = new HashSet<>(wordDict);
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true; // Empty string

            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && wordSet.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }

            return dp[s.length()];
        }

        /**
         * SOLUTION 4: Minimum Window Substring
         * Time: O(m + n)
         * Space: O(k) where k is unique chars in t
         */
        public static String minWindow(String s, String t) {
            /*
             * APPROACH: Sliding Window
             * 1. Use two pointers (left, right)
             * 2. Expand right to include characters
             * 3. Contract left when valid window found
             *
             * EXAMPLE:
             * s = "ADOBECODEBANC", t = "ABC"
             * Window: ADOBEC (valid)
             * Window: BANC (smaller, valid)
             * Result: "BANC"
             */

            if (s.length() == 0 || t.length() == 0) return "";

            // Count characters in t
            Map<Character, Integer> dictT = new HashMap<>();
            for (char c : t.toCharArray()) {
                dictT.put(c, dictT.getOrDefault(c, 0) + 1);
            }

            int required = dictT.size();
            int left = 0, right = 0;
            int formed = 0;

            Map<Character, Integer> windowCounts = new HashMap<>();

            // ans: [window length, left, right]
            int[] ans = {-1, 0, 0};

            while (right < s.length()) {
                char c = s.charAt(right);
                windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

                if (dictT.containsKey(c) &&
                    windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                    formed++;
                }

                // Try to contract window
                while (left <= right && formed == required) {
                    c = s.charAt(left);

                    // Update result if this window is smaller
                    if (ans[0] == -1 || right - left + 1 < ans[0]) {
                        ans[0] = right - left + 1;
                        ans[1] = left;
                        ans[2] = right;
                    }

                    windowCounts.put(c, windowCounts.get(c) - 1);
                    if (dictT.containsKey(c) &&
                        windowCounts.get(c) < dictT.get(c)) {
                        formed--;
                    }

                    left++;
                }

                right++;
            }

            return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
        }

        /**
         * SOLUTION 5: Edit Distance
         * Time: O(m * n)
         * Space: O(m * n)
         */
        public static int editDistance(String word1, String word2) {
            /*
             * APPROACH: Dynamic Programming
             * dp[i][j] = min operations to convert word1[0..i-1] to word2[0..j-1]
             *
             * Operations: Insert, Delete, Replace
             *
             * EXAMPLE:
             * word1 = "horse", word2 = "ros"
             *
             *     "" r  o  s
             * ""  0  1  2  3
             * h   1  1  2  3
             * o   2  2  1  2
             * r   3  2  2  2
             * s   4  3  3  2
             * e   5  4  4  3
             *
             * Result: 3 operations
             */

            int m = word1.length();
            int n = word2.length();

            int[][] dp = new int[m + 1][n + 1];

            // Base cases
            for (int i = 0; i <= m; i++) dp[i][0] = i;
            for (int j = 0; j <= n; j++) dp[0][j] = j;

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = 1 + Math.min(
                            dp[i - 1][j],      // Delete
                            Math.min(
                                dp[i][j - 1],  // Insert
                                dp[i - 1][j - 1] // Replace
                            )
                        );
                    }
                }
            }

            return dp[m][n];
        }

        /**
         * SOLUTION 6: Longest Substring Without Repeating Characters
         * Time: O(n)
         * Space: O(min(m, n)) where m is charset size
         */
        public static int lengthOfLongestSubstring(String s) {
            /*
             * APPROACH: Sliding Window with HashSet
             * 1. Use two pointers
             * 2. Expand right, add to set
             * 3. If duplicate found, contract left
             *
             * EXAMPLE:
             * s = "abcabcbb"
             * - "abc" → length 3
             * - "bca" → length 3
             * - "cab" → length 3
             * Max: 3
             */

            Set<Character> set = new HashSet<>();
            int left = 0, maxLength = 0;

            for (int right = 0; right < s.length(); right++) {
                // Remove characters until no duplicate
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }

        // ========================================================================
        // 2D ARRAY SOLUTIONS
        // ========================================================================

        /**
         * SOLUTION 7: Spiral Matrix
         * Time: O(m * n)
         * Space: O(1)
         */
        public static List<Integer> spiralOrder(int[][] matrix) {
            /*
             * APPROACH: Layer by layer
             * 1. Track boundaries: top, bottom, left, right
             * 2. Traverse: right → down → left → up
             * 3. Shrink boundaries after each direction
             *
             * EXAMPLE:
             * [[1,2,3],
             *  [4,5,6],
             *  [7,8,9]]
             *
             * Result: [1,2,3,6,9,8,7,4,5]
             */

            List<Integer> result = new ArrayList<>();
            if (matrix.length == 0) return result;

            int top = 0, bottom = matrix.length - 1;
            int left = 0, right = matrix[0].length - 1;

            while (top <= bottom && left <= right) {
                // Traverse right
                for (int j = left; j <= right; j++) {
                    result.add(matrix[top][j]);
                }
                top++;

                // Traverse down
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;

                // Traverse left (if still valid row)
                if (top <= bottom) {
                    for (int j = right; j >= left; j--) {
                        result.add(matrix[bottom][j]);
                    }
                    bottom--;
                }

                // Traverse up (if still valid column)
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return result;
        }

        /**
         * SOLUTION 8: Rotate Image 90 Degrees
         * Time: O(n²)
         * Space: O(1)
         */
        public static void rotate(int[][] matrix) {
            /*
             * APPROACH: Two-step process
             * 1. Transpose matrix (swap matrix[i][j] with matrix[j][i])
             * 2. Reverse each row
             *
             * EXAMPLE:
             * [[1,2,3],      Transpose    [[1,4,7],      Reverse rows    [[7,4,1],
             *  [4,5,6],   →              [2,5,8],     →                [8,5,2],
             *  [7,8,9]]                    [3,6,9]]                       [9,6,3]]
             */

            int n = matrix.length;

            // Step 1: Transpose
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // Step 2: Reverse each row
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;
                }
            }
        }

        /**
         * SOLUTION 9: Set Matrix Zeroes
         * Time: O(m * n)
         * Space: O(1)
         */
        public static void setZeroes(int[][] matrix) {
            /*
             * APPROACH: Use first row and column as markers
             * 1. Check if first row/column originally had zeros
             * 2. Use first row/column to mark zeros
             * 3. Set zeros based on markers
             * 4. Handle first row/column separately
             *
             * EXAMPLE:
             * [[1,1,1],      [[1,0,1],
             *  [1,0,1],   →   [0,0,0],
             *  [1,1,1]]       [1,0,1]]
             */

            int rows = matrix.length;
            int cols = matrix[0].length;
            boolean firstRowZero = false;
            boolean firstColZero = false;

            // Check first row
            for (int j = 0; j < cols; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }

            // Check first column
            for (int i = 0; i < rows; i++) {
                if (matrix[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }

            // Use first row and column as markers
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            // Set zeros based on markers
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Handle first row
            if (firstRowZero) {
                for (int j = 0; j < cols; j++) {
                    matrix[0][j] = 0;
                }
            }

            // Handle first column
            if (firstColZero) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][0] = 0;
                }
            }
        }

        /**
         * SOLUTION 10: Search in Sorted Matrix
         * Time: O(m + n)
         * Space: O(1)
         */
        public static boolean searchMatrix(int[][] matrix, int target) {
            /*
             * APPROACH: Start from top-right (or bottom-left)
             * 1. If current > target, move left
             * 2. If current < target, move down
             * 3. If current == target, found!
             *
             * EXAMPLE:
             * [[1, 4, 7,11],
             *  [2, 5, 8,12],
             *  [3, 6, 9,16]]
             *
             * Search 5: Start at 11
             * 11 > 5 → move left to 7
             * 7 > 5 → move left to 4
             * 4 < 5 → move down to 5
             * Found!
             */

            if (matrix.length == 0 || matrix[0].length == 0) return false;

            int row = 0;
            int col = matrix[0].length - 1;

            while (row < matrix.length && col >= 0) {
                if (matrix[row][col] == target) {
                    return true;
                } else if (matrix[row][col] > target) {
                    col--;
                } else {
                    row++;
                }
            }

            return false;
        }

        /**
         * SOLUTION 11: Number of Islands (DFS)
         * Time: O(m * n)
         * Space: O(m * n) for recursion stack
         */
        public static int numIslands(char[][] grid) {
            /*
             * APPROACH: Depth-First Search
             * 1. Iterate through grid
             * 2. When '1' found, increment count and DFS to mark island
             * 3. DFS marks all connected '1's as visited
             *
             * EXAMPLE:
             * [['1','1','0'],
             *  ['1','0','0'],
             *  ['0','0','1']]
             *
             * Island 1: top-left 4 cells
             * Island 2: bottom-right cell
             * Result: 2
             */

            if (grid.length == 0) return 0;

            int count = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                        dfs(grid, i, j);
                    }
                }
            }

            return count;
        }

        private static void dfs(char[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ||
                grid[i][j] == '0') {
                return;
            }

            grid[i][j] = '0'; // Mark as visited

            // Explore 4 directions
            dfs(grid, i + 1, j);
            dfs(grid, i - 1, j);
            dfs(grid, i, j + 1);
            dfs(grid, i, j - 1);
        }

        /**
         * SOLUTION 12: Maximal Square
         * Time: O(m * n)
         * Space: O(m * n)
         */
        public static int maximalSquare(char[][] matrix) {
            /*
             * APPROACH: Dynamic Programming
             * dp[i][j] = side length of largest square with bottom-right at (i,j)
             *
             * Formula:
             * if matrix[i][j] == '1':
             *     dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1
             *
             * EXAMPLE:
             * [['1','0','1','0','0'],
             *  ['1','0','1','1','1'],
             *  ['1','1','1','1','1']]
             *
             * Max square side: 2
             * Area: 4
             */

            if (matrix.length == 0) return 0;

            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] dp = new int[rows + 1][cols + 1];
            int maxSide = 0;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if (matrix[i - 1][j - 1] == '1') {
                        dp[i][j] = Math.min(
                            Math.min(dp[i - 1][j], dp[i][j - 1]),
                            dp[i - 1][j - 1]
                        ) + 1;
                        maxSide = Math.max(maxSide, dp[i][j]);
                    }
                }
            }

            return maxSide * maxSide;
        }

        /**
         * SOLUTION 13: Shortest Path in Binary Matrix (BFS)
         * Time: O(n²)
         * Space: O(n²)
         */
        public static int shortestPathBinaryMatrix(int[][] grid) {
            /*
             * APPROACH: Breadth-First Search
             * 1. Start from top-left
             * 2. Explore 8 directions
             * 3. Track distance
             *
             * EXAMPLE:
             * [[0,0,0],
             *  [1,1,0],
             *  [1,1,0]]
             *
             * Path: (0,0) → (0,1) → (0,2) → (1,2) → (2,2)
             * Length: 5
             */

            if (grid[0][0] == 1 || grid[grid.length - 1][grid.length - 1] == 1) {
                return -1;
            }

            int n = grid.length;
            int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1},  {1, 0},  {1, 1}
            };

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{0, 0, 1}); // row, col, distance
            grid[0][0] = 1; // Mark as visited

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];
                int dist = current[2];

                if (row == n - 1 && col == n - 1) {
                    return dist;
                }

                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    if (newRow >= 0 && newRow < n &&
                        newCol >= 0 && newCol < n &&
                        grid[newRow][newCol] == 0) {
                        queue.offer(new int[]{newRow, newCol, dist + 1});
                        grid[newRow][newCol] = 1;
                    }
                }
            }

            return -1;
        }

        /**
         * SOLUTION 14: Valid Sudoku
         * Time: O(1) - fixed 9x9 grid
         * Space: O(1)
         */
        public static boolean isValidSudoku(char[][] board) {
            /*
             * APPROACH: Hash Sets for validation
             * 1. Check each row for duplicates
             * 2. Check each column for duplicates
             * 3. Check each 3x3 box for duplicates
             *
             * Use sets to track seen numbers
             */

            Set<String> seen = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char current = board[i][j];
                    if (current != '.') {
                        // Create unique identifiers
                        String row = current + " in row " + i;
                        String col = current + " in col " + j;
                        String box = current + " in box " + i/3 + "-" + j/3;

                        if (!seen.add(row) || !seen.add(col) || !seen.add(box)) {
                            return false;
                        }
                    }
                }
            }

            return true;
        }

        // ========================================================================
        // TESTING AND DEMONSTRATION
        // ========================================================================

        public static void main(String[] args) {
            System.out.println("=".repeat(70));
            System.out.println("SOLUTIONS GUIDE - DEMONSTRATIONS");
            System.out.println("=".repeat(70));

            // Test 1: Group Anagrams
            System.out.println("\n1. GROUP ANAGRAMS:");
            String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
            System.out.println("Input: " + Arrays.toString(words));
            System.out.println("Output: " + groupAnagrams(words));

            // Test 2: Longest Common Prefix
            System.out.println("\n2. LONGEST COMMON PREFIX:");
            String[] strs = {"flower", "flow", "flight"};
            System.out.println("Input: " + Arrays.toString(strs));
            System.out.println("Output: '" + longestCommonPrefix(strs) + "'");

            // Test 3: Spiral Matrix
            System.out.println("\n3. SPIRAL MATRIX:");
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("Input:");
            printMatrix(matrix);
            System.out.println("Spiral Order: " + spiralOrder(matrix));

            // Test 4: Rotate Matrix
            System.out.println("\n4. ROTATE MATRIX 90°:");
            int[][] rotateMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("Before:");
            printMatrix(rotateMatrix);
            rotate(rotateMatrix);
            System.out.println("After rotation:");
            printMatrix(rotateMatrix);

            // Test 5: Number of Islands
            System.out.println("\n5. NUMBER OF ISLANDS:");
            char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
            };
            System.out.println("Grid:");
            printCharMatrix(grid);
            // Note: This modifies the grid
            char[][] gridCopy = Arrays.stream(grid).map(char[]::clone).toArray(char[][]::new);
            System.out.println("Number of islands: " + numIslands(gridCopy));

            System.out.println("\n" + "=".repeat(70));
        }

        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }

        private static void printCharMatrix(char[][] matrix) {
            for (char[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
