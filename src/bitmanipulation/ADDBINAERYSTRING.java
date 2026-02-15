package bitmanipulation;

public class ADDBINAERYSTRING {
    class Solution {
 //       public String addBinary(String a, String b) {
//
 //           StringBuilder result = new StringBuilder();
//
 //           int i = a.length() - 1;
 //           int j = b.length() - 1;
 //           int carry = 0;
//
 //           while (i >= 0 || j >= 0 || carry != 0) {
//
 //               int sum = carry;
//
 //               if (i >= 0) {
 //                   sum += a.charAt(i) - '0';
 //                   i--;
 //               }
//
 //               if (j >= 0) {
 //                   sum += b.charAt(j) - '0';
 //                   j--;
 //               }
//
 //               result.append(sum % 2);  // write bit
 //               carry = sum / 2;         // generate carry
 //           }
//
 //           return result.reverse().toString();
 //       }
 //   }

        public String addBinary(String a, String b){
            //10111 //11101
            // we need to add these string binary and return the result as string
            // we start at end of each string as binary addition starts at lsb
            int i = a.length()-1;
            int j = b.length()-1;
            int carry=0;
            StringBuilder result = new StringBuilder();
            //ADDITION happens till either i becomes -1 or j becomes -1 or carry is no more

            while(i>=0 || j>=0 || carry !=0)
            {
                int sum =carry;
                //add lsb of both into sum
                if(i>=0){
                    sum+=a.charAt(i)-'0';//==>char at i is either '0' or '1' this is not sam as 0 and 1
                    // '0' , '1' are string literals with unicode 49 and 48 so if we direclty add them
                    // wrong it will become so we substarct '0' from them as it will give 0 or 1 as result
                    i--;
                }
                if(j>=0){
                    sum+=b.charAt(j)-'0';
                    j--;

                }
                result.append(sum%2);// the resultant bit is pushed
                carry = sum%2;

            }
            return result.reverse().toString();

        }
    }



}
