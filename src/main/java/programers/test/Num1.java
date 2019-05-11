package programers.test;

import java.util.ArrayList;
import java.util.List;

public class Num1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {2,3,4,4,2,1,3,1};
        System.out.println(solution.solution(num));
    }
}

class Solution {
    public int solution(int[] num) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            int sum = list.get(i);
            if (list.get(i) < 4 && list.size() - 1 == i) {
                count++;
            } else if (list.get(i) < 4) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (sum + list.get(j) == 4) {
                        count++;
                        list.remove(j);
                        break;
                    } else if (sum < 4 && j == list.size() - 1) {
                        System.out.println(12341234);
                        count++;
                    }
                }
            } else if (list.get(i) == 4) {
                count++;
            }
        }
        return count;
    }
}
