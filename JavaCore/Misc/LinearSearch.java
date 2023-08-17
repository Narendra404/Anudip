package Misc;

import java.util.*;

class LinearSearch {

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

        System.out.println();
        System.out.print("Enter the element to be searched in the array : ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {

                System.out.println();
                System.out.println("The element is found at index : " + i);
                return;
            }
        }

        System.out.println();
        System.out.println("The element is not in the array.");
    }
}