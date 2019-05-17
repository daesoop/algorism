package leetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        int num = 52341;
        System.out.println(solution.solution(num));
    }
}

class Solution6{
    public long solution(int x) {
        long reverse = 0;
        int nums = x;
        while(nums != 0) {
            reverse = reverse * 10 + (nums % 10);
            nums /= 10;
            if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return reverse;
    }
}
