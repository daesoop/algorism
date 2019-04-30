package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJoonFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Solution1 solution = new Solution1();
        System.out.println(solution.solution(num));
    }
}

class Solution1 {
    public int solution(int num) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= num; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        answer = list.get(num);
        return answer;
    }
}
