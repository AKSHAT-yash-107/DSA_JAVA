package greedy;
import java.util.*;
import java.lang.*;
import java.io.*;
public class maxweightdiff {


    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            while(T-->0){
                String [] nums = br.readLine().split(" ");
                int N=Integer.parseInt(nums[0]);
                int K= Integer.parseInt(nums[1]);
                K=Math.min(K,N-K);
                int [] arr = new int[N];

                String[] values = br.readLine().split(" ");
                for(int i = 0; i < N; i++){
                    arr[i] = Integer.parseInt(values[i]);
                }
                Arrays.sort(arr);
                int sumk=0;
                int tsum=0;
                for(int i =0;i<N;i++){
                    if(i<K) sumk+=arr[i];
                    tsum+=arr[i];
                }
                System.out.println(tsum-2*sumk);
            }

        }
    }

}
