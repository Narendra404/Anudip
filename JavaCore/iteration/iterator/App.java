package iteration.iterator;

import iteration.Employee;

public class App {
    public static void main(String[] args) {

        EmployeeIterator itr = new EmployeeIterator();

        while (itr.hasNext()) {
            Employee emp = itr.next();
            System.out.println(emp.getEmployeeId() + " : " + emp.getEmployeeName());
        }
    }
}
