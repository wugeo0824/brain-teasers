class Solution {
    public void rotate(int[][] matrix) {
        // 1 2 3
        // 4 5 6
        // 7 8 9

        int n = matrix.length;

        // transpose the matrix
        // 1 4 7
        // 2 5 8
        // 3 6 9

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // swap left with right
        // 7 4 1
        // 8 5 2
        // 9 6 3
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n / 2; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][n - 1 - c];
                matrix[r][n - 1 - c] = temp;
            }
        }
    }
}