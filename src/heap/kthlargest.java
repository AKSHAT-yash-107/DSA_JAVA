package heap;

import java.util.PriorityQueue;

public class kthlargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for (int ele: nums){
            pq.offer(ele);
            if (pq.size()>k) pq.remove();
    }
        return pq.peek();
}}
//*
// Universal
//Dear Sir/Madam,
// I hope you are doing well.
//I am writing this email to bring to your immediate attention an important matter regarding the use of phone during
// office hours. It is highly unprofessional and results in decreased productivity leading to increased deadlines ans stress
//Therefore i kindly request you to look into this issue and coordinate corrective measures and on duty policies .
//Thank you for your countinour support and understanding.

// Thanks and regards
// kesh
//
//
// *//