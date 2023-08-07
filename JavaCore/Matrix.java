import java.util.*;

public class Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the dimensions of the matrix : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] matrix1 = new int[x][y];
        int[][] matrix2 = new int[x][y];

        System.out.println();
        System.out.println("Enter the values of matrix 1 : ");

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Enter the values of matrix 2 : ");

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[x][y];

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println();
        System.out.println("The sum of matrix 1 and matrix 2 is as follows : ");
        System.out.println();

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                System.out.print(sum[i][j] + " ");
            }

            System.out.println();
        }
    }
}