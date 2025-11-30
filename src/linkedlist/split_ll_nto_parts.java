package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class split_ll_nto_parts {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode[] splitListToParts(ListNode head, int k) {
         int len,count=0;
         ListNode temp = head;

         while(temp!=null){
             temp=temp.next;
             count++;
         }

         // find base length and the extra
         // extra represents the number of parts which will have size 1 more than base

         len =count;

        int base = len/k;
        int extra=len%k;

         ListNode main[]=new ListNode[k];
         temp = head;

         for(int i =0;i<k;i++) {
             //setting len of each part
             len = base + (i<extra ?1:0 );

             if (len == 0 || temp == null) {
                 main[i] = null;
                 continue;
             }
              int j =0;
                main[i]=temp;
              //giving refrence of the head of each list into main []


              //moving pointer to the last of each list
                    while (j<len-1){
                        if(temp!=null) temp =temp.next;
                        j++;
                    }
             ListNode t= null;
                    // saving the next of the pointer in t
                    if(temp!=null) {
                         t = temp.next;
                        //cutting it off
                        temp.next = null;
                    }
                        //reassinging temp to t
                        temp = t;



         }

return main;
     }


}
