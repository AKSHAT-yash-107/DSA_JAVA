package binarysearch;

public class as {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int l=0,hi=n-1;
        int lb=n;
        boolean flag = false;
        while (l<=hi){
            int mi = l+(hi-l)/2;
            if (letters[mi]>=target) {
                lb= Math.min(lb,mi);
                flag=true;
                hi=mi-1;
            }
            else l=mi+1;
        }
        return ((flag)?letters[lb]:letters[0]);
    }

    public static void main(String[] args) {
        char[] a = {'x','x','y'};
        char t='z';
        System.out.println(nextGreatestLetter(a,t));
    }
}
