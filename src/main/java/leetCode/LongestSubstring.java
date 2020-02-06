package leetCode;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String s = "dvdf";
        solution.solution(s);
    }
}

class Solution2 {
    public int solution(String s) {
        int answer = 0;
        Queue<String> queue = split(s);
        answer = beforeRepetition(s.length(), queue);
        System.out.println("answer : " + answer);
        return answer;
    }

    private Queue<String> split(String string) {
        Queue<String> strings = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            strings.add(String.valueOf(string.charAt(i)));
        }
        return strings;
    }

    private int beforeRepetition(int length, Queue<String> stack) {
        Set<String> strings = new HashSet<>();
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (!strings.contains(stack.peek())) {
                strings.add(stack.poll());
            } else {
                if (max < strings.size()) {
                    max = strings.size();
                }
                strings = new HashSet<>();
                strings.add(stack.poll());
            }
            if (i == length - 1) {
                if (max < strings.size()) {
                    max = strings.size();
                }
            }
        }
        return max;
    }
}
