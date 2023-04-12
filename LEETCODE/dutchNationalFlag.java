package LEETCODE;

import java.util.Arrays;

public class dutchNationalFlag {
    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        int low = 0;
        int high = nums.length-1;
        int mid = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }



        System.out.println(Arrays.toString(nums));
    }
}
