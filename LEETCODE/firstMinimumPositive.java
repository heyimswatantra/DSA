package LEETCODE;

import java.util.Arrays;

public class firstMinimumPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};

        System.out.println();
    }
    public static int firstMissingPositive(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndx = nums[i] -1;
            if(nums[i] > 0 && nums[i] != nums[correctIndx] && nums[i] <= nums.length){
                swapFunction(nums, i ,correctIndx);
            } else {
                i++;
            }
        }
        for(int indx = 0; indx < nums.length; indx++){
            if(nums[indx] != indx){
                return indx + 1;
            }
        }
        return nums.length + 1;
    }
    public static void swapFunction( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
