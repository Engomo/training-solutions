package week13d05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataEditing {

    public int sumOfLetters(String str) {

        Set<Character> characters = new HashSet<>();
        String lowerCaseStr = str.toLowerCase();

        for (char c : lowerCaseStr.toCharArray()) {
            if (isEnglishLowerCaseChar(c)) {
                characters.add(c);
            }
        }
        return characters.size();
    }

    private boolean isEnglishLowerCaseChar(char c) {
        return (c >= 'a' && c <= 'z');
    }
}
