package iteration;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl {

    List<Employee> employees = new ArrayList<>();
    int currentIndex;

    public EmployeeImpl() {

        currentIndex = 0;
        employees.add(new Employee(1, "John Doe", 30, 50000.0f, "Male", "HR"));
        employees.add(new Employee(2, "Jane Smith", 28, 55000.0f, "Female", "Finance"));
        employees.add(new Employee(3, "Bob Johnson", 35, 60000.0f, "Male", "IT"));
        employees.add(new Employee(4, "Alice Brown", 32, 52000.0f, "Female", "Marketing"));
        employees.add(new Employee(5, "Charlie Wilson", 27, 48000.0f, "Male", "Sales"));
        employees.add(new Employee(6, "Eva Davis", 31, 53000.0f, "Female", "HR"));
        employees.add(new Employee(7, "Michael Clark", 29, 58000.0f, "Male", "Finance"));
        employees.add(new Employee(8, "Linda Lee", 34, 62000.0f, "Female", "IT"));
        employees.add(new Employee(9, "David Brown", 33, 54000.0f, "Male", "Marketing"));
        employees.add(new Employee(10, "Grace Smith", 26, 49000.0f, "Female", "Sales"));
        employees.add(new Employee(11, "Robert Johnson", 36, 61000.0f, "Male", "HR"));
        employees.add(new Employee(12, "Olivia Davis", 30, 57000.0f, "Female", "Finance"));
        employees.add(new Employee(13, "James Wilson", 28, 58000.0f, "Male", "IT"));
        employees.add(new Employee(14, "Sophia Martin", 32, 55000.0f, "Female", "Marketing"));
        employees.add(new Employee(15, "William Anderson", 29, 49000.0f, "Male", "Sales"));
        employees.add(new Employee(16, "Emma White", 27, 50000.0f, "Female", "HR"));
        employees.add(new Employee(17, "Daniel Taylor", 34, 60000.0f, "Male", "Finance"));
        employees.add(new Employee(18, "Mia Jackson", 31, 56000.0f, "Female", "IT"));
        employees.add(new Employee(19, "Alexander Harris", 35, 58000.0f, "Male", "Marketing"));
        employees.add(new Employee(20, "Ava Martinez", 28, 52000.0f, "Female", "Sales"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
