package strinng;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class distinct_pair_of_char {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <s.length()-1; i++) {
            String pair = s.substring(i, i + 2);
             map.put(pair,map.getOrDefault(pair,0)+1);
        }
        int count=0;
        for(int p :map.values()){
            if(p>1) count++;
        }
        System.out.println(count);
    }
}