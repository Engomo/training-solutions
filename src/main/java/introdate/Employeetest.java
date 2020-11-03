package introdate;

import java.sql.SQLOutput;

public class Employeetest {
    public static void main(String[] args) {
        Employee employee = new Employee(1992,07,19,"Kőszegi László");

        System.out.println(employee.getName() + "\n" + employee.getDateOfBirth() + "\n" + employee.getBeginEmployment());
    }
}
