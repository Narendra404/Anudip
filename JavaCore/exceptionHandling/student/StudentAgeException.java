package exceptionHandling.student;

public class StudentAgeException extends RuntimeException {
    public StudentAgeException(String message) {
        super((message));
    }
}
