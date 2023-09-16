package polymorphLab.university;

// Abstract University class
abstract public class University {
    abstract public void Enroll(); // Abstract method to enroll in a course
}

// Maths class that extends University
class Maths extends University {
    @Override
    public void Enroll() {
        // Print a message indicating enrollment in a Mathematics course
        System.out.println();
        System.out.println("Enrolled in Mathematics course.");
    }
}

// Science class that extends University
class Science extends University {
    @Override
    public void Enroll() {
        // Print a message indicating enrollment in a Science course
        System.out.println();
        System.out.println("Enrolled in Science course.");
    }
}

// History class that extends University
class History extends University {
    @Override
    public void Enroll() {
        // Print a message indicating enrollment in a History course
        System.out.println();
        System.out.println("Enrolled in History course.");
    }
}

// Main application class
class App {
    public static void main(String[] args) {

        // Create an array of University objects representing different courses
        University[] u = {new Maths(), new Science(), new History()};

        // Enroll in each course and print a message
        for (University var : u) {
            var.Enroll();
        }
    }
}
