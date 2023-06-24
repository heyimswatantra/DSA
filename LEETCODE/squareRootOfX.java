public class squareRootOfX {
    public static int mySqrt(int x) {
        int low = 1, high = x;

        while (low <= high) {
            int mid = (low + high) / 2;
            long val = (mid * mid);

            if (val <= x) low = mid + 1;
            else high = mid - 1;
        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
