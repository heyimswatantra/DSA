package LEETCODE;

import java.util.Map;
import java.util.Stack;

public class largestRectangleInHistogram {
    //https://leetcode.com/problems/largest-rectangle-in-histogram/

    //better approach (multiple passes)
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] leftSmall = new int[n];
        int[] rightSmall = new int[n];

        //compute left just smaller element than current element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek() + 1;
            st.push(i);
        }

        //empty the stack for re-use
        while (!st.isEmpty()) st.pop();

        //compute right just smaller element than current element
        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()) rightSmall[i] = n-1;
            else rightSmall[i] = st.peek() -1;
            st.push(i);
        }

        int maxiA = 0;
        //compute area by width(rightSmall -leftSmall) * height
        for (int i = 0; i < n; i++) {
            maxiA = Math.max(maxiA, (rightSmall[i] - leftSmall[i] + 1) * heights[i]);
        }
        return maxiA;
    }

    //optimal approach (single pass)
    public static int largestRectArea(int[] heights){
        int maxA = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= heights.length; i++){
            while (!st.isEmpty() && (i == heights.length || heights[st.peek()] >= heights[i])) {
                int length = heights[st.peek()];
                st.pop();
                int width = 0;
                if(st.isEmpty()) width = i;
                else width = i - st.peek() - 1;
                maxA = Math.max(maxA, length * width);
            }
            st.push(i);
        }
        return maxA;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
