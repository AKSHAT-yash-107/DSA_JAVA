package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MEDIANDFROMDATASTREAM {
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue<>();


    public void addNum(int num) {
if (max.size()==0) max.add(num);
else{
    if(num<max.peek()) max.add(num);
    else min.add(num);

}
if(max.size()> min.size()+2){
    int t = max.poll();
    min.add(t);
}

        if(min.size()> max.size()+2){
            int t = min.poll();
            max.add(t);
        }
    }

    public double findMedian() {
if(max.size()==min.size()) return (max.peek()+min.peek())/2.0;
else if (max.size()>min.size())return max.peek();
  else return min.peek();

    }
}
