package hashmap;

import java.util.HashMap;

public class pairumsss {
    public static void pairsums(int [] nums,int targt){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0; i< nums.length;i++){
            int rm = targt-nums[i];

                if(map.containsKey(rm)){
                    System.out.println("YS");
                        return;
                }
                else map.put(nums[i],i);
        }



    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,4,7};
        int t = 8;
        pairsums(arr,t);
    }
}
