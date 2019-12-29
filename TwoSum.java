import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap();

        for (int i = 0; i< nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int x = 0; x< nums.length; x++) {
            int complement = target - nums[x];
            if (indices.containsKey(complement) && indices.get(complement) != x) {
                return new int[]{x, indices.get(complement)};
            }
        }

        return new int[]{-1, -1};
    }
}