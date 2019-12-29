class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {
            int shortWall = height[left];
            if (height[right] < shortWall) {
                shortWall = height[right];
            }
            int water = (right - left) * shortWall;
            if (water > max) {
                max = water;
            }
            if (height[left] > height[right]) {
                right --;
            } else {
                left ++;
            }
        }

        return max;
    }
}