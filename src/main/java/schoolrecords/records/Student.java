package schoolrecords.records;

import java.util.ArrayList;
import java.util.List;


public class Student {


    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;

    }

    public void grading(Mark mark){
        if (mark == null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage(){
        double sum = 0.0;
        for (int i = 0; i < marks.size(); i++) {
            sum += marks.get(i).getMarkType().getValue();
        }

        return Math.round((sum / marks.size()) * 100) / 100.0;
    }

    public double calculateSubjectAverage(Subject subject){
        double sum = 0.0;
        int count = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += mark.getMarkType().getValue();
                count++;
            }
        }
        return Math.round((sum / count) * 100) / 100.0;
    }

    public boolean isEmpty(String str) {
        return str == null ||"".equals(str.trim());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String toString = getName();
        for (int i = 0; i < marks.size(); i++) {
            toString += " marks: " + marks.get(i).getSubject().getSubjectName()
                    + ": " + marks.get(i).getMarkType().getDescription()
                    + "(" + marks.get(i).getMarkType().getValue() + ")";
        }
        return toString;
    }
}
