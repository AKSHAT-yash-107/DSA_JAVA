package CONTEST;

public class MAXIMIMBUGET {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int maxcap= Integer.MAX_VALUE;
        for (int i = 0; i < costs.length; i++) {
            if(costs[i]<budget){
                maxcap=Math.max(maxcap,capacity[i]);
            }

        }
        for (int i = 0; i < costs.length; i++) {
            for (int j = i+1; j < costs.length ; j++) {
                if(costs[i]+costs[j]<=budget){
                    int cap = capacity[i]+capacity[j];
                    maxcap=Math.max(cap,maxcap);
                }

            }
        }
        return maxcap;
    }
}
