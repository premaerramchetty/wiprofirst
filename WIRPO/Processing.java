
import java.util.*;
import java.util.stream.Collectors;
class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
}
public class Processing {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("prem", 28, 5000),
            new Employee("suresh", 35, 6000),
            new Employee("kiran", 40, 7000),
            new Employee("ravi", 25, 8000),
            new Employee("kumar", 32, 9000)
        );
        List<String> employeeNames = employees.stream()
            .filter(emp -> emp.getAge() > 30)
            .map(Employee::getName)
            .collect(Collectors.toList());
        OptionalDouble averageSalary = employees.stream()
            .filter(emp -> emp.getAge() > 30)
            .mapToDouble(Employee::getSalary)
            .average();
        System.out.println("Employees older than 30: " + employeeNames);
        System.out.println("Average salary: " + (averageSalary.isPresent() ? averageSalary.getAsDouble() : "N/A"));
    }
}