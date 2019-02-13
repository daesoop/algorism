package Array;

import java.util.Scanner;

public class NumberOfWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().trim().split(" ");
        System.out.println(str.length);
    }
}
