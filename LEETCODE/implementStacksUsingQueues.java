package LEETCODE;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class implementStacksUsingQueues {

    // using two Qs
    static class MyStack{
        public static Queue<Integer> q1 = new LinkedList<>();
        public static Queue<Integer> q2 = new LinkedList<>();
        public static int top ;
        public static void push(int x) {
            q1.add(x);
            top = x;
        }

        public static int pop() {
            while (q1.size() > 1) {
                top = q1.remove();
                q2.add(top);
            }
            int res = q1.remove();
            Queue<Integer> tempQ = q1;
            q1 = q2;
            q2 = tempQ;

            return res;
        }

        public static int top() {
            return top;
        }

        public static boolean empty() {
            return q1.isEmpty();
        }

    }

    public static class MyStackusingOneQ {
        public static Queue<Integer> q = new LinkedList<>();
        public static int top;

        public static void push(int x) {
            q.add(x);
            int size = q.size();
            while (size > 1) {
                q.add(q.remove());
                size--;
            }
        }

            public static int pop () {
                return q.remove();
            }

            public static int top () {
                return q.peek();
            }

            public static boolean empty () {
                return q.isEmpty();
            }
        }

    public static void main(String[] args) {

        MyStack q = new MyStack();
//      MyStackusingOneQ q = new MyStackusingOneQ();


        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while(!q.empty()) {
            System.out.println(q.top());
            q.pop();
        }
//
//        while (!q1.isEmpty()) {
//            System.out.println(q.peek());
//            q.remove();
//        }
    }

}
