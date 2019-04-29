package programers.level2;

public class Country124 {
    public static void main(String[] args) {
        int i = 7;
        Solution9 solution = new Solution9();
        System.out.println(solution.solution(i));
    }
}

class Solution9 {
    public String solution(int num) {
        String answer = "";

        while (num > 0) {
            int rest = num % 3;
            num = num / 3;

            if (rest == 0) {
                num -= 1;
                rest = 4;
            }
            answer = rest + answer;
        }
        return answer;
    }
}

