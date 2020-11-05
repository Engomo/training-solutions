package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Józsi", 1990);
        Employee employee2 = new Employee("Karcsi", 1991);
        Employee employee3 = new Employee("Béla", 1992);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        Employee Józsi = company.findEmployeeByName("Józsi");
        System.out.println(Józsi.getName() + " " + Józsi.getYearOfBirth());

        List<String> names = company.listEmployeeNames();
        System.out.println(names);
    }
}
