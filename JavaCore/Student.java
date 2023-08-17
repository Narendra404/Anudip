import java.util.*;

class Person {
    private String name;
    private String address;
    Person() {

        name = null;
        address = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
public class Student extends Person{

    private int student_id;

    Student (String name, String address, int stu_id) {

        setName(name);
        setAddress(address);
        this.student_id = stu_id;
    }

    // Only to remove 'set data member to final' warning
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void display() {

        System.out.println();
        System.out.println("The name of the student is : " + getName());
        System.out.println("The address of the student is : " + getAddress());
        System.out.println("The id of the student is : " + student_id);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the name of the Student : ");
        String name = sc.nextLine();
        System.out.print("Enter the address of the Student : ");
        String address = sc.nextLine();
        System.out.print("Enter the id of the Student : ");
        int id = sc.nextInt();

        Student s = new Student(name, address, id);
        s.display();
    }
}
