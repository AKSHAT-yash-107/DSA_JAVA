package heap;
import java.util.*;


public class kthclosest{
    public class Pair implements Comparable<Pair>{
    int ele;
    int diff;
    Pair(int e ,int d) {
        this.ele=e; this.diff=d;
    }

        public int compareTo(Pair p) {
            if (this.diff == p.diff) return this.ele - p.ele;
            return this.diff - p.diff;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    PriorityQueue<Pair> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    for(int n : arr){
        int diff = Math.abs(x-n);
        maxheap.add( new Pair(n,diff) );
        if (maxheap.size()>k) maxheap.remove();
    }
    List<Integer> ans = new ArrayList<>();
    while(!maxheap.isEmpty()){
        Pair p = maxheap.remove();
        ans.add(p.ele);

    }
    Collections.sort(ans);
return ans;
}
}