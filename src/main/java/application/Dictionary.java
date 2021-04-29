package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;
    private List<String> words;

    public Dictionary() {
        this.dictionary = new HashMap<>();
        this.words = new ArrayList<>();
    }

    public String get(String word) {
        return this.dictionary.get(word);
    }


}
