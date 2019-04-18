package programers.level1;

public class StringToInt {
    public static void main(String[] args) {
        String str = "1234";
        Solution12 solution = new Solution12();
        System.out.println(solution.solution(str));
    }
}

class Solution12 {
    public int solution(String str) {
        return Integer.parseInt(str);
    }
}