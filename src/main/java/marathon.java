import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class marathon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"mislav", "mislav", "stanko", "ana" };
        String[] completion = {"mislav", "stanko", "ana"};
        System.out.println(solution.solution(participant, completion));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {

            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }
}