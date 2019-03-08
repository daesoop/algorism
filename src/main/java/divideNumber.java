import java.util.Arrays;

public class divideNumber {
    public static void main(String[] args) {
        int[] num = {3, 2, 6};
        int divisor = 10;
        Solution6 solution = new Solution6();
        System.out.println(Arrays.toString(solution.solution(num, divisor)));
    }
}

class Solution6 {
    public int[] solution(int[] num, int divisor) {
        int current = 0;
        int[] answer = new int[num.length];
        int[] fal = new int[1];
        for (int i = 0; i < num.length; i++) {
            if (num[i] % divisor == 0) {
                answer[current] = num[i];
                current++;
            }
        }
        int[] ans = new int[current];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = answer[i];
        }
        if (current == 0) {
            fal[0] = -1;
            return fal;
        }
        Arrays.sort(ans);
        return ans;
    }
}