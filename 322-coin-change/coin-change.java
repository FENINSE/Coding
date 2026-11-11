class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        int ans = solve(coins,coins.length-1,dp,amount);
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
    static int solve(int[] arr,int i, int[][] dp,int target){
        if(i==0){
            if(target%arr[0]==0){
                return target/arr[0];
            }else{
                return Integer.MAX_VALUE;
            }
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int nottake = 0 + solve(arr,i-1,dp,target);
        int take = Integer.MAX_VALUE;
        if(arr[i] <= target){
            int result = solve(arr,i,dp,target-arr[i]);
            if(result!=Integer.MAX_VALUE){
                take = 1 + result;
            }
        }
        dp[i][target] = Math.min(take,nottake);
        return dp[i][target];
    }
}