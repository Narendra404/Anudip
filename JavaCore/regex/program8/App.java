package regex.program8;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        System.out.println("metacharacters d....");// d means digit
        System.out.println(Pattern.matches("\\d", "abc"));// false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));// true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));// false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));// false (digit and char)
    }
}
