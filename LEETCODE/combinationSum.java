package LEETCODE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
    private static void findCombination(int indx, int []arr , int target, List<List<Integer>> ans, List<Integer> ds){
        if(indx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[indx] <= target){
            ds.add(arr[indx]);
            findCombination(indx,arr,target - arr[indx], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(indx + 1, arr, target, ans, ds);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans , new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        System.out.println(combinationSum(arr, 7));
    }

}
