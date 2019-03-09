public class twoNumberSideSum {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        Solution7 solution = new Solution7();
        System.out.println(solution.solution(a, b));
    }
}

class Solution7 {
    public long solution(int a, int b) {
        int size = Math.abs(a - b) + 1;
        long[] arr = new long[size];
        int aa = 0;
        long answer = 0;
        if (a < b) {
            aa = a;
            for (int i = 0; i < size; i++) {
                arr[i] = aa;
                aa++;
            }
        } else if (a > b) {
            aa = b;
            for (int i = 0; i < size; i++) {
                arr[i] = aa;
                aa++;
            }
        } else if (a == b) {
            arr[0] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}