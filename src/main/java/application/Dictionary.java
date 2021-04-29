package application;

import java.util.*;

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

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            words.add(word);
        }
        dictionary.put(word, translation);
    }

    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }


}
