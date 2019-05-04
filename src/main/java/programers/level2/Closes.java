package programers.level2;

public class Closes {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        int i = 5;
        int[] lost = {2,4};
        int[] reverse = {3};
        System.out.println(solution.solution(i, lost, reverse));
    }
}

class Solution13 {

    public int solution(int num, int[] lost, int[] reverse) {
        int answer = num;
        for (int i = 0; i < lost.length; i++) {
            boolean bo = false;
            for (int j = 0; j < reverse.length; j++) {
                if (reverse[j] - lost[i] == 1) {
                    lost[i] = -1;
                    reverse[j] = -1;
                    bo = true;
                } else if (lost[i] - reverse[j] == 1) {
                    lost[i] = -1;
                    reverse[j] = - 1;
                    bo = true;
                }
            }
            if (!bo) {
                answer--;
            }
        }
        return answer;
    }
}
