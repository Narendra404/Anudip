package collectionsProg.stack.basicUsage;

import java.util.Random;
import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack <Integer> stack = new Stack<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++) stack.push(random.nextInt(10));

        System.out.println();
        System.out.println("Elements of stack are as follows : ");
        for (Integer val : stack) System.out.print(val + " ");

        stack.pop();
        System.out.println();
        System.out.println();
        System.out.println("Elements of stack after pop operation : ");
        for (Integer val : stack) System.out.print(val + " ");
    }
}
