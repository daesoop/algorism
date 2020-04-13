package leetCode;

import java.util.Arrays;

public class ThreeSumCloset {

    public static void main(String[] args) {
        Solution18 solution = new Solution18();

        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(solution.threeSumClosest(nums, target));
    }
}

class Solution18 {
    public int threeSumClosest(int[] nums, int target) {
        int answer = 0;
        Arrays.sort(nums);
        int distance;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) { return sum; }

                distance = Math.abs(target - sum);
                if (distance < minDistance) {
                    minDistance = distance;
                    answer = sum;
                }

                if (sum < target) {
                    ++j;
                } else {
                    --k;
                }
            }
        }

        return answer;
    }
}
