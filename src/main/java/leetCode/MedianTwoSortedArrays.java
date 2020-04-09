package leetCode;

import java.util.ArrayList;
import java.util.List;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        int[] num1 = {1, 3, 6};
        int[] num2 = {2, 4, 5};
        System.out.println(solution.solution(num1, num2));
    }
}

class Solution17 {

    public double solution(int[] num1, int[] num2) {
        double answer = 0;

        List<Double> list = new ArrayList<>();
        sort(num1, num2, list);
        int half = list.size() / 2;
        System.out.println("half : " + half);
        if (list.size() % 2 == 0) {
            answer = (list.get(half) + list.get(half - 1)) / 2;
        } else {
           answer = list.get(list.size() / 2);
        }
        return answer;
    }

    private void sort(int[] num1, int[] num2, List<Double> list) {
        for (int i = 0; i < num1.length; i++) {
            list.add(Double.valueOf(num1[i]));
        }
        for (int i = 0; i < num2.length; i++) {
            list.add(Double.valueOf(num2[i]));
        }

        list.sort(Double::compareTo);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list : " + list.get(i));
        }
    }

}
