package linkedlist;

public class reverese_II {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverselist(ListNode head){
            ListNode prev=null,curr=head,next=null;
            if(head==  null) return head;
            while(curr!=null){
                next= curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;

        }
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(head==null || head.next==null) return head;
            int count=1;
            ListNode left_prev=null,right_next=null,left_node=null,right_node=null;
            ListNode temp =head;
            while(temp != null){
                if(count==left-1) left_prev=temp;
                if(count==left) left_node=temp;
                if(count==right) right_node=temp;
                if(count==right+1) right_next=temp;
                temp =temp.next;
                count++;
            }
            if (left_prev!=null) left_prev.next=null;
            // right_node.next=null;

            ListNode newHeadOfSegment = reverselist(left_node);

            if(left_prev!=null) left_prev.next=newHeadOfSegment ;
            else head= newHeadOfSegment ;
            left_node.next=right_next;


            return head;

        }

    }


}
