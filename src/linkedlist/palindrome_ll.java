package linkedlist;
import java.util.LinkedList;
public class palindrome_ll {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

       ListNode current = head;
      ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {



        ListNode temp = head;

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;

        }
        slow= reverseList(slow);

        while (slow!=null){
            if(temp.val!=slow.val) return false;
            slow=slow.next;
            temp=temp.next;


        }
return true;
    }

}
