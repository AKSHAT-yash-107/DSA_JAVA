package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallest {
   public static int kthsmallest(int [] nums ,int k){

        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder() );
        for (int ele: nums){
            pq.offer(ele);
            if (pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}
