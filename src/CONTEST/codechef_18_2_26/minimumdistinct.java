package CONTEST.codechef_18_2_26;
import java.util.*;
import java.lang.*;
import java.io.*;

public class minimumdistinct {

    class Codechef {
        public static void main(String[] args) throws java.lang.Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());


            while (T-- > 0) {
                int N = Integer.parseInt(br.readLine());
                int K = Integer.parseInt(br.readLine());
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = Integer.parseInt(br.readLine());
                }

                HashMap<Integer, Integer> map = new HashMap<>();
                for (int ele : arr) {
                    map.put(ele, map.getOrDefault(ele, 0) + 1);
                }

                int[] brr = new int[map.size()];
                for (int i = 0; i < map.size(); i++) {
                    brr[i] = map.get(i);
                }


                Arrays.sort(brr);
                int dis = brr.length;

                for (int f : brr) {
                    if (K >= f) {
                        K -= f;
                        dis--;
                    } else break;
                }
                System.out.println(Math.max(1, dis));
            }
        }

    }
}
