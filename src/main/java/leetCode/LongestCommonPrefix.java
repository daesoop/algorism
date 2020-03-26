package leetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(solution.solution(strings));
    }
}

class Solution4 {
    public String solution(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
