package CONCEPTS;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,2,3,1,2,4,5,5,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr) {
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
    }

    static void swapFunction( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
