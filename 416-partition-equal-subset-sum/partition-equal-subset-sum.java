class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int m = nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int target = sum/2;
        int[][] dp = new int[nums.length][target+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return solve(nums,m-1,target,dp);
    }
    static boolean solve(int[] arr,int i, int target, int[][] dp){
        if(target==0){
            return true;
        }
        if(i==0){
            return arr[0]==target;
        }
        if(dp[i][target]!=-1){
            return dp[i][target]==1;
        }
        boolean nottake = solve(arr,i-1,target,dp);
        boolean take = false;
        if(arr[i] <= target){
            take = solve(arr,i-1,target-arr[i],dp);
        }
        dp[i][target] = (take || nottake) ? 1 : 0;
        return dp[i][target]==1;
    }
}