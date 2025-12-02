package linkedlist;

public class rotatelist {


public class ListNode {
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail =head;int len=0;
        if(head==null || head.next==null || k==0) return head;

        while(tail.next!=null){
            len++;
            tail=tail.next;
        }

        ListNode newtail=head;
        k=k%len;

        if(k==0) return head;
        while(k<len-k-1){
            newtail=newtail.next;
        }
        ListNode newHead = newtail.next;

        // Step 5: break link
        newtail.next = null;

        // Step 6: attach old tail to old head
        tail.next = head;

        return newHead;



    }
}}