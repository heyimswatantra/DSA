package LEETCODE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    private static void findCombination(int indx, int []arr , int target, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = indx; i < arr.length; i++){
            if(i > indx && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            findCombination(i+1, arr ,target- arr[i], ans, ds);
            ds.remove(ds.size() -1);
            }
        }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0, candidates, target, ans , new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(arr, 8));
    }
}
