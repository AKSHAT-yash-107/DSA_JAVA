package ARRAYS;
import java.util.ArrayList;
import java.util.Iterator;

public class basicsofarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addFirst(10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        //System.out.println(arr);
        Iterator<Integer> i= arr.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
