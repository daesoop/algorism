package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {

        Solution22 solution = new Solution22();
        int[] digits = {1,2,9};
        solution.plusOne(digits);
    }
}

class Solution22 {
    List<Integer> headInteger = new ArrayList<>();

    public int[] plusOne(int[] digits) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits.length - 1 == i) {
                this.headInteger = parse(digits[i]);
                for (int j = 0; j < this.headInteger.size(); j++) {
                    list.add(this.headInteger.get(j));
                }
            } else {
                list.add(digits[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            answer[i] = list.get(i);
        }
        return answer;
    }

    public List<Integer> parse(int digit) {
        List<Integer> list = new ArrayList<>();
        String s = String.valueOf(digit + 1);
        for (int i = 0; i < s.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        return list;
    }
}