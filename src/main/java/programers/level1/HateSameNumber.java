package programers.level1;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {
    public static void main(String[] args) {
         int[] num = {1,1,3,3,0,1,1};
         Solution15 solution = new Solution15();
         solution.solution(num);
    }
}

class Solution15{
    public List<Integer> solution(int[] num) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                answer.add(num[i]);
            }
            if (i > 0 && num[i - 1] != num[i]) {
                answer.add(num[i]);
            }
        }
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
        return answer;
    }
}
