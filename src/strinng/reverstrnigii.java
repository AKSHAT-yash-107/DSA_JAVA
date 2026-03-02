package strinng;

public class reverstrnigii {
    class Solution {
        public String reverseStr(String s, int k) {
            char [] arr= s.toCharArray();
            int temp =k;

            for (int i = 0; i+k < s.length(); i+=k*2) {
                while(i<temp){
                    char t = arr[i];
                    arr[i]=arr[temp+i-1];
                    arr[temp+k-1]=t;
                    i++;temp--;

                }
                temp=k;
            }
                return new String(arr);
        }
    }
}
