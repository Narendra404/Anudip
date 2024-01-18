package database.testApp.databaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection;
    private Connection connection = null;

    private DatabaseConnection() {
        // Step 1: Load the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step 2: Establish the database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "n2ren");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public static DatabaseConnection getDatabaseConnectionObject() {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    public Connection getConnectionObj() {
        return databaseConnection.connection;
    }
}