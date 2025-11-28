package hashmap;

import java.util.HashSet;

public class duplicate {
    public static boolean containsDuplicate(int[] num) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            set.add(i);
        }

        if(set.size()!= num.length) return false;

        return true;
    }

    public static void main(String[] args) {
        int []a = {1,2,2,5};
        System.out.println(containsDuplicate(a));
    }
}
