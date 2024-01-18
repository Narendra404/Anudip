package exceptionHandling.demoThrow;

import java.sql.SQLException;

public class DemoThrow {
    public static void main(String[] args) {

        System.out.println("Starting of main");
        Integer result = null;
        try {
            result = new C().dispC();
        } catch (NullPointerException | ArithmeticException | SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
        System.out.println("Ending of main");
    }
}

class A {
    public Integer dispA() throws SQLException {

        throw new SQLException("This exception is SQL related.");
    }
}

class B {
    public Integer dispB() throws SQLException {
        System.out.println("Starting of B");

        System.out.println("Ending of B");
        return new A().dispA();
    }
}

class C {
    public Integer dispC() throws SQLException {
        System.out.println("Starting of C");

        System.out.println("Ending of C");
        return new B().dispB();
    }
}