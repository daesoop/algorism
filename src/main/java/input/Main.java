package input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 1 && a <= 100) {
            for (int i = 1; i <= a; i++) {
                System.out.println();
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
            }
        }
    }
}
