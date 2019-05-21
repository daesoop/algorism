package programers.level1;

import java.util.ArrayList;
import java.util.List;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {10};
        Solution19 solution = new Solution19();
        solution.solution(arr);
    }
}

class Solution19{
    public int[] solution(int[] arr) {
        int min = arr[0];
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
