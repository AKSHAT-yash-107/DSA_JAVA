package strinng;

public class stringconcatenate {
    public String concat(String [] s ){
        if (s==null||s.length==0) return "";
        StringBuilder ans = new StringBuilder(s[0]);
        char sep='|';


        for (int i = 1; i <s.length ; i++) {
                ans.append(sep).append(s[i]);
        }
        return ans.toString();
    }
}
