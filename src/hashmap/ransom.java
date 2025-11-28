package hashmap;

import java.util.HashMap;
public class ransom{
    public  static  boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i =0 ; i< ransomNote.length(); i++){
            if(map1.containsKey(ransomNote.charAt(i))){
                int f = map1.get(ransomNote.charAt(i));
                map1.put(ransomNote.charAt(i),f+1);
            }
            else map1.put(ransomNote.charAt(i),1);
        }

        for(int i =0 ; i< magazine.length(); i++){
            if(map2.containsKey(magazine.charAt(i))){
                int f = map2.get(magazine.charAt(i));
                map2.put(magazine.charAt(i),f+1);
            }
            else map2.put(magazine.charAt(i),1);
        }

        for(char key : map1.keySet()){

            int x = map1.get(key);
            int y = map2.get(key);
            if(x>y) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String S = "BG";
        String T = "ASAFBVBVFRFBG";
        System.out.println(canConstruct(S,T));
    }

}