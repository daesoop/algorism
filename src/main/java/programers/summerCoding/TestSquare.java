package programers.summerCoding;

public class TestSquare {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int w = 8;
        int h = 12;
        System.out.println(solution.solution(w, h));
    }
}

class Solution1 {
    private long gcd = 0;

    public long solution(int w, int h) {
        long wl = Long.parseLong(String.valueOf(w));
        long hl = Long.parseLong(String.valueOf(h));
        gcd(wl, hl);
        return (wl * hl) - (wl + hl -this.gcd);
    }

    private long gcd(long w, long h) {
        long num = 0;
        if (w > h) {
            num = w;
        } else if (w < h) {
            num = h;
        }

        for (long i = num; 1 < i; i--) {
            if ((w % i == 0) && (h % i == 0)) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
