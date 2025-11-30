package linkedlist;
import java.util.LinkedList;
public class peak_node {

    public class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode peak(ListNode head){
        if (head == null) return null;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        ListNode list = new ListNode(-2);
        ListNode a = list;

        while (curr != null) {

            boolean isPeak = true;

            // Check left
            if (prev != null && curr.val <= prev.val)
                isPeak = false;

            // Check right
            if (next != null && curr.val <= next.val)
                isPeak = false;

            if (isPeak) {
                a.next = new ListNode(curr.val);
                a = a.next;
            }

            // Move pointers safely
            prev = curr;
            curr = next;
            next = (next != null ? next.next : null);
        }

        return list.next;
    }

}
