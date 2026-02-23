package hashmap;

import java.util.*;

public class dnasequence {


    public List<String> findRepeatedDnaSequences(String s){

        List<String > list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i+10 <=s.length() ; i++) {
            String sub = s.substring(i,i+10);
            map.put(sub,map.getOrDefault(sub,0)+1);
            if (map.get(sub)==2) list.add(sub);
        }
        return list;
    }


}
