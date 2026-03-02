package strinng;

public class STRINGSTARTWITHVOWEL {
    public int vowel(String [] s){
        int count =0;
        for (int i =0;i<s.length;i++){
            if(s[i].charAt(0)=='a'||s[i].charAt(0)=='e'||s[i].charAt(0)=='i'||s[i].charAt(0)=='o'||s[i].charAt(0)=='u') count ++;
        }
        return count;
    }
}
