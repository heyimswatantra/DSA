class houseRobberII {
    //same as house robber 1, just calling helper func twice
    //once from idx 0 -> n-1 and then for 1 -> n

    //space optimised DP
    public int rob(int[] nums){
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] arr1 = new int[n-1];
        int[] arr2 = new int [n-1];

        for (int i = 0; i < n; i++) {
            if (i != 0) arr1[i-1] = nums[i];
            if (i != n-1) arr2[i] = nums[i];
        }
        int ans1 = helper(arr1);
        int ans2 = helper(arr2);
        return Math.max(ans1, ans2);
    }

    public int helper(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i > 1) pick += prev2;

            int notPick = 0 + prev;

            int curr = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
