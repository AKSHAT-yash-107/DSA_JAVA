package strinng;

public class string {
    public static void main(String[] args) {
        String s = "i am akshat ";

      //  for (int i = 0; i < s.length(); i++) {
       //     for(int j =i+1;j<=s.length();j++){
        //        System.out.println(s.substring(i,j));
          //  }

        //}

        int num=99909;
        String s2 = ""+num;
        System.out.println(s2);
        char [] arr= s.toCharArray();
        StringBuilder t = new StringBuilder(s);
//---------------------------------------------------------------------------//
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0) arr[i]='a';
        }
        System.out.println(arr);

        StringBuilder z= new StringBuilder();
        String [] t2= s.split(" ");
        String reversed = "";
        for (int i = t2.length - 1; i >= 0; i--) {
            reversed += t2[i];
            if (i != 0) reversed += " ";
        }
      //  System.out.println(reversed);

            String m = "askhat";
        String p= m.substring(0)+m.substring(0,0);
        System.out.println(p);
    }
}
