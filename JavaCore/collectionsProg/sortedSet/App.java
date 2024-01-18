package collectionsProg.sortedSet;

import employeeManage.Employee;

import java.util.SortedSet;

public class App {
    public static void main(String[] args) {

        SortedSet<Employee> employees = new PrepareEmployee(new EmployeeNameDesc()).getEmployees();

        System.out.println();
        System.out.println("Employees sorted in descending order of names :");
        System.out.println();
        for (Employee emp : employees) System.out.println(emp);

        SortedSet<Employee> employees1 = new PrepareEmployee(new EmployeeSortAge()).getEmployees();

        System.out.println();
        System.out.println("Employees sorted in ascending order of ages :");
        System.out.println();
        for (Employee emp : employees1) System.out.println(emp);
    }
}
