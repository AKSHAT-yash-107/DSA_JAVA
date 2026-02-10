package greedy;

import java.util.Arrays;

public class asssigncookies {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int c=0 ;
            int gd=0;
            int count =0;
            while(gd<g.length &&c <s.length){
                if(s[c]>=g[gd]){

                    gd++;
                }
                c++;
            }
            return gd;
        }
    }
}
