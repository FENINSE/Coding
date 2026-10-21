
class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m][n][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(0, 0, n - 1, grid, dp);
    }

    static int solve(int i, int j1, int j2,
                     int[][] grid, int[][][] dp) {

        int m = grid.length;
        int n = grid[0].length;

        if (j1 < 0 || j1 >= n || j2 < 0 || j2 >= n) {
            return Integer.MIN_VALUE;
        }

        if (i == m - 1) {
            if (j1 == j2) {
                return grid[i][j1];
            }
            return grid[i][j1] + grid[i][j2];
        }

        if (dp[i][j1][j2] != -1) {
            return dp[i][j1][j2];
        }

        int maxi = Integer.MIN_VALUE;

        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {

                int value;

                if (j1 == j2) {
                    value = grid[i][j1];
                } else {
                    value = grid[i][j1] + grid[i][j2];
                }

                value += solve(i + 1, j1 + d1, j2 + d2, grid, dp);

                maxi = Math.max(maxi, value);
            }
        }

        return dp[i][j1][j2] = maxi;
    }
}
