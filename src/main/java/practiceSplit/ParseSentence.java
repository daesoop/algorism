package practiceSplit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseSentence {


    private Map<String, Integer> words = new HashMap<>();

    public void parse(String[] sentence) {

        for (int i = 0; i < sentence.length; i++) {
            String[] strArr = sentence[i].split(" ");
            for (int j = 0; j < strArr.length; j++) {
                words.put(strArr[i], 1);
            }
        }
    }
}
