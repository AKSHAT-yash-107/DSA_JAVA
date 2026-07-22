package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class activity_selection {
    public class Activity{
        int start,end;
        Activity(int st,int et){
            this.start=st;
            this.end=et;
        }
      public static  int activity(int [] start, int [] end){
            int n = start.length;

            Activity [] act = new Activity[n];
            Arrays.sort(act,(a, b)-> a.end- b.end);

            int count =1;
            int lastend=act[0].end;

            for(int i =0;i<n;i++){
                if(act[i].start>= lastend){
                    count++;
                    lastend=act[i].end;
                }
            }
            return count;
      }
        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[] start = {1,3,0,5,8,5};
            int[] end   = {2,4,6,7,9,9};

            System.out.println(activity(start,end));

        }
    }
}
