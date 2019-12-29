class Solution {
    enum Index {
        GOOD, BAD, UNKNOWN
    }

    Index[] memo;
    
    public boolean canJump(int[] nums) {

        memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;
        
        return jump(nums, 0);
    }

    private boolean jump(int[] nums, int current) {
        if (memo[current] != Index.UNKNOWN) {
            return memo[current] == Index.GOOD ? true : false;
        }

        int maxJump = nums[current];
        
        if (maxJump + current >= nums.length) {
            memo[current] = Index.GOOD;
            return true;
        }

        if (maxJump == 0) {
            memo[current] = Index.BAD;
            return false;
        }

        for (int j = maxJump; j > 0; j--) {
            if (jump(nums, current + j)) {
                memo[current + j] = Index.GOOD;
                return true;
            }
        }

        return false;
    }
}
