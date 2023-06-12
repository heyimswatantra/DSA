package INTERVIEWBIT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class nextSmallerElement {
    public static int[] nearestSmallEle(int[] nums1) {
        HashMap<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int i = nums1.length-1; i >= 0 ; i--) {
            while (!stack.isEmpty() && stack.peek() > nums1[i]){
                map.put(stack.pop(), nums1[i]);
            }
            stack.push(nums1[i]);
        }
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);
        for (int i = res.length-1; i >=0; i--){
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(nearestSmallEle(x)));
    }
}
//Input 1:
//    A = [4, 5, 2, 10, 8]
//Output 1:
//    G = [-1, 4, -1, 2, 2]