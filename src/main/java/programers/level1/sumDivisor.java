package programers.level1;

public class sumDivisor {
    public static void main(String[] args) {
        int num = 5;
        Solution11 solution = new Solution11();
        System.out.println(solution.solution(num));
    }
}

class Solution11 {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        int[] numArr = new int[num];
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
               numArr[count] = i;
               count++;
            }
        }
        for (int i = 0; i < numArr.length; i++) {
            answer += numArr[i];
        }
        return answer;
    }
}