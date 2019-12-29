class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int found = find(nums, target, 0, nums.length);
        if (found == -1) {
            return new int[]{-1, -1};
        }

        int left = found;
        int right = found;
        while (left > 0 && nums[left-1] == nums[found]) {
            left--;
        }
        while (right < nums.length-1 && nums[right+1] == nums[found]) {
            right++;
        }

        return new int[]{left, right};
    }

    private int find(int[] nums, int target, int left, int right) {
        int mid =(left + right)/2;
        int value = nums[mid];
        if (target == value) {
            return mid;
        }

        if (target < value) {
            right = mid;
        } else {
            left = mid + 1;
        }

        if (left >= right) {
            return -1;
        } else {
            return find (nums, target, left, right);
        }
    }
}