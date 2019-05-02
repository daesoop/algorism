package programers.level1;

import java.util.*;

public class NumberSplitPriority {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        int num = 18395;
        System.out.println(solution.solution(num));
    }
}
class Solution13{
    public String solution(int num) {
        String str = String.valueOf(num);
        String[] strArr = str.split("");
        int[] numArr = new int[strArr.length];
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numArr.length; i++) {
            list.add(Integer.parseInt(strArr[i]));
        }
        Collections.sort(list, new CompareNumb());
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }

        return stringBuilder.toString();
    }
}

class CompareNumb implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}
