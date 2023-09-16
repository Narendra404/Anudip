package iteration.iterable;

import iteration.Employee;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
       Iterator<Employee> emp = new EmployeeIterable().iterator();

       while (emp.hasNext()) {
           Employee employee = emp.next();
           System.out.println(employee.getEmployeeId()+ " : " + employee.getEmployeeName());
       }

    }
}
