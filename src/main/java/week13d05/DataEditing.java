package week13d05;

import java.util.ArrayList;
import java.util.List;

public class DataEditing {

    public int sumOfLetters(String str) {

        List<Character> characters = new ArrayList<>();
        String lowerCaseStr = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (isEnglishLowerCaseChar(lowerCaseStr.charAt(i)) && !characters.contains(lowerCaseStr.charAt(i))) {
                characters.add(lowerCaseStr.charAt(i));
            }
        }
        return characters.size();
    }

    private boolean isEnglishLowerCaseChar(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }return false;
    }
}
