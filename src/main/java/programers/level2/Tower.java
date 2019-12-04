package programers.level2;

public class Tower {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        int[] height = {1,5,3,6,7,6,5};
        solution20.solution(height);
    }
}

class Solution20 {
    public int[] solution(int[] height) {
        int[] answer = new int[height.length];
        for (int i = height.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (height[i] < height[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}
