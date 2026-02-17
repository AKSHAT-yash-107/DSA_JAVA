package bitmanipulation;

public class SWAPUSINGXOR {

    public static void swap(int a , int  b ){
        a= a^b;
        b=a^b;
        b=a^b;
    }
}
