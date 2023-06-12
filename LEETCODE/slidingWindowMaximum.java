package LEETCODE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class slidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int rightIndx = 0;

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            //remove number out of window size k
            if(!q.isEmpty() && q.peek() == i-k) {
                q.poll();
            }
            //remove smaller numbers in k range as there is a larger no then them
            while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k-1) {
                res[rightIndx++] = nums[q.peek()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindow(arr , 3);
        System.out.println(Arrays.toString(res));
    }
}
