package array;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long num = 118372;
        System.out.println(solution.solution(num));
    }
}

class Solution {
    public int solution(long num) {
        int answer = 0;
//        String str = String.valueOf(num);
//        List<String> arr = Arrays.asList(str.split(""));
        int[] numarr = {1,1,8,3,7,2};
        return answer;
    }
}


class ComparetorMyInt implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 == o2) {
            return 0;
        } else {
            return 1;
        }
    }
}
