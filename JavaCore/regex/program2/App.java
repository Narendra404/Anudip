package regex.program2;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
        System.out.println(Pattern.matches(".s", "amms"));// false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)

        System.out.println(Pattern.matches(".s.", "msg"));//true( having 3 char and middle is 's')
    }
}
