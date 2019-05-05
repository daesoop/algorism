package programers.level2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        int num =31;
        System.out.println(solution.solution(num));
    }
}

class Solution14 {
    public int solution(int num) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        if (num >= 2) {
            for (int i = 2; i <= num; i++) {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
        }
        System.out.println("list : " + list.get(num));
        if (list.get(num) < 1234567) {
            System.out.println("working");
            answer = list.get(num) % 1234567;
        } else if (list.get(num) > 1234567) {
            System.out.println("asdf");
            answer = 1234567 % list.get(num);
        }
        return answer;
    }
}
