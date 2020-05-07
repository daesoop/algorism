package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PlusOne {
    public static void main(String[] args) {

        Solution22 solution = new Solution22();
        int[] digits = {2,4,9,3,9};
        solution.plusOne(digits);
    }
}

class Solution22 {

    boolean plus = false;

    public int[] plusOne(int[] digits) {

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            stack.add(digits[i]);
        }

        if (stack.size() == 1 && stack.peek() == 9) {
            stack.pop();
            list.add(0);
            list.add(1);
        } else if (stack.peek() == 9 ) {
            plus = true;
            list.add(0);
            stack.pop();
        } else if (stack.peek() != 9) {
            list.add(stack.pop() + 1);
        }

        while (!stack.empty()) {
            if (plus) {
                if (stack.peek() == 9) {
                    list.add(0);
                    stack.pop();
                    plus = true;
                    if (plus && stack.empty()) {
                        list.add(1);
                    }
                } else {
                    plus = false;
                    list.add(stack.pop() + 1);
                }
            } else {
                list.add(stack.pop());
            }
        }

        int[] answer = new int[list.size()];
        int num = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            answer[num] = list.get(i);
            System.out.println(answer[num]);
            num++;
        }
        return answer;
    }

}