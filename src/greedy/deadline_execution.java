package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class deadline_execution {

    public class Job{
        int dur,dl;
        Job(int dur,int dl){
            this.dl=dl;
            this.dur=dur;

        }
    }

    public static int task(int []duration,int []deadline){
        int n= duration.length;;
        Job [] job = new Job[n];

        for(int i =0;i<n;i++){
            job[i].dur=duration[i];
            job[i].dl=deadline[i];

        }
        Arrays.sort(job,(a,b)->a.dl-b.dl);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int total_time=0;

        for(Job j : job){
            total_time+=j.dl;
            pq.offer(j.dur);

            if(total_time>j.dl){
                total_time-=pq.poll();
            }
        }
        return pq.size();

    }

    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        int [] duration = new int[n];
        int [] deadline=new int [n];

        for(int i =0;i<n;i++){
            String[] input=br.readLine().trim().split("\\s+");
            duration[i]= Integer.parseInt(input[0]);
            deadline[i]=Integer.parseInt(input[1]);
        }

        System.out.println(task(duration,deadline));
    }

}
