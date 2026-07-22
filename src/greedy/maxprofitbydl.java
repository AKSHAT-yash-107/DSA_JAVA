package greedy;

import java.util.Arrays;

public class maxprofitbydl {
    public class Job{
        int profit,deadline;
        Job(int p,int dl){
            this.profit=p; this.deadline=dl;
        }
    }

    public static int [] maximize_profit(int []prof,int[] deadline){
        int n= prof.length;
        Job []jobs= new Job[n];
        int maxdl=0;
        for (int i = 0; i < n; i++) {
            jobs[i].profit = prof[i];
            jobs[i].deadline = deadline[i];
            maxdl = Math.max(maxdl, deadline[i]);
        }
            boolean[] slot = new boolean[n];
            Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
            int count = 0;
            int totalProfit = 0;

            for (Job job : jobs) {
                for (int j = job.deadline; j > 0; j--) {
                    if (!slot[j]) {
                        slot[j] = true;
                        count++;
                        totalProfit += job.profit;
                    }
                }

            }

            return new int[]{count,totalProfit};


    }}

