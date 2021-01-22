package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Corona {

    public int sumIndexCorona() {
        Path path = Path.of("src/main/index.html");
        int sum = 0;
            try (BufferedReader reader = Files.newBufferedReader(path)) {
                String line;

                while ((line = reader.readLine()) != null) {
                    if (line.contains("koronavírus")) {
                        sum++;
                    }
                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can't read file!");
            }
            return sum;
        }

    public static void main(String[] args) {
        Corona corona = new Corona();

        System.out.println(corona.sumIndexCorona());
    }
}


