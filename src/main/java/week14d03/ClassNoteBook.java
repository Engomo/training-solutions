package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassNoteBook {

    private List<Student> students = new ArrayList<>();

    public List<Student> getOrderedStudentList() {
        List<Student> result = new ArrayList<>(students);
        Collections.sort(result, Comparator.comparing(Student::getName));
        return result;
    }
}
