package programers.level1;

import javax.xml.soap.SAAJResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StirngLengthTrim {
    public static void main(String[] args) {

        String str = "W 4s d2a3";
        length(str);
    }

    private static void length(String str) {
        int max = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            int current = str.charAt(i);

            if (current == 32) {
                continue;
            }

           if (current >= 48 && current <= 57) {
                max += current - 48;
                continue;
            }

            answer.append(String.valueOf((char)current).toUpperCase());
        }
        answer.append(max);
        System.out.println(answer);
    }
}
