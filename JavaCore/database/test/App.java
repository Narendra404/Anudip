package database.test;

import java.sql.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "n2ren");
            // Step 3: Create a statement
            statement = connection.createStatement();
            // Step 4: Execute the query
            resultSet = statement.executeQuery("SELECT * FROM employees");
            // Step 5: Process the results
            while (resultSet.next()) {
                int employee_id = resultSet.getInt("employee_id");
                String employee_name = resultSet.getString("employee_name");
                System.out.println("employee_id: " + employee_id + ",employee_name: " + employee_name);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
            // Step 6: Close the connection and release resources
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
    }
}