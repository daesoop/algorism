package programers.level2;

import java.util.Stack;

public class StockTime {
    public static void main(String[] args) {
        int[] prices = {498, 501, 470, 489};
        Solution1 solution = new Solution1();
        solution.solution(prices);
    }
}

class Solution1 {

    public void solution(int[] prices) {
        int[] answer = new int[prices.length];
        int num = 0;
        for (int i = 0; i < prices.length; i++) {
            num = 1;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j] || j == prices.length - 1) {
                    answer[i] = num;
                    break;
                }
                num++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

class stack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int[] num = {111,22,344,455};
        for (int i = 0; i < num.length; i++) {
            stack.push(num[i]);
        }
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}