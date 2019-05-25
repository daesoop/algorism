package leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class SortColors {

    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        int[] nums = {2,0,2,1,1,0};
        solution.solution(nums);
    }
}

class Solution10 {
    public void solution(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] >= nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
