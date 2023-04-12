package LEETCODE;

import java.util.Arrays;

public class searchInMatrix {
    public static void main(String[] args) {
//1,3,5,7],[10,11,16,20],[23,30,34,60
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(searchInSortedMatrix(arr, 3));
    }

    static boolean searchInSortedMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;

}

//    static boolean BS(int[][] matrix, int row, int cStart, int cEnd,int target){
//        while(cStart<=cEnd){
//            int mid = cStart + (cEnd-cStart)/2;
//            if(matrix[row][mid] == target){
//                return true;
//            }if(matrix[row][mid] < target){
//                cStart = mid +1;
//            }else{
//                cEnd = mid-1;
//            }
//
//        }
//        return false;
//    }
//
//    static boolean searchInSortedMatrix(int[][] matrix, int target){
//
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        if(rows == 1){
//            return BS(matrix,0,0, cols,target);
//        }
//        int rStart = 0;
//        int rEnd = rows-1;
//        int cMid = cols/2;
//        while(rStart < (rEnd - 1)){
//             int mid = rStart + (rEnd - rStart)/2;
//             if(matrix[mid][cMid] == target){
//                 return true;
//             }
//             if(matrix[mid][cMid] < target){
//                 rStart = mid;
//             }else{
//                 rEnd = mid;
//             }
//        }
//        //now we have two rows
//        //check whether the target is in the col of 2 rows
//        if(matrix[rStart][cMid] == target){
//            return true;
//        }
//        if(matrix[rStart+1][cMid] == target){
//            return true;
//        }
//
//
//        //search in 1st half
//        if(target<= matrix[rStart][cMid-1]){
//            return BS(matrix,rStart,0,cMid-1,target);
//        }
//        //search in 2nd half
//        if(target >= matrix[rStart][cMid-1] && target <= matrix[rStart][cols-1 ]){
//            return BS(matrix,rStart,cMid+1,cols-1,target);
//        }
//        //search in 3rd half
//        if(target <= matrix[rStart][cMid-1]){
//            return BS(matrix,rStart+1,0    ,cMid-1,target);
//        }
//        //search in 4th half
//        else{
//            return BS(matrix,rStart+1,cMid+1,cols-1,target);
//
//        }
//    }
}
