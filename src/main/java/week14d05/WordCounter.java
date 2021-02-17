package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public Map<String, Integer> countWords(BufferedReader reader, String... words) {
        Map<String, Integer> result = new HashMap<>();
        String line;
        try {
            processLine(reader, result, words);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file.", ioe);
        }
        return result;
    }

    private void processLine(BufferedReader reader, Map<String, Integer> result, String[] words) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            for (String word : words) {
                if (line.toLowerCase().contains(word)) {
                    generateMap(result, word);
                }
            }
        }
    }

    private void generateMap(Map<String, Integer> result, String word) {
        if (!result.containsKey(word)) {
            result.put(word, 1);
        } else {
            result.put(word, result.get(word) + 1);
        }
    }
}
