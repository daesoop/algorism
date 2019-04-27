package programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        Solution8 solution = new Solution8();
        System.out.println(solution.solution(scoville, k));
    }
}

class Solution8 {
    public int solution(int[] scoville, int k) {
        int answer = 0;
        Arrays.sort(scoville);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        while (true) {
            if (pq.peek() >= k) {
                break;
            } else if (pq.size() == 1) {
                return -1;
            }
            pq.add(pq.poll() + (pq.poll() * 2));
            answer++;
        }
        return answer;
    }
}
