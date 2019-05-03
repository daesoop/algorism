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
        for (int i = 0; i < num.length; i++) {
            if (length < num[i]) {
                bo = false;
            }
        }
        return bo;
    }
}
