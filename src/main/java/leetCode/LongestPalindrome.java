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

        if (s == null || "".equals(s)) {
            return s;
        }

        int len = s.length();

        String answer = "";
        int max = 0;

        boolean[][] dp = new boolean[len][len];

        for (int j = 0; j < len; j++) {

            for (int i = 0; i <= j; i++) {

                boolean judge = s.charAt(i) == s.charAt(j);

                dp[i][j] = j - i > 2 ? dp[i + 1][j - 1] && judge : judge;

                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    answer = s.substring(i, j + 1);
                }
            }
        }
        return answer;
    }
}
