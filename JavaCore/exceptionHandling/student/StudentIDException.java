package exceptionHandling.student;

public class StudentIDException extends RuntimeException {
    public StudentIDException(String message) {
        super(message);
    }
}
