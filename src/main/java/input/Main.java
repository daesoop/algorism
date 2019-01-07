package input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();
        String[] str = b.split(",");
        int max = 0;
        int[] value = new int[a];
        int values = 0;
        int[] num = new int[a];
        int average = 0;
        if(a != str.length) {
            return;
        }
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < a; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        for (int i = 0; i < a; i++) {
            values += num[i] / max * 100;
        }
        System.out.println(num[0] / max * 100);
        System.out.println(num[1] / max * 100);
        System.out.println(num[2] / max * 100);
        System.out.println(max);
        System.out.println(values);
        System.out.println(values / a);
    }
}
