package programers.level2;

import java.util.Stack;

public class StockTime {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        Solution1 solution = new Solution1();
        solution.solution(prices);
    }
}

class Solution1 {

    public void solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int num = 0;
            if (i < prices.length - 1) {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[i] <= prices[j] && i != prices.length) {
                        num++;
                    } else if (prices[i] > prices[j] && i == prices.length) {
                        break;
                    }
                }
            }
            answer[i] = num;
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}