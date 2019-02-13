package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            List<Integer> num = new ArrayList<>();
            String[] str = scanner.nextLine().split("");
            int all = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("X")) {
                    num.add(0);
                }
                else if (str[j].equals("O") && j != 0) {
                    num.add(num.get(j - 1) + 1);
                }
                else if (str[0].equals("O")) {
                    num.add(1);
                }
            }
            for (int j = 0; j < num.size(); j++) {
                all += num.get(j);
            }
            System.out.println(all);
        }
    }
}
