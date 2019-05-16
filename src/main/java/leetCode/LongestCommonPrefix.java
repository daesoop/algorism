package leetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        String[] strings = {"flower","flow","flight"};
        System.out.println(solution.solution(strings));
    }
}

class Solution4{
    public String solution(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
