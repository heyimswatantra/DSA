package CONCEPTS;

public class circularQueueUsingArray {
    static class Queue {
        int size;
        int[] arr;
        int rear = -1;
        int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }
        public  boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public  boolean isFull() {
            return (rear+1) % size == front;
        }
        public void add(int val) {
            if (isFull()) System.out.println("-1");
            //for first element
            if (front == -1) front = 0;

            rear = (rear+1) % size;
            arr[rear] = val;
        }
        public int remove() {
            if(isEmpty()) return -1;

            int res = arr[front];

            //single ele
            if (rear == front) rear = front = -1;
            else front = (front+1) % size;

            return res;
        }
        public int peek() {
            if(isEmpty()) return  -1;

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.remove()
            );
        }
    }
}
