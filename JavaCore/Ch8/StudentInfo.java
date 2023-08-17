package Ch8;

import java.util.*;

public class StudentInfo {

    int id;
    String name;
    String add;
    boolean placement;
    int marks;

    void input(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student's ID : ");
        id = sc.nextInt();
        System.out.print("Enter the Student's name : ");
        name = sc.next();
        System.out.print("Enter the Student's address : ");
        add = sc.nextLine();
        System.out.print("Enter the Student's placement status (true / false) : ");
        placement = sc.nextBoolean();
        System.out.print("Enter the Student's marks : ");
        marks = sc.nextInt();
    }

    void display(){

        System.out.println("Student's ID : " + id);
        System.out.println("Student's name : " + name);
        System.out.println("Student's address : " + add);
        System.out.println("Student's placement status : " + placement);
        System.out.println("Student's marks : " + marks);
    }

    public static void main (String[] args) {
        StudentInfo s = new StudentInfo();
        s.input();
        s.display();
    }
}
