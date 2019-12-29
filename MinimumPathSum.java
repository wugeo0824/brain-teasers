class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (m * n == 0) {
            return 0;
        }

        int[][] memo = new int[m][n];

        for (int i = 0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        memo[0][0] = grid[0][0];
        return findMinPath(grid, m-1, n-1, memo);
    }

    private int findMinPath(int[][] grid, int row, int col, int[][] memo) {

        if (memo[row][col] != -1) {
            return memo[row][col];
        }

        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        if (row == 0) {
            left = findMinPath(grid, row, col - 1, memo);
        } else if (col == 0) {
            top = findMinPath(grid, row -1, col, memo);
        } else {
            left = findMinPath(grid, row, col - 1, memo);
            top = findMinPath(grid, row -1, col, memo);
        }

        int min = left;
        if (left > top) {
            min = top;
        }

        int result = min + grid[row][col];
        memo[row][col] = result;
        return result;
    }
}