package strinng;

public class createacronym {
    public String acronym(String [] words){
        StringBuilder st= new StringBuilder(" ");
        if (words==null ||  words.length==0) return st.toString();
        for (int i = 0; i < words.length; i++) {
            st.append(words[i].charAt(0));

        }
        return st.toString();

    }
}
