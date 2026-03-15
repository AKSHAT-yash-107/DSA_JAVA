package greedy;

public class broken_calc {
    class Solution {

            public int brokenCalc(int start, int target) {
                int count =0;
                if(start==target) return 0;
                while(target>start){
                    if((target&1)==1) {
                        target++;
                    }
                    else {
                        target/=2;
                    }
                    count++;

                }

                return count+start-target;

            }
        }
        }


