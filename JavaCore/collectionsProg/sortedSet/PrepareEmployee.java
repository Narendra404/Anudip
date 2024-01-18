package collectionsProg.sortedSet;

import employeeManage.Employee;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PrepareEmployee {

    private SortedSet<Employee> employees;

    public PrepareEmployee(Comparator<Employee> obj) {

        employees = new TreeSet<>(obj);

        employees.add(new Employee(101, "Rohit", 24, 30000.0f, "male", "Sales"));
        employees.add(new Employee(102, "Komal", 25, 40000.0f, "female", "Training"));
        employees.add(new Employee(103, "Pravesh", 26, 50000.0f, "male", "Development"));
        employees.add(new Employee(104, "Prerna", 27, 60000.0f, "female", "Research"));
        employees.add(new Employee(105, "Umesh", 28, 70000.0f, "male", "Administration"));
        employees.add(new Employee(106, "Priya", 29, 80000.0f, "female", "HR"));
        employees.add(new Employee(107, "Ankit", 30, 90000.0f, "male", "Sales"));
        employees.add(new Employee(108, "Sneha", 31, 100000.0f, "female", "Development"));
        employees.add(new Employee(109, "Rajesh", 32, 110000.0f, "male", "Research"));
        employees.add(new Employee(110, "Amita", 33, 120000.0f, "female", "Administration"));
    }

    public SortedSet<Employee> getEmployees() {
        return employees;
    }
}
