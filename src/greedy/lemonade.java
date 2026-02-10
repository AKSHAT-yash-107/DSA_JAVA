package greedy;

public class lemonade {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int fs=0;
            int ts=0;
            for(int ele:bills){
                if(ele == 5) fs++;
                else if(ele == 10) {
                    if(fs != 0){
                        fs--;
                        ts++;
                    }
                    else return false;
                }
                else {
                    if(ts!=0 && fs!=0) {ts--;
                        fs--;
                    }
                    else if (fs>=3) fs-=3;
                    else return false;
                }

            }
            return true;
        }
    }
}
