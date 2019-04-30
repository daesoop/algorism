package programers.level2;

import java.util.ArrayList;
import java.util.List;

public class DevelopFunction {
    public static void main(String[] args) {
        int[] progress = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        Solution10 solution = new Solution10();
        solution.solution(progress, speeds);
    }
}

class Solution10 {
    public int[] solution(int[] progress, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int max = 0;
        int cnt = 0;
        int length = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < progress.length; i++) {
            int num = progress[i];
            int time = 0;
            while (num < 100) {
                num += speeds[i];
                time++;
            }
            list.add(time);
        }

        max = list.get(0);
        cnt++;
        for (int i = 1; i < list.size(); i++) {
            System.out.println("i : " + i);
            if (list.get(i) > max && i == list.size() - 1) {
                answer.add(cnt);
                length++;
                max = list.get(i);
                answer.add(1);

            } else if (list.get(i) <= max) {
                cnt++;
            } else if (list.get(i) <= max && i == list.size()) {
                cnt++;
                answer.add(cnt);
            } else if (list.get(i) > max &&  i < list.size() - 1) {
                answer.add(cnt);
                length++;
                max = list.get(i);
                cnt = 1;
            }
        }
        int[] answer1 = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answer1[i] = answer.get(i);
        }
        return answer1;
    }
}
