package programers.level1;

import java.util.*;

public class SortSentenceMine {
    public static void main(String[] args) {
        Solution18 solution = new Solution18();
        String[] strings = {"abce", "abcd", "cdx"};
        int num = 2;
        solution.solution(strings, num);
    }
}

class Solution18 {
    public String[] solution(String[] strings, int num) {
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(num) - o2.charAt(num);
            }
        });
        return strings;
    }
}
