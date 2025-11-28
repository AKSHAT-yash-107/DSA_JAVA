package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;


 class NODE{
     int val;
     NODE next=null;
     NODE(int b){this.val=b;}
}



public class intro {

     public static void recdis(NODE head){
         if(head==null) return;
         System.out.println(head.val);
         recdis(head.next);
     }




    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);


        Iterator it = list.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }

        System.out.println("\n");
      //  list.remove();
       // list.removeFirst();
       list.removeLastOccurrence(30);
         it = list.iterator();
        while(it.hasNext()){
             System.out.println(it.next());
        }



    }
}
