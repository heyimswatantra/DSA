import java.util.Arrays;

public class houseRobber {
    //basic recursion
    public int rob0(int[] nums) {
        int n = nums.length;
        return calc0(n-1, nums);
    }
    int calc0(int idx, int[] nums) {
        if (idx == 0) return nums[idx];
        if (idx < 0) return 0;

        int pick = nums[idx] + calc0(idx - 2, nums);
        int notPick = 0 + calc0(idx - 1, nums);

        return Math.max(pick, notPick);
    }

    // memorization
    public int rob1(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return calc1(n-1, nums, dp);
    }
    int calc1(int idx, int[] nums, int[] dp) {
        if (idx == 0) return nums[idx];
        if (idx < 0) return 0;

        if (dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + calc1(idx-2, nums, dp);
        int notPick = 0 + calc1(idx-1, nums, dp);

        return dp[idx] = Math.max(pick, notPick);
    }

    //tabulation
    public static int rob2(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
//        int neg = 0;

        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i > 1) pick += dp[i-2];
            int notPick = 0 + dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }
        System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }

    //space optimization
    public static int rob3(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i>1) pick += prev2;

            int notPick = 0 + prev;

            int curr = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(rob2(arr));
    }
}
