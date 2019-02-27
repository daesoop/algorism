public class marathon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"leo","kiki","eden"};
        String[] completion = {"eden","kiki"};
        System.out.println(solution.solution(participant, completion));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    completion[j] = null;
                }
            }
        }
        return answer;
    }
}