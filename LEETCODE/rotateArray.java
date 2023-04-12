package LEETCODE;

import java.util.Arrays;

public class rotateArray {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        flip(nums,0,n-k-1);
        flip(nums,n-k,n-1);
        flip(nums,0,n-1);
    }

    public static void flip(int[] arr,int s,int e)
    {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
//    public void rotate(int[] nums, int k) {
//        int n = 0;
//        int indx1;
//        int indx2;
//        while(n <= k){
//            swapFunction(nums,indx1, indx2);
//            n++;
//        }
//
//    }
//    private void swapFunction( int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int k = 4;
    rotate(arr, k);
    System.out.println(Arrays.toString(arr));
}
}
