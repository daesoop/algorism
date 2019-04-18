package programers.level1;

public class findSosu {
    public static void main(String[] args) {
        int i = 5;
        Solution9 solution = new Solution9();
        System.out.println(solution.solution(i));
    }
}
class Solution9 {
    public int solution(int num) {
        int result = 0;
        for (int i = 2; i <= num; i++) {
            boolean right = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    right = false;
                    break;
                }
            }
            if(right) {
                result++;
            }
        }
        return result;
    }
}
