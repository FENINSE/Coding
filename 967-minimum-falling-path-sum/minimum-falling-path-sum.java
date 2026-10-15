class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix[0].length;
        int[] dp = new int[n];
        for(int i=0;i<matrix[0].length;i++){
            dp[i] = matrix[0][i];
        }
        for(int i=1;i<matrix.length;i++){
            int[] temp = new int[n];
            for(int j=0;j<matrix[0].length;j++){
                //int down = Integer.MAX_VALUE;
                int down = matrix[i][j] + dp[j];
                int leftdg = Integer.MAX_VALUE;
                int rightdg = Integer.MAX_VALUE;
                if(j-1 >= 0){
                    leftdg = matrix[i][j] + dp[j-1];
                }
                if(j+1 <= n-1){
                    rightdg = matrix[i][j] + dp[j+1];
                }
                temp[j] = Math.min(down, Math.min(leftdg,rightdg));
            }
            dp = temp;
        }
        int min = dp[0];
        for(int i=1;i<dp.length;i++){
            min = Math.min(dp[i],min);
        }
        return min;
    }
}