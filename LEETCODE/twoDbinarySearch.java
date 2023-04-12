package LEETCODE;

import java.util.Arrays;

public class twoDbinarySearch {
    public static void main(String[] args) {

        int[][] nums = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int t = 37;
        System.out.println(Arrays.toString(search(nums, 37)));
    }
    static int [] search (int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while(r < matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int [] {r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
