package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int num = 0;
        System.out.println(solution.solution(num));
    }
}
class Solution3{
    public boolean solution(int num) {
        List<String> list = new ArrayList<>();
        boolean answer = false;
        if (num < 0) {
            return false;
        }
        String str = String.valueOf(num);
        StringBuilder str2 = new StringBuilder();
        String[] strings = str.split("");
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            str2.append(list.get(i));
        }

        if (str.equals(str2.toString())) {
            answer = true;
        }
        return answer;
    }
}