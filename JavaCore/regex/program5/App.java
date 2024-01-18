package regex.program5;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));// true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));// true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));// true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));// false (z and t are not matching pattern)
        System.out.println(Pattern.matches("[amn]+", ""));// false (a or m or n must come one time)
    }
}
