class Solution {
    public int getMaximumGold(int[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;
        int maxgold = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] > 0){
                    maxgold = Math.max(maxgold,dfs(grid,i,j));
                }
            }
        }
        return maxgold;
    }
    static int dfs(int[][] grid,int row, int col){
        int max = 0;
        int gold = grid[row][col];
        grid[row][col] = 0;

        if(row > 0 && grid[row-1][col] > 0){
            max = Math.max(max,dfs(grid,row-1,col));
        }
        if(row < grid.length-1 && grid[row+1][col] > 0){
            max = Math.max(max,dfs(grid,row+1,col));
        }
        if(col<grid[0].length-1 && grid[row][col+1] > 0){
            max = Math.max(max,dfs(grid,row,col+1));
        }
        if(col > 0 && grid[row][col-1] > 0){
            max = Math.max(max,dfs(grid,row,col-1));
        }
        grid[row][col] = gold;
        return max+gold;
    }
}