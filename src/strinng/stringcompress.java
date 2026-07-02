package strinng;

public class stringcompress {
    public int compress(char [] chars){
        int i=0;
        int index=0;
        while(i<chars.length){
            int count=0;
            char c =chars[i];
            while(i<chars.length&& chars[i]==c){
                count++;
                i++;
            }
            chars[index++]=c;
            if (count > 1) {
                String cnt = String.valueOf(count);

                for (char p: cnt.toCharArray()) {
                    chars[index++] = p;
                }
            }

        }
            return index;
    }
}
