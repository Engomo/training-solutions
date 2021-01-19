package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {
    public void newMark(Path file, int mark){
        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(mark));
            }
        }catch (IOException ex) {
            throw new IllegalStateException("Can't write file", ex);
        }
    }

    public void average(Path file) {
        try {
            List<String> marks = Files.readAllLines(file);
            double sum = 0;
            for (String str : marks) {
                sum += Double.parseDouble(str);
            }
            Files.writeString(file, "average: " + (sum / marks.size()), StandardOpenOption.APPEND);
        }catch (IOException ex) {
            throw new IllegalStateException("Can't write file", ex);
        }
    }
}
