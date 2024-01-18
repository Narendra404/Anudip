package database.testApp.dao;

import database.testApp.beans.Employee;

import java.util.List;

public interface EmployeeDao {

    Employee getEmployee(Integer employee_id);

    List<Employee> getEmployees();

    Boolean addEmployee(Employee employee);

    Employee deleteEmployee(Integer employee_id);

    Boolean updateEmployee(Employee employee);
}