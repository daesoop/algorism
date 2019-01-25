import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num1193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> result = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                for (int j = i; j >= 1; j--) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((i - j + 1));
                    sb.append("/");
                    sb.append(j);

                    result.add(sb.toString());
                }
            } else {

                for (int j = i; j >= 1; j--) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    sb.append("/");
                    sb.append((i - j + 1));

                    result.add(sb.toString());
                }
            }

        }
        sc.close();
        System.out.println(result.get(n - 1));
    }
}