package D2ARRAY;

public class searchin2d {
    class Solution {
        public boolean searchMatrix(int[][] mat, int target) {
            int r = mat.length;
            int c = mat[0].length;
            int lo=0,hi=r*c-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                int val= mat[mid/c][mid%c];
                if(val==target) return true;
                else if (val<target) lo=mid+1;
                else hi=mid-1;
            }
            return false;
        }
    }
}
