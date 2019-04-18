package programers.level1;

import java.util.Scanner;

public class sosu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        String[] strArr = str.split(" ");
        int sosu = 0;
        int[] numArr = new int[num];
        for (int i = 1; i <= strArr.length; i++) {
            numArr[i - 1] = Integer.parseInt(strArr[i - 1]);
            for (int j = 1; j <= numArr[i - 1]; j++) {
                if (numArr[i - 1] % j == 0) {
                    sosu++;
                }
            }
        }
        System.out.println(sosu);
    }
}
