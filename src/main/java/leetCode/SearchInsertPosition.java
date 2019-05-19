package leetCode;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution8 solution = new Solution8();
        int[] nums = {1,3,5,6};
        System.out.println(solution.searchInsert(nums, 2));
    }
}

class Solution8 {
    public int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
            count++;
        }
        return count;
    }
}