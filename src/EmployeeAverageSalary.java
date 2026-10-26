
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeAverageSalary {
    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 60000),
                new Employee("Charlie", "HR", 55000)
        );

        // Group employees by department
        // Calculate average salary for each department
        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(
                                        Employee::getSalary
                                )
                        ));

        // Print the result
        System.out.println(
                "Average Salary by Department: "
                        + avgSalaryByDept
        );
        List<Employee> topN = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Top 2 Employees: " + topN);
    }
}
