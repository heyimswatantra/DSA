package LEETCODE;

public class trappingRainWater {
    //https://leetcode.com/problems/trapping-rain-water/

    /*
    Brute Approach is to use two nested loops and compute result by min(left[i] - right[i]) - arr[i];

    Better Approach is to use prefix and suffix max

    Optimal Approach is to use two pointers approach
    */
    public static int trap(int[] heights) {
        int n = heights.length;
        int left = 0, right = n-1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while (left <= right) {

            if(heights[left] <= heights[right]) {

                // if arr[i] less than leftMax update leftMax else add it result
                if(heights[left] >= leftMax) leftMax = heights[left];
                else res += leftMax - heights[left];
                left++;
            } else {

                // if arr[i] less than rightMax update rightMax else add it result
                if (heights[right] >= rightMax) rightMax = heights[right];
                else res += rightMax - heights[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
