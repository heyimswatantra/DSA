package CONCEPTS;

import java.util.LinkedList;
import java.util.Queue;

public class queueUsingLL {

    static class Node {
        int val;
        Node next;

        Node (int val) {
            this.val = val;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null, tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        public static void add(int val) {
            Node newNode  = new Node(val);
            if(tail == null) tail = head = newNode;
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if(isEmpty()) return -1;

            int front = head.val;
            if(head == tail) tail = null;
            head = head.next;
            return front;
        }

        public static int peek() {
            return head.val;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

//      queue is an interface, isleye hum queue ke objects nhi bana skte
//      queue interface ko do classes implement krti h
//      Queue<Integer> q = new LinkedList<>(); { using collection framework }
//      Queue<Integer> q = new ArrayDeque<>(); { using collection framework }

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);



        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
