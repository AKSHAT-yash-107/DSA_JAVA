package stacccccks;

import java.util.ArrayList;
import java.util.Stack;

public class dailu_temp {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
            int [] ans = new int[temperatures.length];
        for( int right = temperatures.length-1;right>=0;right--){

            while(!st.isEmpty()&& temperatures[st.peek()]<=temperatures[right]) st.pop();
            if(st.empty()) ans[right]=0;
            else ans[right]=st.peek()-right;
            st.push(right);
        }
        return ans;
        }
    }
}
