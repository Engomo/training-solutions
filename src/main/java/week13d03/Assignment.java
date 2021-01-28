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
            String line;

            while ((line = br.readLine()) != null) {
                separateClasses(br);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.", e);
        }
    }

    private void separateClasses(BufferedReader br) throws IOException {
        String name = br.readLine();
        String subject = br.readLine();
        String division = br.readLine();
        int hours = Integer.parseInt(br.readLine());
        teacherList.add(new Teacher(name, subject, division, hours));
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


