class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        int ans = solve(coins,coins.length-1,dp,amount);
        return ans==0 ? 0 : ans;
    }
    static int solve(int[] arr, int i, int[][] dp, int target){
        if(i==0){
            return target%arr[i]==0 ? 1 : 0;
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int nottake = solve(arr,i-1,dp,target);
        int take = 0;
        if(arr[i] <= target){
            take = solve(arr,i,dp,target-arr[i]);
        }
        dp[i][target] = take + nottake;
        return dp[i][target];
    }
}