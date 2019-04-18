package programers.level1;

import java.util.Arrays;

public class K {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution4 solution = new Solution4();
        System.out.println(solution.solution(arr, command));
    }

    @Override
    public String toString() {
        return "programers.level1.K{}";
    }
}

class Solution4 {
    public int[] solution(int[] arr, int[][] command) {
        int[] answer = new int[command.length];
        int temp_length = 0;
        int answer_length = 0;
        for (int i = 0; i < command.length; i++) {
            int[] tmp = new int[command[i][1] - command[i][0] + 1];
            for (int j = command[i][0]-1; j < command[i][1]; j++) {
                tmp[i] = command[i][j];
                temp_length++;
            }
            Arrays.sort(tmp);
            answer[answer_length] = tmp[command[i][2]-1];
            answer_length++;
        }
        return answer;
    }

}

