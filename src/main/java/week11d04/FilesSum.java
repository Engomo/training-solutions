package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public String getFileName(int i) {
        return "number" + (i < 10 ? "0" + i : i) + ".txt";
    }

    public int sumNumbers() {
        int sum = 0;

        for (int i = 0; i < 100; i++) {

            String fileName = getFileName(i);

            if (Files.isRegularFile(Path.of(fileName))) {
                int content = readFromFile(fileName);
                sum += content;
            }
        }
        return sum;
    }

    public int readFromFile(String fileName) {

        int content;

        try {
            content = Integer.parseInt(Files.readString(Path.of(fileName)));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
        return content;
    }

    public static void main(String[] args) {
        System.out.println(new FilesSum().sumNumbers());
    }
}
