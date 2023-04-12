package LEETCODE;
import java.util.ArrayList;
import java.util.List;

public class findAllNosDisappearedInArray {

    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndx = nums[i] - 1;
            if(nums[i] != nums[correctIndx]){
                swapFunction(nums, i , correctIndx);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int indx = 0; indx < nums.length; indx++) {
            if(nums[indx] != indx+1){
                ans.add(indx+1);
            }
        }
        return ans;
    }

     void swapFunction( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
