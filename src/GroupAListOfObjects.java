import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAListOfObjects {

    static class Employee {
        String name;
        String department;
        int salary;

        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 60000),
                new Employee("Charlie", "IT", 70000)
        );

        Map<String, List<Employee>>  groupedByDept = employees.parallelStream()
                .collect(Collectors.groupingByConcurrent(Employee::getDepartment));

        System.out.println("Grouped by Department: " + groupedByDept);
    }
}