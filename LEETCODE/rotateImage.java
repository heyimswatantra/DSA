package LEETCODE;

import java.util.Arrays;

public class rotateImage {
    public static void rotate(int[][] matrix) {
        int len = matrix.length;

        //transpose the matrix
        for(int i = 0; i<len; i++){
            for (int j = i; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reversing the rows
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len -j -1];
                matrix[i][len - j -1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(arr);
        for (int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
    }
}
//[1,2,3],[4,5,6],[7,8,9]
//[7,4,1],[8,5,2],[9,6,3]