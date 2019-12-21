package programers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SaveBoat {
    public static void main(String[] args) {
        int[] arr = {70, 50, 80};
        int limit = 100;
        Solution22 solution = new Solution22();
        System.out.println(solution.solution(arr, limit));
    }
}

class Solution22 {
    List<Integer> list = new ArrayList<>();
    Boolean bo = false;
    int sum = 0;
    int answer = 0;

    public int solution(int[] people, int limit) {
        parse(people);
        onTheBoat(limit);
        return answer;
    }

    public void parse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

    private void onTheBoat(int limit) {
        List<Integer> boat = new ArrayList<>();
        int i = 0;
        while (!bo) {
            if (sum + list.get(i) <= limit && !boat.contains(i)) {
                boat.add(i);
                sum += list.get(i);
                for (int j = i + 1; j < list.size(); j++) {
                    if (sum + list.get(j) <= limit && !boat.contains(j)) {
                        boat.add(j);
                        sum += list.get(j);
                    }
                }
            answer++;
            }
            //list를 다 돌면 break
            sum = 0;
            if (i == list.size() - 1) {
                bo = true;
                break;
            }
            i++;
        }
    }
}
