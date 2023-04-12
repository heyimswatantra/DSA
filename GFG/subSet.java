package GFG;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class subSet {

    static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        // pick the element
        subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

        // Do-not pick the element
        subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
    }

    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }



    public static void main(String args[]) {


        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }




//    private static void func(int indx, int[] nums, int n, List<Integer> ans, List<List<Integer>> subSet){
//        if(indx == n){
//            subSet.add(ans);
//            return;
//        }
//        func(indx+1, nums, n, ans.subList(indx, indx), subSet);
//        func(indx+1, nums, n, ans, subSet);
//    }
//
//    public static List<List<Integer>> subsets(int[] nums) {
//        int n = nums.length;
//        List<Integer> ans = new ArrayList<>();
//        List<List<Integer>> subSet = new ArrayList<>();
//        func(0,nums,nums.length,ans,subSet);
//        return subSet;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        int n = arr.length;
//        System.out.println(subsets(arr));
//
//    }
}
