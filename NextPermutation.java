class Solution {
    public int[] nextPermutation(int[] nums) {
        // start from tail to head
        // if any is smaller than pointer, swap
        // if reached head, swap

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(i, j, nums);
        }

        reverse(i + 1, nums);

        return nums;
    }

    private void reverse(int start, int[] nums) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(i, j, nums);
            i++;
            j--;
        }
    }

    private void swap(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}