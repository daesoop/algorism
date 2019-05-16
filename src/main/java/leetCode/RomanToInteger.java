package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        String s = "MCMXCIV";
        System.out.println(solution.solution(s));
    }
}
class Solution5{

    public int solution(String s) {
        int answer = 0;
        int preNum = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I" , 1);
        map.put("V" , 5);
        map.put("X" , 10);
        map.put("L" , 50);
        map.put("C" , 100);
        map.put("D" , 500);
        map.put("M" , 1000);
        String[] strings = s.split("");
        for (int i = 0; i < s.length(); i++) {
            if (map.get(strings[i]) > preNum) {
                answer += map.get(strings[i]) - (preNum * 2);
            } else {
                answer += map.get(strings[i]);
            }
            preNum = map.get(strings[i]);
        }
        return answer;
    }
}
