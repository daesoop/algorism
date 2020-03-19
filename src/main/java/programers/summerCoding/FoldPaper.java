package programers.summerCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FoldPaper {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int n = 4;
        System.out.println(solution.solution(n));
    }
}
class Solution3{

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < list.size(); j++) {
                stack.add(list.get(j));
            }
            list.add(0);
            while (!stack.isEmpty()) {
                if (stack.pop() == 0) {
                    list.add(1);
                } else {
                    list.add(0);
                }
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            arr[i] = list.get(i);
        }
        return arr;
    }

}
