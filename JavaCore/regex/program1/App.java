package regex.program1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        // 1st way
        Pattern p = Pattern.compile(".s");// . represents single character so the
            // pattern will match any two characters with s as the second character.

        Matcher m = p.matcher("as");
        boolean b = m.matches();

        // 2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        // 3rd way
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b + " " + b2 + " " + b3);
    }
}