class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }

        int max = nums[0];
        int bestSoFar = nums[0];

        for (int i = 1; i< nums.length; i++) {
            int sum = bestSoFar + nums[i];
            if (sum > nums[i]) {
                bestSoFar = sum;
            } else {
                bestSoFar = nums[i];
            }
            if (bestSoFar > max) {
                max = bestSoFar;
            }
        }

        return max;
    }
}