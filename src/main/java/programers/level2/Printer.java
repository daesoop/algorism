package programers.level2;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int[] priorities1 = {2, 1, 3, 2};
        int location = 0;
        Solution11 solution11 = new Solution11();
        System.out.println("answer : " + solution11.solution(priorities, location));
    }
}

class Solution11 {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int lastSortNum = priorities.length - 1;
        boolean boo = false;

        // 가장 큰 수를 찾기 위해 리스트에 값들 넣어주기
        for (int i = 0; i < priorities.length; i++) {
            list.add(priorities[i]);
        }

        //우선 순위를 만들어야 하기 때문
        Arrays.sort(priorities);
        int max = priorities[lastSortNum];
        int i = 0;

        while (!boo) {
            if (i % priorities.length == location % priorities.length && list.get(i) == max) {
                answer++;
                break;
            } else if (list.get(i) == max) {
                answer++;
                lastSortNum--;
                max = priorities[lastSortNum];
            } else if (list.get(i) < max) {
                list.add(list.get(i));
            }
            i++;
        }
        return answer;
    }
}
