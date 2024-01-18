package exceptionHandling.lab;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Simple Interest : ");
            double si = sc.nextDouble();

            System.out.println("Enter the Principal Amount : ");
            double p = sc.nextDouble();

            System.out.println("Enter the Time period (in years) : ");
            int t = sc.nextInt();

            if (t == 0) {
                throw new java.lang.ArithmeticException("Time period cannot be zero");
            }

            double InterestRate = (si * 100) / (p * t);
            System.out.println("Interest Rate : " + InterestRate);

        } catch (java.lang.ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

    }
}
