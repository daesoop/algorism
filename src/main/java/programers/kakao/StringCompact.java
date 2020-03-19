package programers.kakao;

import java.util.*;

public class StringCompact {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aabbaccc";
        System.out.println(solution.solution(s));
    }
}

class Solution {

    public int solution(String s) {

        List<Integer> compareNumbers = new ArrayList<>();
        List<String> list = split(s);


        for (int i = 1; i < s.length(); i++) {
            compareNumbers.add(parse(list, i));
        }
        compareNumbers.add(s.length());

        Collections.sort(compareNumbers);
        return compareNumbers.get(0);
    }

    private int parse(List<String> list, int i) {
        int num = 1;
        String str = "";
        StringBuilder compare = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for (int j = 0; j < i; j++) {
            str += list.get(j);
        }

        for (int j = i; j < list.size(); j++) {
            compare.append(list.get(j));
            if (j % i == i - 1) {
                if (str.equals(compare.toString())) {
                    num++;
                } else if (!str.equals(compare.toString())) {
                    if (num > 1) {
                        answer.append(num);
                    }
                    answer.append(str);
                    num = 1;
                    str = compare.toString();
                }
                if (j == list.size() - 1) {
                    if (num > 1) {
                        answer.append(num);
                    }
                    answer.append(str);
                }
                compare.delete(0, i);
            }
            if (j == list.size() -1 && compare.toString().length() > 0) {
                if (num > 1) {
                    answer.append(num);
                }
                answer.append(str);
                answer.append(compare.toString());
            }
        }

        return answer.toString().length();
    }

    private List<String> split(String s) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }
        return list;
    }
}
