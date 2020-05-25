package backjoon;

import java.util.Scanner;

public class Factorial10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("num!!");
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}


