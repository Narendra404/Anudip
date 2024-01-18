package regex.program10;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));// true (non-digit and may come 0 or more times)
        System.out.println(Pattern.matches("\\D*", "m"));// true (non-digit and may come 0 or more times)
        System.out.println(Pattern.matches("\\D*", "mm"));// true (non-digit and may come 0 or more times)
        System.out.println(Pattern.matches("\\D*", "mam"));// true (non-digit and may come 0 or more times)
    }
}
