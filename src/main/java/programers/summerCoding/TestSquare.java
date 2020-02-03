package programers.summerCoding;

public class TestSquare {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int w = 7;
        int h = 12;
        System.out.println(solution.solution(w, h));
    }
}

class Solution1 {
    private long gcd = 0;

    public long solution(int w, int h) {
        long wl = Long.parseLong(String.valueOf(w));
        long hl = Long.parseLong(String.valueOf(h));
        return (wl * hl) - (wl + hl - gcd(wl, hl));
    }


    public long gcd(long w, long h) {
        long small,big ;

        big = w >= h ? w : h ;
        small = w < h ? w : h ;

        while ( small != 0 ) {
            long nmg = big % small ;
            big = small;
            small = nmg;
        }
        return big;
    }
}
