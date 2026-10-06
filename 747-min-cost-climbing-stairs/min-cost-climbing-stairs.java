class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        int n = cost.length;
        Arrays.fill(dp,-1);
        int ways = Math.min(minways(cost,dp,n-1),minways(cost,dp,n-2));
        return ways;
    }
    static int minways(int[] arr, int[] dp, int n){
        if(n==0){
            return arr[0];
        }
        if(n==1){
            return arr[1];
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int left = minways(arr,dp,n-1)+arr[n];
        int right = minways(arr,dp,n-2)+arr[n];
        dp[n] = Math.min(left,right);
        return dp[n];
    }
}