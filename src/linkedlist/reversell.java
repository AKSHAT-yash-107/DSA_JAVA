package linkedlist;

public class reversell {
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
        public ListNode reverseList(ListNode head) {
          if(head == null ) return head;

        ListNode current = head;
            ListNode prev = null;
            ListNode next = null;
            while(current!=null){
                next = current.next;
                current.next = prev;
                prev=current;
                current = next;

            }
            return prev;
// the recusrive way
//            public ListNode reverseList(ListNode head) {
//            if(head==null || head.next==null)return  head;
//            ListNode a = head.next;
//            ListNode nh= reverseList(a);
//            a.next= head;
//            head.next= null;
//            return nh;
//            }
        }




    }
