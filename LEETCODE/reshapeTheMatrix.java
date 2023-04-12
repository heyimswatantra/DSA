package LEETCODE;

import java.util.Arrays;

public class reshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length * mat[0].length) return mat;

        int[][] ans = new int[r][c];

        for (int i = 0; i < r * c; i++) {
            ans[i/c][i%c] = mat[i / mat[0].length][i % mat[0].length];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4}
        };
        System.out.println();
//        for(int[] i : arr){
//            System.out.println(Arrays.toString(i));
//        }
    }
}
//[1,2],[3,4]], r = 2, c = 4