package programers.level1;

public class MiddleLetter {
    public static void main(String[] args) {
        String s = "qwer";
        Solution8 solution = new Solution8();
        System.out.println(solution.solution(s));
    }
}
class Solution8 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        if (str.length % 2 == 0) {
            answer += str[str.length / 2 - 1];
            answer += str[str.length / 2 ];
        } else if (str.length % 2 != 0) {
            answer = str[(int) (str.length / 2 + 0.5)];
        }
        return answer;
    }
}
