package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String s = "III";
        solution.solution(s);
    }
}
class Solution2{
    public int solution(String s) {
        List<Integer> list = new ArrayList<>();
        int answer = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                list.add(answer);
                System.out.println(i);
                System.out.println(s.charAt(i));
                answer = 1;
            } else if (s.charAt(i) != s.charAt(i - 1)) {
                answer++;
            }
            if (i == s.length() - 1) {
                list.add(answer);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return answer;
    }
}
