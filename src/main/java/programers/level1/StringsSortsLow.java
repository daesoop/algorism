package programers.level1;

import java.util.*;

public class StringsSortsLow {
    public static void main(String[] args) {
        String str = "Zbcdefg";
        Solution16 solution = new Solution16();
        System.out.println(solution.solution(str));
    }
}

class Solution16 {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        String[] strings = str.split("");
        Arrays.sort(strings);
        Collections.reverse(Arrays.asList(strings));
        for (int i = 0; i < strings.length; i++) {
            answer.append(strings[i]);
        }
        return answer.toString();
    }
}
