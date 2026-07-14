package strinng;

public class strincompres3 {
    class Solution {
        public String compressedString(String word) {
        int i =0,index=0;
        StringBuilder sb = new StringBuilder();
        while(i<word.length()){
            int count =0;
            char c = word.charAt(i);
            while(i<word.length()&&c==word.charAt(i)&& count!=9){
                count++;
                i++;
            }
            sb.append(count).append(c);
        }   
        return sb.toString();
        }
    }
}
