package backjoon.sort;

import java.util.Scanner;

public class SortInside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        String[] arr = num.split("");
        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < numArr.length; i++) {
            for (int j = i; j < numArr.length; j++) {
                if (numArr[i] < numArr[j]) {
                     int tmp = numArr[j];
                     numArr[j] = numArr[i];
                     numArr[i] = tmp;
                }
            }
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
