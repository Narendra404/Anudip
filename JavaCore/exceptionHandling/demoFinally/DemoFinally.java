package exceptionHandling.demoFinally;

public class DemoFinally {
    public static void main(String[] args) {
        System.out.println("Starting of main");
        System.out.println(new Calculate().disp());
        System.out.println("Ending of main");
    }
}


class Calculate {
    Integer num1 = 99;
    Integer num2 = 0;
    Integer result = null;

    Calculate() {
        num1 = 99;
        num2 = 0;
    }

    public Integer disp() {
        try {
            result = num1 / num2;
            return result;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
            return -1;
        } finally {
            System.out.println("Finally");
        }
    }
}