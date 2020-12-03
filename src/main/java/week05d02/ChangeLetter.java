package week05d02;

public class ChangeLetter {
    public String changeVowels(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ("aeiou".contains(str.substring(i, i + 1))){
                builder.append("*");
            }
            else {
                builder.append(str.substring(i, i + 1));
            }
        }
        return builder.toString();
    }
}