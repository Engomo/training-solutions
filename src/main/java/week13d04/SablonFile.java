package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SablonFile {

    private List<Employee> employeeList = List.of(new Employee("John Doe", 1980), new Employee("Jane Doe", 1992));

    public String readFromFile(Path path, List<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();
            for (Employee e : employees) {
                sb.append(repalceNameAndYear(line, e));
            }

        } catch (IOException e) {
            throw new IllegalArgumentException("Can't read file.", e);
        }
        return sb.toString();
    }

    private String repalceNameAndYear(String line, Employee employee) {
        line = line.replace("{nev}", employee.getName());
        line = line.replace("{ev}", Integer.toString(employee.getYearOfBirth()));
        return line + "\n";
    }

    public static void main(String[] args) {
        SablonFile sablonFile = new SablonFile();
        System.out.println(sablonFile.readFromFile(Path.of("sablon.txt"), Arrays.asList(new Employee("John Doe", 1980), new Employee("Jane Doe", 1992))));
    }
}
