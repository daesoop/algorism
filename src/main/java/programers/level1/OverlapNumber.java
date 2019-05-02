package programers.level1;

import java.util.ArrayList;
import java.util.List;

public class OverlapNumber {
    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        int[] num = {1, 3, 4, 2 , 1};
        System.out.println(solution.solution(num));
    }
}

class Solution14 {
    public boolean solution(int[] num) {
        boolean bo = true;
        int length = num.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (length < num[i]) {
                bo = false;
            }
            if (i > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    System.out.println("j : " + j);
                    if (list.get(j) == num[i]) {
                        return false;
                    }
                }
            }
            list.add(num[i]);
        }

        return bo;
    }
}
