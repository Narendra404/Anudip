package employeeManage;

public class App {
    public static void main(String[] args) {

        EmployeeImpl employee_impl = new EmployeeImpl();
        Employee employee = employee_impl.getEmployeeById(102);

        if (employee == null) {
            System.out.println("Employee not found.");
        }
        else {
            System.out.println(employee);
        }

        System.out.println("Number of employees of department 'Sales' is : " + employee_impl.getEmployeeCountingByDepartment("Sales"));
    }
}