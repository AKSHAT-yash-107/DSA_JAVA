package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Nmeetigs {
    static class schedule{
        int start;
        int end;
        int position;
    }
    public static void main(String[] args) {
        int []start = {1,3,0,5,8,5};
        int [] end  = {2,4,6,7,9,9};
        meetings(start,end);

    }
    public static void meetings(int [] start, int [ ] end ){
        schedule[] sch = new schedule[start.length];
        for(int i =0 ;i < start.length;i++){
            sch[i]=new schedule();
            sch[i].start=start[i];
            sch[i].end=end[i];
            sch[i].position=i+1;
        }


        Arrays.sort(sch, (a,b) -> Integer.compare(a.end, b.end));

        int count=1;
        ArrayList<Integer> result = new ArrayList<>();

        int freetime=sch[0].end;
        result.add(sch[0].position)  ;
        for(int i =1 ;i<sch.length;i++){
            if( freetime<= sch[i].start){
                count++;
                freetime=sch[i].end;
                result.add(sch[i].position)   ;

            }
        }
        System.out.println(count);
        System.out.println(result);
    }


}
