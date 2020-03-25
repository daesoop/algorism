package programers.level2;

public class Tile {
    public static void main(String[] args) {
        Solution26 solution = new Solution26();
        int n = 4;
        System.out.println(solution.solution(n));
    }
}

class Solution26{

    public int solution(int n) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            // 숫자가 너무 커지는 것을 방지하기 위해 나머지를 구한다.
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return b;
    }
}
