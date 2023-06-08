import java.util.Stack;

public class reverse_a_Stack {

    public static void reverseAStack(Stack<Integer> s){
        if(s.isEmpty()) return;

        int top = s.pop();
        reverseAStack(s);
        pushAtBottom(top, s);
    }

    public static void pushAtBottom(int data, Stack<Integer> s){
        //base case
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseAStack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
