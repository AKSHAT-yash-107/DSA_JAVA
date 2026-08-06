package strinng;
import java.util.*;
public class decode_Strings
{


    class Solution {
        public String decodeString(String s) {
            Stack <Integer> numst= new Stack<>();
            Stack <StringBuilder> stringst= new Stack<>();

            StringBuilder curr= new StringBuilder();
             int num=0;

             for( char i :s.toCharArray() ){
                 if(Character.isDigit(i)){
                     num=num*10+(i-'0');
                 }
                 else if (i=='['){
                     numst.push(num);
                     stringst.push(curr);
                     curr= new StringBuilder();
                     num=0;
                 }
                 else if(i==']'){
                     int rep= numst.pop();
                     StringBuilder prev = stringst.pop();

                     while(rep>0) {
                         prev.append(curr);
                         rep--;
                     }
                     curr=prev;
                 }

                 else curr.append(i);
             }
             return curr.toString();
        }
    }

}
