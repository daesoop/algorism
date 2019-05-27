package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < num; i++) {
            String string = scanner.next();
            int count = 0;
            for (int j = 0; j < string.length(); j++) {
                String[] arr = string.split("");
                stack.push(arr[j]);
                while (!stack.isEmpty()) {
                    if (stack.peek().equals("(")) {
                        count++;
                        stack.pop();
                    } else if (stack.peek().equals(")")) {
                        count--;
                        stack.pop();
                    }
                }
            }
            if (count == 0) {
                System.out.println("YES");
            } else if (count != 0) {
                System.out.println("NO");
            }
        }
    }
}