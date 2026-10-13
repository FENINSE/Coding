class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        if(obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        else{
            int ways = solve(m-1,n-1,dp,obstacleGrid);
            return ways;
        }
        //return ways;
    }
    static int solve(int m, int n, int[][] dp,int[][] grid){
        if(m==0 && n==0){
            return 1;
        }
        if(m < 0 || n < 0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int left = 0;
        int up = 0;
        if(n > 0){
            if(grid[m][n-1]!=1){
                left = solve(m,n-1,dp,grid);
            }
        }
        if(m > 0){
            if(grid[m-1][n]!=1){
                up = solve(m-1,n,dp,grid);
            }
        }
        dp[m][n] = left+up;
        return dp[m][n];
    }
}