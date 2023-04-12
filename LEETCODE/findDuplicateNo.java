package LEETCODE;

public class findDuplicateNo {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){

            if(nums[i] != i+1) {
                int correctIndx = nums[i] - 1;
                if (nums[i] != nums[correctIndx]) {
                    swapFunction(nums, i, correctIndx);
                } else {
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    void swapFunction( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
