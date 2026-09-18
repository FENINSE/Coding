class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean [n][n];
        List<List<String>> main = new ArrayList<>();
        queens(board,main,0);
        return main;
    }
    static void queens(boolean[][] board, List<List<String>> main,int row){
        if(row==board.length){
            ArrayList<String> list = new ArrayList<>();
        for(boolean[] i : board){
            String s = "";
            for(boolean element : i){
                if(element){
                    s+="Q";
                }else{
                    s+=".";
                }
            }
            list.add(s);
        }
        main.add(list);
        return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                queens(board,main,row+1);
                board[row][col] = false;
            }
        }
        return;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxleft = Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxright = Math.min(row,board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}