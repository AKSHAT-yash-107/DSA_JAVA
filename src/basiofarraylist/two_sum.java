package basiofarraylist;

public class two_sum {
    public static void main(String[] args) {
        int arr[]  = {1, 2, 5, 22, 56, 7, 9, 10, 4,};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
    for(int j =i+1;j<n;j++){
        if(arr[i]+arr[j]==1){
            System.out.println(arr[i]+" "+arr[j]);
        }
    }
        }
    }
}
