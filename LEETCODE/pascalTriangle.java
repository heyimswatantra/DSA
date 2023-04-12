package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
     public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        if(numRows == 0 ){
            return pascalTriangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalTriangle.add(firstRow);

         for (int i = 1; i < numRows; i++) {
             List<Integer> prevRow = pascalTriangle.get(i-1);
             List<Integer> currentRow = new ArrayList<>();

             currentRow.add(1);
             for (int j = 1; j < i; j++) {
                 currentRow.add(prevRow.get(j-1) + prevRow.get(j));
             }
             currentRow.add(1);
             pascalTriangle.add(currentRow);
         }
         return pascalTriangle;
     }
}
