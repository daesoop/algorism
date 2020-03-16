package programers.level2;


import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public static void main(String[] args) {
        Solution25 solution = new Solution25();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution.solution(clothes));
    }
}

class Solution25 {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
            } else {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }
        }

        for (String keys : map.keySet()) {
            answer *= map.get(keys) + 1;
        }

        answer -= 1;
        return answer;
    }
}
