package stacccccks;

import java.util.HashMap;
import java.util.Stack;

public class max_freq_stack {

    class FreqStack {
        HashMap<Integer,Integer> map;
        HashMap<Integer, Stack<Integer>> grp;
        int maxfreq;


        public FreqStack() {
            maxfreq=0;
            map=new HashMap<>();
            grp=new HashMap<>();
        }

        public void push(int val) {
            int f = map.getOrDefault(val,0)+1;
            map.put(val,f);

            if(!grp.containsKey(f)){
                grp.put(f,new Stack<>());
            }
            grp.get(f).push(val);
            maxfreq= Math.max(maxfreq,f);

        }

        public int pop() {
            int top = grp.get(maxfreq).pop();
            map.put(top,map.get(top)-1);

            if(grp.get(maxfreq).isEmpty()) maxfreq--;


            return top;

        }
    }

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
}
