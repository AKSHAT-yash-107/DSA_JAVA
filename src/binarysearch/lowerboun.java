package binarysearch;

public class lowerboun {

    public static int lowerbound(int [] arr, int t){
        int n = arr.length;

        int l = 0 ,h=n-1,rs=n;
        while (l<=h){
            int m =l +(h-l)/2;
            if(arr[m]>=t){
                rs=m;
                h=m-1;
            }
            else l=m+1;
        }

        return  rs;

    }
}
