package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class laststoneweigh {
    public int lastStoneWeight(int[] stones) {
    if (stones.length==1) return stones[0];
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : stones){
            pq.add(n);
        }

            while (pq.size()>1){
                int top = pq.remove();
                int stop=pq.remove();
                if(top!=stop){
                    pq.add(top-stop);
                }

            }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
