import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        Integer num = new Integer(17); // 박싱
        int n = num.intValue();        // 언박싱
        System.out.println(n);

        Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱
        char c = ch;        // char c = ch.charValue();           : 오토언박싱
        System.out.println(c);

    }
}

