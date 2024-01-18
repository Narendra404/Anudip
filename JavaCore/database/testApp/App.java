package database.testApp;

import database.testApp.beans.Employee;
import database.testApp.daoImpl.EmployeeDaoImpl;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
        Scanner scanner = new Scanner(System.in);

        char ch = 'h';

        do {

            switch (ch) {

                case 'a' -> {

                    System.out.println("\t\tAdd Employee");
                    System.out.println("\nEnter the details of the employee :");

                    Employee employee = getEmployeeDetails(scanner);

                    if (employeeDaoImpl.addEmployee(employee)) {
                        System.out.println("\nEmployee added!!!");
                    }
                    else {
                        System.out.println("\nSomething went wrong!!!\nEmployee not added!!!");
                    }
                }

                case 'e' -> {

                    System.out.println("\t\tGet Employee");
                    System.out.print("\nEnter the id of the employee : ");
                    Integer id = scanner.nextInt();

                    Employee employee = employeeDaoImpl.getEmployee(id);

                    if (employee != null) {

                        System.out.println("\nThe Employee's details are as follows :");
                        printEmployeeDetails(employee, Boolean.FALSE);
                    }
                    else {
                        System.out.println("\nSomething went wrong!!!\nEmployee could not be retrieved!!!");
                        System.out.println("Please check if the entered id of the employee is authentic.");
                    }
                }

                case 'E' -> {

                    System.out.println("\t\tGet All Employees");
                    System.out.println("\nThe list of the employees are as follows : \n");

                    List<Employee> employees = employeeDaoImpl.getEmployees();

                    for (Employee employee : employees) {
                        printEmployeeDetails(employee, Boolean.TRUE);
                    }
                }

                case 'd' -> {

                    System.out.println("\t\tDelete Employee");
                    System.out.print("\nEnter the id of the employee : ");
                    Integer id = scanner.nextInt();

                    Employee employee =  employeeDaoImpl.deleteEmployee(id);

                    if (employee != null) {

                        System.out.println("\nThe deleted Employee's details are as follows :");
                        printEmployeeDetails(employee, Boolean.FALSE);
                    }
                    else {

                        System.out.println("\nSomething went wrong!!!\nEmployee could not be deleted!!!");
                        System.out.println("Please check if the entered id of the employee is authentic.");
                    }
                }

                case 'u' -> {

                    System.out.println("\t\tUpdate Employee");
                    System.out.println("\nEnter the details of the employee to be updated :");

                    Employee employee = getEmployeeDetails(scanner);

                    if (employeeDaoImpl.updateEmployee(employee)) {

                        System.out.println("\nThe details of the updated Employee are as follows :");
                        printEmployeeDetails(employee, Boolean.FALSE);
                    }
                    else {

                        System.out.println("\nSomething went wrong!!!\nEmployee could not be updated!!!");
                        System.out.println("Please check if the entered id of the employee is authentic.");
                    }
                }

                case 'h' -> {

                    System.out.println("\t\tHELP");
                    System.out.println("\n\tPress 'a' : to add an employee.");
                    System.out.println("\n\tPress 'e' : to get an employee.");
                    System.out.println("\n\tPress 'E' : to get all employees.");
                    System.out.println("\n\tPress 'd' : to delete a employee.");
                    System.out.println("\n\tPress 'u' : to update a employee.");
                    System.out.println("\n\tPress 'q' : to exit the application.");
                    System.out.println("\n\tPress 'h' : to get this help message.");
                    System.out.print("\n\nEnter your choice : ");
                }

                default -> System.out.println("\nInvalid choice!!!\nPress 'h' to see help.");
            }

            ch = scanner.next().charAt(0);
        } while (ch != 'q');

        employeeDaoImpl.closeConnection();
    }

    private static Employee getEmployeeDetails(Scanner scanner) {

        System.out.print("\nEnter the id of the employee : ");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\nEnter the name of the employee : ");
        String name = scanner.nextLine();
        System.out.print("\nEnter the salary of the employee : ");
        Double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nEnter the designation of the employee : ");
        String designation = scanner.nextLine();
        scanner.nextLine();
        System.out.print("\nEnter the date of joining (yyyy-[m]m-[d]d) of the employee : ");
        Date date = Date.valueOf(scanner.nextLine());

        return new Employee(id, name, salary, designation, date);
    }

    private static void printEmployeeDetails(Employee employee, Boolean isList) {

        if (isList) {

            System.out.printf("[ %-21s : %d |", "Employee id", employee.getEmployee_id());
            System.out.printf(" %-21s : %s |", "Employee name", employee.getEmployee_name());
            System.out.printf(" %-21s : %.2f |", "Employee salary", employee.getEmployee_salary());
            System.out.printf(" %-21s : %s |", "Employee designation", employee.getEmployee_designation());
            System.out.printf(" %-21s : %s ]\n", "Employee d.o.j", employee.getEmployee_joiningDate().toString());
        }
        else {

            System.out.printf("\n%-21s : %d", "Employee id", employee.getEmployee_id());
            System.out.printf("\n%-21s : %s", "Employee name", employee.getEmployee_name());
            System.out.printf("\n%-21s : %.2f", "Employee salary", employee.getEmployee_salary());
            System.out.printf("\n%-21s : %s", "Employee designation", employee.getEmployee_designation());
            System.out.printf("\n%-21s : %s\n", "Employee d.o.j", employee.getEmployee_joiningDate().toString());
        }
    }
}