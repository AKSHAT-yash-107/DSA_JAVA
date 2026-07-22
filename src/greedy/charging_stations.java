package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class charging_stations {

    public static class Car {
        int arrival,duration;
        Car(int a, int d){
            this.arrival=a;
            this.duration=d;

        }}

        public static int charging(Car[]car,int k){
            Arrays.sort(car,(a, b)-> a.arrival-b.arrival);

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int ans=0;//represents no of cars charged ;

            for(Car c: car){
                while(!pq.isEmpty() && pq.peek()<=c.arrival) pq.poll();

                if(pq.size()<k){
                    pq.offer(c.arrival+c.duration);
                    ans++;

                }
            }
            return ans;

        }


    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        Car[] car=new Car[n];

        for(int i =0;i<n;i++){
            String [] input = br.readLine().trim().split("\\s+");
            int a =Integer.parseInt(input[0]);
            int b=Integer.parseInt(input[1]);
            car[i] = new Car(a, b);


        }
        System.out.println(charging(car,k));
    }}