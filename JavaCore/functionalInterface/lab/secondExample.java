package functionalInterface.lab;

@FunctionalInterface
interface Calculate {
    int square(int n);
}

public class secondExample{
    public static void main(String[] args) {
        Calculate calculate = (n1) -> { // This is a lambda statement
            // not expression
            return (n1 * n1);
        };

        System.out.println(calculate.square(8));
    }
}