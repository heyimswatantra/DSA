package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-i/
public class nextGreaterElement {

    public static int[] nxtGrtEle(int[] nums1, int[] nums2) {

        //initialize an empty result array with all vals as -1 of size equal to nums1 arr
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);

        //push nums1 vals into a hashmap to get hold of every element of arr (in constant time)
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hm.put(i, nums1[i]);
        }

        Stack<Integer> st = new Stack<>();

        //iterate through nums2
        for (int curr : nums2) {

            //if stack is not empty and current element of nums2 is greater than stack top,
            //then pop the stack top element, get index of it in nums1 array
            //and add current element at that index in result array
            while (!st.isEmpty() && curr > st.peek()) {
                int val = st.pop();
                System.out.println(hm);
                int indx = hm.getOrDefault( val,0);
                result[indx] = curr;
            }

            //push only those values which are in nums1 array to avoid unnecessarily checking for all items
            if (hm.containsValue(curr)) {
                st.push(curr);
            }
        }
        return result;

        /*
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.getOrDefault(nums1[i], -1);
        return nums1;
        */
    }

    public static void main(String[] args) {

        int[] nums1 = {2,1,3};
        int[] nums2 = {2,3,1};

        int[] rs = nxtGrtEle(nums1, nums2);
        for (int r : rs) {
            System.out.print(r + " ");
        }
    }
}
