package programers.test;

public class  GCD {
    public static void main(String[] args) {
        int first = 8;
        int second = 12;
        testGcd gcd = new testGcd();
        System.out.println(gcd.gcd(first, second));

    }
}

class testGcd {

    public long gcd(int w, int h) {
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

