package backjoon;

import java.util.*;

public class Treasure {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        Collections.sort(a);
        Collections.sort(b);
        Collections.reverse(b);

        for (int i = 0; i < n; i++) {
            answer += a.get(i) * b.get(i);
        }

        System.out.println("answer : " + answer);

    }

}
