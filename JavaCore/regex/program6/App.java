package regex.program6;

public class App {
    public static void main(String[] args) {

        System.out.println("* quantifier ....");
        System.out.println("a".matches("[amn]*"));// true (a or m or n may come zero or more times)
        System.out.println("aaa".matches("[amn]*"));// true (a comes more than one time)
        System.out.println("aammmnn".matches("[amn]*"));// true (a or m or n may come zero or more times)
        System.out.println("aazzta".matches("[amn]*"));// false (z and t are not matching pattern)
        System.out.println("".matches("[amn]*"));// true (a or m or n may come zero or more times)
    }
}
