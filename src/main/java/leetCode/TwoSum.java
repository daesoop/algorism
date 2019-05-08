package leetCode;

public class TwoSum {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] nums = {2,7,11,15};
        int target = 9;
        solution1.twoSum(nums, target);
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}