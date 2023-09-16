package iteration.iterable;

import iteration.Employee;
import iteration.EmployeeImpl;

import java.util.Iterator;
import java.util.List;
public class EmployeeIterable implements Iterable {

    List<Employee> employees = new EmployeeImpl().getEmployees();

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}
