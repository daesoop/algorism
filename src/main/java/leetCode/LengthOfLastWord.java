package leetCode;

import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution24 solution = new Solution24();
        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s));
    }
}

class Solution24 {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        if ( strArr.length == 0) {
            return 0;
        }
        if (strArr.length == 1) {
            return strArr[0].length();
        }
        String str = strArr[strArr.length - 1];
        return str.length();
    }
}
