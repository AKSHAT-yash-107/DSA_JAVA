package slidingwindow;

import java.util.Formattable;
import java.util.HashMap;

public class fruitbasket {
    public static int totalFruit(int[] fruits) {
        int left=0,right=0,maxlen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( right =0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);


            if (map.size()>2){
                int freq =map.get(fruits[left]);
                if (freq==1) map.remove(fruits[left]);
                else map.put(fruits[left],freq-1);
                left++;
            }

            maxlen=Math.max(maxlen,right-left+1);

        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,2,2};
        System.out.println(totalFruit(arr));
    }
}
