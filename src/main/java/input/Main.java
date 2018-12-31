package input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i >= 1; i--) {
            if (i != a) {
                System.out.println();
            }
            for (int j = a - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
