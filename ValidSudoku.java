import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row ++) {
            for (int col = 0; col < 9; col ++) {
                char number = board[row][col];
                if (number != '.' && (
                    !seen.add(number + "in row " + row) ||
                    !seen.add(number + "in col " + col) ||
                    !seen.add(number + "in block" + row/3 + col/3))) {
                        return false;
                    }
            }
        }

        return true;
    }
}