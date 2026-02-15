package bitmanipulation;

public class binaryadd {
    public static void binary(int a , int b ) {
        while (b != 0) {

            int sum = a ^ b;// sum of literal dgit without carry
            int c = (a & b) << 1;// represent the location of carry int the addtion
            // then left shft carry  because carry is always added to next

            a = sum;// now we will add the sum and carry in a loop
            b = c;
            String s ="aAa";
            System.out.println(13&12);
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
         binary(4,5);
    }
}

// a = 10111
// b= 11101
// 1+1 =0 ;c =1
//1+0=0 ;c=0
//1+1 =0;c=1
//1+1=0;c=1
//1+0=1;c=0
//1+0=1;c=0
//




