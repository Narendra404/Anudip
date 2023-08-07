package Ch8;

import java.util.*;

public class Employee {

    int id;
    String name;
    String add;
    int salary;
    float tax;

    void input(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Employee's ID : ");
        id = sc.nextInt();
        System.out.print("Enter the Employee's name : ");
        name = sc.next();
        System.out.print("Enter the Employee's address : ");
        sc.nextLine();
        add = sc.nextLine();
        System.out.print("Enter the Employee's salary : ");
        salary = sc.nextInt();
    }

    float calculateTax(int salary) {
        
        float tax;

        if (salary <= 250000) {
            tax = 0;
        }
        else if (salary > 250000 && salary <= 500000) {
            tax = (salary - 250000) * 0.10f;
        }
        else if (salary > 500000 && salary <= 1000000) {
            tax = (salary - 500000) * 0.20f + 30000;
        }
        else {
            tax = (salary - 1000000) * 0.30f + 50000;
        }

        return tax;
    }

    void display(){

        tax = calculateTax(salary);
        System.out.println();
        System.out.println("Employee's ID : " + id);
        System.out.println("Employee's name : " + name);
        System.out.println("Employee's address : " + add);
        System.out.println("Employee's salary : " + salary);
        System.out.println("Employee's tax : " + tax);
        System.out.println("Employee's salary after tax deduction : " + (salary - tax));
    }

    public static void main (String[] args) {
        Employee e = new Employee();
        e.input();
        e.display();
    }
}
