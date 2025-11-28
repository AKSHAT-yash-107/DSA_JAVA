package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class happynumber {
    public static int sqsum(int n){
        int sum=0,r=0;
        while (n>0){
            r =n%10;
            sum+=r*r;
            n=n/10;
        }
        return sum;

    }
    public static boolean happyornot(int n) {
        HashSet<Integer> SET = new HashSet<>();
        while (n != 1) {
            if (SET.contains(n)) return false;

            SET.add(n);
            n = sqsum(n);

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(happyornot(10));
    }
}
