import java.util.*;

public class MenuWithSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("\t\tMenu");
        System.out.println();
        System.out.println("\tTime\t\t\tContents\t\t\t\t\tPrice");
        System.out.println();
        System.out.println("\tBreakfast(1)\tChai(c) & Toast(t)\t\t\t100");
        System.out.println("\tLunch(2)\t\tRice(R) & Rajma(r)\t\t\t150");
        System.out.println("\tDinner(3)\t\tChapati(C) & Paneer(p)\t\t200");
        System.out.println();
        System.out.println("Enter the associated character or the full name of a meal : ");
        String ch = sc.next();

        switch (ch) {
            case "1", "Chai", "Toast", "Breakfast", "c", "t" -> {
                System.out.println("The Breakfast contents : ");
                System.out.println("Chai & Toast");
                System.out.println("Price : 100");
            }
            case "2", "Rice", "Rajma", "R", "r", "Lunch" -> {
                System.out.println("The Lunch contents : ");
                System.out.println("Rice & Rajma");
                System.out.println("Price : 150");
            }
            case "3", "Dinner", "Chapati", "Paneer", "C", "p" -> {
                System.out.println("The Dinner contents : ");
                System.out.println("Chapati & Paneer");
                System.out.println("Price : 200");
            }
            default -> System.out.println("Wrong Choice. Try again.");
        }
    }
}