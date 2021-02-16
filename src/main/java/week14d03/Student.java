package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private Map<String, List<Integer>> subjectMap = new HashMap<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Map<String, List<Integer>> getSubjectMap() {
        return subjectMap;
    }

    public String getName() {
        return name;
    }

    public void addMark(String subject, Integer mark) {
        if (!subjectMap.containsKey(subject)) {
            subjectMap.put(subject, new ArrayList<>());
        }
        subjectMap.get(subject).add(mark);
    }
}
