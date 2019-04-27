package programers.level2;

import java.util.Arrays;
import java.util.HashMap;

public class PhoneNumberArray {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        String[] str = {"12232332", "12", "222222"};
        solution.solution(str);
    }
}

class Solution6{

    public boolean solution(String[] str) {
        boolean bo = true;
        String low = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < low.length()) {
                low = str[i];
            }
        }
        for (int i = 1; i < str.length; i++) {
            if (str[i].startsWith(low)) {
                bo = false;
            }
        }
        System.out.println(bo);
        return bo;
    }
}

class AnotherPerson {
    class Solution {
        public boolean solution(String[] phone_book) {
            Arrays.sort(phone_book);
            for (int i = 0; i < phone_book.length-1; i++) {
                if (phone_book[i].length() < phone_book[i+1].length()) {
                    if (phone_book[i].equals(phone_book[i+1].substring(0, phone_book[i].length()))) return false;
                } else  if (phone_book[i+1].equals(phone_book[i].substring(0, phone_book[i+1].length()))) return false;
            }
            return true;
        }
    }
}
