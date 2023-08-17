package Ch8;

import java.util.*;

public class SalesComm {

    static int truncate(float n) {

        int decInt = (int) Math.rint(n);

        if (decInt > n) {
            
            return (int)(n - (decInt - n));
        }
        else {
            
            return (int)(n - (n - decInt));
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("\t\t\tSALES COMMISSION");
        System.out.println();
        System.out.print("Enter the number of employees : ");
        int n = sc.nextInt();

        int[] gross = new int[n];

        System.out.println();
        System.out.println("Enter the gross weekly sales of each employee one by one : ");
        for (int i = 0; i < n; i++) {
            
            gross[i] = sc.nextInt();
        }
        
        int[] comm = new int[n];
        for (int i = 0; i < n; i++) {
            
            comm[i] = truncate(0.09f * gross[i]) + 200;
        }

        int[] count = new int[9];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            
            if (comm[i] >= 200 && comm[i] < 300) {
                
                count[0]++;
            }
            else if (comm[i] >= 300 && comm[i] < 400) {
                
                count[1]++;
            }
            else if (comm[i] >= 400 && comm[i] < 500) {
                
                count[2]++;
            }
            else if (comm[i] >= 500 && comm[i] < 600) {
                
                count[3]++;
            }
            else if (comm[i] >= 600 && comm[i] < 700) {
                
                count[4]++;
            }
            else if (comm[i] >= 700 && comm[i] < 800) {
                
                count[5]++;
            }
            else if (comm[i] >= 800 && comm[i] < 900) {
                
                count[6]++;
            }
            else if (comm[i] >= 900 && comm[i] < 1000) {
                
                count[7]++;
            }
            else if (comm[i] >= 1000) {
                
                count[8]++;
            }
        }
        
        System.out.println();
        System.out.println("\t\tSales Category\t\tNumber of employees");
        System.out.println();
        int st = 200;
        for (int i = 0; i < 9; i++) {
            if (st != 1000) {
                
                System.out.println("\t\ta) $" + st + " - $" + ((st + 100) - 1) + "\t\t" + count[i]);
            }
            else {
                
                System.out.println("\t\ta) $" + st + " - $...\t\t" + count[i]);
            }
            st += 100;
        }
        System.out.println();
    }
}
