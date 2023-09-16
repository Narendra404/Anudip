package iteration.iterator;

import iteration.Employee;
import iteration.EmployeeImpl;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeIterator implements Iterator {

    List<Employee> employees;
    int currentIndex;

    public EmployeeIterator() {

        currentIndex = 0;
        employees = new EmployeeImpl().getEmployees();
    }

    @Override
    public boolean hasNext() {
        return currentIndex < employees.size();
    }

    @Override
    public Employee next() {

        if (currentIndex >= employees.size()) {
            throw new NoSuchElementException();
        }

        return employees.get(currentIndex++);
    }
}
