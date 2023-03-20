package WordCounter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
    }

    public static Map<String, Integer> wordFrequency(String[] words) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        return wordFrequency;
    }
}