package slidingwindow;

import java.util.HashMap;

public class maxsubarraywithdistinctk {
    public int maxsubwithdistk(int [] num , int k ){
        int len=num.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        int left =0;
        int sum=0,maxsum=0;

        for (int right = 0; right < len; right++) {
            map.put(num[right],map.getOrDefault(num[left],0)+1);
            sum+=num[right];

            while(map.size()>k){
                map.put(num[left],map.get(num[right]-1));
                if(map.get(num[left])==0) map.remove(num[left]);

                sum-=num[left];
                 left++;

            }

            maxsum=Math.max(maxsum,sum);


        }
        return maxsum>0? maxsum:0;
    }
}
