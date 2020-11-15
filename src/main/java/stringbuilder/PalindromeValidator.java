package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        str = str.trim();

        StringBuilder sb = new StringBuilder(str);
        return str.equalsIgnoreCase(sb.reverse().toString());
    }
}
