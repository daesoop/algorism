package programers.level1;

import java.lang.reflect.Array;
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
        for (int i = 0; i < command.length; i++) {
            int start = command[i][0];
            int end = command[i][1];
            int k = command[i][2];

            int tmp[] = new int[end - start + 1];
            int tmpLength = 0;

            for (int j = start - 1; j < end; j++) {
                tmp[tmpLength] = arr[j];
                tmpLength++;
            }
            Arrays.sort(tmp);
            answer[i] = tmp[k - 1];
        }
        return answer;
    }

}

class kFail{

    public int[] solution(int[] arr, int[][] command) {
        int[] answer = new int[command.length];
        int temp_length = 0;
        int answer_length = 0;
        for (int i = 0; i < command.length; i++) {
            int[] tmp = new int[command[i][1] - command[i][0] + 1];
            for (int j = command[i][0]; j < command[i][1]; j++) {
                tmp[i] = command[i][j];
                temp_length++;
            }
            Arrays.sort(tmp);
            answer[answer_length] = tmp[command[i][2]];
            answer_length++;
        }
        return answer;
    }

}

