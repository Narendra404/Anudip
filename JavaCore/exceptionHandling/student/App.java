package exceptionHandling.student;

public class App {
    public static void main(String[] args) {

        StudentImpl studentImpl = new StudentImpl();

        try {
            studentImpl.setStudent(new Student(101, "August", "Male", 0, "Delhi"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(studentImpl.getStudent());
    }
}
