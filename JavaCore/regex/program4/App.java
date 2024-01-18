package regex.program4;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));// true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));// false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));// false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));// false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));// false (a or m or n must come one time)
        System.out.println(Pattern.matches("[amn]?", ""));// true (a or m or n may come one time or not)
    }
}
