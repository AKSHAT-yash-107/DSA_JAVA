package bitmanipulation;

public class singlenumber {
    public int single (int []arr){
        int res =0;
        for(int n :arr){
            res^=n;
        }
        return res;
    }
}
