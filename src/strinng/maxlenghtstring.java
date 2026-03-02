package strinng;

public class maxlenghtstring {
    public static String maxlenght(String []s ){


        String max=s[0];
        int maxl=max.length();
        for (int i = 1; i < s.length; i++) {
            if(maxl<s[i].length()) {
                max=s[i];
                maxl=s[i].length();
            }
        }

return max;

    }
}
