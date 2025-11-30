package linkedlist;

public class find_max_and_min_Dis {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int []arr={-1,-1};

        ListNode prev=head;
        ListNode curr= head.next;
        ListNode next=curr.next;

        int min = Integer.MAX_VALUE;
        int first=-1;
        int last=-1;


        int count=1;
        while(next!=null){
            if(prev.val> curr.val && curr.val<next.val || prev.val< curr.val && curr.val>next.val){
                if(first==-1) first=count;
               if (last!=-1)min= Math.min(min,(count-last));
                last=count;

            }
                count++;
            prev=prev.next;
            curr=curr.next;
            next=next.next;

        }
        if(first==last) return arr;
        int max = last-first;

        arr[0]=min;
        arr[1]=max;
        return arr;





    }
    }



