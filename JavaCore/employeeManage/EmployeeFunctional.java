package employeeManage;

public interface EmployeeFunctional {

    Employee getEmployeeById(Integer employee_Id);
    Integer getEmployeeCountingByDepartment(String employee_Department);
    Integer getTotalCountingOfEmployees();
    Employee[] getAllEmployee();

}