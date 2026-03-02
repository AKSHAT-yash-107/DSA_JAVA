package strinng;

public class findpalindromicsrring {
    public boolean palindro(String t ){

        int i =0;int j=t.length()-1;
        while(i<j){
            if( t.charAt(i)!=t.charAt(j)) return false;
            i++;j--;

        }
        return true;

    }
    public int findpalindrome(String [] s){
        if(s == null) return 0;
        int count =0;

        for (int i = 0; i < s.length; i++) {
            if(palindro(s[i])) count++;

        }
        return count;

    }
}
