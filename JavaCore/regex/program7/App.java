package regex.program7;

public class App {
    public static void main(String[] args) {

        System.out.println("x{n} quantifier ....");
        System.out.println("a".matches("[amn]{1}"));// true (a or m or n once)
        System.out.println("aaa".matches("[amn]{3}"));// true (a comes more than one time)
        System.out.println("aammmnn".matches("[amn]{1}"));// false (a or m or n comes more than one time)
        System.out.println("aazzta".matches("[amn]{6}"));// false (z and t are not matching pattern)
        System.out.println("".matches("[amn]{0}"));// true (a or m or n may come zero times)
    }
}
