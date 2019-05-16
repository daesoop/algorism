package leetCode;

public class RomanToInteger {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        String s = "IV";
        System.out.println(solution.solution(s));
    }
}
class Solution5{

    public int solution(String s) {
        String[] strings = s.split("");
        int answer = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("I")) {
                System.out.println("I");
                answer += 1;
            } else if (strings[i].equals("V")) {
                System.out.println("V");
                answer += 5;
            } else if (strings[i].equals("X")) {
                answer += 10;
            } else if (strings[i].equals("L")) {
                answer += 50;
            } else if (strings[i].equals("C")) {
                answer += 100;
            } else if (strings[i].equals("D")) {
                answer += 500;
            } else if (strings[i].equals("M")) {
                answer += 1000;
            }
        }
        return answer;
    }
}
