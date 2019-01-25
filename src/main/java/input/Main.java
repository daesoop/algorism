package input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split("");
            int count = 0;
            int sum = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("O")) {
                    count++;
                    sum = sum + count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}