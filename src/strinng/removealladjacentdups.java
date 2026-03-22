package strinng;

import java.util.Stack;

public class removealladjacentdups {
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> st = new Stack<>();

            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < s.length(); i++) {
                if(st.peek()==s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
return sb.reverse().toString();
        }
    }
    class Solution1 {
        public String removeDuplicates(String s) {
            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                int len = sb.length();

                if (len > 0 && sb.charAt(len - 1) == c) {
                    sb.deleteCharAt(len - 1); // pop
                } else {
                    sb.append(c); // push
                }
            }

            return sb.toString();
        }
    }
}
