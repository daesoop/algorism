package programers.kakao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EasyCompact {
    public static void main(String[] args) {
        Solution27 solution = new Solution27();
        String s = "aabbaccc";
        System.out.println(solution.solution(s));
    }
}

class Solution27{

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int num = 1;
        String str = "";
        List<String> splitList = Arrays.asList(s.split(""));
        Queue<String> queue = new LinkedList<>(splitList);

        str = queue.poll();
        while (!queue.isEmpty()) {
            if (queue.peek().equals(str)) {
                queue.poll();
                num++;
            } else if (!queue.peek().equals(str)) {
                addString(answer, num, str);
                num = 1;
                str = queue.poll();
            }
            if (queue.isEmpty()) {
                addString(answer, num, str);
            }
        }

        return answer.toString();
    }

    private void addString(StringBuilder answer, int num, String str) {
        if (num > 1) {
            answer.append(num);
        }
        answer.append(str);
    }
}
