class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return ways(dp,n);
    }
    static int ways(int[] dp , int n){
        if(n==1 || n==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int left = ways(dp,n-1);
        int right = ways(dp,n-2);
        dp[n] = left+right;
        return dp[n];
    }
}