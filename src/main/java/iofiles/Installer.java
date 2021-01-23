package iofiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Installer {

    public void install(String installFolder) {
        Path target = Path.of(installFolder);
        if (!Files.exists(target) || !Files.isDirectory(target)) {
            throw new IllegalArgumentException("The given directory doesn't exist");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/install/install.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.endsWith("/")) {
                    Files.createDirectories(target.resolve(line));
                }else {
                    Files.copy(this.getClass().getResourceAsStream("/install/" + line), target.resolve(line), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }catch (IOException e) {
            throw new IllegalStateException("Cannot copy files.", e);
        }
    }
}
