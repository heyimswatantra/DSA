package LEETCODE;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class subSet {
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }
}

















































//    private static void func(int indx, int[] nums, int n, List<Integer> ans, List<List<Integer>> subSet){
//        if(indx == n){
//            ans.add(nums[indx]);
//            subSet.add(new ArrayList<>(ans));
//            return;
//        }
//        func(indx+1, nums, n, ans.subList(indx, indx), subSet);
//        ans.remove(indx);
////        func(indx+1, nums, n, ans, subSet);
//    }
//
//    public static List<List<Integer>> subsets(int[] nums) {
//        int n = nums.length;
//        List<Integer> ans = new ArrayList<>();
//        List<List<Integer>> subSet = new ArrayList<>();
//        func(0,nums,nums.length,ans,subSet);
//        return subSet;
//    }