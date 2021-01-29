package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Assignment {

    private List<Teacher> teacherList = new ArrayList<>();

    public void readFromFile(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String[] block = new String[4];

            while ((block[0] = br.readLine()) != null) {
                teacherList.add(separateClasses(br, block));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.", e);
        }
    }

    private Teacher separateClasses(BufferedReader br, String[] block) throws IOException {

        for (int i = 1; i < 4; i++) {
            block[i] = br.readLine();
        }
        return new Teacher(block[0], block[1], block[2], Integer.parseInt(block[3]));
    }

    public int calculateTeacherHours(String name) {
        int sum = 0;
        for (Teacher t : teacherList) {
            if (t.getName().equals(name)) {
                sum += t.getHoursInWeeks();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment();

        assignment.readFromFile("beosztas.txt");
        System.out.println(assignment.calculateTeacherHours("Csincsilla Csilla"));
    }
}


