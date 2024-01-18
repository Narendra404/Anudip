package functionalInterface.lab;

//Functional Interface
@FunctionalInterface // Annotation
interface A {
    double vectorValue(int a, int b);
}

public class firstExample {
    public static void main(String[] args) {

        A a = ((x, y) -> { // This is a lambda statement
            // not expression
            return Math.sqrt(x*x + y*y);
        });

        int n1 = 99;
        int n2 = 77;
        double result = a.vectorValue(n1, n2);
        System.out.println("Result: " + result);

    }
}
