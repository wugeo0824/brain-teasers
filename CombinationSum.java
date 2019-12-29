import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, new ArrayList<Integer>(), result);

        return result;
    }

    private void backtrack(
        int[] candidates,
        int target,
        int index,
        int sum,
        List<Integer> temp,
        List<List<Integer>> result) {

        if (sum > target) {
            return;
        }

        if (sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (sum < target) {
            for (int i = index; i < candidates.length; i++) {
                int current = candidates[i];

                temp.add(current);
                backtrack(candidates, target, i+1, sum + current, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }
}