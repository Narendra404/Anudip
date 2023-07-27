public class Student {

    String name;
    int roll_no;

    Student(String name, int roll_no) {

        this.name = name;
        this.roll_no = roll_no;
    }

    void display() {

        System.out.println("The name of the student is : " + name);
        System.out.println("The roll no of the student is : " + roll_no);
    }

    public static void main(String[] args) {

        Student ob = new Student("John", 2);
        ob.display();
    }
}
