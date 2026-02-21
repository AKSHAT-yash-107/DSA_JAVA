package greedy;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;

public class evacuatetomoon {

    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            String []nums = br.readLine().split(" ");
            int N= Integer.parseInt(nums[0]);
            int M = Integer.parseInt(nums[1]);
            int H = Integer.parseInt(nums[2]);

            long []cars= new long[N];
            long [] outlet = new long[M];

            String [] car =   br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                cars[i]= Long.parseLong(car[i]);

            }
            String []outs =   br.readLine().split(" ");
            for (int i = 0; i < M; i++) {
                outlet[i]= Long.parseLong(outs[i])*H;

            }
            Arrays.sort(cars);
            Arrays.sort(outlet);

            int i = N-1;
            int j = M-1;
            long Total=0;

            while(i>0 && j>0){
                Total+= Math.min(cars[j],outlet[i]);
                i--;j--;

            }
            System.out.println(Total);


        }
    }


}
