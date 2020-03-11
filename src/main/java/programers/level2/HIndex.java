package programers.level2;


import leetCode.ReverseInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HIndex {
    public static void main(String[] args) {
        Solution16 solution = new Solution16();
        int[] num = {1545, 1126, 323, 1, 2345,12,63};
        System.out.println(solution.solution(num));
    }
}

class Solution16{

    public int solution(int[] num) {
        Arrays.sort(num);
        int answer = 0;
        int averageH = 0;
        int averageD = 0;

        for (int i = num.length - 1; i >= 0; i--) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] <= num[j]) {
                    averageD++;
                }
                if (num[i] >= num[j]) {
                    averageH++;
                }
            }
            if (averageD == num[i]) {
                return averageD;
            } else if (averageH == num[i]) {
                return averageH;
            }
            averageD = 0;
            averageH = 0;
        }
        return answer;
    }

    public int solution2(int[] num) {
        Arrays.sort(num);
        int answer = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("num[i] : " + num[i]);
            int over = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] <= num[j]) {
                    over++;
                }
            }
            if (over == num[i]) {
                answer = num[i];
                break;
            }
        }
        return answer;
    }
}
