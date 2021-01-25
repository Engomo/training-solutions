package week12d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secret {

    public String readSecret(Path path) {
        StringBuilder sb = new StringBuilder();

        try (InputStream is = Files.newInputStream(path)){
            byte[] buffer = new byte[1000];
            int size;
            while ((size = is.read(buffer)) > 0) {
                for (int i = 0; i < size; i++) {
                    char c = (char) (buffer[i] + 10);
                    sb.append(c);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.", e);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = new Secret().readSecret(Path.of("src/main/resources/secret.dat"));
        System.out.println(result);
    }
}