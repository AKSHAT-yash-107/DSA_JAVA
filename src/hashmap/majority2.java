package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majority2 {
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int ele: map.keySet()){
            if (map.get(ele)>n/3){
                list.add(ele);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] arr= {1,2};
        List<Integer>lis1= majorityElement(arr);
        System.out.println(lis1);
    }
}
