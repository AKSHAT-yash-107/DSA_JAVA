package CONTEST.codechef_18_2_26;
import java.util.*;
import java.lang.*;
import java.io.*;
public class rus2exam {

    class Codechef {
        public static void main(String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T-- > 0) {
                int X = sc.nextInt();

                int Y = sc.nextInt();
                int N = sc.nextInt();

                int rem = N - (X * Y);
                if (rem < 0) rem = 0;
                System.out.println(rem);

            }

        }
    }
}
