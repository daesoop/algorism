package programers.level2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HIndex {
    public static void main(String[] args) {
        Solution16 solution = new Solution16();
        int[] num = {0,6,3,1,5};
        System.out.println(solution.solution(num));
    }
}

class Solution16{

    public int solution(int[] num) {
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
