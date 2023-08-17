package Misc;

import java.util.*;

class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println();
        System.out.println("Enter the elements of the array one by one : ");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int[] arr_new = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {

            boolean flag = false;
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr_new[j]) {

                    flag = true;
                    break;
                }
            }

            if (!flag) {

                arr_new[count] = arr[i];
                count++;
            }
        }

        System.out.println();
        System.out.println("The elements of the array without duplicates : ");
        System.out.println();

        for (int i = 0; i < count; i++) {

            System.out.println(arr_new[i]);
        }
    }
}