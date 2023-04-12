package LEETCODE;

import java.util.Arrays;

public class setMisMatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] arr) {
            int i = 0;
            while(i < arr.length){
                int correctIndx = arr[i] - 1;
                if(arr[i] != arr[correctIndx]){
                    swapFunction(arr, i , correctIndx);
                }
                else{
                    i++;
                }
            }
            for (int indx = 0; indx < arr.length; indx++) {
                if(arr[indx] != indx + 1){
                    return new int[] {arr[indx], indx+1};
                }
            }
            return new int [] {-1,-1};
        }

        static void swapFunction( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

