class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);

        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = length - 1;
            int target = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == target) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while(low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return result;
    }
}