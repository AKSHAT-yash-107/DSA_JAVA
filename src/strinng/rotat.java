package strinng;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class rotat {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int n = s.length();
        HashSet<String> st = new HashSet<>();
        if((s+s).contains(goal)) return true;
        return false;





    }

    public static void main(String[] args) {
        String g= "abcde";
        String t= "abced";
        System.out.println(rotateString(g,t));
    }
}