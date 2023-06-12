package CONCEPTS;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr = {4,5,3,2,6,7,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swapFunction(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swapFunction(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
