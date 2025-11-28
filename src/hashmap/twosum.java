package hashmap;

import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target-nums[i];
            if (map.containsKey(need)){

                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);


        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int a[]={2,7,11,15};
        int [] b = twoSum(a,9);
        System.out.println(b);
    }
}