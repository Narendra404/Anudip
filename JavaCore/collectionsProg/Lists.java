package collectionsProg;

import java.util.List;
import java.util.ArrayList;

public class Lists {

    /*Basic Usage: Create an ArrayList of integers and add elements 5, 10, and 15. Print the ArrayList.

Size and Capacity: Add elements 2, 4, 6, and 8 to an ArrayList. What is the size of the ArrayList?

Access and Modify: Create an ArrayList of strings containing "apple", "banana", and "cherry". Replace "banana" with "grape" and print the ArrayList.

Looping: Given an ArrayList of doubles, calculate the sum of all elements using a loop.

Searching: Create an ArrayList of names ("Alice", "Bob", "Charlie", "David"). Check if "Charlie" exists in the ArrayList.

Removing Elements: Starting with an ArrayList of integers, remove all occurrences of a specific number.*/
    public static void main(String[] args) {

        List<Integer> employee_age = new ArrayList<>();

        employee_age.add(23);
        employee_age.add(21);
        employee_age.add(34);

        Integer sum = 0;

        for (Integer age : employee_age) {
            sum += age;
        }

        Float average = (float) sum / employee_age.size();

        System.out.println(average);

    }
    
}
