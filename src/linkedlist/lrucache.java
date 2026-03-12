package linkedlist;

import java.util.HashMap;

public class lrucache {


   public  class Node {
        int key,value;
        Node next,prev;
        Node (int key, int v){ this.key=key; this.value=v;}
    }

    class LRUCache {

        int capacity;
        HashMap<Integer,Node> map;
        Node head,tail;

        public LRUCache(int capacity) {
            this.capacity=capacity;
            this.map=new HashMap<>();
            head = new Node(0,0);
            tail=new Node (0,0);
            head.next=tail;
            tail.prev=head;

        }

        public int get(int key) {
            if(!map.containsKey(key)) return -1;
            Node curr= map.get(key);
            remove(curr);
            insertathead(curr);
            return curr.value;
        }

        public void put(int key, int value) {
            if(map.containsKey(key)){
                Node curr= map.get(key);
                remove(curr);
                insertathead(curr);
                curr.value=value;
            }
            if(map.size()==capacity){
                Node cur = tail.prev;
                remove(cur);
                map.remove(cur.key);
            }

            Node curr =new Node(key,value);
            insertathead(curr);
            map.put(key,curr);


        }

        public void remove (Node node){
            node.prev.next=node.next;
            node.next.prev=node.prev;

        }

        public void insertathead(Node node){
            node.next=head.next;
            head.next.prev=node;
            head.next=node;
            node.prev=head;

        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
