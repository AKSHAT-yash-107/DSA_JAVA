package linkedlist;

public class swappingaltpair {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(1);
        d.next = head;

        ListNode prev = d;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            ListNode a = temp.next;
            temp.next = a.next;
            a.next = temp;
            prev.next = a;
            prev = temp;
            temp = temp.next;

        }
        return d.next;

    }
}




