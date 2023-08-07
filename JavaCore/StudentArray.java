import java.util.Scanner;

public class StudentArray {

    String name;
    int roll_no;
    String address;
    String status;

    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the student's name : ");
        name = sc.next();
        System.out.print("Enter the student's roll number : ");
        roll_no = sc.nextInt();
        System.out.print("Enter the student's address : ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.print("Enter the student's exam status (pass / fail)  : ");
        status = sc.next();
    }
    public void display(){

        System.out.println();
        System.out.println("student's name : \t\t\t\t" + name);
        System.out.println("student's roll number : \t\t" + roll_no);
        System.out.println("student's address : \t\t\t" + address);
        System.out.println("student's exam status : \t\t" + status);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();

        StudentArray[] obj = new StudentArray[n];

        System.out.println();
        System.out.println("Enter the details of the students one by one : ");

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Enter the details of student " + (i + 1) + " : ");
            obj[i] = new StudentArray();
            obj[i].input();
        }

        System.out.println();
        System.out.println("The details of the students who have passed the exams are as follows : ");

        for (int i = 0; i < n; i++) {

            if (obj[i].status.equals("pass")) {

                obj[i].display();
            }
        }

    }
}