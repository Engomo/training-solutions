package timesheet;

import activity.Report;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Company {

    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();


    public Company(InputStream employeesFile, InputStream projectsFile) {

        try (BufferedReader employeeReader = new BufferedReader(new InputStreamReader(employeesFile))) {
            String line;
            while ((line = employeeReader.readLine()) != null) {
                String[] name = line.split(" ");
                employees.add(new Employee(name[0], name[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read employees.", ioe);
        }

        try (BufferedReader projectsReader = new BufferedReader(new InputStreamReader(projectsFile))) {
            String line;
            while ((line = projectsReader.readLine()) != null) {
                projects.add(new Project(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read employees.", ioe);
        }
    }


    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        timeSheetItems.add(new TimeSheetItem(employee, project, beginDate, endDate));
    }

    public List<ReportLine> calculateProjectByNameYearMonth(String employeeName, int year, int month) {
        int i = 0;
        boolean found = false;
        List<TimeSheetItem> filteredTSItemsByName;
        List<ReportLine> report = new ArrayList<>();
        Map<String, Integer> pPairs = new HashMap<>();

        for (Project project : projects) {
            report.add(new ReportLine(project, 0L));
            pPairs.put(project.getName(), i++);
        }

        for (Employee employee1: employees) {
            if (employee1.getName().equals(employeeName)) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new IllegalArgumentException();
        }

        filteredTSItemsByName = timeSheetItems.stream().filter((timeSheetItem) ->
                timeSheetItem.getEmployee().getName().equals(employeeName) &&
                timeSheetItem.getBeginDate().getYear() == year &&
                timeSheetItem.getBeginDate().getMonthValue() == month).collect(Collectors.toList());

        for (TimeSheetItem timeSheetItem : filteredTSItemsByName) {
            String pName = timeSheetItem.getProject().getName();
            report.get(pPairs.get(pName)).addTime(timeSheetItem.hoursBetweenDates());
        }

        return report;
    }

    public void printToFile(String employeeName, int year, int month, Path file) {
        String rLine = employeeName + "\t" + year + "-" + String.format("%02d", month) + "\t";
        List<ReportLine> reportLines;
        int totalHours = 0;

        reportLines = calculateProjectByNameYearMonth(employeeName,year,month);
        for(ReportLine reportLine : reportLines) {
            totalHours += reportLine.getTime();
        }

        rLine += totalHours + "\n";

        for (ReportLine reportLine : reportLines) {
            if (reportLine.getTime() != 0) {
                rLine += reportLine.getProject().getName() + "\t" +
                        reportLine.getTime() + "\n";
            }
        }

        try {
            Files.writeString(file, rLine);
        } catch (IOException ioe) {
            throw new IllegalStateException();
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Project> getProjects() {
        return new ArrayList<>(projects);
    }

    public List<TimeSheetItem> getTimeSheetItems() {
        return timeSheetItems;
    }
}
