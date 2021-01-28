package week13d03;

public class Teacher {
    private String name;
    private String subject;
    private String division;
    private int hoursInWeeks;

    public Teacher(String name, String subject, String division, int hoursInWeeks) {
        this.name = name;
        this.subject = subject;
        this.division = division;
        this.hoursInWeeks = hoursInWeeks;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getDivision() {
        return division;
    }

    public int getHoursInWeeks() {
        return hoursInWeeks;
    }
}
