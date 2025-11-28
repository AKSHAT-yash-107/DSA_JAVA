package heap;

import java.lang.ref.PhantomReference;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthclosestpointfromorigin {

    public class triplet implements Comparable<triplet>{
        int dist,x,y;
                triplet(int d ,int x,int y){
                    this.dist=d;this.x=x;this.y=y;
                }
                public int compareTo(triplet t){
                    return this.dist-t.dist;

                }

    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<triplet> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y =points[i][1];
            int d = x*x+y*y;
            maxheap.add(new triplet(d,x,y));
            if(maxheap.size()>k) maxheap.remove();
        }
        int ans[][]= new int[k][2];
        for (int i = 0; i < k; i++) {
            triplet t = maxheap.remove();
            ans[i][0]= t.x;
            ans[i][1]=t.y;

        }
return ans;
    }
}
