package leetCode;


import java.util.Stack;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "babad";
        Solution14 solution = new Solution14();
        solution.longestPalindrome(s);
    }

}

class Solution14 {
    public String longestPalindrome(String s) {
        String answer = "";
        int max = 0;
        String bs = "";
        Stack<String> stack = new Stack<>();
        String[] strings = s.split("");
        for (int i = 0; i < strings.length - 1; i++) {
            bs = strings[i];
            for (int j = i; j < strings.length; j++) {

            }
        }
        return answer;
    }
}
