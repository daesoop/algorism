package programers.level2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SummerCodingEngilsh {
    public static void main(String[] args) {
        Solution18 solution = new Solution18();
        String[] str = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        solution.solution(3, str);
    }

}

class Solution18 {
    public void solution(int i, String[] str) {
        int num = 0;
        Set<String> strings = new HashSet<>();
        for (int j = 0; j < str.length; j++) {
            strings.add(str[i]);
            num++;
        }
        Iterator it = strings.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
