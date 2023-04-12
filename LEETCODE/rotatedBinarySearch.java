package LEETCODE;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr){
        int start = 0 ;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end-start) / 2;

            if( mid < end && arr[mid] > arr[mid+1])
                return arr[mid+1];
            if(start < mid && arr[mid] < arr[mid-1])
                return arr[mid];
            if( arr[mid] <= arr[start])
                end = mid -1;
            else
                start = mid + 1;
        }
        return arr[0];
    }

}
