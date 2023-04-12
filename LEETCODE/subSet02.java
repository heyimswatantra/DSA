package LEETCODE;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class subSet02 {
    public static void findSubsets(int indx, int[] nums, List<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = indx; i < nums.length; i++){
            if(i!=indx && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(i+1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4};
        subsetsWithDup(arr);
        for (List<Integer> nums : subsetsWithDup(arr)){
            System.out.println(nums);
        }

    }
}
