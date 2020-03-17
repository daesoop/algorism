package backjoon.hanoi;

import java.awt.image.BandedSampleModel;
import java.util.Scanner;

public class Hanoi1914 {
    int answer = 0;
    public static void main(String[] args) {
        Hanoi1914 hanoi1914 = new Hanoi1914();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's getting on");
        int num = scanner.nextInt();

        hanoi1914.moveHanoi("1", "2", "3", num);
        hanoi1914.result();
    }

    private void moveHanoi(String first, String center, String last, int num) {
        if (1 == num) {
            ++ answer;
            System.out.println(num + " = " + first + " - > " + last);
        } else {
            moveHanoi(first, last, center, num - 1);
            ++ answer;
            System.out.println(num + " = " + first + " - > " + last);
            moveHanoi(center, first, last, num - 1);

        }
    }

    private void result() {
        System.out.println("answer : " + answer);
    }
}
