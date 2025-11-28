package hashmap;

import java.util.HashSet;

public class intersextionofarry {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0|| nums2.length==0 ) return new int[]{};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int ele: nums1){
            set1.add(ele);
        }

        for(int ele : nums2){
            if(set1.contains(ele)){
                 set2.add(ele);
            }}

            int [] result = new int[set2.size()];
            int i =0;
            for(int ele: set2){
                result[i++]= ele;
            }

        return result;
    }

    public static void main(String[] args) {
        int [] a = {1,2,2,3};
        int [] b ={2,2};
        int [] c = intersection(a,b);
        System.out.println(c);
    }
}
