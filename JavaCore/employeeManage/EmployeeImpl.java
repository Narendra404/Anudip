package employeeManage;

public class EmployeeImpl implements EmployeeFunctional {

    private Employee[] employee_list = new Employee[10];

    public EmployeeImpl() {

        employee_list[0] = new Employee(101, "Rohit", 24, 30000.0f, "male", "Sales");
        employee_list[1] = new Employee(102, "Komal", 25, 40000.0f, "female", "Training");
        employee_list[2] = new Employee(103, "Pravesh", 26, 50000.0f, "male", "Development");
        employee_list[3] = new Employee(104, "Prerna", 27, 60000.0f, "female", "Research");
        employee_list[4] = new Employee(105, "Umesh", 28, 70000.0f, "male", "Administration");
        employee_list[5] = new Employee(106, "Priya", 29, 80000.0f, "female", "HR");
        employee_list[6] = new Employee(107, "Ankit", 30, 90000.0f, "male", "Sales");
        employee_list[7] = new Employee(108, "Sneha", 31, 100000.0f, "female", "Development");
        employee_list[8] = new Employee(109, "Rajesh", 32, 110000.0f, "male", "Research");
        employee_list[9] = new Employee(110, "Amita", 33, 120000.0f, "female", "Administration");

    }

    public void setEmployeeList(Employee[] employee_list) {
        this.employee_list = employee_list;
    }

    @Override
    public Employee getEmployeeById(Integer employee_Id) {
        Employee required_employee = null;

        for (Employee employee : employee_list) {

            if (employee.getEmployeeId().equals(employee_Id)) {

                required_employee = employee;
                break;
            }
        }

        return required_employee;
    }

    @Override
    public Integer getEmployeeCountingByDepartment(String employee_Department) {

        Integer employee_count = 0;

        for (Employee employee : employee_list) {

            if (employee.getEmployeeDepartment().equals(employee_Department)) {
                employee_count++;
            }
        }

        return employee_count;
    }

    @Override
    public Integer getTotalCountingOfEmployees() {
        return employee_list.length;
    }

    @Override
    public Employee[] getAllEmployee() {
        return employee_list;
    }
}