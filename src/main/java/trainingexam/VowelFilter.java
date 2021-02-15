package trainingexam;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VowelFilter {

    private final String VOWELS = "aáeéiíoóöőuúüűAÁEÉIÍOÓÖŐUÚÜŰ";

    public String filterVowels(BufferedReader reader) {
    StringBuilder sb = new StringBuilder();
    String line;
    try {
        while ((line = reader.readLine()) != null) {
            processLine(sb, line);
        }
    }catch (IOException ioe) {
        throw new IllegalStateException("Something wnt wrong.", ioe);
    }
    return sb.toString();
    }

    private void processLine(StringBuilder sb, String line) {
        for (Character c : line.toCharArray()) {
            if (!VOWELS.contains(c.toString())) {
                sb.append(c);
            }
        }
        sb.append("\n");
    }

    public static void main(String[] args) {
        VowelFilter vowelFilter = new VowelFilter();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("vowels.txt"))) {
            System.out.println(vowelFilter.filterVowels(reader));
        } catch (IOException e) {
            throw new IllegalStateException("Wrong");
        }


    }
}
