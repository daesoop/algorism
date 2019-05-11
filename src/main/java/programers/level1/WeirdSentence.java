package programers.level1;

import java.util.ArrayList;
import java.util.List;

public class WeirdSentence {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        String sentence = "try hello world";
        System.out.println(solution.solution(sentence));
    }
}

class Solution17{
    public String solution(String sentence) {
        StringBuilder answer = new StringBuilder();
        String[] str = sentence.trim().split(" ");
        for (int i = 0; i < str.length; i++) {
            String[] arr = str[i].split("");
            for (int j = 0; j < arr.length; j++) {
                if (j % 2 == 0) {
                    answer.append(arr[j].toUpperCase());
                } else {
                    answer.append(arr[j].toLowerCase());
                }
            }
            if (i != str.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
