
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int[] priorities1 = {2,1,3,2};
        int location = 0;
        PrinterTest printerTest = new PrinterTest();
        System.out.println(printerTest.solution(priorities, location));
    }
}

class PrinterTest{
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int out = 0;
        Queue<Integer> priority = new PriorityQueue<Integer>(priorities.length, new Compare());
        Queue<Integer> real = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            priority.add(priorities[i]);
            real.add(priorities[i]);
        }

        while (!priority.isEmpty()) {
            int wait = priority.peek();
            int line = real.peek();
            if (wait == line) {
                answer++;
                real.remove();
                priority.add(wait);
                priority.remove();
                if (out%priorities.length == location) {
                    break;
                }
                out++;
            } else {
                real.add(line);
                real.poll();
                out++;
            }
        }
        return answer;
    }
}

class Compare implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}