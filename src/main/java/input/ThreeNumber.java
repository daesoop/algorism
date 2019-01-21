package input;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] parse = str.split(" ");
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(parse[i]);
        }
        Arrays.sort(num);

        System.out.println(num[1]);
    }
}
