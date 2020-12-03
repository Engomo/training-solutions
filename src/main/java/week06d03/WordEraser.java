package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word) {
        String[] splitted = words.split(" ");
        StringBuilder result = new StringBuilder();
        for (String item : splitted) {
            if (!item.equals(word)) {
                result.append(item + " ");
            }
        }
        return result.toString().trim();
    }
}
