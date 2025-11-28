package hashmap;
import java.util.HashSet;
import java.util.HashMap;


public class uniqfrq {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            if(map.containsKey(n)) {
                int frq = map.get(n);
                map.put(n, frq + 1);
            }
            else map.put(n,1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int x : map.keySet()){
            set.add(map.get(x));
        }
        return (map.size()==set.size());
        }

    public static void main(String[] args) {
        int [] arr = {1,2,45,6,7,2};
        System.out.println(uniqueOccurrences(arr));
    }  }
