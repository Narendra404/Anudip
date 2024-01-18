package exceptionHandling.student;

public class StudentImpl {

    private Student student;

    public StudentImpl() {
        super();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) throws StudentAgeException, StudentIDException {
        validate(student);
        this.student = student;
    }

    private void validate(Student student) throws StudentAgeException, StudentIDException {

        if ((student.getStudentId() == null) || student.getStudentId() <= 0) {
            throw new StudentIDException("StudentIDError : The id is null or less than 1.");
        }

        if ((student.getStudentAge() == null) || student.getStudentAge() <= 0) {
            throw new StudentAgeException("StudentAgeError : The id is null or less than 1.");
        }
    }
}
