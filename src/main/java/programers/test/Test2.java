package programers.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String compressed = "pp2(c2(a))";

        System.out.println("final : " + solution.solution(compressed));
    }
}

class Solution2 {

    private Queue<String> queue = new LinkedList<>();
    private Stack<Integer> stack = new Stack<>();
    String rest = "";
    StringBuilder answer = new StringBuilder();
    String num = "";

    public String solution(String compressed) {
        String[] str = compressed.split("()");

        //queue 생성
        for (int i = 0; i < str.length; i++) {
            queue.add(str[i].toLowerCase());
        }

        //Queue<String>이 비워질 때까지 while()
        while (!queue.isEmpty()) {
            //checkChar(숫자와 문자 비교);
            if (checkChar(queue.peek())) {
                Integer.parseInt(queue.peek());
                num += queue.poll();
            } else if (!checkChar(queue.peek())) {
                //"(" 라면 앞의 숫자가 있기 때문에 while문 생성
                if (queue.peek().equals("(")) {
                    queue.poll();
                    stack.push(Integer.parseInt(num));
                    this.num = "";
                    whileMoon();
                    // while문으로 들어가지 않는 문자 집어넣기
                } else if (!queue.peek().equals(")")) {
                    answer.append(queue.poll());
                }
            }
        }
        return answer.toString();
    }

    //재귀 문
    private String whileMoon() {

        String sentence = "";

        while (!stack.isEmpty()) {
            if (checkChar(queue.peek())) {
                num = "";
                num += queue.poll();
                rest += sentence;
            } else if (!checkChar(queue.peek())) {
                if (queue.peek().equals(")")) {
                    queue.poll();
                    int number = stack.pop();

                    if (!stack.isEmpty()) {
                        rest += forMoon(sentence, number);
                        sentence = "";
                    } else {
                        if (!sentence.equals("")) {
                            rest += sentence;
                        }
                        answer.append(forMoon(rest, number));
                        rest = "";
                        sentence = "";
                    }
                } else if (queue.peek().equals("(")) {
                    queue.poll();
                    if (!num.equals("")) {
                        stack.push(Integer.parseInt(num));
                    } else {
                        sentence += queue.poll();
                        break;
                    }
                    this.num = "";
                    whileMoon();
                } else {
                    sentence += queue.poll();
                    System.out.println("sentence : " + sentence);
                }
            }
        }
        return answer.toString();
    }

    //checkChar(숫자와 문자 비교);
    private boolean checkChar(String charactor) {
        try {
            Integer.parseInt(charactor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    //문자 저장
    private String forMoon(String str, int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
