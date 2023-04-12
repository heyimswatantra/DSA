package LEETCODE;

public class missingNo {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(cyclicSort(arr));

    }
    static int cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndx = arr[i];
            if(arr[i] < arr.length &&  arr[i] != arr[correctIndx]){
                swapFunction(arr, i , correctIndx);
            }
            else{
                i++;
            }
        }
        for (int indx = 0; indx < arr.length; indx++) {
            if(arr[indx] != indx){
                return indx;
            }
        }
        return arr.length;
    }

    static void swapFunction( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
