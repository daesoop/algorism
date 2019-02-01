package input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] str = scanner.nextLine().split(" ");
            int strNum = Integer.parseInt(str[0]);
            String[] strings = str[1].split("");
            for (int k = 0; k < str[1].length(); k++) {
                for (int j = 0; j < strNum; j++) {
                    stringBuilder.append(strings[k]);
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}