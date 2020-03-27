package leetCode;

public class RemoveElement {

    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(solution.solution(nums, val));
    }
}

class Solution12 {

    public int solution(int[] nums, int val) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[answer] = nums[i];
                answer++;
            }
        }

        for (int i = 0; i < answer; i++) {
            System.out.println(nums[i]);
        }

        return answer;
    }

}
