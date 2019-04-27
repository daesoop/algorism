package programers.level2;

import java.util.ArrayList;
import java.util.List;

public class BiggestNumber {
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        int[] numbers = {6, 2, 10};
        System.out.println(solution.solution(numbers));
    }
}

class Solution7 {
    public String solution(int[] numbers) {
        List<String> num = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            num.add(String.valueOf(numbers[i]));
        }
        num.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num.size(); i++) {
            stringBuilder.append(num.get(i));
        }
        return stringBuilder.toString();
    }
}
