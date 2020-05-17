package leetCode;

public class JumpGame {
    public static void main(String[] args) {
        Solution26 solution = new Solution26();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(solution.canJump(nums));
    }
}

class Solution26 {
    public boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) {
                return true;
            }
        }

        return false;
    }

    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums);
    }
}
