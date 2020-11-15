package stringconcat.employee;

public class Employee {
    private String name;
    private int salary;
    private String job;

    public Employee(String name, String job, int salary) {
        if (isEmpty(name)){
            throw new IllegalArgumentException("Name must not be empty.");
        }
        if (isEmpty(job)) {
            throw new IllegalArgumentException("Job must not be empty.");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return name + " - " + job + " - " + salary + " Ft";
    }

    public boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
