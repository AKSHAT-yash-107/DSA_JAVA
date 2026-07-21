package strinng;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stringvowl_cont {
    public static boolean isVowel(char ch ){
        ch=Character.toLowerCase(ch);
        return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        StringBuilder sb = new StringBuilder();
        char prevtype=' ';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char currtype=isVowel(ch)?'V':'C';

            if(prevtype!=currtype){
                sb.append(currtype);
                prevtype=currtype;

            }
        }
        System.out.println(sb.toString());


    }
}
