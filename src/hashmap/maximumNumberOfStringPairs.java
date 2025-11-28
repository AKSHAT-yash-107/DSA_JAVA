package hashmap;

import java.util.HashSet;

public class maximumNumberOfStringPairs {
    public static String rvrs( String s){
        StringBuffer buf =  new StringBuffer(s);
        return buf.reverse().toString();
    }
    public static int maximumNumberOfStringPair(String[] words){
        int num=0;
        HashSet<String> set = new HashSet<>();
        for(int i =0 ; i< words.length;i++){
            String rv = rvrs(words[i]);
            if(set.contains(rv)){
                num++;
                set.remove(rv);
            }
            set.add(words[i]);
        }

        return num;
    }

    public static void main(String[] args) {
        String [] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPair(words));
    }
}
