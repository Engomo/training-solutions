package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        String line;
        StringWriter sw = new StringWriter();
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < Integer.parseInt(line); i++) {
                sw.write("*");
            }
            sw.write("\n");
        }
        return sw.toString();
    }
}
