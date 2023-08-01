import java.util.*;

public class Parcel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the weight of the parcel (in grams) : ");
        int weight = sc.nextInt();

        int charge = 15;

        if (weight > 1000) {

            int count = ((weight - 1000) % 500 == 0) ? (weight - 1000) / 500 : (weight - 1000) / 500 + 1;
            charge += count * 8;
        }

        System.out.println();
        System.out.println("The charge of the parcel weighing " + weight + " is : " + charge);
        System.out.println();
    }
}