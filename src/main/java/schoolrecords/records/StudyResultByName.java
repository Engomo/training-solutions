package schoolrecords.records;

public class StudyResultByName {
    private String studentName;
    private double studyAvarge;

    public StudyResultByName(String studentName, double studyAvarge) {
        this.studentName = studentName;
        this.studyAvarge = studyAvarge;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAvarge;
    }
}
