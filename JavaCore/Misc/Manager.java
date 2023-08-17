package Misc;

import java.util.*;

class Employee {

    private String name;
    private int ID;

    Employee(String name, int id) {

        this.name = name;
        this.ID = id;
    }

    // the setter methods are written to remove the warning
    // which suggests the data members be final
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
public class Manager extends Employee{

    private String department;

    Manager(String name, int id, String dept) {
        super(name, id);
        this.department = dept;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void display() {

        System.out.println();
        System.out.println("The name of the Manager is : " + getName());
        System.out.println("The ID of the Manager is : " + getID());
        System.out.println("The department of the Manger is : " + getDepartment());
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the name of the Manager : ");
        String name = sc.nextLine();
        System.out.print("Enter the ID of the Manager : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the department of the Manager : ");
        String dept = sc.nextLine();

        Manager m = new Manager(name, id, dept);

        m.display();
    }
}
