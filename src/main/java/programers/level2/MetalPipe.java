package programers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MetalPipe {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        String str = "()(((()())(())()))(())";
        System.out.println("answer : " + solution.solution(str));
    }
}

class Solution17 {

    int answer = 0;
    String pre = "";

    public int solution(String str) {
        String[] strings = str.split("");
        Queue<String> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < strings.length; i++) {
            queue.add(strings[i]);
        }
        int i = 0;

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " : ");
            if (queue.peek().equals("(")) {
                pre = queue.poll();
                answer++;
                stack.push(i);
                i++;
            } else if (queue.peek().equals(")")) {
                if (pre.equals("(")) {
                    stack.pop();
                    answer--;
                    answer += stack.size();
                } else if (pre.equals(")")) {
                    i--;
                    stack.pop();
                }
                pre = queue.poll();
            }
            System.out.println(answer);
        }
        return answer;
    }
}

