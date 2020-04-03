package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterPhoneNumber {
    public static void main(String[] args) {
        Solution15 solution = new Solution15();
        String s = "23";
        solution.letterCombinations(s);
    }
}

class Solution15 {
    private Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    String str = "";

    public List<String> letterCombinations(String s) {
        List<String> list = new ArrayList<>();
        String[] digits = s.split("");
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            str += String.valueOf(phone.get(digits[i]).charAt(digits[i].length()));
        }
        String check = "";

        while (check.equals(str)) {

            if (num == s.length()) {
                addLast(list, digits[num]);
            }

        }

        return list;
    }

    private void addLast(List<String> list, String digit) {
        for (int i = 0; i < digit.length(); i++) {
            str += digit.charAt(i);
            list.add(str);
            str.substring(str.length() - 1);
        }
        str = "";
    }

    private String addStr() {
        return "";
    }
}
