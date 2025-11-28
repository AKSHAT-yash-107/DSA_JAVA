package heap;

import java.util.PriorityQueue;

public class kthlargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for (int ele: nums){
            pq.offer(ele);
            if (pq.size()>k) pq.remove();
    }
        return pq.peek();
}}
