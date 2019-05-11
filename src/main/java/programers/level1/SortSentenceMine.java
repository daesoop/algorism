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
        String[] answer = new String[strings.length];
        Map<String, String> map = new HashMap();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            String[] str = strings[i].split("");
            if (map.containsKey(str[num])) {
                list.add(str[num]+str[num]);
                map.put(list.get(i), strings[i]);
            } else {
                list.add(str[num]);
                map.put(list.get(i), strings[i]);
            }
        }
        Collections.sort(list);

        for (int i = 0; i < strings.length; i++) {
            answer[i] = map.get(list.get(i));
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}