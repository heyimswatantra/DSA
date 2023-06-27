public class MinDaysToBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) return -1;
        int low = findMin(bloomDay);
        int high = findMax(bloomDay);

        while (low <= high) {
            int mid = (low + high) / 2;
            if(possible(bloomDay,mid,m,k)) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static boolean possible(int[] arr, int day, int m, int k){
        int cnt = 0 , noOfBouquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) cnt++;
            else {
                noOfBouquets += (cnt / k);
                cnt = 0;
            }
        }
        noOfBouquets += (cnt / k);
        return noOfBouquets >= m;
    }

    public static void main(String[] args) {
        int[] arr = {7,7,7,7,13,11,12,7};
        System.out.println(minDays(arr,2,3));
    }
}
