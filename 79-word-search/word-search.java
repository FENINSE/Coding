class Solution {

    public boolean exist(char[][] board, String word) {

        boolean[][] vis = new boolean[board.length][board[0].length];

        String ans = "";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (dfs(board, word, ans, word, vis, i, j)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    static boolean dfs(char[][] board, String word, String ans,
                       String s, boolean[][] vis, int row, int col) {

        ans += word.charAt(0);

        vis[row][col] = true;

        if (s.equals(ans)) {
            return true;
        }

        String newstr = word.substring(1);

        // Right
        if (col < board[row].length - 1 &&
            newstr.charAt(0) == board[row][col + 1] &&
            !vis[row][col + 1]) {

            if (dfs(board, newstr, ans, s, vis, row, col + 1)) {
                return true;
            }
        }

        // Left
        if (col > 0 &&
            newstr.charAt(0) == board[row][col - 1] &&
            !vis[row][col - 1]) {

            if (dfs(board, newstr, ans, s, vis, row, col - 1)) {
                return true;
            }
        }

        // Up
        if (row > 0 &&
            newstr.charAt(0) == board[row - 1][col] &&
            !vis[row - 1][col]) {

            if (dfs(board, newstr, ans, s, vis, row - 1, col)) {
                return true;
            }
        }

        // Down
        if (row < board.length - 1 &&
            newstr.charAt(0) == board[row + 1][col] &&
            !vis[row + 1][col]) {

            if (dfs(board, newstr, ans, s, vis, row + 1, col)) {
                return true;
            }
        }

        vis[row][col] = false;

        return false;
    }
}