package collectionsProg.sortedSet;

import employeeManage.Employee;

import java.util.Comparator;

public class EmployeeSortAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getEmployeeAge().compareTo(o2.getEmployeeAge()));
    }
}
