package strinng;

public class reverseeachstring {

    class Solution {
        public String rev(String t ){
            char [] a=t.toCharArray();
            int i=0;
            int j=t.length()-1;
            while(i<j){
                char b = a[i];
                a[i]=a[j];
                a[j]=b;
                i++;j--;
            }
            return new String (a);
        }
        public String reverseWords(String s) {
            StringBuffer sb  = new StringBuffer();
            int i =0;

            while(i<s.length()){
                int j=i;
                while(j<s.length() && s.charAt(j)!=' ' ) j++;
                String w=s.substring(i,j);
                sb.append(rev(w));
                if(j < s.length())
                    sb.append(' ');
                i=j+1;

            }
            return sb.toString();

        }
    }
}
