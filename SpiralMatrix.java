class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int count = 1;
        int[][] result = new int[n][n];

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result[top][i]=count;
                count++;
            }
            for (int i = top+1; i<= bottom; i++) {
                result[i][right]=count;
                count++;
            }
            for (int i = right-1; i>=left; i--) {
                result[bottom][i]=count;
                count++;
            }
            for (int i = bottom-1; i>top; i--) {
                result[i][left]=count;
                count++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        return result;
    }
}