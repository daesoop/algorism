package programers.summerCoding;

public class intactSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(8, 12));
    }
}

class Solution {
    private int gcd = 0;
    private int w = 0;
    private int h = 0;

    public int solution(int w, int h) {
        int answer = 0;
        this.w = w;
        this.h = h;

        gcd();
        System.out.println("block : " + block());

        return answer;
    }

    private int block() {
        int block = 0;
        block = (this.w/this.gcd) + (this.h/this.gcd - 1);
        return block;
    }

    private int calculate() {
        int num = 0;
        int block = block();

        return num;
    }
    public void gcd() {
        int num = 0;
        if (this.w > this.h) {
            num = this.w;
        } else if (this.w < this.h) {
            num = this.h;
        }

        for (int i = num; 1 < i; i--) {
            if ((this.w % i == 0) && (this.h % i == 0)) {
                this.gcd = i;
                break;
            }
        }
    }

}