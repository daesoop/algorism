package programers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class marathon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"mislav", "mislav", "stanko", "ana" };
        String[] completion = {"mislav", "stanko", "ana"};
        System.out.println(solution.solution(participant, completion));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        for (int i = 0; i < participant.length; i++) {
            if (!map.containsKey(participant[i])) {
                map.put(participant[i], 1);
            } else if (map.containsKey(participant[i])) {
                map.put(participant[i], map.get(participant[i]) + 1);
            }
        }
        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i] ,map.get(completion[i]) - 1);
        }
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                answer = s;
            }
        }
        return answer;
    }
}