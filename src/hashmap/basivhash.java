package hashmap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class basivhash {
    public static int rv (int n){
        int r=0;
        while (n > 0){
            int x =  n%10;
            r =r *10 +x;
            n=n/10;

        }
        return  r;
    }


}
