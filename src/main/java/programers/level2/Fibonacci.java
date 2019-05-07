package programers.level2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        int num =31;
        System.out.println(solution.solution(num));
    }
}

class Solution14 {
    public long solution(int num) {
        long answer = 0;
        if (num < 2) {
            answer = num;
        } else {
            answer = solution(num - 1) + solution(num - 2);
        }
        return answer;
    }
}
