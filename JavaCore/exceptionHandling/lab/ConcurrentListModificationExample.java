package exceptionHandling.lab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConcurrentListModificationExample {

    public static void main(String[] args) {
        // Create a list of FinancialData
        List<FinancialData> financialDataList = new ArrayList<>();

        // Create and start two threads to concurrently modify the list
        Thread addThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                Date date = new Date();
                FinancialData financialData = new FinancialData(date, 100L * i, 110L * i, 90L * i, 105L * i, 1000L * i);
                addFinancialData(financialDataList, financialData);
                printFinancialDataList(financialDataList);
                sleep(100); // Simulate some processing time
            }
        });

        Thread removeThread = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                removeFinancialData(financialDataList, i);
                printFinancialDataList(financialDataList);
                sleep(150); // Simulate some processing time
            }
        });

        // Start the threads
        addThread.start();
        removeThread.start();

        try {
            // Wait for both threads to finish
            addThread.join();
            removeThread.join();
        } catch (InterruptedException e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.err.println(stackTraceElement);
            }

        }
    }

    private static synchronized void addFinancialData(List<FinancialData> list, FinancialData financialData) {
        list.add(financialData);
    }

    private static synchronized void removeFinancialData(List<FinancialData> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }

    private static void printFinancialDataList(List<FinancialData> list) {
        System.out.println("Financial Data List:");
        for (FinancialData financialData : list) {
            System.out.println(financialData);
        }
        System.out.println();
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}