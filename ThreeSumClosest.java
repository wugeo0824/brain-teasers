class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[length-1];

        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = length - 1;
            while (low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if (sum == target) {
                    return target;
                }

                if (sum < target) {
                    low++;
                } else {
                    high--;
                }

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
            }
        }

        return closest;
    }
}