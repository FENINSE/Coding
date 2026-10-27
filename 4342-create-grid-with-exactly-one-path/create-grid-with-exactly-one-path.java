
class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        for (int i = 0; i < m; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '#');
            grid[i] = new String(row);
        }

        char[] first = new char[n];
        Arrays.fill(first, '.');
        grid[0] = new String(first);

        for (int i = 0; i < m; i++) {
            char[] row = grid[i].toCharArray();
            row[n - 1] = '.';
            grid[i] = new String(row);
        }

        return grid;
    }
}
