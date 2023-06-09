package LEETCODE;

import java.util.Stack;

public class validParenthesis {
        public static boolean isValid(String s) {
            Stack<Character> st = new Stack<>();

            for(char c: s.toCharArray()){

                //push opening brackets into stack

                if( c == '(' || c == '[' || c == '{' ){
                    st.push(c);
                } else {

                    // if stack is empty then return false since no opening brakets have been pushed
                    // also if top of stack != to next character in string it is not valid case (rtn false)
                    if( st.isEmpty() || (st.peek() == '(' && c != ')') || (st.peek() == '{' && c != '}') || (st.peek() == '[' && c != ']')) {
                        return false;
                    }
                    // after comparing pop that character from stack
                    st.pop();
                }
            }
            // after completion of loop is stack is empty ? true : false
            return st.isEmpty();
        }


    public static void main(String[] args) {
        String s = ")(";

        System.out.println(isValid(s));
    }
}


/*
Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(' || s.charAt(i) ==  '[' || s.charAt(i) == '{' ) {
                st.push(s.charAt(i));
            }
            else {

                char c = st.pop();
                if( st.isEmpty() || (st.peek() == '(' && c != ')') || (st.peek() == '{' && c != '}') || (st.peek() == '[' && c != ']')) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
*/