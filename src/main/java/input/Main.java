package input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A <= 100000) {
            for (int i = A; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }
}
