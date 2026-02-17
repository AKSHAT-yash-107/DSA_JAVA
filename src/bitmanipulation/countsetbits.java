package bitmanipulation;

public class countsetbits {
    public static void countsetnbit(int n ){
        int count =0;
        while(n!=0){
            int bit=n&-n;
            System.out.println(bit);
            n-=bit;
            count++;

        }
      System.out.println("total set bits ="+count);

    }

    public static void main(String[] args) {
        countsetnbit(77);

    }


}

