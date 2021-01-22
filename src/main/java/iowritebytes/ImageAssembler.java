package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {

    public void makeImageFile(byte[][] imageparts, Path folder) {
        Path file = folder.resolve("image.png");

        try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (byte[] part : imageparts) {
                bos.write(part);
            }
        }catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }
}
