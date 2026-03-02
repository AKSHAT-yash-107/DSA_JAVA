package strinng;

public class validpalindrme {
    class Solution {
        public boolean check(String a){
            int i =0;int j=a.length()-1;
            while(i<j){
                if( a.charAt(i)!=a.charAt(j)) return false;
                i++;j--;

            }
            return true;
        }
        public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        StringBuffer bf = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                if(Character.isLetterOrDigit(s.charAt(i))) bf.append(s.charAt(i));

            }
            return check(bf.toString());


        }
    }
}
