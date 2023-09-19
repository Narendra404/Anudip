package collectionsProg.sortedSet;

import java.util.Comparator;

public class EmployeeNameDesc implements Comparator<employeeManage.Employee> {
    @Override
    public int compare(employeeManage.Employee o1, employeeManage.Employee o2) {
        return (o2.getEmployeeName().compareTo(o1.getEmployeeName()));
    }
}
