import java.util.ArrayList;
import java.util.List;

public class moiTest {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(answers));
    }
}
class Solution2 {
    public int[] solution(int[] answers) {
        int[][] arr = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5,}
        };
        int[] point = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (arr[0][i%5] == answers[i]) {
                point[0] += 1;
            }
            if (arr[1][i%8] == answers[i]) {
                point[1] += 1;
            }
            if (arr[2][i%10] == answers[i]) {
                point[2] += 1;
            }
        }
        int max = 0;
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < point.length; i++) {
            if (max < point[i]) {
                max = point[i];
            }
        }
        for (int i = 0; i < point.length; i++) {
            if (max == point[i]) {
                index.add(i + 1);
            }
        }
        int[] arr1 = new int[index.size()];
        for (int i = 0; i < index.size(); i++) {
            arr1[i] = index.get(i);
        }
        return arr1;
    }
}
