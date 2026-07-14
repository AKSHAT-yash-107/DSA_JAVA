package stacccccks;

import java.util.Stack;

public class postfix_evaluation {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> st = new Stack<>();
            for(String s : tokens){
                if(s.equals("+")|| s.equals("-")|| s.equals("*")|| s.equals("/")){
                    int a = st.pop();
                    int b= st.pop();
                    switch (s) {
                        case "+" :

                            st.push(a+b);
                            break;
                        case "-" :

                            st.push(a-b);
                            break;
                        case "*" :

                            st.push(a*b);
                            break;
                        case "/" :

                            st.push(a/b);
                            break;
                    }



                }
                else {
                    st.push(Integer.parseInt(s));
                }
            }
return st.pop();
        }
    }
}
