class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        int MOD = 1_000_000_007;
        if(m==1 && n==1){
            return 1;
        }
        long left = solve(grid,m-1,n-2,0,dp,MOD);
        long up = solve(grid,m-2,n-1,1,dp,MOD);
        return (int)(left+up)%MOD;
    }
    static int solve(int[][] grid,int i,int j,int dir,int[][][] dp,int MOD){
        if(i < 0 || j < 0){
            return 0;
        }
        if(grid[i][j]==1){
            if(dir==0){
                return solve(grid,i-1,j,1,dp,MOD);
            }else{
                return solve(grid,i,j-1,0,dp,MOD);
            }
        }
        if(i==0 && j==0){
            return 1;
        }
        if(dp[i][j][dir]!=-1){
            return dp[i][j][dir];
        }
        long left = solve(grid,i,j-1,0,dp,MOD);
        long up = solve(grid,i-1,j,1,dp,MOD);
        dp[i][j][dir] = (int)(left+up)%MOD;
        return dp[i][j][dir];
    }
}