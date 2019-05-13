package programers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevelopFunction {
    public static void main(String[] args) {
        int[] progress = {93, 30, 55, 60, 40, 65};
        int[] speeds = {1, 30, 5 , 10, 60, 7};
        Solution10 solution = new Solution10();
        solution.solution(progress, speeds);
    }
}

class Solution10 {
    public int[] solution(int[] progress, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < progress.length; i++) {
            int count = 0;

            while (progress[i] < 100) {
                progress[i] += speeds[i];
                count++;
            }
            days.add(count);
        }

        int max = days.poll();
        int count = 1;
        while (!days.isEmpty()) {
            if (max < days.peek()) {
                max = days.peek();
                ans.add(count);
                count = 1;
                days.poll();
            } else if (max >= days.peek()) {
                count++;
                days.poll();
            }
            if (days.isEmpty()) {
                ans.add(count);
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
