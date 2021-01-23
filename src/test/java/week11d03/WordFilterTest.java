package week11d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithChar() {
        List<String> words = List.of("alma", "bab", "körte", "malac", "ubi");

        WordFilter wordFilter = new WordFilter();

        assertEquals(List.of("alma", "bab","malac"), wordFilter.wordsWithChar(words, 'a'));
    }
}