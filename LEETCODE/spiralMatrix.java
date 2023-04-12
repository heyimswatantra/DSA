package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiralMatrix {
    public static List<Integer> spiralOrder(int [][] matrix){
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int dir = 0;
        List<Integer> ans = new ArrayList<>();

        while (left <= right && top <= bottom){
            switch (dir){
                case 0 :
                    for (int i = left; i <= right; i++) {
                        ans.add(matrix[top][i]);
                    }
                    top++;
                    break;
                case 1 :
                    for (int i = top; i <= bottom; i++) {
                        ans.add(matrix[i][right]);
                    }
                    right++;
                    break;
                case 2 :
                    for(int i = right; i >= left; i--){
                        ans.add(matrix[bottom][i]);
                    }
                    bottom++;
                    break;
                case 3 :
                    for(int i = bottom; i >= top; i--){
                        ans.add(matrix[i][left]);
                    }
                    left++;
                    break;
            }
            dir = (dir + 1) % 4;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer>  newArr = spiralOrder(matrix);

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(new[i][j]);
//            }
//            System.out.println();
//        }
        System.out.println(newArr);
    }
}
