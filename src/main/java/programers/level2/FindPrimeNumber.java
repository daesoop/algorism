package programers.level2;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumber {
    public static void main(String[] args) {
        String str = "17";
        Solution15 solution = new Solution15();
        solution.solution(str);
    }
}

class Solution15{
    public int solution(String str) {
        int answer = 0;

        String[] nums = str.split("");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(Integer.parseInt(nums[i]));
        }

        for (int i = 0; i < list.size(); i++) {

        }

        return 0;
    }
}
