package leetCode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        System.out.println(solution.intToRoman(49));
    }
}

class Solution7{
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                answer.append(strs[i]);
            }
        }

        return answer.toString();
    }

    private void parse() {

    }
}
