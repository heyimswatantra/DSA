public class kokoEatingBananas {
        public static int minEatingSpeed(int[] piles, int h) {
            // binary search on Answers
            int low = 0, high = findMax(piles);

            while (low <= high) {
                int mid = (low + high) / 2;
                int totalH = calcHours(piles, mid);
                if( totalH <= h) high = mid - 1;
                else low = mid + 1;
            }
            return low;
        }

         static int findMax(int[] piles) {
            int maxN = Integer.MAX_VALUE;
            int n = piles.length;
            for (int i=0; i<n;  i++) {
                maxN = Math.max(maxN, piles[i]);
            }
            return maxN;
        }

         static int calcHours(int[] piles , int hourly) {
            int totalTime = 0;
            int n = piles.length;
            for (int i=0; i<n; i++) {
                totalTime += Math.ceil((double) piles[i] / (double) hourly);
            }
            return totalTime;
        }

    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));
    }
}
