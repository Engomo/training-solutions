package stringscanner;

import java.util.InputMismatchException;
import java.util.Scanner;


public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        Scanner scanner;
        if (isEmpty(delimiter)) {
            scanner = new Scanner(intString);
        } else {
            scanner = new Scanner(intString).useDelimiter(delimiter);
        }
        return calculateSumWhitScanner(scanner);
    }


    private int calculateSumWhitScanner(Scanner scanner) {
        int sum = 0;
        while (scanner.hasNext()) {
            try {

                sum += scanner.nextInt();
            } catch (InputMismatchException ime) {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        return sum;
    }

    public int readAndSumValues(String intString){
        Scanner scanner = new Scanner(intString);
        return calculateSumWhitScanner(scanner);
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if(isEmpty(text) || word == null || "".equalsIgnoreCase(word)){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

    try(Scanner scanner = new Scanner(text)){
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains(word)) {
                sb.append(line);
                sb.append("\n");
            }
        }
        return sb.toString().trim();
    }

    }

    public boolean isEmpty(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        return false;
    }
}
