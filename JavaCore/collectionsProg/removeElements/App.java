package collectionsProg.removeElements;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        List<Integer> remove_list = new ArrayList<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) list.add(random.nextInt(10));

        System.out.println();
        System.out.println("The list is as follows : ");
        System.out.println(list);

        System.out.println();
        System.out.print("Enter the element whose all occurrences need to be removed : ");
        Integer element = sc.nextInt();
        remove_list.add(element);

        list.removeAll(remove_list);

        System.out.println();
        System.out.println("The list after removal of element " + element + " is as follows : ");
        System.out.println(list);
    }
}
