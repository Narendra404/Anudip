package Misc;

public class Armstrong2 {
    public static void main (String[] args) {

        System.out.println();
        System.out.println("The Armstrong numbers between 10 t0 1000 are : ");
        System.out.println();

        for (int i = 10; i < 1000; i++) {
           
            int t = i, sum = 0, no_of_digits = 0;

            while (t > 0) {
                t = t / 10;
                no_of_digits++;
            }
             
            t = i;
            while (t > 0) {
                sum += (int)Math.pow((t % 10), no_of_digits);
                t = t / 10;         
            }

            if (i == sum) {
                System.out.println(i);
            }
        }

        System.out.println();
    }
}
