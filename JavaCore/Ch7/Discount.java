package Ch7;

import java.util.*;

public class Discount {

    float discount(float cost_price, float x) {

       float dis = cost_price * (x / 100);

       return cost_price - dis;
    }

    float discount(float cost_price, float x, float y) {

        float dis = cost_price * (x / 100);
        float dis_cp = cost_price - dis;
        float sec_dis = dis_cp * (y / 100);

        return dis_cp - sec_dis;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the cost price of the articles : ");
        float cp = sc.nextFloat();

        Discount obj = new Discount();

        float a = 30F, b = 20F, c = 10F;

        float d1 = obj.discount(cp, a);
        float d2 = obj.discount(cp, b, c);

        if (d1 < d2) {

            System.out.println();
            System.out.println("The best offer the customer is with the discount of " + a + "% and MP of : " + d1);
            System.out.println();
        }
        else {

            System.out.println();
            System.out.println("The best offer the customer is with the discount of " + b + "% and " + c + "% and MP of : " + d2);
            System.out.println();
        }
    }
}