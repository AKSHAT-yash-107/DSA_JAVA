package basiofarraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class intersextionof2array {
    public  static int[] intersect(int[] nums1, int[] nums2) {
            if (nums1.length==0||nums2.length==0) return new int[]{};
        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int ele: nums1){
            map1.put(ele,map1.getOrDefault(ele,0)+1);
        }


        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele: nums2){
            if (map1.containsKey(ele)&& map1.get(ele)>0){
                ans.add(ele);
                map1.put(ele, map1.get(ele)-1);

                }
            }

        int [] result =  new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i]= ans.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int []arr={1,2,2,3};
        int []brr={2,2};
        int []c= intersect(arr,brr);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
