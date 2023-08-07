package Ch6;

import java.util.*;

class Emp {

    int eid;
    String ename;
    String companyname;

    static int id;
    static String name;

    static String company;

    static void Run () {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ID of the employee : ");
        id = sc.nextInt();

        System.out.print("Enter the name of the employee : ");
        name = sc.next();

        System.out.print("Enter the name of the employee's company : ");
        company = sc.next();
    }

    public void input() {

        eid = Emp.id;
        ename = Emp.name;
        companyname = Emp.company;
    }

    public void display() {

        System.out.println();
        System.out.println("The id of the employee is : " + eid);
        System.out.println("The name of the employee is : " + ename);
        System.out.println("THe name of the employee's company : " + companyname);
        System.out.println();
    }

    public static void main(String[] args) {

        Emp e = new Emp();
        Emp.Run();
        e.input();
        e.display();
    }
}