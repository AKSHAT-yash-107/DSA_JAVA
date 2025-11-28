package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GROUPANAGRAMS {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();

        for(String S : strs){
            char [] element = S.toCharArray();
            Arrays.sort(element);
            String key = new String(element);
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(S);

        }
            return new ArrayList<>(map.values());
    }

}
