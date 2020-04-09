package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring2 {
    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        String s = "dvdf";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}

class Solution11 {

    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        if (s.equals("")) {
            return 0;
        }
        answer = check(s);


        return answer;
    }

    public int check(String s) {
        int max = 0;
        String[] arr = s.split("");
        List<String> set = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (!set.contains(arr[j])) {
                    set.add(arr[j]);
                } else if (set.contains(arr[j])) {
                    break;
                }
            }
            if (max < set.size()) {
                max = set.size();
            }
            set.removeAll(set);
        }
        return max;
    }
}
