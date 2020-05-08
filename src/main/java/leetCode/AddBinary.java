package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddBinary {
    public static void main(String[] args) {
        Solution23 solution = new Solution23();
        String a = "11";
        String b = "1";
        solution.addBinary(a, b);
    }
}

class Solution23 {
    Stack<Integer> aStack = new Stack<>();
    Stack<Integer> bStack = new Stack<>();

    public String addBinary(String a, String b) {

        boolean plusOne = false;
        StringBuilder sb = new StringBuilder();
        int max = 0;

        for (int i = 0; i < a.length(); i++) {
            aStack.add(Integer.valueOf(String.valueOf(a.charAt(i))));
        }

        for (int i = 0; i < b.length(); i++) {
            bStack.add(Integer.valueOf(String.valueOf(b.charAt(i))));
        }

        List<String> list = new ArrayList<>();

        if (aStack.size() >= bStack.size()) {
            max = aStack.size();
        } else {
            max = bStack.size();
        }
        int i = 0;
        while (i < max) {
            int aNum = 0;
            int bNum = 0;

            if (!aStack.empty()) {
                aNum = aStack.pop();
            }
            if (!bStack.empty()) {
                bNum = bStack.pop();
            }

            if (plusOne) {
                if (aNum + bNum == 2) {
                    list.add("1");
                } else if (aNum + bNum == 1) {
                    list.add("0");
                } else if (aNum + bNum == 0) {
                    plusOne = false;
                    list.add("1");
                }
            } else {
                if (aNum + bNum == 2) {
                    list.add("0");
                    plusOne = true;
                } else if (aNum + bNum == 1) {
                    list.add("1");
                    plusOne = false;
                } else if (aNum + bNum == 0) {
                    list.add("0");
                    plusOne = false;
                }
            }
            i++;
        }
        if (plusOne) {
            list.add("1");
        }

        for (int j = list.size() - 1; j >= 0; j--) {
            sb.append(list.get(j));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
