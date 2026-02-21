package greedy;
import java.util.*;
import java.lang.*;
import java.io.*;

public class chef_string {

    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int T = Integer.parseInt(br.readLine());
            while(T-->0){


                String s = br.readLine();

                int count =0;
                int n = s.length();
                int i =0;
                while(i<n-1){
                    if(s.charAt(i)!=s.charAt(i+1)){
                        count++;
                        i+=2;
                    }
                    else i++;
                }
                System.out.println(count);
            }
        }
    }
}
