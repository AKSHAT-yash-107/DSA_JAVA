package stacccccks;

import java.util.HashMap;
import java.util.Stack;

public class next_grat {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Stack<Integer> st  = new Stack<>();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int right= nums2.length-1;right>=0;right++){
                while(!st.isEmpty() && nums2[st.peek()]<=nums2[right]){
                    st.pop();

                }
                int next = st.isEmpty()? -1: st.peek();
                map.put(nums2[right],next);
                st.push(right);
            }
            int [] result= new int[nums1.length];
            for(int i=0;i<result.length;i++){
                result[i]=map.get(nums1[i]);

            }
            return result;
        }
    }

}
