package database.testApp.daoImpl;

import database.testApp.beans.Employee;
import database.testApp.dao.EmployeeDao;
import database.testApp.databaseConfig.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private final Connection connection;

    public EmployeeDaoImpl() {
        connection = DatabaseConnection.getDatabaseConnectionObject().getConnectionObj();
    }

    public void closeConnection() {
        if (connection != null) {

            try {
                connection.close();
            } catch (SQLException e) {
                for (StackTraceElement element : e.getStackTrace()) {
                    System.out.println(element.toString());
                }
            }
        }
    }

    @Override
    public Employee getEmployee(Integer employee_id) {

        Employee employee = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            String sql = "SELECT * FROM employees WHERE employee_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, employee_id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                Integer employee_id1 = resultSet.getInt("employee_id");
                String employee_name = resultSet.getString("employee_name");
                Double employee_salary = resultSet.getDouble("employee_salary");
                String employee_designation = resultSet.getString("employee_designation");
                Date employee_joiningdate = resultSet.getDate("employee_joiningDate");

                employee = new Employee(employee_id1, employee_name, employee_salary, employee_designation, employee_joiningdate);
            }
        } catch (SQLException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.toString());
            }
        } finally {
            try {

                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException e) {
                for (StackTraceElement element : e.getStackTrace()) {
                    System.out.println(element.toString());
                }
            }
        }

        return employee;
    }

    @Override
    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM employees");

            while (resultSet.next()) {

                Integer employee_id = resultSet.getInt("employee_id");
                String employee_name = resultSet.getString("employee_name");
                Double employee_salary = resultSet.getDouble("employee_salary");
                String employee_designation = resultSet.getString("employee_designation");
                Date employee_joiningdate = resultSet.getDate("employee_joiningDate");

                employees.add(new Employee(employee_id, employee_name, employee_salary, employee_designation, employee_joiningdate));
            }
        } catch (SQLException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.toString());
            }
        } finally {
            try {

                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
                for (StackTraceElement element : e.getStackTrace()) {
                    System.out.println(element.toString());
                }
            }
        }

        return employees;
    }

    @Override
    public Boolean addEmployee(Employee employee) {

        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = connection.prepareStatement("INSERT INTO employees VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, employee.getEmployee_id());
            preparedStatement.setString(2, employee.getEmployee_name());
            preparedStatement.setDouble(3, employee.getEmployee_salary());
            preparedStatement.setString(4, employee.getEmployee_designation());
            preparedStatement.setDate(5, employee.getEmployee_joiningDate());

            if (preparedStatement.executeUpdate() > 0) {
                return Boolean.TRUE;
            }
        } catch (SQLException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.toString());
            }
        } finally {
            try {

                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                for (StackTraceElement element : e.getStackTrace()) {
                    System.out.println(element.toString());
                }
            }
        }

        return Boolean.FALSE;
    }

    @Override
    public Employee deleteEmployee(Integer employee_id) {

        Employee employee = null;

        if (isEmployeeExists(employee_id)) {

            PreparedStatement preparedStatement = null;
            employee = getEmployee(employee_id);

            try {

                String sql = "DELETE FROM employees WHERE employee_id=?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, employee_id);

                if (preparedStatement.executeUpdate() > 0) {
                    return employee;
                }

            } catch (SQLException e) {
                for (StackTraceElement element : e.getStackTrace()) {
                    System.out.println(element.toString());
                }
            } finally {
                try {

                    if (preparedStatement != null)
                        preparedStatement.close();
                } catch (SQLException e) {
                    for (StackTraceElement element : e.getStackTrace()) {
                        System.out.println(element.toString());
                    }
                }
            }
        }

        return employee;
    }

    @Override
    public Boolean updateEmployee(Employee employee) {

        if (isEmployeeExists(employee.getEmployee_id())) {

            PreparedStatement preparedStatement = null;

            try {

                String sql = "UPDATE employees SET employee_name=?, employee_salary=?, employee_designation=?, employee_joiningDate=? WHERE employee_id=?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, employee.getEmployee_name());
                preparedStatement.setDouble(2, employee.getEmployee_salary());
                preparedStatement.setString(3, employee.getEmployee_designation());
                preparedStatement.setDate(4, employee.getEmployee_joiningDate());
                preparedStatement.setInt(5, employee.getEmployee_id());

                if (preparedStatement.executeUpdate() > 0) {
                    return Boolean.TRUE;
                }
            } catch (SQLException e) {
                for (StackTraceElement element : e.getStackTrace()) {
                    System.out.println(element.toString());
                }
            } finally {
                try {

                    if (preparedStatement != null)
                        preparedStatement.close();
                } catch (SQLException e) {
                    for (StackTraceElement element : e.getStackTrace()) {
                        System.out.println(element.toString());
                    }
                }
            }
        }

        return Boolean.FALSE;
    }

    private Boolean isEmployeeExists(Integer employee_id) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            String sql = "SELECT * FROM employees WHERE employee_id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, employee_id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return Boolean.TRUE;
            }
        } catch (SQLException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.toString());
            }
        } finally {
            try {

                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException e) {
                for (StackTraceElement element : e.getStackTrace()) {
                    System.out.println(element.toString());
                }
            }
        }

        return Boolean.FALSE;
    }
}