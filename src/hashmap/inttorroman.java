package hashmap;
import java.util.*;

public class inttorroman {

    public static String intToRoman(int num) {


        int[] intval = {1000, 900, 500, 400, 100, 90, 50,40, 10, 9, 5, 4, 1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder s = new StringBuilder();
        for(int i =0 ;i < intval.length;i++){
            while (num>=intval[i]){
                num-=intval[i];
                s.append(roman[i]);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1749));
    }
}
