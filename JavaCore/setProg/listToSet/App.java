package setProg.listToSet;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {

    public static void main(String[] args) {

        List<String> student_names = new ArrayList<>();

        // Adding 10 names to the student_names ArrayList
        student_names.add("Alice");
        student_names.add(" Bob");
        student_names.add(" Charlie ");
        student_names.add("David");
        student_names.add(" Eva");
        student_names.add("Frank ");
        student_names.add(" Grace");
        student_names.add("david");
        student_names.add(" Ivy");
        student_names.add("Jack ");

        ListIterator<String> itr = student_names.listIterator();

        while (itr.hasNext()) {
            String temp = itr.next().toLowerCase().trim();
            itr.set(temp);
        }

        for (String studentName : student_names) {
            System.out.println(studentName);
        }

    }
}
