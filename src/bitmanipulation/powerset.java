package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class powerset {
    public static List<List<Integer>> subset(int [ ] nums){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int  num = 0;  num < 1<<n ;  num++) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if((num & 1<<i)!=0) ans .add(nums[i]);
            }
            result.add(ans);
        }


        return result;
    }
}
