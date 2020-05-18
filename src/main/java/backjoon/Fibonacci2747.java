package backjoon;

import java.util.Scanner;

public class Fibonacci2747 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("put number in");
        int num = scanner.nextInt();
        int answer = 0;
        int n1 = 0;
        int n2 = 1;
        answer = n1 + n2;
        int n3 = 0;
        for (int i = 1; i < num; i++) {
            n3 = addNum(n1, n2);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);
    }

    public static int addNum(int n1, int n2) {
        return n1 + n2;
    }
}
