package programers.level2;

import java.util.*;

public class Printers {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int[] priorities1 = {2, 1, 3, 2};
        int location = 2;
        Solution11 solution11 = new Solution11();
        System.out.println("answer : " + solution11.solution(priorities, location));
    }
}

class Solution11 {

    public int solution(int[] priorities, int location) {
        Queue<Printer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Printer(priorities[i], i));
        }

        int answer = 0;
        Arrays.sort(priorities);

        int max = 0;
        int last = priorities.length - 1;

        while (!queue.isEmpty()) {
            max = priorities[last];
            if (location == queue.peek().position) {
                if (max == queue.peek().getNum()) {
                    answer++;
                    return answer;
                } else if (max > queue.peek().getNum()) {
                    queue.add(new Printer(queue.peek().num, queue.peek().position));
                    queue.poll();
                }
            } else {
                if (max == queue.peek().getNum()) {
                    answer++;
                    last--;
                    queue.poll();
                } else if (max > queue.peek().getNum()) {
                    queue.add(new Printer(queue.peek().num, queue.peek().position));
                    queue.poll();
                }
            }
        }
        return answer;
    }
}

class Printer {
    int num;
    int position;

    public Printer(int num, int position) {
        this.num = num;
        this.position = position;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
