package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {
    public void writeTemperatures(Temperatures temperatures, String pathString) {
        try {
            Path path = Path.of(pathString);
            Files.write(path, temperatures.getData());
        } catch (IOException ex) {
            throw new IllegalArgumentException("Can't write file", ex);
        }
    }
}
