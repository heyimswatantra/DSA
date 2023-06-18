package LEETCODE;

import java.util.Stack;

public class minStack {
    static class MinStack {

        Stack<Long> st = new Stack<>();
        Long min;
        public  MinStack() {
            min = Long.MAX_VALUE;
        }

        public void push(int value) {
            Long val = Long.valueOf(value);
            if(st.isEmpty()){
                st.push(val);
                min = val;
            } else {
                if(val < min) {
                    st.push(2 * val - min);
                    min = val;
                } else {
                    st.push(val);
                }
            }
        }

        public void pop() {
            if(st.isEmpty()) return;

            Long val = st.pop();
            if(val < min){
                min = (2 * min - val);
            }
        }

        public int top() {
            if(st.isEmpty()) return -1;

            Long val = st.peek();
            if(val < min){
                return min.intValue();
            }
            return val.intValue();
        }

        public int getMin() {
            return min.intValue();
        }

    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin() + " " + obj.top());
    }
}
