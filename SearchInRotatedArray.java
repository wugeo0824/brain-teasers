class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) /2;

            int pivot = nums[mid];
            // if mid and target are not on the same side
            if ((nums[mid] < nums[0]) != (target < nums[0])) {
                pivot = target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            if (pivot < target) {
                low = mid + 1;
            } else if (pivot > target) {
                high = mid;
            } else {
                return mid;
            }
        }

        if (nums[low] == target) {
            return low;
        } else {
            return -1;
        }
    }
}