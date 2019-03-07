import java.util.Arrays;

public class differentNumber {
    public static void main(String[] args) {
        int[] num = {1, 1, 3, 3, 0, 1, 1};
        Solution5 solution = new Solution5();
        System.out.println(Arrays.toString(solution.solution(num)));
    }
}

class Solution5 {
    public int[] solution(int[] num) {
        int[] answer = new int[num.length];
        int current = 0;
        for (int i = 0; i < answer.length; i++) {
            if (i == 0) {
                answer[current] = num[i];
                current++;
            } else if (i != 0 && answer[current - 1] != num[i]) {
                answer[current] = num[i];
                current++;
            }
        }
        int[] ans = new int[current];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = answer[i];
        }
        return ans;
    }

}