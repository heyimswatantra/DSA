package LEETCODE;

import java.util.HashMap;

public class subArrayWithSumK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prevSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prevSum += nums[i];
            if(map.containsKey(prevSum - k)){
                count += map.get(prevSum-k);
            }
            map.put(prevSum, map.getOrDefault(prevSum,0) +1);
        }
        return count;
    }

//    int sum = 0;
//        int ans = 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//        for(int j=0;j<nums.length;j++){
//            sum += nums[j];
//            if(map.containsKey(sum -k)){
//                ans += map.get(sum-k);
//            }
//            map.put(sum,map.getOrDefault(sum,0)+1);
//        }
//        return ans;

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n  = 3;
        System.out.println(subarraySum(arr,n));
    }
}
