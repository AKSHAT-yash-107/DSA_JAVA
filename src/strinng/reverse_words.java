package strinng;

public class reverse_words {
    class Solution {
        public void swap(String[]a, int st,int end){
            while(st<=end){
                String temp = a[st];
                a[st]=a[end];
                a[end]=temp;
                st++;
                end--;
            }
        }
        public String reverseWords(String s) {
            String [] arr= s.trim().split("\\s+");
            swap(arr,0,arr.length-1);
            String result= "";
            for(String t : arr){
                result+=t+" ";

            }
return result.trim();
        }
    }
}
