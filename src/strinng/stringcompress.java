package strinng;

public class stringcompress {
    public int compress(char [] chars){
        int i=0;
        int index=0;
        while (i< chars.length){
            int count =0;
            char c = chars[i];
            if(i< chars.length && chars[i]==c){
                count++;
                i++;
            }
            chars[index++]=c;
            if(count>1){
                String cnt = String.valueOf(count);
                char[] p= cnt.toCharArray();
                for(char t : p ){
                    chars[index++]=t;

                }
            }
        }
            return index;
    }
}
