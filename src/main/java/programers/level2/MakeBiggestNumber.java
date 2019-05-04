package programers.level2;

public class MakeBiggestNumber {
    public static void main(String[] args) {
        String number = "1924";
        Solution12 solution = new Solution12();
        System.out.println(solution.solution(number, 2));
    }
}
class Solution12{
    public String solution(String number, int k) {
        String answer = "";
        int length = number.length() - k;
        String[] strArr = number.split("");
        for (int i = 0; i < number.length(); i++) {

        }
        return answer;
    }
}
