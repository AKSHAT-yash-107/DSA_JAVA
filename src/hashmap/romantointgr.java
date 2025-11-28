package hashmap;
import java.util.HashMap;

public class romantointgr {
    public static int romanToInt(String s) {
        HashMap<Character , Integer > map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        for(int i =0 ;i<s.length();i++){
            int x =map.get(s.charAt(i));
            if(i+1 < s.length() && x < map.get(s.charAt(i+1))){
                sum-=x;
            }
            else sum+=x;
        }

        return sum;
    }

    public static void main(String[] args) {
        String S = "IX";
        System.out.println(romanToInt(S));
    }
}
