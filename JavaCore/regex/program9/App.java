package regex.program9;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        System.out.println("metacharacters D ....");// D means non-digit
        System.out.println(Pattern.matches("\\D", "abc"));// false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));// false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));// false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));// false (digit and char)
        System.out.println(Pattern.matches("\\D", "m"));// true (non-digit and comes once)
        System.out.println(Pattern.matches("\\D", "mm"));// false (non-digit and comes more than once)
        System.out.println(Pattern.matches("\\D", "mam"));// false (non-digit and char)
    }
}
