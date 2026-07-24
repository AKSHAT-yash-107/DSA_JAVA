package greedy;

import java.util.Arrays;

public class city_scheduling {
    class Solution {
        public int twoCitySchedCost(int[][] costs) {
            Arrays.sort(costs, (a, b) -> (a[1] - a[0]) - (b[1] - b[0]));

            int n = costs.length / 2;
            int sum = 0;
            for (int i = 0; i < costs.length; i++) {
                if (i < n) {
                    sum += costs[i][1]; // send to B
                } else {
                    sum += costs[i][0]; // send to A
                }
            }
            return sum;
        }

    }
}
