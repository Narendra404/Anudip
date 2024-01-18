package threads.syncArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncArrayList {
    public static void main(String[] args) {
        // Create a synchronized ArrayList
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        // Create multiple threads to add and remove elements from the list
        Thread addThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronizedList.add("Item " + i);
                System.out.println("Added: Item " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread removeThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                if (!synchronizedList.isEmpty()) {
                    String removedItem = synchronizedList.remove(0);
                    System.out.println("Removed: " + removedItem);
                } else {
                    System.out.println("List is empty.");
                }
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start the threads
        addThread.start();
        removeThread.start();

        try {
            // Wait for threads to complete
            addThread.join();
            removeThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Print the final contents of the list
        System.out.println("Final List Contents:");
        for (String item : synchronizedList) {
            System.out.println(item);
        }
    }
}
