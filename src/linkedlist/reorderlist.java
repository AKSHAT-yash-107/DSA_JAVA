package linkedlist;
import java.util.LinkedList;

public class reorderlist {
    public class ListNode {
        int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode reverselist(ListNode head){
        ListNode curr = head;
                ListNode prev = null;

      ListNode next = null;
      while(curr!=null ){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;

      }
      return prev;

  }
    public void reorderList(ListNode head) {
        ListNode fast= head;
        ListNode slow =head;

    while(fast!=null && fast.next!=null){
    fast = fast.next.next;
    slow= slow.next;
    }
    ListNode a = slow.next;

    slow.next=null;
    a=reverselist(a);

    ListNode temp =head;
    while(a!=null){
        ListNode change1=temp.next;

        ListNode change2=a.next;
        temp.next=a;
        a.next= change1;

        temp=change1;
        a=change2;
    }






    }
}
