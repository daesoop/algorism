package practiceSplit;

import java.util.ArrayList;
import java.util.List;

public class CountingWords {

    public static void main(String[] args) {
        String[] sentence = {"i am a boy", "i am not girl"};
        ParseSentence parseSentence = new ParseSentence();
        parseSentence.parse(sentence);
    }
}
