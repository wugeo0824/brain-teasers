import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        step(result, nums, new ArrayList(), 0);
        return result;
    }

    private void step(List<List<Integer>> result, int[] nums, List<Integer> tempList, int start) {
        result.add(new ArrayList(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(i);
            step(result, nums, tempList, start + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}