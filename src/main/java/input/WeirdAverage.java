package input;

import java.util.Scanner;

public class WeirdAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int[] numArr = new int[num];
        double ave = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < num; i++) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
        }

        for (int i = 0; i < num; i++) {
            ave += numArr[i] * 100.0 / max;
        }
        System.out.println(ave / num);
    }
}
