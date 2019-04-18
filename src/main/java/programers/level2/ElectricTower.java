package programers.level2;

import java.util.Stack;

public class ElectricTower {
    public static void main(String[] args) {
        int[] answer = {6, 9, 5, 7, 4};
        Solution solution = new Solution();
        System.out.println(solution.solution(answer));
    }

}

class Solution {

    public int[] solution(int[] height) {

        int max = height[height.length - 1];
        int[] answer = new int[height.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            stack.push(height[i]);
        }

        for (int i = height.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (height[i] < height[j]) {
                    answer[i] = j + 1;
                    break;
                }
                if (height[i] >= height[j] && j == 0) {
                    answer[i] = 0;
                    break;
                }
            }
        }

        answer[0] = 0;
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}