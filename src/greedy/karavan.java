package greedy;

import java.util.Arrays;

public class karavan {
    import java.util.*;

    class Item {
        int value;
        int weight;
        double ratio;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    public class Main {

        static double fractionalKnapsack(int[] value, int[] weight, int capacity) {

            int n = value.length;

            Item[] arr = new Item[n];

            for (int i = 0; i < n; i++)
                arr[i] = new Item(value[i], weight[i]);

            Arrays.sort(arr, (a, b) -> Double.compare(b.ratio, a.ratio));

            double ans = 0;

            for (Item item : arr) {

                if (capacity >= item.weight) {

                    ans += item.value;
                    capacity -= item.weight;

                } else {

                    ans += item.ratio * capacity;
                    break;
                }
            }

            return ans;
        }

        public static void main(String[] args) {

            int[] value = {60, 100, 120};
            int[] weight = {10, 20, 30};

            System.out.printf("%.2f\n",
                    fractionalKnapsack(value, weight, 50));
        }
    }
}
