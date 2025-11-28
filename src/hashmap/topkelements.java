package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topkelements {
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0)
            return new int[0];
        Map<Integer,Integer> map = new HashMap<>();
        for (int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minheap=
                new PriorityQueue<>((a,b)->a.getValue() -b.getValue());
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            minheap.offer(entry);
            if (minheap.size()>k){
                minheap.poll();
            }
        }
        int [] arr= new int[k];
        int index=0;
        while (!minheap.isEmpty()){
            arr[index++]=minheap.poll().getKey();
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr [] = {1,1,1,2,2,3};
        System.out.println(topKFrequent(arr,2));
    }
}