package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Józsi", 2015,225000);

        employee.raiseSalary(25000);
        System.out.println(employee.toString());
    }
}
