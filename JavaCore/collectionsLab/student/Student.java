package collectionsLab.student;

import java.util.ArrayList;
import java.util.List;

// a Student class with name and roll number
public class Student {

    private String name;
    private Integer rollNumber;

    public Student() {
        super();
    }

    public Student(String name, Integer rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}

// the class that implements the Student class
class StudentImpl {

    // create a list of Student objects
    private final List<Student> students = new ArrayList<>();

    public StudentImpl() {

        // add students to the list
        students.add(new Student("John Smith", 101));
        students.add(new Student("Sarah Miller", 125));
        students.add(new Student("Jane Doe", 102));
        students.add(new Student("Michael Johnson", 103));
        students.add(new Student("Emily Brown", 104));
        students.add(new Student("Sebastian Williams", 124));
        students.add(new Student("William Wilson", 105));
        students.add(new Student("Olivia Davis", 106));
        students.add(new Student("James Jones", 107));
        students.add(new Student("Sofia Johnson", 123));
        students.add(new Student("Sophia Lee", 108));
        students.add(new Student("Benjamin Moore", 109));
        students.add(new Student("Isabella Taylor", 110));
        students.add(new Student("Liam Anderson", 111));
        students.add(new Student("Samantha Davis", 122));
        students.add(new Student("Charlotte Martinez", 112));
        students.add(new Student("Ethan Rodriguez", 113));
        students.add(new Student("Amelia Hernandez", 114));
        students.add(new Student("Mason Brown", 115));
        students.add(new Student("Ava Garcia", 116));
        students.add(new Student("Samuel Smith", 121));
        students.add(new Student("Noah Martinez", 117));
        students.add(new Student("Olivia Johnson", 118));
        students.add(new Student("Lucas Wilson", 119));
        students.add(new Student("Emma Anderson", 120));
    }

    // method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // method to remove a student using name
    public void removeStudent(String studentName) {
        students.removeIf(var -> var.getName().equalsIgnoreCase(studentName));
    }

    // method to remove a student using roll number
    public void removeStudent(Integer studentRollNumber) {
        students.removeIf(var -> var.getRollNumber().equals(studentRollNumber));
    }

    // method to remove students with a particular starting letter
    public void removeStudentStartingWith(String startingLetter) {
        students.removeIf(var -> var.getName().startsWith(startingLetter));
    }

    // method to remove all students
    public void removeAllStudents() {
        for (Student var : students) {
            students.remove(var);
        }
    }

    // method to display all students
    public void displayStudents() {
        for (Student var : students) {
            System.out.println(var);
        }
    }
}

// the driver application class
class App {
    // main method
    public static void main(String[] args) {

        // create an object of StudentImpl class
        StudentImpl obj = new StudentImpl();

        // display students prior any change
        System.out.println();
        System.out.println("The students : ");
        System.out.println();
        obj.displayStudents();

        // remove the students whose name starts with the letter 'S'
        obj.removeStudentStartingWith("S");

        // display the students after removing the names
        System.out.println();
        System.out.println("The students after removing those whose name starts with 'S' : ");
        System.out.println();
        obj.displayStudents();
    }
}