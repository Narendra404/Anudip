import java.util.*;

public class LargestAndSmallest {

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

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            
            if (arr[i] > max) {
                
                max = arr[i];
            }

            if (arr[i] < min) {

                min = arr[i];
            }
        }

        int newMax = min;
        int newMin = max;

        for (int i = 0; i < n; i++) {
            
            if (arr[i] > newMax && arr[i] != max) {

                newMax = arr[i];
            }

            if (arr[i] < newMin && arr[i] != min) {

                newMin = arr[i];
            }
        }

        System.out.println();
        System.out.println("The second highest number in the array is : " + newMax);
        System.out.println();
        System.out.println();
        System.out.println("The second smallest number in the array is : " + newMin);
        System.out.println();
    }
}
