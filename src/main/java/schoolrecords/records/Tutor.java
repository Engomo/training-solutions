package schoolrecords.records;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (int i = 0; i < taughtSubjects.size(); i++) {
            if(taughtSubjects.get(i).getSubjectName().equals(subject.getSubjectName())){
                return true;
            }
        }
        return false;
    }
}



