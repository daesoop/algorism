package practiceSplit;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

public class Word {

    private String word = "";
    private int count = 0;

    public Word(String word) {
        this.word = word;
        count++;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
